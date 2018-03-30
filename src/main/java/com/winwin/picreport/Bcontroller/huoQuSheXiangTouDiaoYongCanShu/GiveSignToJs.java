package com.winwin.picreport.Bcontroller.huoQuSheXiangTouDiaoYongCanShu;


import com.winwin.picreport.Bcontroller.I;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GiveSignToJs {



    @RequestMapping(value= I.signToJs)
    public @ResponseBody JsParams f(){
        return  SignParamGet.f();
    }




}
