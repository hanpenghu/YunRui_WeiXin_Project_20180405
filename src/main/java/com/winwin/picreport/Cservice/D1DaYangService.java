package com.winwin.picreport.Cservice;
import com.alibaba.fastjson.JSON;
import com.winwin.picreport.Ddao.reportxmlmapper.PrdtSampMapper;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Futils.MessageGenerate;
import com.winwin.picreport.Futils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class D1DaYangService {
    @Autowired
    private PrdtSampMapper prdtSampMapper;
    public List<Msg> ImageUpLoadAndDataSave001(String projectPath, MultipartFile thum,  MultipartFile attach, HttpServletRequest request,String daYangSuoLueTuAndFuJianZongPath,String dirUrl,String suoLueTuWenJianJia,String fuJianWenJianJia){
        try {

            String uuidstr = UUID.randomUUID().toString();
            String imageThumUrl="";
            String attachmentUrl="";
            /**
             *下面是保存缩略图和附件
             * */

            if(thum!=null){
                String thumImg= thum.getOriginalFilename();
                //缩略图和附件不能包含截取字符串的符号
                if(thumImg.contains("!")||thumImg.contains(";")){
                    return MessageGenerate.generateMessage("您的图片不能包含有!符号或者;符号","您的图片不能包含有!符号或者;符号！","","34");
                }else{

                    thumImg=uuidstr+"!"+thumImg;
                }
                //将缩略图保存在指定的目录
                thum.transferTo(new File(projectPath+daYangSuoLueTuAndFuJianZongPath.replace(".","")+suoLueTuWenJianJia, thumImg));
                //将缩略图在springboot中的资源定位url搞出来,将来给徐勇用于显示在页面,暂时保存在数据库
//                imageThumUrl=dirUrl+suoLueTuWenJianJia+thumImg+";";//分号是分隔符
                    //新思路,数据库不再存路径,只存名字,返回给前端的时候加上路径dirUrl
                    imageThumUrl=suoLueTuWenJianJia+thumImg+";";
                if(!new File(projectPath+daYangSuoLueTuAndFuJianZongPath.replace(".","")+suoLueTuWenJianJia, thumImg).exists()){
                    return MessageGenerate.generateMessage("保存失败","保存失败","缩略图没有保存成功导致所有数据没保存","","35");
                }

            }


            if(attach!=null){
                String attachment = attach.getOriginalFilename();
                //缩略图和附件不能包含截取字符串的符号
                if(attachment.contains("!")||attachment.contains(";")){
                    return MessageGenerate.generateMessage("您的缩略图不能包含有!符号或者;符号","您的缩略图不能包含有!符号或者;符号","","34");
                }else{
                    attachment=uuidstr+"!"+attachment;
                }
                //将附件保存在指定的目录
                attach.transferTo(new File(projectPath+daYangSuoLueTuAndFuJianZongPath.replace(".","")+fuJianWenJianJia, attachment));

                //将缩略图在springboot中的资源定位url搞出来,将来给徐勇用于显示在页面,暂时保存在数据库
//                attachmentUrl=dirUrl+fuJianWenJianJia+attachment+";";//分号是分隔符
                //新思路,数据库不再存路径,只存名字,返回给前端的时候加上路径dirUrl
                attachmentUrl=fuJianWenJianJia+attachment+";";
                if(!new File(projectPath+daYangSuoLueTuAndFuJianZongPath.replace(".","")+fuJianWenJianJia, attachment).exists()){
                    return MessageGenerate.generateMessage("保存失败","保存失败","附件没有保存成功导致所有数据没保存","","36");
                }
            }



            /**suoLueTuWenJianJia=suoLueTuWenJianJia/
             *   @Value("${suoLueTuWenJianJia}")
            private String suoLueTuWenJianJia;

             @Value("${fuJianWenJianJia}")
             private String fuJianWenJianJia;
              * */

            /**
             *下面是插入数据库数据用的
             * */
            String prdtSamp = request.getParameter("prdtSamp");//得到其他的text数据(PrdtSamp)
            PrdtSamp prdtSampOb = JSON.parseObject(prdtSamp, PrdtSamp.class);
            //注意,产品建档的时候直接插入缩略图url字段,将来update的时候得到原来的加上去
            prdtSampOb.setThum(imageThumUrl);//所有的缩略图都放在一个字段,将来分隔字符串拿到所有
            prdtSampOb.setAttach(attachmentUrl);
            prdtSampOb.setId(uuidstr);
            List<Msg> list=this.insertDaYang(prdtSampOb);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageGenerate.generateMessage("保存失败","保存失败","数据库系统级别错误","","38");
    }







    public List<Msg> ImageUpLoadAndDataSave002OfManyAttach(String projectPath, MultipartFile thum,  List<MultipartFile> attachList, HttpServletRequest request,String daYangSuoLueTuAndFuJianZongPath,String dirUrl,String suoLueTuWenJianJia,String fuJianWenJianJia){
        try {

            String uuidstr = UUID.randomUUID().toString();
            String imageThumUrl="";
            String attachmentUrl="";
            /**
             *下面是保存缩略图和附件
             * */

            if(thum!=null){
                String thumImg= thum.getOriginalFilename();
                //缩略图和附件不能包含截取字符串的符号
                if(thumImg.contains("!")||thumImg.contains(";")){
                    return MessageGenerate.generateMessage("您的图片不能包含有!符号或者;符号","您的图片不能包含有!符号或者;符号","","34");
                }else{

                    thumImg=uuidstr+"!"+thumImg;
                }
                //将缩略图保存在指定的目录
                thum.transferTo(new File(projectPath+daYangSuoLueTuAndFuJianZongPath.replace(".","")+suoLueTuWenJianJia, thumImg));
                //将缩略图在springboot中的资源定位url搞出来,将来给徐勇用于显示在页面,暂时保存在数据库
//                imageThumUrl=dirUrl+suoLueTuWenJianJia+thumImg+";";//分号是分隔符
                //新思路,数据库不再存路径,只存名字,返回给前端的时候加上路径dirUrl
                imageThumUrl=suoLueTuWenJianJia+thumImg+";";
                if(!new File(projectPath+daYangSuoLueTuAndFuJianZongPath.replace(".","")+suoLueTuWenJianJia, thumImg).exists()){
                    return MessageGenerate.generateMessage("保存失败","保存失败","缩略图没有保存成功导致所有数据没保存!","","35");
                }

            }

            for(MultipartFile attach:attachList){
                if(attach!=null){
                    String attachment = attach.getOriginalFilename();
                    //缩略图和附件不能包含截取字符串的符号
                    if(attachment.contains("!")||attachment.contains(";")){
                        return MessageGenerate.generateMessage("您的附件不能包含有!符号或者;符号","您的附件不能包含有!符号或者;符号","","34");
                    }else{
                        attachment=uuidstr+"!"+attachment;
                    }
                    //将附件保存在指定的目录
                    attach.transferTo(new File(projectPath+daYangSuoLueTuAndFuJianZongPath.replace(".","")+fuJianWenJianJia, attachment));

                    if(!new File(projectPath+daYangSuoLueTuAndFuJianZongPath.replace(".","")+fuJianWenJianJia, attachment).exists()){
                        return MessageGenerate.generateMessage("保存失败","保存失败","附件没有保存成功导致所有数据没保存!","","36");
                    }
                    //将缩略图在springboot中的资源定位url搞出来,将来给徐勇用于显示在页面,暂时保存在数据库
//                attachmentUrl=dirUrl+fuJianWenJianJia+attachment+";";//分号是分隔符
                    //新思路,数据库不再存路径,只存名字,返回给前端的时候加上路径dirUrl
                    attachmentUrl=attachmentUrl+fuJianWenJianJia+attachment+";";
                }
            }




            /**suoLueTuWenJianJia=suoLueTuWenJianJia/
             *   @Value("${suoLueTuWenJianJia}")
            private String suoLueTuWenJianJia;

             @Value("${fuJianWenJianJia}")
             private String fuJianWenJianJia;
              * */

            /**
             *下面是插入数据库数据用的
             * */
            String prdtSamp = request.getParameter("prdtSamp");//得到其他的text数据(PrdtSamp)
            PrdtSamp prdtSampOb = JSON.parseObject(prdtSamp, PrdtSamp.class);
            //注意,产品建档的时候直接插入缩略图url字段,将来update的时候得到原来的加上去
            prdtSampOb.setThum(imageThumUrl);//所有的缩略图都放在一个字段,将来分隔字符串拿到所有
            prdtSampOb.setAttach(attachmentUrl);
            prdtSampOb.setId(uuidstr);
            List<Msg> list=this.insertDaYang(prdtSampOb);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageGenerate.generateMessage("保存失败","保存失败","数据库系统级别错误","","38");
    }
















    public List<Msg> insertDaYang(PrdtSamp prdtSamp) {
        Integer ii= null;
        List<Msg> list;
        try {
            prdtSamp.setInsertdate(new Date());
            ii = prdtSampMapper.insert(prdtSamp);
        } catch (Exception e) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~打样保存一条数据失败!~~~~~~~~~~~~~~~~~~~~~~~~");
            return MessageGenerate.generateMessage("保存失败","保存失败","数据库系统级别错误","","38");
        }
        list = new MessageGenerate().generateMessage(""+ii+"","产品打样新增"+ii+"条数据","产品打样新增"+ii+"条数据","","37");
        return list;
    }
}
