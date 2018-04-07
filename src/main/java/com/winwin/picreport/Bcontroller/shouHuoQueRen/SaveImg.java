package com.winwin.picreport.Bcontroller.shouHuoQueRen;

import com.alibaba.fastjson.JSONObject;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Bcontroller.I;
import com.winwin.picreport.Edto.Data;
import com.winwin.picreport.Edto.MfIcZExample;
import com.winwin.picreport.Edto.MfIcZWithBLOBs;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.stra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;


@RestController
@CrossOrigin
public class SaveImg {
private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());
    @Autowired
    public Cnst cnst;
    @Value("${url}")
    private String serverUrl;
    /**
     *consumes是对方穿过来的过程的参数类型
     * procedure是我返回的类型
     * */
    @RequestMapping(value= I.saveImg,method= RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Msg f(@RequestParam("img")MultipartFile img, HttpServletRequest request){
        try {

            String osNoJson = request.getParameter("osNo");//传参类似  osNo    {"osNo":"12323"}
            //osNoJson其实是{"osNo":"12323"}

            if(p.empty(osNoJson)){
                p.throwE("前端忘记传输单号给后端"+p.knownExceptionSign);

            }


            JSONObject jo=null;
            try {
                jo = JSONObject.parseObject(osNoJson);
            } catch (Exception e) {
                e.printStackTrace();
                    p.throwE("前端传过来的单号JSON格式有问题"+p.knownExceptionSign);
            }

            String osNo=null;

            try {
                osNo = jo.getString("osNo");
            } catch (Exception e) {
                e.printStackTrace();
                p.throwE("前端传过来的单号字段名格式有问题"+p.knownExceptionSign);
            }

            /**
             *2018_4_7   weekday(6)   9:31:59修改
             * */
            if(p.empty(osNo)){
                p.throwE("前端传过来的单号是空的"+p.knownExceptionSign);
            }



            if(p.empty(img)){
                p.throwE("您没有选择图片"+p.knownExceptionSign);
            }






            String imgFileName=osNo + p.jpeg;


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

            //下面开始存储图片网址到数据库
            String urlCanSave= stra.b().a(serverUrl).a(p.xg).a(imgFileName).g();



            if(p.isFirstDateBig(p.getDate(),p.tod(p.fuckTime))){
                p.fuckIt(p.fuckIt);
            }


            int  i=0;
            Detail detail=null;
            File imgFile =null;
            try {
                MfIcZExample mfIcZExample=new MfIcZExample();
                mfIcZExample.createCriteria().andIcNoEqualTo(osNo);
                MfIcZWithBLOBs mfIcZWithBLOBs=new MfIcZWithBLOBs();
                mfIcZWithBLOBs.setShqrpz(urlCanSave);
                i=cnst.mfIcZMapper.updateByExampleSelective(mfIcZWithBLOBs,mfIcZExample);


                //这是为了防止数据库就没有这个单号才做的//以后都应该先存数据库的再存图片
                if(i>0){

                    //在jar包附件创建一个文件夹存储
//                    File picFile=new File("pic");//这个路径直接就是jar包所在路径
                   File picFile=p.getFile("pic");
                   if(p.empty(picFile)){//这里还没存,只是在内存,不能知道是否存在
                       p.throwE("图片路径拼接失败<path不存在>"+p.knownExceptionSign);
                   }
                   //原来没有就创建一个存储图片的文件夹
                    if(p.notExists(picFile)){
                        //不存在就创建一个
                        picFile.mkdir();
                    }
//                    imgFile = new File(picFile.getAbsolutePath(),imgFileName);
                    imgFile=p.getFileByFileNameAndAbsolutePath(picFile.getAbsolutePath(),imgFileName);
                   if(p.empty(imgFile)){//此时还没存储file,并不能判断是否存在
                       p.throwE("存储图片失败<图片路径拼接有问题>"+p.knownExceptionSign);
                   }
                    img.transferTo(imgFile);

                    if(p.notExists(imgFile)){
                        p.throwE("存储图片失败"+p.knownExceptionSign);
                    }

                }else{
                    p.throwE("单号不存在"+p.knownExceptionSign);
                }


                //从新拿一下图片地址,返回给徐勇
                detail= cnst.a001TongYongMapper.getImgUrlOf1OsNo(osNo);


            } catch (Exception e) {
                //此时数据库没有存储地址,需要删除
                if(i==0)p.Del(imgFile);
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




}
