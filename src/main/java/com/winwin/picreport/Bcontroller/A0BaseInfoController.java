package com.winwin.picreport.Bcontroller;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.AllConstant.StatusCnst;
import com.winwin.picreport.Edto.CurrentType;
import com.winwin.picreport.Edto.Data;
import com.winwin.picreport.Edto.KeHu;
import com.winwin.picreport.Edto.YeWuYuan;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@CrossOrigin
@RestController
@RequestMapping(InterFaceCnst.base)
public class A0BaseInfoController {
    @Autowired
    private Cnst cnst;
//////////////////////////////////////////////////////////////////////////
@RequestMapping(value=InterFaceCnst.allKeHu,method= RequestMethod.POST,produces = {InterFaceCnst.ContentTypeJsonAndCharsetUtf8})
    public @ResponseBody List<KeHu> getAllCustOf_obj_id_1_that_KeHuNotChangShang(){
         List<KeHu> keHus =cnst.manyTabSerch.getAllCustOf_obj_id_1_that_KeHuNotChangShang();
         return keHus;
    }


    //所有厂商接口
    @RequestMapping(value= InterFaceCnst.allFactory,method= RequestMethod.POST,produces = {InterFaceCnst.ContentTypeJsonAndCharsetUtf8})
    public @ResponseBody List<KeHu> getAll_obj_id_2_that_ChangShang(){
        List<KeHu> keHus =cnst.manyTabSerch.getAll_obj_id_2_that_ChangShang();
        return keHus;
    }

//    @RequestMapping(value="allKeHutest",method= RequestMethod.GET,produces = {InterFaceCnst.ContentTypeJsonAndCharsetUtf8})
//    public @ResponseBody List<KeHu> getAllCustOf_obj_id_1_that_KeHuNotChangShangtest(){
//        List<KeHu> keHus =cnst.manyTabSerch.getAllCustOf_obj_id_1_that_KeHuNotChangShang();
//        return keHus;
//    }
////////////////////////////////////////////////////////////////////////////////////////////
@RequestMapping(value=InterFaceCnst.allYeWuYuan,method= RequestMethod.POST,produces = {InterFaceCnst.ContentTypeJsonAndCharsetUtf8})
public @ResponseBody List<YeWuYuan> getAllYeWuYuan(){
    List<YeWuYuan> YeWuYuans =cnst.manyTabSerch.getAllYeWuYuan();
    return YeWuYuans;
}
////////////////////////////////////////////////////////////////////////////

    @RequestMapping(value=InterFaceCnst.CurrentType,method= RequestMethod.POST
            ,produces = {InterFaceCnst.ContentTypeJsonAndCharsetUtf8})
    public @ResponseBody Msg CurrentType(){
        List<CurrentType>currentTypeList=cnst.manyTabSerch.CurrentType();
        return Msg.gmg().setData(Data.gD().setCurrentTypeList(currentTypeList))
                .setStatus(StatusCnst.loginSucc).setChMsg("获得所有币别成功");
    }
/////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping(value=InterFaceCnst.allUnit,method= RequestMethod.POST
            ,produces = {InterFaceCnst.ContentTypeJsonAndCharsetUtf8})
    public @ResponseBody Msg allUnit(){
        //得到所有主单位
        List<String> units = cnst.manyTabSerch.allUnit();
        //得到所有副单位
        List<String> units1 = cnst.manyTabSerch.allUnit1();
        //得到去重复的工具
        Set<String> set=new HashSet<>();
        units.forEach(v->set.add(v.trim()));
        units1.forEach(v->set.add(v.trim()));
        //创建返回给前端的list
        List<String>currentTypeList=new ArrayList<>();
        set.forEach(v->currentTypeList.add(v));
        return Msg.gmg().setData(Data.gD().setUnitList(currentTypeList))
                .setStatus(StatusCnst.loginSucc).setChMsg("获得所有单位成功");
    }

/*    public static void main(String[]args){
//        Set<String> hashset=new TreeSet<>();
//        hashset.add("abc");
//        hashset.add("abc");
//        hashset.add("韩寒");
//        System.out.println(hashset);

        Set<String> set1=new HashSet<>();
        set1.add("abc");
        set1.add("abc");
        set1.add("韩寒");
        set1.add("韩寒");
        set1.add("韩寒1");
        System.out.println(set1);

    }*/
///////////////////////////////////////////////////////////////////////////////
}
/////////////////////////////////////////////////////////////