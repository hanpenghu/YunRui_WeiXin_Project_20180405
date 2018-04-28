package com.winwin.picreport.Bcontroller.shouHuoQueRen;


import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.stra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service
@Transactional
public class SaveImg64OneByOneService {
    @Value("${url}")
    private String serverUrl;
    @Autowired
    public Cnst cnst;
    @Transactional
    public Detail  f(ImgSaveEntity ise,int varcharOfUrlsLength){

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
            p.throwE("前端传过来的图片超过9个"+p.knownExceptionSign);
        }





        //查找数据库最大的那个url的后缀  maxSufix
        MfIcZExample mfIcZExample1=new MfIcZExample();
        mfIcZExample1.createCriteria().andIcNoEqualTo(osNo);
        List<MfIcZ> mfIcZS1 = cnst.mfIcZMapper.selectByExample(mfIcZExample1);
        String allUrls="";
        if(p.empty(mfIcZS1)){
            p.throwE("数据库没有这个单号: "+osNo+"！"+p.knownExceptionSign);
        }
        if(p.notEmpty(mfIcZS1)){
            allUrls=mfIcZS1.get(0).getShqrpz();
            if(p.notEmpty(allUrls)){
                allUrls=allUrls.trim()+p.nStr(p.spac,p.n2);
            }
        }



        List<String> urls1=new LinkedList<>();
        if(p.notEmpty(allUrls)){
            if(p.notEmpty(allUrls.trim())){
                urls1 = p.chaiFenZuHeFenGeFu(allUrls, p.nStr(p.spac,p.n2), p.n2);
            }
        }

        int maxSufix=0;
        List<String>sufixStrs=new LinkedList<>();
        if(p.notEmpty(urls1)){
            for(String url:urls1){
                String substring = url.substring(url.indexOf(p.xhx) + 1);
                substring=substring.replace(p.jpeg,p.space);
                substring=substring.replace(p.jpg,p.space);
                sufixStrs.add(substring);
            }
            Collections.sort(sufixStrs);
        }

        if(p.notEmpty(sufixStrs)){
            maxSufix=Integer.valueOf(sufixStrs.get(sufixStrs.size()-1));
        }
        p.p("-------------所有后缀集合------------------------------------------");
        p.p(sufixStrs);
        p.p("-------------------------------------------------------");






        //assemble imgName
        String urlImgNames="";
        List<String>imgNames=new LinkedList();
        if(p.notEmpty(base64Strs)){
            //设置所有的图片名字
            for(int i=0;i<base64Strs.size();i++){
                String imgName = stra.b().a(osNo).a(p.xhx).a(p.strValeOf0(i + 1+maxSufix)).a(p.jpeg).g();
                imgNames.add(imgName);
                //下面开始存储图片网址到数据库
                String urlCanSave= stra.b().a(serverUrl).a(p.xg).a(imgName).g();
                urlImgNames=stra.b().a(urlImgNames).a(urlCanSave).a(p.nStr(p.spac,p.n2)).g();
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
        int k=0;
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

            MfIcZExample mfIcZExample=new MfIcZExample();
            mfIcZExample.createCriteria().andIcNoEqualTo(osNo);
            MfIcZWithBLOBs mfIcZWithBLOBs=new MfIcZWithBLOBs();
//                if(urlImgNames.length()>200){
//                    urlImgNames=urlImgNames.substring(0,200);
//                }

            // select original shqrpz
            List<MfIcZ> mfIcZS = cnst.mfIcZMapper.selectByExample(mfIcZExample);
            String shqrpzOriginal=p.space;
            if(p.notEmpty(mfIcZS)){
                shqrpzOriginal = mfIcZS.get(0).getShqrpz();
                shqrpzOriginal=(shqrpzOriginal==null?"":shqrpzOriginal);
            }


            //trim started 2 space//keep the most back 2 space//后置分隔符, 2个空格
            String urls = (shqrpzOriginal + p.nStr(p.spac,p.n2)+ urlImgNames).trim()+p.nStr(p.spac,p.n2);
            if(urls.length()>varcharOfUrlsLength){
                p.throwE("shqrpz字段中的所有网址字符串长度超过系统设定长度"+p.knownExceptionSign);
            }


            mfIcZWithBLOBs.setShqrpz(urls);
            i=cnst.mfIcZMapper.updateByExampleSelective(mfIcZWithBLOBs,mfIcZExample);

        /**
         *2018_4_28   weekday(6)   14:44:01
         * 老郑让加上备注,到tf_ic 一份标注
         * */
            TfIcExample tfIcExample=new TfIcExample();
            tfIcExample.createCriteria().andIcNoEqualTo(osNo);
            TfIc tfIc=new TfIc();
            tfIc.setRem(Cnst.youShouHuoQueRenPinZheng);
            k=cnst.tfIcMapper.updateByExampleSelective(tfIc,tfIcExample);



            //这是为了防止数据库就没有这个单号才做的//以后都应该先存数据库的再存图片
            if(i>0&&k>0){

                //在jar包附件创建一个文件夹存储
//                    File picFile=new File("pic");//这个路径直接就是jar包所在路径


                int ii=0;
                for(String base64Str:base64Strs){

                    p.p("-------------------开始---保存第一个--base64图片开始-----"+p.dtoStr(p.getDate(),"yyyy-MM-dd HH:ss:mm,SSS")+"--------------------------");
                    //                    imgFile = new File(picFile.getAbsolutePath(),imgFileName);
                    imgFile=p.getFileByFileNameAndAbsolutePath(picFile.getAbsolutePath(),imgNames.get(ii));
                    p.GenerateImage(base64Str,imgFile);

//                    if(p.notExists(imgFile)){
//                        p.throwE("存储图片失败"+p.knownExceptionSign);
//                    }
                    p.p("------------------结束---保存第一个--base64图片结束----------"+p.dtoStr(p.getDate(),"yyyy-MM-dd HH:ss:mm,SSS")+"---------------------------");
                    ii=ii+1;
                }

            }else{
                p.throwE("单号不存在"+p.knownExceptionSign);
            }


            //从新拿一下图片地址,返回给徐勇
            detail= cnst.a001TongYongMapper.getImgUrlOf1OsNo(osNo);



            return detail;




    }




}
