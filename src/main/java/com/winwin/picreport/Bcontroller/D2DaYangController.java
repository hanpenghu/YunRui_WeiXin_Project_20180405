package com.winwin.picreport.Bcontroller;

import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Futils.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@Controller
@CrossOrigin
public class D2DaYangController {

    @RequestMapping(value = "insertExcelToDB", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public  void  confirmTheOrder(@RequestParam(value = "excel", required = false) MultipartFile excel) {
        String excelName= excel.getOriginalFilename();

    }


}
