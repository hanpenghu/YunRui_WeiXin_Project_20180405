package com.winwin.picreport.Bcontroller;

import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import com.winwin.picreport.Edto.ChaXunTiaoJian;
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
    public @ResponseBody List<SalePrdDetailTab1> salePrdDetailTab1(@RequestBody ChaXunTiaoJian chaXunTiaoJian){
        List<SalePrdDetailTab1> listAll=new ArrayList<>();
        //循环所有的cus_no
        chaXunTiaoJian.getCus_no().forEach((cus_no)-> listAll.addAll(manyTabSerch.salePrdDetailTab1(chaXunTiaoJian,cus_no)));
        return listAll;
    }

}
