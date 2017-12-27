package com.winwin.picreport.Bcontroller;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Edto.KeHu;
import com.winwin.picreport.Edto.YeWuYuan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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

/////////////////////////////////////////////////////////////////////////////////
}
///////////////////////////////////////////////////////////////////////////