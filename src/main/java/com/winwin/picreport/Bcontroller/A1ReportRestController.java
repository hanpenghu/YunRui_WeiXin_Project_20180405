package com.winwin.picreport.Bcontroller;
import com.winwin.picreport.Cservice.A1ReportRestService;
import com.winwin.picreport.Edto.ShouDingDanFromExcel;
import com.winwin.picreport.Futils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
//    System.out.println(shouDingDanFromExcels);
    List<Msg> listmsg=new ArrayList<>();
    try {
        boolean a=(shouDingDanFromExcels.get(0)==null);
        boolean c=shouDingDanFromExcels.get(0).getOsNo()==null;
        boolean b = "".equals(shouDingDanFromExcels.get(0).getOsNo());
        boolean d = "undefined".equals(shouDingDanFromExcels.get(0).getOsNo());

        Msg msg=new Msg();
        if(!a||!c||!b||!d){
            //guo lv suo you bu chong fu de osNo
            //分离出所有不相同的订单号
            Set<String> set=new HashSet();

            for(ShouDingDanFromExcel shouDingDanFromExcel:shouDingDanFromExcels){
                set.add(shouDingDanFromExcel.getOsNo().trim());
            }
//            System.out.println(set);
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

//            System.out.println(list1);
            for(List<ShouDingDanFromExcel> list3:list1){
                try {
                    a1.saveYiPiDingDanHaoXiangTongDe(list3,listmsg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            msg.setMsg("数据插入成功");
        }else{
            msg.setMsg("第一条数据就没有OsNo(订单号),拒绝所有操作,检查您的数据信息再次插入");
        }

        listmsg.add(msg);

        if(listmsg.size()>1){
            for(Msg msg11:listmsg){
                if("数据插入成功".equals(msg11.getMsg())){
                        listmsg.remove(msg11);
                }
            }
        }


    } catch (Exception e) {
        e.printStackTrace();
    }
    ////////////////////////////////////////////////////////////////////////
    return listmsg;
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