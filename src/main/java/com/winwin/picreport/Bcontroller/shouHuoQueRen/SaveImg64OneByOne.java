package com.winwin.picreport.Bcontroller.shouHuoQueRen;


import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Bcontroller.I;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.linklistT;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.stra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
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
private  int varcharOfUrlsLength=600;
    @Autowired
    private  SaveImg64OneByOneService saveImg64OneByOneService;


    /**
     *虽然名字起的是OneByOne,但是实际上是一个数组就过去了
     * */
    @RequestMapping(value= I.saveImg64OneByOne,method= RequestMethod.POST)
    public @ResponseBody
    Msg f(@RequestBody ImgSaveEntity ise){
        p.p("--------开始了-----"+p.dtoStr(p.getDate(),"yyyy-MM-dd HH:mm:ss,sss")+"------------------------------------------");
        p.p("前端数据过来开始");
        p.p("-------------------------------------------------------");
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
        p.p("----------结束了-"+p.dtoStr(p.getDate(),"yyyy-MM-dd HH:mm:ss,sss")+"--------------------------------------------");
        p.p("后端数据保存完成");
        p.p("-------------------------------------------------------");
        return Msg.gmg().setMsg("成功"+p.noExceptionSign).setData(new Data().setObj(detail)).setStatus(p.s1);
    }



    @Autowired
    private SaveImgFormDataService saveImgFormDataService;



    //request.getParameter("osNo");//单号名字是osNo
    //{"imgs":["formData1","formData2"],"osNo":"1111"}

    @RequestMapping(value= I.saveImgFormData,method= RequestMethod.POST
            ,consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE )
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






    @RequestMapping(value= I.saveImgFormData001,method= RequestMethod.POST
            ,consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE )
    public @ResponseBody
    Msg f1(@RequestParam(value="img1",required = false)MultipartFile img1 ,
           @RequestParam(value="img2",required = false)MultipartFile img2 ,
           @RequestParam(value="img3",required = false)MultipartFile img3 ,
           @RequestParam(value="img4",required = false)MultipartFile img4 ,
           @RequestParam(value="img5",required = false)MultipartFile img5 ,
           @RequestParam(value="img6",required = false)MultipartFile img6 ,
           @RequestParam(value="img7",required = false)MultipartFile img7 ,
           @RequestParam(value="img8",required = false)MultipartFile img8 ,
           @RequestParam(value="img9",required = false)MultipartFile img9 ,
           HttpServletRequest request){

        p.p("----------------img1到img9---------------------------------------");
        p.p(img1);
        p.p(img2);
        p.p(img3);
        p.p(img4);
        p.p(img5);
        p.p(img6);
        p.p(img7);
        p.p(img8);
        p.p(img9);
        p.p("-------------------------------------------------------");


        p.p("--------------------开始时间-----------------------------------");
        p.p(p.dtoStr(p.getDate(),"yyyy-MM-dd HH:mm:ss,sss"));
        p.p("-------------------------------------------------------");
        List<MultipartFile>imgs=new LinkedList<>();
        if(null!=img1&&img1.getSize()>0){
            imgs.add(img1);
        }
        if(null!=img2&&img2.getSize()>0){
            imgs.add(img2);
        }
        if(null!=img3&&img3.getSize()>0){
            imgs.add(img3);
        }
        if(null!=img4&&img4.getSize()>0){
            imgs.add(img4);
        }
        if(null!=img5&&img5.getSize()>0){
            imgs.add(img5);
        }
        if(null!=img6&&img6.getSize()>0){
            imgs.add(img6);
        }
        if(null!=img7&&img7.getSize()>0){
            imgs.add(img7);
        }
        if(null!=img8&&img8.getSize()>0){
            imgs.add(img8);
        }
        if(null!=img9&&img9.getSize()>0){
            imgs.add(img9);
        }



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

        p.p("--------------------结束时间-----------------------------------");
        p.p(p.dtoStr(p.getDate(),"yyyy-MM-dd HH:mm:ss,sss"));
        p.p("-------------------------------------------------------");
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
