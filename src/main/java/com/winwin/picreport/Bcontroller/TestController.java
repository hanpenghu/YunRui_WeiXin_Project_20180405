package com.winwin.picreport.Bcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "~~~~~~~~~~TongLe~~~~~~~~~~~~";
    }

    @RequestMapping("/test1")
    public String test1(){
        return "~~~~~~~~~~TongLe~~~1~~~~~~~~~";
    }
    @RequestMapping("/test2")
    public String test2(){
        return "~~~~~~~~~~TongLe~~~2~~~~~~~~~";
    }
}
