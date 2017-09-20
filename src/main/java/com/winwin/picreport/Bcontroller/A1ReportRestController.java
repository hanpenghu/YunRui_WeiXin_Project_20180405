package com.winwin.picreport.Bcontroller;
import com.winwin.picreport.Cservice.A1ReportRestService;
import com.winwin.picreport.Edto.ShouDingDanFromExcel;
import com.winwin.picreport.Futils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
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
//前端没有任何参数传         [{}]
@RequestMapping(value="shouDingDanExcelToTable",method= RequestMethod.POST,produces = {"application/json;charset=utf-8"})
public @ResponseBody List<Msg> shouDingDanExcelToTable(@RequestBody List<ShouDingDanFromExcel> shouDingDanFromExcels){
    System.out.println(shouDingDanFromExcels);
    boolean a=(shouDingDanFromExcels.get(0)==null);
    boolean b = "".equals(shouDingDanFromExcels.get(0).getOsNo());
    List<Msg> list=new ArrayList<>();
    Msg msg=new Msg();
    if((!a)&&(!b)){
       a1.saveShouDingDanFromExcelToTable(shouDingDanFromExcels);
        //数据已经传入controller
        msg.setMsg("shouDingDanExcelToTable_ShuJu_YiJing_ChuanDao_Controller");
    }else{
        //数据未能传到controller
        msg.setMsg("shouDingDanExcelToTable_ShuJu_WeiNeng_ChuanDao_Controller");
    }
    list.add(msg);
    ////////////////////////////////////////////////////////////////////////
    return list;
////////////////////////////////
}


//////////////////////////////////////////////////////////////////////////////////////////////
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
/////////////////////////////////////////////////////////////////////////////////////////////
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