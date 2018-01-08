package com.winwin.picreport.Cservice;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Ddao.reportxmlmapper.PrdtSampMapper;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSampExample;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.SpringbootJarPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;

@Transactional
@Service("deleteOneImg")
public class D1DaYangServiceOfDeleteOneImg {
//    @Value("${fuJianWenJianJia}")
//    private String fuJianWenJianJia;
//    @Value("${daYangSuoLueTuAndFuJianZongPath}")//./1234567/
//    private String daYangSuoLueTuAndFuJianZongPath;
//    @Value("${suoLueTuWenJianJia}")
//    private String suoLueTuWenJianJia;
    @Autowired
    private Cnst cnst;
    /**
     ****************************************************************************************
     * */
    //要删除的image如下
//"http://127.0.0.1:8070/suoLueTuWenJianJia/be1272e8-b8cc-467d-8c84-981af0a4b2af!通过域名找到IP.jpg"

    public List<Msg> deleteOneImage(String imgUrl) {
//        synchronized (this) {
            if(imgUrl==null){
                return MessageGenerate.generateMessage("您要删除的图片不存在",
                        "您要删除的图片不存在",
                        "您要删除的图片是null","", "43");
            }
            if(!imgUrl.contains("http://")){
                return MessageGenerate.generateMessage("您要删除的图片不存在",
                        "您要删除的图片不存在", "前端传过来的图片路径不合法"
                        ,"", "43");
            }
            if(!imgUrl.contains("!")){
                return MessageGenerate.generateMessage("您要删除的图片不存在",
                        "您要删除的图片不存在", "前端传过来的图片路径不合法",
                        "", "43");
            }

            File file = new File(getThumPath(imgUrl));
            if(file.exists()){
                file.delete();
            }
//下面更新数据库中字段
            String thumInDataBase = this.getThumInDataBase(imgUrl);
            System.out.println("thumInDataBase：：："+thumInDataBase);
            PrdtSampExample prdtSampExample=new PrdtSampExample();
            prdtSampExample.createCriteria().andThumLike("%"+thumInDataBase+"%");
            List<PrdtSamp> prdtSampList = cnst.prdtSampMapper.selectByExample(prdtSampExample);
//        System.out.println(prdtSampList);
//        PrdtSamp prdtSamp;
//        String newthums=null;
            if(prdtSampList.size()>0){
                PrdtSamp  prdtSamp=prdtSampList.get(0);
                //将数据库中的一堆缩略图路径中的要删除的那个替换成空字符串
                String newthums=prdtSamp.getThum().replace(thumInDataBase+";","");
                System.out.println("~~~~~~~~~~~~thumInDataBase~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(thumInDataBase);
                System.out.println(newthums);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
                if(newthums!=null){
                    int i=  cnst.manyTabSerch.updateThumColumn("%"+thumInDataBase+"%",newthums);
                    if(i==1){
                        return MessageGenerate.generateMessage("缩略图已经删除",
                                "缩略图已经删除",
                                "缩略图已经删除","", "44");
                    }
                }

            }else{
                System.out.println("List<PrdtSamp> prdtSampList = prdtSampMapper.selectByExample(prdtSampExample)得到的0size()");
            }


            return MessageGenerate.generateMessage("删除失败", "删除失败",
                    "您可能只删除了图片或者数据库记录之中的一个","", "45");
//        }
    }

    /**
     ****************************************************************************************
     * */

    public List<Msg> deleteOneAttach(String attachUrl) {
//        synchronized (this) {
            if(attachUrl==null){
                return MessageGenerate.generateMessage("您要删除的附件不存在",
                        "您要删除的附件不存在",
                        "您要删除的附件是null","", "43");
            }
            if(!attachUrl.contains("http://")){
                return MessageGenerate.generateMessage("您要删除的附件不存在",
                        "您要删除的附件不存在", "前端传过来的附件路径不合法"
                        ,"", "43");
            }
            if(!attachUrl.contains("!")){
                return MessageGenerate.generateMessage("您要删除的附件不存在",
                        "您要删除的附件不存在", "前端传过来的附件路径不合法",
                        "", "43");
            }

            File file = new File(getAttachPath(attachUrl));
            if(file.exists()){
                file.delete();
            }
//下面更新数据库中字段
            /**
             *上面删除的是文件夹中的文件,下面删除的是数据库的中文件记录
             * */
            String attachInDataBase = this.getAttachInDataBase(attachUrl);
            PrdtSampExample prdtSampExample=new PrdtSampExample();
            prdtSampExample.createCriteria().andAttachLike("%"+attachInDataBase+"%");
            List<PrdtSamp> prdtSampList = cnst.prdtSampMapper.selectByExample(prdtSampExample);
            PrdtSamp prdtSamp;
            String newAttachs=null;
            if(prdtSampList.size()>0){
                prdtSamp=prdtSampList.get(0);
                //将数据库中的一堆缩略图路径中的要删除的那个替换成空字符串
                newAttachs=prdtSamp.getAttach().replace(attachInDataBase+";","");
                if(newAttachs!=null){
                    int i=  cnst.manyTabSerch.updateAttachColumn("%"+attachInDataBase+"%",newAttachs);
                    if(i==1){
                        return MessageGenerate.generateMessage("附件已经删除", "附件已经删除", "附件已经删除","", "44");
                    }
                }

            }


            return MessageGenerate.generateMessage("删除失败", "删除失败", "您可能只删除了附件或者数据库记录之中的一个","", "45");
//        }
    }
    /**
     ****************************************************************************************
     * */
public String getThumPath(String httpurl){
    return SpringbootJarPath.JarLuJingGet()+
            cnst.daYangSuoLueTuAndFuJianZongPath.replace(".","")+getThumInDataBase(httpurl);
}

public String getThumInDataBase(String url){
//    String url="http://127.0.0.1:8070/suoLueTuWenJianJia/be1272e8-b8cc-467d-8c84-981af0a4b2af!通过域名找到IP.jpg";
    int i = url.indexOf(cnst.suoLueTuWenJianJia);
    String substring = url.substring(i);
    return substring;
}



    /**
     ****************************************************************************************
     * */


    public String getAttachPath(String httpurl){
        return SpringbootJarPath.JarLuJingGet()+
                cnst.daYangSuoLueTuAndFuJianZongPath.replace(".","")+getAttachInDataBase(httpurl);
    }
    public String getAttachInDataBase(String url){
//    String url="http://127.0.0.1:8070/suoLueTuWenJianJia/be1272e8-b8cc-467d-8c84-981af0a4b2af!通过域名找到IP.jpg";
        int i = url.indexOf(cnst.fuJianWenJianJia);
        String substring = url.substring(i);
        return substring;
    }

//    public static void main(String[]args){
//        String str="http://127.0.0.1:8070/suoLueTuWenJianJia/be1272e8-b8cc-467d-8c84-981af0a4b2af!通过域名找到IP.jpg";
//        int i = str.indexOf("suoLueTuWenJianJia/");
//        String substring = str.substring(i);
//        System.out.println(substring);
//        //suoLueTuWenJianJia/be1272e8-b8cc-467d-8c84-981af0a4b2af!通过域名找到IP.jpg
//    }

    /**
     ****************************************************************************************
     * */
}
