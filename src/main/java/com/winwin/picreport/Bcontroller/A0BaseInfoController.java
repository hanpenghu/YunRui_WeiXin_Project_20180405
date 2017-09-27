package com.winwin.picreport.Bcontroller;

import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import com.winwin.picreport.Edto.KeHu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/base")
public class A0BaseInfoController {
    @Autowired
    private ManyTabSerch manyTabSerch;
//////////////////////////////////////////////////////////////////////////
@RequestMapping(value="allKeHu",method= RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public @ResponseBody List<KeHu> getAllCustOf_obj_id_1_that_KeHuNotChangShang(){
         List<KeHu> keHus =manyTabSerch.getAllCustOf_obj_id_1_that_KeHuNotChangShang();
         return keHus;
    }

////////////////////////////////////////////////////////////////////////////
}
///////////////////////////////////////////////////////////////////////////