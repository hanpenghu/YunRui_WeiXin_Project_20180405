package com.winwin.picreport.Bcontroller;
import com.winwin.picreport.Cservice.A1ReportRestService;
import com.winwin.picreport.Edto.ShouDingDanFromExcel;
import com.winwin.picreport.Futils.Msg;
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
public class A1ReportRestController {
    @Autowired
    private A1ReportRestService a1;
/////////////////////////////////////////////////////////////////////////////////////////////
//前端没有任何参数传         [{}]         受订单号成功后是SO
@RequestMapping(value="shouDingDanExcelToTable",method= RequestMethod.POST,produces = {"application/json;charset=utf-8"})
public @ResponseBody List<Msg> shouDingDanExcelToTable(@RequestBody List<ShouDingDanFromExcel> shouDingDanFromExcels){
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
                //for一次就是处理同一批号osNo一次
                List<ShouDingDanFromExcel> list001 = this.heBingTongYiDingDanXiaMianHuoHaoXiangTongDe_qty_amtn_tax_amt(list3);
                a1.saveYiPiDingDanHaoXiangTongDe(list001,listmsg);
            } catch (Exception e) { e.printStackTrace(); }
        }
    }
///////////////////////////////////////////////////////////////////////////////////
    public List<ShouDingDanFromExcel> heBingTongYiDingDanXiaMianHuoHaoXiangTongDe_qty_amtn_tax_amt(List<ShouDingDanFromExcel> list3){
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
                double qty=0;
                double amtn=0;
                double tax=0;
                double amt=0;
                for(ShouDingDanFromExcel shouDingDanFromExcel:list0){
                    try {qty+=Double.parseDouble(shouDingDanFromExcel.getQty()); } catch (NumberFormatException e) {e.printStackTrace();}
                    try {amtn+=Double.parseDouble(shouDingDanFromExcel.getAmtn());} catch (NumberFormatException e) {e.printStackTrace();}
                    try {tax+=Double.parseDouble(shouDingDanFromExcel.getTax());} catch (NumberFormatException e) {e.printStackTrace();}
                    try {amt+=Double.parseDouble(shouDingDanFromExcel.getAmt());} catch (NumberFormatException e) {e.printStackTrace();}
                }
                if(list0.size()>0) {
                    ShouDingDanFromExcel shouDingDanFromExcel = list0.get(0);
                    shouDingDanFromExcel.setQty(String.valueOf(qty));
                    shouDingDanFromExcel.setAmtn(String.valueOf(amtn));
                    shouDingDanFromExcel.setTax(String.valueOf(tax));
                    shouDingDanFromExcel.setAmt(String.valueOf(amt));
                    list.add(shouDingDanFromExcel);
                }
            }
        }
        return  list;
    }
/////////////////////////////////////////////////////////////////////////////
    public void quChuDuoYuDeSuccessMsg(List<Msg> listmsg,String msg){
        if(listmsg.size()>1){
            for(Msg msg11:listmsg){
                if(msg.equals(msg11.getMsg())){
                    listmsg.remove(msg11);
                }
            }
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value="f",method= RequestMethod.POST,produces = {"text/plain;charset=utf-8"})
    public String  f(){
        return "你好！！！";
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value="h",method= RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public @ResponseBody  Test  h(){
        Test test=new Test();
        test.setStr("韩寒！！！");
        return test;
    }

//////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
}
/////////////////////////////////////////////////////////////////////////////////////////////



































































class Test{
    private String str="";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Bcontroller.Test{");
        sb.append("str='").append(str).append('\'');
        sb.append('}');
        return sb.toString();
    }
}