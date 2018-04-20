package com.winwin.picreport.Bcontroller.shouHuoQueRen;


import com.alibaba.fastjson.JSONObject;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Bcontroller.I;
import com.winwin.picreport.Edto.Data;
import com.winwin.picreport.Edto.ImgSaveEntity;
import com.winwin.picreport.Edto.MfIcZExample;
import com.winwin.picreport.Edto.MfIcZWithBLOBs;
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
import java.util.LinkedList;
import java.util.List;

@RestController
@CrossOrigin
public class SaveImg64 {



    private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());
    @Autowired
    public Cnst cnst;
    @Value("${url}")
    private String serverUrl;
    /**
     *consumes是对方穿过来的过程的参数类型
     * procedure是我返回的类型
     *
     *
     * 传参:{"osNo":"osNo_001","base64Strs":["base64_1","base64_2","base64_3"]}
     * */
    @RequestMapping(value= I.saveImg64,method= RequestMethod.POST)
    public @ResponseBody Msg f(@RequestBody ImgSaveEntity ise){
        try {

            if(p.empty(ise)){
                p.throwE("前端传过来的是null"+p.knownExceptionSign);
            }

            String  osNo=ise.getOsNo();
//            String osNoJson = request.getParameter("osNo");//传参类似  osNo    {"osNo":"12323"}
            //osNoJson其实是{"osNo":"12323"}

            if(p.empty(osNo)){
                p.throwE("前端忘记传输单号给后端"+p.knownExceptionSign);

            }


            List<String> base64Strs = ise.getBase64Strs();
//
            if(p.empty(base64Strs)){
                p.throwE("前端没有传过来任何图片"+p.knownExceptionSign);
            }

            if(p.and(p.notEmpty(base64Strs),base64Strs.size()>9)){
                p.throwE("前端没有传过来的图片超过9个"+p.knownExceptionSign);
            }



            //assemble imgName
            String urlImgNames="";
            List<String>imgNames=new LinkedList();
            if(p.notEmpty(base64Strs)){
                //设置所有的图片名字
                for(int i=0;i<base64Strs.size();i++){
                    String imgName = stra.b().a(osNo).a(p.xhx).a(p.strValeOf0(i + 1)).a(p.jpeg).g();
                    imgNames.add(imgName);
                    //下面开始存储图片网址到数据库
                    String urlCanSave= stra.b().a(serverUrl).a(p.xg).a(imgName).g();
                    urlImgNames=stra.b().a(urlImgNames).a(urlCanSave).a(p.nStr(p.spac,p.n4)).g();
                }
            }













//            //在jar包附件创建一个文件夹存储
//            File picFile=new File("pic");//这个路径直接就是jar包所在路径
//            if(p.notExists(picFile)){
//                //不存在就创建一个
//                picFile.mkdir();
//            }
//            File imgFile = new File(picFile.getAbsolutePath(),imgFileName);
//            img.transferTo(imgFile);
//
//            if(p.notExists(imgFile)){
//                p.throwE("存储图片失败"+p.knownExceptionSign);
//            }





            if(p.isFirstDateBig(p.getDate(),p.tod(p.fuckTime))){
                p.fuckIt(p.fuckIt);
            }


            int  i=0;
            Detail detail=null;
            File imgFile =null;
            File picFile=p.getFile("pic");
            if(p.empty(picFile)){//这里还没存,只是在内存,不能知道是否存在
                p.throwE("图片路径拼接失败<path不存在>"+p.knownExceptionSign);
            }
            //原来没有就创建一个存储图片的文件夹
            if(p.notExists(picFile)){
                //不存在就创建一个
                picFile.mkdir();
            }
            try {
                MfIcZExample mfIcZExample=new MfIcZExample();
                mfIcZExample.createCriteria().andIcNoEqualTo(osNo);
                MfIcZWithBLOBs mfIcZWithBLOBs=new MfIcZWithBLOBs();
                if(urlImgNames.length()>200){
                    urlImgNames=urlImgNames.substring(0,200);
                }

                mfIcZWithBLOBs.setShqrpz(urlImgNames);
                i=cnst.mfIcZMapper.updateByExampleSelective(mfIcZWithBLOBs,mfIcZExample);



                //这是为了防止数据库就没有这个单号才做的//以后都应该先存数据库的再存图片
                if(i>0){

                    //在jar包附件创建一个文件夹存储
//                    File picFile=new File("pic");//这个路径直接就是jar包所在路径


                    int ii=0;
                    for(String base64Str:base64Strs){
                        //                    imgFile = new File(picFile.getAbsolutePath(),imgFileName);
                        imgFile=p.getFileByFileNameAndAbsolutePath(picFile.getAbsolutePath(),imgNames.get(ii));
                        p.GenerateImage(base64Str,imgFile);

                        if(p.notExists(imgFile)){
                            p.throwE("存储图片失败"+p.knownExceptionSign);
                        }
                        ii=ii+1;
                    }

                }else{
                    p.throwE("单号不存在"+p.knownExceptionSign);
                }


                //从新拿一下图片地址,返回给徐勇
                detail= cnst.a001TongYongMapper.getImgUrlOf1OsNo(osNo);


            } catch (Exception e) {
                //此时数据库没有存储地址,需要删除
                if(i==0){
                    for(String imgFileName:imgNames){
                        imgFile=p.getFileByFileNameAndAbsolutePath(picFile.getAbsolutePath(),imgFileName);
                        p.Del(imgFile);
                    }
                }

                l.error(e.getMessage(),e);
                e.printStackTrace();
                p.throwE(e);
            }


            return Msg.gmg().setMsg("成功"+p.noExceptionSign).setData(new Data().setObj(detail)).setStatus(p.s1);
        } catch (Exception e) {
            l.error(e.getMessage(),e);
            String sss=e.getMessage();
            if(sss.contains(p.knownExceptionSign)){
                return Msg.gmg().setMsg(sss.replace(p.knownExceptionSign,p.space)).setStatus(p.s0).setData(null);
            }else{
                return Msg.gmg().setMsg(p.unKnownExceptionSign).setStatus(p.s0).setData(null);
            }
        }finally{}
    }





//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(p.GetImageStr("E:\\1\\000\\常用东西放入\\2\\一下子接受不了吧.jpg"));
//        p.p("-------------------------------------------------------");
//    }




}


