package com.winwin.picreport.Bcontroller.xiaoShouDingDanDaoRuDaoChuExcel.excelXiaoShouDingDanXiaZai;



import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *导出exce前奏---打包
 * */
@CrossOrigin
@RestController
public class MfPssDaBaoExcel {

    @Autowired
    private Cnst cnst;


    private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());
    @RequestMapping(value = InterFaceCnst.mfPssDaBao,method = RequestMethod.POST)
    public @ResponseBody
    Msg f(@RequestBody ChaXunTiaoJian chaXunTiaoJian, HttpServletResponse response){
//注册所有异常信息

        //用于记录以完成的下载的数据量，单位是byte
        long downloadedLength = 0l;
        try {
            /**
             *下面开始读取数据库数据
             * */
            List<String> cusNos = chaXunTiaoJian.getCus_no();
            String endTime = chaXunTiaoJian.getEndTime();
            String startTime=chaXunTiaoJian.getStartTime();

            if(p.empty(cusNos)){
                throw new RuntimeException("客户代号是空的"+p.knownExceptionSign);
            }
            if(p.empty(endTime)){
                throw new RuntimeException("结束时间是空的"+p.knownExceptionSign);
            }
            if(p.empty(startTime)){
                throw new RuntimeException("开始时间是空的"+p.knownExceptionSign);
            }




            //得到所有的符合条件的单号
            List<String>psNos=new LinkedList<>();
            for(String cusNo:cusNos){
                List<String>psNos1=cnst.manyTabSerch.selectMfpssOsNo(cusNo,startTime,endTime);
                psNos.addAll(psNos1);
            }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            List<SalePrdDetailTab1>salePrdDetailTab1s=new LinkedList<>();
            for(String psNo:psNos){

                //从表头得到信息
                Map<String,String>mfps=cnst.manyTabSerch.selectMfInfo(psNo);


                TfPssExample tpe=new TfPssExample();
                tpe.createCriteria().andPsNoEqualTo(psNo);
                List<TfPss> tfPsses = cnst.tfPssMapper.selectByExample(tpe);


                for(TfPss tfPss:tfPsses){

                    SalePrdDetailTab1 salePrdDetailTab11=new SalePrdDetailTab1();
                    salePrdDetailTab11.setRemHead(mfps.get("remHead"));
                    salePrdDetailTab11.setPsNo(psNo);
                    salePrdDetailTab11.setCusOsNo(mfps.get("cusOsNo"));

                    salePrdDetailTab11.setPrdName(tfPss.getPrdName());
                    salePrdDetailTab11.setPrdNo(tfPss.getPrdNo());
                    salePrdDetailTab11.setQty(p.bigDecimal2String0(tfPss.getQty()));
                    salePrdDetailTab11.setUp(p.bigDecimal2String0(tfPss.getUp()));
                    salePrdDetailTab11.setAmt(p.bigDecimal2String0(tfPss.getAmt()));
                    salePrdDetailTab11.setAmtnNet(p.bigDecimal2String0(tfPss.getAmtnNet()));
                    salePrdDetailTab11.setOs_no(tfPss.getOsNo());
                    salePrdDetailTab11.setBat_no(tfPss.getBatNo());
                    salePrdDetailTab11.setRemBody(tfPss.getRem());
                    salePrdDetailTab11.setItm(p.strValeOfSpace(tfPss.getItm()));




                    PrdtExample pse=new PrdtExample();
                    pse.createCriteria().andPrdNoEqualTo(tfPss.getPrdNo());

                    //下面都是为了得到indxName,中类名称
                    List<Prdt> prdts = cnst.prdtMapper.selectByExample(pse);//只有一个
                    if(p.notEmpty(prdts)){
                        Prdt prdt = prdts.get(0);
                        //设置单位
                        salePrdDetailTab11.setUnit(prdt.getUt()==null?"1":prdt.getUt());
                        Indx indx = cnst.indxMapper.selectByPrimaryKey(prdt.getIdx1());
                        //设置中类名称
                        salePrdDetailTab11.setIndxName(indx.getName());
                    }

                    TfPssZExample tfPssZExample=new TfPssZExample();
                    tfPssZExample.createCriteria().andPsNoEqualTo(psNo);
                    TfPssZKey tfPssZKey=new TfPssZKey();
                    tfPssZKey.setPsId("SA");
                    tfPssZKey.setItm(tfPss.getItm());
                    tfPssZKey.setPsNo(psNo);
                    TfPssZ tfPssZ = cnst.tfPssZMapper.selectByPrimaryKey(tfPssZKey);

                    //设置备次
                    salePrdDetailTab11.setBc(p.bigDecimal2StringSpace(tfPssZ.getBc()));
                    //设置毛重
                    salePrdDetailTab11.setMz(p.bigDecimal2StringSpace(tfPssZ.getMz()));
                    //设置皮重
                    salePrdDetailTab11.setPz(tfPssZ.getPz());
                    //设置成分代码
                    salePrdDetailTab11.setChengFenDaiMa(tfPssZ.getCfdm());


                    salePrdDetailTab1s.add(salePrdDetailTab11);

                }

            }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





















            /**
             *下面开始把读好的数据库数据封装到excel
             * */




            return null;
        } catch (Exception e) {
            String s = e.getMessage();
            l.error(s,e);
            if(s.contains(p.knownExceptionSign)){
                return Msg.gmg().setStatus(p.s0).setMsg(s);
            }else{
                return Msg.gmg().setStatus(p.s0).setMsg("未知异常");
            }
        }





    }





}
