package com.winwin.picreport.Bcontroller.xiaoShouDingDanDaoRuDaoChuExcel;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Cservice.A1ReportRestService;
import com.winwin.picreport.Ddao.reportxmlmapper.MfPosMapper;
import com.winwin.picreport.Edto.MfPosExample;
import com.winwin.picreport.Edto.ShouDingDanFromExcel;
import com.winwin.picreport.Futils.*;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/*
*   select os_dd as '受订日期',rem as '表头备注', cur_id as '币别',exc_rto as '汇率',cus_no as '客户编号',
   tax_id '扣税类别',cus_os_no '客户订单',os_no	 as '受订单号'
  ,* from mf_pos
----------------------------------------------------
  select os_dd as '受订日期',prd_no as '货品代号',prd_name as '品名',qty as '数量',unit as '单位'
  ,amtn as '未税本位币',tax as '税额',amt as '金额',
  tax_rto as '税率' ,rem as '表身备注'	,est_dd as '预交日期' ,up as '单价'
  ,*from tf_POS
 ---------------------------------------------------------
  select sapwlm as 'SAP物料名',saphh as 'SAP行号',SAPPH as 'SAP品号',cfdm as '成分代码',* from tf_pos_z
*
* */
@CrossOrigin
@RestController
@RequestMapping("/a")
/**
 *导入excel
 * */
public class SapXiaoShouDingDanExcelDaoRuXiTong {
    @Autowired
    private Cnst cnst;
/////////////////////////////////////////////////////////////////////////////////////////////
//前端没有任何参数传         [{}]         受订单号成功后是SO
@RequestMapping(value="shouDingDanExcelToTable",
        method= RequestMethod.POST,produces = {"application/json;charset=utf-8"})
public @ResponseBody List<Msg>
shouDingDanExcelToTable(@RequestBody List<ShouDingDanFromExcel> shouDingDanFromExcels){

    p.p("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    p.p(shouDingDanFromExcels);
    p.p("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//    shouDingDanFromExcels.forEach(v->{
//        if(p.dy(v.getPrdNo(),"154429710")){
//            if(p.dy(v.getOsNo(),"170856BR3SSYZYP84771")){
//                     p.p(p.gp().sad(p.dexhx).sad(v.toString()).sad(p.dexhx).gad());
//            }
//        }
//    });
//    p.p("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    List<Msg> listmsg=new ArrayList<>();

    long time01=new Date().getTime();
    try {

        //////////////////////////同一个excel中订单号检查必须一样的模块////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //检查shouDingDanFromExcels里面的osno订单号是否统一 一样,不一样不行
        //根据osNo订单号去重复//这里单单是为了看是否是统一单号
        TreeSet<ShouDingDanFromExcel> set1 = new TreeSet<>(Comparator.comparing(ShouDingDanFromExcel::getOsNo));
        set1.addAll(shouDingDanFromExcels);
        int size = set1.size();
        p.p(p.gp().sad(p.dexhx).sad("去重复后的长度是:").sad(p.strValeOf(size)).sad(p.dexhx).gad());
        if(size ==1){
            //此时证明里面全部是一个相同单号,去重复后,变成一条记录在set中,此时什么都不用做,继续下一步

            p.p(p.gp().sad(p.dexhx).sad("所有单号一样,可以继续下一步").sad(p.dexhx).gad());
        }else{
            //此时证明有2个以上不同单号,需要提示 客户,同一个excel中必须只能有一个osno
            listmsg.addAll (new MessageGenerate()
                    .generateMessage("excel里面有不相同的单号,请检查excel并把不同的单号放到不同的excel再导入！"));

            throw new RuntimeException("excel里面有不相同的单号,请检查excel并把不同的单号放到不同的excel再导入！");

        }
       /* try {
             p.p(p.gp().sad(p.dexhx).sad(p.strValeOf("开始线程等待")).sad(p.dexhx).gad());
            Thread.sleep(1*60*60*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        Msg msg=new Msg();
        if(this.panDuanQianDuanChuanGuoLaiDeShuJuShiFouYouWenTi(shouDingDanFromExcels)){
            //guo lv suo you bu chong fu de osNo//分离出所有不相同的订单号
            Set<String> set = this.fenLeiQuChongFuDingDanHaoDaoSetJiHe
                    (shouDingDanFromExcels);
            List<List<ShouDingDanFromExcel>> list1=this
                    .anDingDanHaoFenLeiHouDe2GeJiHeFangRuYiGeJiHe
                    (set, shouDingDanFromExcels);
            //按批号分批插入数据库,一个批号下的不成功都不成功在service成实现，listmsg暗传输msg错误信息
            this.anDingDanHaoFenLeiHouXiangServiceCengChuanShuJu(list1,listmsg);
            msg.setMsg("数据插入成功");
        }else{ msg.setMsg("第一条数据就没有OsNo(订单号),拒绝所有操作,检查您的数据信息再次插入");}
        //把当前的msg放入将要返回给前端的集合
        listmsg.add(msg);
        //如果msg列表中有2个及2个以上,说明数据没有完全插入成功,就把那个数据插入成功的message删掉
        this.quChuDuoYuDeSuccessMsg(listmsg,"数据插入成功");
        this.quChuKongDeMsg(listmsg);//如果Msg中的字段msg是"",那么久去除这一条数据
    } catch (Exception e) {
        e.printStackTrace();
    }
    long time02=new Date().getTime();
    Msg msg001=new Msg();
    msg001.setXiaoHaoShiJian(String.valueOf((time02-time01)/1000));
    listmsg.add(msg001);
    ////////////////////////////////////////////////////////////////////////
    return listmsg;
////////////////////////////////
}

    private void quChuKongDeMsg(List<Msg> listmsg) {
            listmsg.forEach((msg)->{
                if(!NotEmpty.notEmpty(msg.getMsg())){
                    listmsg.remove(msg);
                }
            });
    }

    /////////////////////////////////////////////////////////////////////////////////////////////
    public boolean panDuanQianDuanChuanGuoLaiDeShuJuShiFouYouWenTi(List<ShouDingDanFromExcel> shouDingDanFromExcels){
        boolean a=(shouDingDanFromExcels.get(0)==null);
        boolean c=shouDingDanFromExcels.get(0).getOsNo()==null;
        boolean b = "".equals(shouDingDanFromExcels.get(0).getOsNo());
        boolean d = "undefined".equals(shouDingDanFromExcels.get(0).getOsNo());
        boolean e=!a||!c||!b||!d;
        return e;
    }
/////////////////////////////////////////////////////////////////////////////////////////////

    public Set<String> fenLeiQuChongFuDingDanHaoDaoSetJiHe(List<ShouDingDanFromExcel> shouDingDanFromExcels){
        Set<String> set=new HashSet();

        for(ShouDingDanFromExcel shouDingDanFromExcel:shouDingDanFromExcels){
            set.add(shouDingDanFromExcel.getOsNo().trim());
        }
        return set;
    }
 //////////////////////////////////////////////////////////////////////////////////////////////
 public List<List<ShouDingDanFromExcel>> anDingDanHaoFenLeiHouDe2GeJiHeFangRuYiGeJiHe(Set<String> set,List<ShouDingDanFromExcel> shouDingDanFromExcels){
     List<List<ShouDingDanFromExcel>> list1=new ArrayList();
     //把所有的记录根据单号分成多个单号相同的大类
     for(String str:set){
         List<ShouDingDanFromExcel> list2=new ArrayList();
         for(ShouDingDanFromExcel ss:shouDingDanFromExcels){
             if(str.equals(ss.getOsNo().trim())){
                 list2.add(ss);
             }
         }
         list1.add(list2);
     }
     return list1;
 }
 ////////////////////////////////////////////////////////////////////////////////////////
    /**
     *数据库插入数据
     * */
    public void anDingDanHaoFenLeiHouXiangServiceCengChuanShuJu(List<List<ShouDingDanFromExcel>> list1,List<Msg> listmsg){
        for(List<ShouDingDanFromExcel> list3:list1){
            try {
                //首先进行osNo判断,如果在mf_pos中已经有这个osNo,我们就不再进行下面的save步骤
                MfPosExample mfPosExample=new MfPosExample();
                mfPosExample.createCriteria().andOsNoEqualTo(list3.get(0).getOsNo());
                long l = cnst.mfPosMapper.countByExample(mfPosExample);
                if(l==0){//此时数据库没有这个单号,我们开始进行接下来的save//如果有的话就不要再save了
                    //for一次就是处理同一批号osNo一次
                    Map<String, List> listMap =
                            this.heBingTongYiDingDanXiaMianHuoHaoXiangTongDe_qty_amtn_tax_amt
                                    (list3,listmsg);
                    /**
                     *数据库插入数据
                     * */
                    cnst.a1.saveYiPiDingDanHaoXiangTongDe(listMap,listmsg);
                }else{
//                    listmsg.addAll(new MessageGenerate().generateMessage("重复数据,未能成功插入,重复的单号为“"+list3.get(0).getOsNo()+"”"));
                    listmsg.addAll(new MessageGenerate().generateMessage("重复数据,未能成功插入001"));
                    return;//此时停止循环所有单号
                }
            } catch (Exception e) {
                e.printStackTrace();
                //下面的return 是针对    if(l==0)抛出的异常的
                return;//这个意思是:如果一个excel中有一个单号没有插入成功,那么,停止循环其他单号，所有单号都不会插入成功

            }
        }
    }
///////////////////////////////////////////////////////////////////////////////////
    public Map<String,List> heBingTongYiDingDanXiaMianHuoHaoXiangTongDe_qty_amtn_tax_amt
        (List<ShouDingDanFromExcel> list3,List<Msg> listmsg){
        Map<String,List>map=new HashMap();
        //用list00来装入合并同一货号的几个东西后的ShouDingDanFromExcel
        List<ShouDingDanFromExcel> list=new ArrayList<>();
        //收集同一货号的list
        List<List<ShouDingDanFromExcel>>samePrdNoList=new ArrayList<>();

        //注意:传进来的list3已经是同一订单号下面了
        //去重所有相同的(货号+成分代码)的组合放入set集合,因为同一订单下,货号+成分代码一起相同才能合并
        Set<String>prdNoAndCfdmSet =new HashSet<>();
        for(ShouDingDanFromExcel shouDingDanFromExcel:list3){
            prdNoAndCfdmSet.add(shouDingDanFromExcel.getPrdNo().trim()+shouDingDanFromExcel.getCfdm().trim());
        }

//         p.p(p.gp().sad(p.dexhx).sad(prdNoAndCfdmSet.toString()).sad(p.dexhx).gad());

        //循环所有去重后的货号+成分代码的集合,因为去重后导入主表的就只有去重后这么多了
        for(String prdNoAndCfdm:prdNoAndCfdmSet){
            //循环所有同一单号下的订单,对当前货号+成分代码下的订单合并
            List<ShouDingDanFromExcel>list0=new ArrayList<>();
            for(ShouDingDanFromExcel shouDingDanFromExcel:list3){//list3是所有徐勇传过来的excel
                if(prdNoAndCfdm.equals(shouDingDanFromExcel.getPrdNo().trim()
                        +shouDingDanFromExcel.getCfdm().trim())){
                    list0.add(shouDingDanFromExcel);//找到同一个货号+成分代码下的所有excel项
                }
            }
                ///list0存的其实是当前 (货号+成分代码)相同 下的所有excel数据,需要合并,但是没有合并
            //这个算法的精妙之处在于,循环(货号+成分代码),然后一边用samePrdNoList收集没有合并的excel,一边合并list0中的数据放入list,最后
            //samePrdNoList进入主表//list进入sapso记录所有没有合并之前的数据

            //收集同一货号+成分代码下的list,这个是收集未合并的,将来用于放入sapso

            samePrdNoList.add(list0);
          /*  p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
                if("EBNE1701491YZ750381070048292".equals(list0.get(0).getOsNo().trim()+list0.get(0).getPrdNo().trim()+list0.get(0).getCfdm().trim())){
                    for(ShouDingDanFromExcel shouDingDanFromExcel:list0){
                        p.p("~~~~~~~~~~~saphh~"+shouDingDanFromExcel.getSaphh()+"~~~qty~~~"+shouDingDanFromExcel.getQty()+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                }
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");*/
            //此时list0里面装的都是同一（货号+成分代码）下的东西了(需要合并的),我们可以合并同一货号的某些字段了
            synchronized (this){//这个内部就是为了合并
                double qty=0;//数量
                double amtn=0;//未税金额
                double tax=0;//税额
                double amt=0;//金额合并
//                double danJia=0;//当时想错了,单价不能合并
                for(ShouDingDanFromExcel shouDingDanFromExcel:list0){
                    try {qty+=Double.parseDouble(shouDingDanFromExcel.getQty().trim()); } catch (NumberFormatException e) {listmsg.addAll(new MessageGenerate().generateMessage("有qty数量不是数字  "+shouDingDanFromExcel.getOsNo()+"   "+shouDingDanFromExcel.getPrdNo()+"    "+shouDingDanFromExcel.getCfdm()+""));throw new RuntimeException(e);}
                    try {amtn+=Double.parseDouble(shouDingDanFromExcel.getAmtn().trim());} catch (NumberFormatException e) {listmsg.addAll(new MessageGenerate().generateMessage("有amtn未税金额不是数字"+shouDingDanFromExcel.getOsNo()+"   "+shouDingDanFromExcel.getPrdNo()+"    "+shouDingDanFromExcel.getCfdm()+""));throw new RuntimeException(e);}
                    try {tax+=Double.parseDouble(shouDingDanFromExcel.getTax().trim());} catch (NumberFormatException e) {listmsg.addAll(new MessageGenerate().generateMessage("有tax税额不是数字"+shouDingDanFromExcel.getOsNo()+"   "+shouDingDanFromExcel.getPrdNo()+"    "+shouDingDanFromExcel.getCfdm()+""));throw new RuntimeException(e);}
                    try {amt+=Double.parseDouble(shouDingDanFromExcel.getAmt().trim());} catch (NumberFormatException e) {listmsg.addAll(new MessageGenerate().generateMessage("有amt金额不是数字"+shouDingDanFromExcel.getOsNo()+"   "+shouDingDanFromExcel.getPrdNo()+"    "+shouDingDanFromExcel.getCfdm()+""));throw new RuntimeException(e);}
//                    try {danJia+=Double.parseDouble(shouDingDanFromExcel.getUp());} catch (NumberFormatException e) {e.printStackTrace();}
                }
                if(list0.size()>0) {
                    //我们只要取到第一个就行了,因为list0里面放入的都是一样的,需要合并的,上面已经把该合并的合并了,下面只要找到其中一个,把合并后的设置进去就好了
                    ShouDingDanFromExcel shouDingDanFromExcel=new ShouDingDanFromExcel();

                    ShouDingDanFromExcel shouDingDanFromExcel1 = list0.get(0);

                    BeanUtils.copyProperties(shouDingDanFromExcel1,shouDingDanFromExcel);

                    ////////////////////2017-11-23郑总让加/////////////////////////////////////////////////////////////////////////
                    AmtAndAmtnAndTaxChongXinSuan.f(amt,amtn,tax,qty,shouDingDanFromExcel);//在类内部进行判断计算各种金额
                    ///////////////////////////////////////////////////////////////////////////////////////////
                    shouDingDanFromExcel.setQty(String.valueOf(qty));
                    shouDingDanFromExcel.setAmtn(BaoLiuXiaoShu.m3SiSheWuRuBianStr(amtn,2));
                    shouDingDanFromExcel.setTax(BaoLiuXiaoShu.m3SiSheWuRuBianStr(tax,2));
                    shouDingDanFromExcel.setAmt(BaoLiuXiaoShu.m3SiSheWuRuBianStr(amt,2));
//                    shouDingDanFromExcel.setUp(String.valueOf(danJia));
                    list.add(shouDingDanFromExcel);//合并后放入list
                }
               /* p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
                if("EBNE1701491YZ750381070048292".equals(list0.get(0).getOsNo().trim()+list0.get(0).getPrdNo().trim()+list0.get(0).getCfdm().trim())){
                    for(ShouDingDanFromExcel shouDingDanFromExcel:list0){
                        p.p("~~~~~~~~~~~saphh~"+shouDingDanFromExcel.getSaphh()+"~~~qty~~~"+shouDingDanFromExcel.getQty()+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                }
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");*/
            }
        }

        map.put("samePrdNoMeraged",list);
        map.put("samePrdNoList",samePrdNoList);
        return  map;
    }
/////////////////////////////////////////////////////////////////////////////
    public void quChuDuoYuDeSuccessMsg(List<Msg> listmsg,String msg){
        try {
            if(listmsg.size()>1){
                listmsg.forEach((msg1)->{
                    if(msg.equals(msg1.getMsg())){
                        listmsg.remove(msg1);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//    @RequestMapping(value="f",method= RequestMethod.POST,produces = {"text/plain;charset=utf-8"})
//    public String  f(){
//        return "你好！！！";
//    }
//    /////////////////////////////////////////////////////////////////////////////////////////////////
//    @RequestMapping(value="h",method= RequestMethod.POST,produces = {"application/json;charset=utf-8"})
//    public @ResponseBody  Test  h(){
//        Test test=new Test();
//        test.setStr("韩寒！！！");
//        return test;
//    }

//////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
}
/////////////////////////////////////////////////////////////////////////////////////////////



































































//class Test{
//    private String str="";
//
//    public String getStr() {
//        return str;
//    }
//
//    public void setStr(String str) {
//        this.str = str;
//    }
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Bcontroller.Test{");
//        sb.append("str='").append(str).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
//}