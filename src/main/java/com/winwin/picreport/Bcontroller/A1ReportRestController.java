package com.winwin.picreport.Bcontroller;
import com.winwin.picreport.Cservice.A1ReportRestService;
import com.winwin.picreport.Ddao.reportxmlmapper.MfPosMapper;
import com.winwin.picreport.Edto.MfPosExample;
import com.winwin.picreport.Edto.ShouDingDanFromExcel;
import com.winwin.picreport.Futils.MessageGenerate;
import com.winwin.picreport.Futils.Msg;
import com.winwin.picreport.Futils.NotEmpty;
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
public class A1ReportRestController {
    @Autowired
    private A1ReportRestService a1;
    @Autowired
    private MfPosMapper mfPosMapper;
/////////////////////////////////////////////////////////////////////////////////////////////
//前端没有任何参数传         [{}]         受订单号成功后是SO
@RequestMapping(value="shouDingDanExcelToTable",method= RequestMethod.POST,produces = {"application/json;charset=utf-8"})
public @ResponseBody List<Msg> shouDingDanExcelToTable(@RequestBody List<ShouDingDanFromExcel> shouDingDanFromExcels){
//   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//    System.out.println(shouDingDanFromExcels);
//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
    List<Msg> listmsg=new ArrayList<>();
    long time01=new Date().getTime();
    try {
        Msg msg=new Msg();
        if(this.panDuanQianDuanChuanGuoLaiDeShuJuShiFouYouWenTi(shouDingDanFromExcels)){
            //guo lv suo you bu chong fu de osNo//分离出所有不相同的订单号
            Set<String> set = this.fenLeiQuChongFuDingDanHaoDaoSetJiHe(shouDingDanFromExcels);
            List<List<ShouDingDanFromExcel>> list1=this.anDingDanHaoFenLeiHouDe2GeJiHeFangRuYiGeJiHe(set, shouDingDanFromExcels);
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
     //把所有的记录根据单号分成2大类
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
    public void anDingDanHaoFenLeiHouXiangServiceCengChuanShuJu(List<List<ShouDingDanFromExcel>> list1,List<Msg> listmsg){
        for(List<ShouDingDanFromExcel> list3:list1){
            try {
                //首先进行osNo判断,如果在mf_pos中已经有这个osNo,我们就不再进行下面的save步骤
                MfPosExample mfPosExample=new MfPosExample();
                mfPosExample.createCriteria().andOsNoEqualTo(list3.get(0).getOsNo());
                long l = mfPosMapper.countByExample(mfPosExample);
                if(l==0){//此时数据库没有这个单号,我们开始进行接下来的save//如果有的话就不要再save了
                    //for一次就是处理同一批号osNo一次
                    Map<String, List> listMap = this.heBingTongYiDingDanXiaMianHuoHaoXiangTongDe_qty_amtn_tax_amt(list3);
                    a1.saveYiPiDingDanHaoXiangTongDe(listMap,listmsg);
                }else{
//                    listmsg.addAll(new MessageGenerate().generateMessage("重复数据,未能成功插入,重复的单号为“"+list3.get(0).getOsNo()+"”"));
                    listmsg.addAll(new MessageGenerate().generateMessage("重复数据,未能成功插入"));
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
    public Map<String,List> heBingTongYiDingDanXiaMianHuoHaoXiangTongDe_qty_amtn_tax_amt(List<ShouDingDanFromExcel> list3){
        Map<String,List>map=new HashMap();
        //用list00来装入合并同一货号的几个东西后的ShouDingDanFromExcel
        List<ShouDingDanFromExcel> list=new ArrayList<>();
        //收集同一货号的list
        List<List<ShouDingDanFromExcel>>samePrdNoList=new ArrayList<>();

        //注意:传进来的list3已经是同一订单号下面了
        //去重所有相同的货号放入set集合
        Set<String>set =new HashSet<>();
        for(ShouDingDanFromExcel shouDingDanFromExcel:list3){
            set.add(shouDingDanFromExcel.getPrdNo().trim());
        }

        //循环所有去重后的货号
        for(String prdNo:set){
            //循环所有同一单号下的订单,对当前货号下的订单合并
            List<ShouDingDanFromExcel>list0=new ArrayList<>();
            for(ShouDingDanFromExcel shouDingDanFromExcel:list3){
                if(prdNo.equals(shouDingDanFromExcel.getPrdNo().trim())){
                    list0.add(shouDingDanFromExcel);
                }
            }
            //收集同一货号的list
            samePrdNoList.add(list0);
            //此时list0里面装的都是同一货号的东西了,我们可以合并同一货号的某些字段了
            synchronized (this){
                double qty=0;//数量
                double amtn=0;//未税金额
                double tax=0;//税额
                double amt=0;//金额合并
//                double danJia=0;//当时想错了,单价不能合并
                for(ShouDingDanFromExcel shouDingDanFromExcel:list0){
                    try {qty+=Double.parseDouble(shouDingDanFromExcel.getQty()); } catch (NumberFormatException e) {e.printStackTrace();}
                    try {amtn+=Double.parseDouble(shouDingDanFromExcel.getAmtn());} catch (NumberFormatException e) {e.printStackTrace();}
                    try {tax+=Double.parseDouble(shouDingDanFromExcel.getTax());} catch (NumberFormatException e) {e.printStackTrace();}
                    try {amt+=Double.parseDouble(shouDingDanFromExcel.getAmt());} catch (NumberFormatException e) {e.printStackTrace();}
//                    try {danJia+=Double.parseDouble(shouDingDanFromExcel.getUp());} catch (NumberFormatException e) {e.printStackTrace();}
                }
                if(list0.size()>0) {
                    ShouDingDanFromExcel shouDingDanFromExcel = list0.get(0);
                    shouDingDanFromExcel.setQty(String.valueOf(qty));
                    shouDingDanFromExcel.setAmtn(String.valueOf(amtn));
                    shouDingDanFromExcel.setTax(String.valueOf(tax));
                    shouDingDanFromExcel.setAmt(String.valueOf(amt));
//                    shouDingDanFromExcel.setUp(String.valueOf(danJia));
                    list.add(shouDingDanFromExcel);
                }
            }
        }

        map.put("samePrdNoMeraged",list);
        map.put("samePrdNoList",samePrdNoList);
        return  map;
    }
/////////////////////////////////////////////////////////////////////////////
    public void quChuDuoYuDeSuccessMsg(List<Msg> listmsg,String msg){
        if(listmsg.size()>1){
            listmsg.forEach((msg1)->{
                if(msg.equals(msg1.getMsg())){
                    listmsg.remove(msg1);
                }
            });
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