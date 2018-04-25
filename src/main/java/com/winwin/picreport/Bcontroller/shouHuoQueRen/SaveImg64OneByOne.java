package com.winwin.picreport.Bcontroller.shouHuoQueRen;


import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Bcontroller.I;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.stra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

@RestController
@CrossOrigin
public class SaveImg64OneByOne {



    private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());
    @Autowired
    public Cnst cnst;
    @Value("${url}")
    private String serverUrl;
    /**
     *consumes是对方穿过来的过程的参数类型
     * procedure是我返回的类型
     *
     *这个base64Strs数组里面只能传入一个
     * 传参:{"osNo":"osNo_001","base64Strs":["base64_1"]}
     *
     *
     * 这个接口后来用作一次上传过个图片
     *
     *
     *
     * */
private  int varcharOfUrlsLength=200;
    @Autowired
    private  SaveImg64OneByOneService saveImg64OneByOneService;


    @RequestMapping(value= I.saveImg64OneByOne,method= RequestMethod.POST)
    public @ResponseBody
    Msg f(@RequestBody ImgSaveEntity ise){
        Detail detail=null;
        try {

             detail=saveImg64OneByOneService.f(ise,varcharOfUrlsLength);

        } catch (Exception e) {
            l.error(e.getMessage(),e);
            String sss=e.getMessage();
            if(sss.contains(p.knownExceptionSign)){
                return Msg.gmg().setMsg(sss.replace(p.knownExceptionSign,p.space).replace(p.runTimeE,p.space)).setStatus(p.s0).setData(null);
            }else{
                return Msg.gmg().setMsg(p.unKnownExceptionSign).setStatus(p.s0).setData(null);
            }
        }
        return Msg.gmg().setMsg("成功"+p.noExceptionSign).setData(new Data().setObj(detail)).setStatus(p.s1);
    }



    @Autowired
    private SaveImgFormDataService saveImgFormDataService;



    //request.getParameter("osNo");//单号名字是osNo
    //{"imgs":["formData1","formData2"],"osNo":"1111"}

    @RequestMapping(value= I.saveImgFormData,method= RequestMethod.POST)
    public @ResponseBody
    Msg f1(@RequestParam("imgs")List<MultipartFile> imgs ,HttpServletRequest request){
        Detail detail=null;
        try {

            p.p("-------------------------------------------------------");
            p.p(imgs);
            p.p("-------------------------------------------------------");
            detail=saveImgFormDataService.f(imgs,request,varcharOfUrlsLength);

        } catch (Exception e) {
            l.error(e.getMessage(),e);
            String sss=e.getMessage();
            if(sss.contains(p.knownExceptionSign)){
                return Msg.gmg().setMsg(sss.replace(p.knownExceptionSign,p.space).replace(p.runTimeE,p.space)).setStatus(p.s0).setData(null);
            }else{
                return Msg.gmg().setMsg(p.unKnownExceptionSign).setStatus(p.s0).setData(null);
            }
        }
        return Msg.gmg().setMsg("成功"+p.noExceptionSign).setData(new Data().setObj(detail)).setStatus(p.s1);
    }








//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(p.GetImageStr("E:\\1\\000\\常用东西放入\\2\\一下子接受不了吧.jpg"));
//        p.p("-------------------------------------------------------");
//    }



    public static void main(String[]args){
        p.p("-------------------------------------------------------");
        p.p("http://127.0.0.1:8080/IC011602220001_1.jpeg  http://127.0.0.1:8080/IC011602220001_2.jpeg  http://127.0.0.1:8080/IC011602220001_3.jpeg  http://127.0.0.1:8080/IC011602220001_4.jpeg".length());
        p.p("-------------------------------------------------------");
    }



}
