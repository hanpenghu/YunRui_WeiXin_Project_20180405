package com.winwin.picreport.Cservice;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.Constant.msgCnst;
import com.winwin.picreport.AllConstant.StatusCnst;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSamp0;
import com.winwin.picreport.Edto.UpDef;
import com.winwin.picreport.Edto.UpDefMy01;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.p;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

@Service
@Transactional
public class SaveSaleOrBuyPrice {
    @Autowired
    private Cnst cnst;
        public Msg saveSaleOrBuyPrice(UpDefMy01 up){
            String usr=up.getUsr();
            String cusNo=up.getCusNo();
            if(null==cusNo){//联合主键之一,不能为null
                cusNo="";
            }
            String chkMan=usr;
            //得到打样唯一标识
            String uuid = up.getUuid();
            //先拿出来需要的全局数据
            BigDecimal qty = up.getQty();
            if(null==qty){qty=new BigDecimal(0);}
            //得到币别代号//RMB
            String curId = up.getCurId();
            if(null==curId){
                curId="";
            }
            //得到币别名字//人民币
            String curName = up.getCurName();
            //前端传过来的备注
            String remFront = up.getRemFront();
            //固定的备注   //"打样系统"
            String rem = up.getRem();
            //单位
            String unit = up.getUnit();
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~采购或者销售保存单位unit="+unit+"~~这个在取出的时候实际上是来自prdt,而这里的实际没有保存~~~~~~~~~~~~~~~~~~~~~~");
            //采购带运费
            BigDecimal haveTransUpBuy = up.getHaveTransUpBuy();
            //采购无运费
            BigDecimal noTransUpBuy = up.getNoTransUpBuy();

            //销售有运费
            BigDecimal haveTransUpSale = up.getHaveTransUpSale();
            //销售无运费
            BigDecimal noTransUpSale = up.getNoTransUpSale();

            //处理一下unit,因为unit必须存入一个1或者2


            if(NotEmpty.empty(curId)){
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
                p.p("币别代号没有传过来");
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveFalse)
                        .setMsg("curId 币别代号没有传过来");
            }
            //把上面的东西放在一个map里面好处理
            Map<String, Object> gmp = p.gp()
                    .smp("uuid", uuid)
                    .smp("qty", qty)
                    .smp("curId", curId)
                    .smp("curName", curName)
                    .smp("remFront", remFront)
                    .smp("rem", rem)
                    .smp("unit", unit)//因为数据库up_def中的unit只能是1或者2这类短的
                    .smp("haveTransUpBuy", haveTransUpBuy)
                    .smp("noTransUpBuy", noTransUpBuy)
                    .smp("haveTransUpSale", haveTransUpSale)
                    .smp("noTransUpSale", noTransUpSale)
                    .smp("usr",usr)
                    .smp("chkMan",usr).smp("cusNo",cusNo).gmp();


//////////////////////////货号流水模块////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //获得uuid对应的prdt_no
            String prdNo= cnst.manyTabSerch.selectPrdNoFromPrdtSamp(uuid);

            //如果货号是空的,先流水一下
            if(NotEmpty.empty(prdNo)){
                //下面流水一次单号//注意必须先得到index
                PrdtSamp prdtSamp = cnst.prdtSampMapper.selectByPrimaryKey(uuid);
                PrdtSamp0 prdtSamp0=new PrdtSamp0();
                BeanUtils.copyProperties(prdtSamp,prdtSamp0);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                //给prdtSamp流水prdtNo//下面是prdno流水模块
                cnst.gPrdNo.prdtSampObjGetPrdNo(prdtSamp0);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                prdNo=prdtSamp0.getPrdNo();
            }else{
                //此时货号不是空的
                PrdtSamp prdtSamp = cnst.prdtSampMapper.selectByPrimaryKey(uuid);
                PrdtSamp0 prdtSamp0=new PrdtSamp0();
                BeanUtils.copyProperties(prdtSamp,prdtSamp0);
                //此时prdNo已经存在存在prdt_Samp,那么我们看看这个prdNo在prdt表是否存在
                cnst.gPrdNo.reSetPrdNo(prdtSamp0);
            }
            /////////////单位对比插入模块/////////////////////////////////////////////////////////////////////////////////
            //找到该prdNo对应的ut(就是存的单位)
            String ut=cnst.manyTabSerch.selectUtFromPrdt(prdNo);

            if(NotEmpty.empty(ut)){
                //如果是空的,证明prdt表中没有该ut,需要插入该unit
              Integer y=  cnst.manyTabSerch.insertUnitToUtOfPrdt(unit,prdNo);
            }
//////////////////////////////////////////////////////////////////////////////////////////////
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验1~~prdNo=~~"+prdNo+"~~~~~~~~~~~~~~~~~~~~");
            if(NotEmpty.empty(prdNo)){
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验2~~~~~~~~~~~~~~~~~~~~~~~~");
                //空的单号,必须告诉前端终止
                return Msg.gmg().setStatus(StatusCnst.excelSaveFalse)
                        .setMsg(msgCnst.failSave.getValue())
                        .setChMsg(msgCnst.failSave.getValue());
            }else{
                gmp.put("prdNo",prdNo);

                //判断是采购的还是销售的
                //采购的都是0,证明现在是销售的
                if(haveTransUpBuy==null&&noTransUpBuy==null){
                    p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验3~~~~~~~~~~~~~~~~~~~~~~~~");
                    //按销售保存
                   return this.saveAsSaler(gmp);
                }else{
                    p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验4~~~~~~~~~~~~~~~~~~~~~~~~");
                    //现在是采购的,按采购保存
                    return this.saveAsBuyer(gmp);

                }

            }
        }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //采购的价格入库
    private Msg saveAsBuyer(Map<String, Object> gmp) {
        String unit=(String)gmp.get("unit");
        UpDef upDef=new UpDef();
        upDef.setHjNo("SamplesSys");
        upDef.setsDd(new Date());
        upDef.setQty((BigDecimal) gmp.get("qty"));
        //这个默认字符串"打样系统"
        upDef.setRem((String)gmp.get("rem"));
        //得到币别
        upDef.setCurId((String)gmp.get("curId"));
        //得到单位
        upDef.setUnit((String)gmp.get("1"));
        upDef.setPriceId("2");
        /////////////////////////////////////////////////////////////////////////////////////
        upDef.setCusNo((String)gmp.get("cusNo"));
        upDef.setUsr((String)gmp.get("usr"));
        upDef.setChkMan((String)gmp.get("chkMan"));
        /////////////////////////////////////////////////////////////////////////////////////
        upDef.setPrdMark("");
        upDef.setPrdNo((String)gmp.get("prdNo"));
        upDef.setBzKnd("");
        upDef.setKnd("");
        upDef.setSupPrdNo("");
        upDef.setCusAre("");
        //采购含运费入库
        if(NotEmpty.notEmpty(gmp.get("haveTransUpBuy"))){
            //01代表不含运费//其他代表是含运费的
            upDef.setBilType("");
            upDef.setUp((BigDecimal) gmp.get("haveTransUpBuy"));
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验5~~~~~~~~~~~~~~~~~~~~~~~~");
            //往价格表up_def插入采购价格。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
            int insert = cnst.upDefMapper.insert(upDef);
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验6~~~~~~~~~~~~~~~~~~~~~~~~");
            if(insert==0) {
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验7~~~~~~~~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveFalse)
                        .setMsg("保存采购价格含运费的失败");
            }else{

            }
        }
        //采购不含运费入库
        if(NotEmpty.notEmpty( gmp.get("noTransUpBuy"))){
            //01代表不含运费//其他代表是含运费的
            upDef.setBilType("01");
            upDef.setUp((BigDecimal) gmp.get("noTransUpBuy"));
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验9~~~~~~~~~~~~~~~~~~~~~~~~");
            //往价格表up_def插入采购价格。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
            int insert= cnst.upDefMapper.insert(upDef);
            if(insert==0) {
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~10~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveFalse)
                        .setMsg("保存采购价格不含运费的失败");
            }else{
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验~~11~~~~~~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveSucc)
                        .setMsg("保存采购价格成功");
            }
        }

        return Msg.gmg().setStatus(StatusCnst.excelSaveSucc)
                .setMsg("保存采购价格成功");

    }
    /**
     ****************************************************************************************
     * */

    //销售的价格入库
    private Msg saveAsSaler(Map<String, Object> gmp) {
        String unit=(String)gmp.get("unit");
        UpDef upDef=new UpDef();
        upDef.setHjNo("SamplesSys");
        upDef.setsDd(new Date());
        upDef.setQty((BigDecimal) gmp.get("qty"));
        //这个默认字符串"打样系统"
        upDef.setRem((String)gmp.get("rem"));
        //得到币别
        upDef.setCurId((String)gmp.get("curId"));
        //得到单位
        upDef.setUnit((String)gmp.get("1"));
        //1代表销售,2代表采购
        upDef.setPriceId("1");


/////////////////////////////////////////////////////////////////////////////////////
        upDef.setCusNo((String)gmp.get("cusNo"));
        upDef.setUsr((String)gmp.get("usr"));
        upDef.setChkMan((String)gmp.get("chkMan"));
        /////////////////////////////////////////////////////////////////////////////////////
        upDef.setPrdMark("");
        upDef.setPrdNo((String)gmp.get("prdNo"));
        upDef.setBzKnd("");
        upDef.setKnd("");
        upDef.setSupPrdNo("");
        upDef.setCusAre("");
        //销售含运费入库
        if(NotEmpty.notEmpty( gmp.get("haveTransUpSale"))){
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~12~~~~~~~~~~");
            //01代表不含运费//其他代表是含运费的
            upDef.setBilType("");
            upDef.setUp((BigDecimal) gmp.get("haveTransUpSale"));
            if(null==upDef.getCusNo()){
                upDef.setCusNo("");
            }
            //往价格表up_def插入采购价格
            int insert=cnst.upDefMapper.insert(upDef);//。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~13~~~~~~~~~~~~~~~~");
            if(insert==0) {
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验14~~~~~~~~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveFalse)
                        .setMsg("保存销售价格含运费的失败");
            }else{

            }
        }
        //销售不含运费入库
        if(NotEmpty.notEmpty( gmp.get("noTransUpSale"))){
            p.p("~~~~~~~~~~~~~~~~~~~~~~16~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
            //01代表不含运费//其他代表是含运费的
            upDef.setBilType("01");
            upDef.setUp((BigDecimal) gmp.get("noTransUpSale"));
            p.p("~~~~~~~~~~~~~~~~~~~~~~17~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
            if(null==upDef.getCusNo()){
                upDef.setCusNo("");
            }
            //往价格表up_def插入采购价格
            int insert=cnst.upDefMapper.insert(upDef);//。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
            if(insert==0) {
                p.p("~~~~~~~~~~~~~~~~~~~~~~18~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveFalse)
                        .setMsg("保存销售价格不含运费的失败");
            }else{
                p.p("~~~~~~~~~~~~~~~~~~~~~~19~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveSucc)
                        .setMsg("保存销售价格的成功");
            }
        }

        return Msg.gmg().setStatus(StatusCnst.excelSaveSucc)
                .setMsg("保存销售价格的成功");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


























//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
