package com.winwin.picreport.Bcontroller;

import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import com.winwin.picreport.Edto.SalePrdDetailTab1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/c1")
public class C1SalePrdtDetailToExcelController {
    @Autowired
    private ManyTabSerch manyTabSerch;
    @RequestMapping(value="salePrdDetailTab1",method = RequestMethod.POST,produces ={"application/json;charset=utf-8"})
    public @ResponseBody List<SalePrdDetailTab1> salePrdDetailTab1(){
        List<SalePrdDetailTab1> list=new ArrayList<>();
        list = manyTabSerch.salePrdDetailTab1();
        return list;
    }
}
