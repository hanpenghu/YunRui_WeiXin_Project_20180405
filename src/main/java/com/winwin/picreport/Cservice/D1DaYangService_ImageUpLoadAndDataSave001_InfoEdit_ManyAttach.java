package com.winwin.picreport.Cservice;
import com.alibaba.fastjson.JSON;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Ddao.reportxmlmapper.PrdtSampMapper;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSamp0;
import com.winwin.picreport.Futils.*;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("infoEditOfManyAttach")
public class D1DaYangService_ImageUpLoadAndDataSave001_InfoEdit_ManyAttach {
    @Autowired
    private Cnst cnst;

//    @Value("${daYangSuoLueTuAndFuJianZongPath}")//./1234567/
//    private String daYangSuoLueTuAndFuJianZongPath;
//
//    @Value("${suoLueTuWenJianJia}")
//    private String suoLueTuWenJianJia;
//
//    @Value("${fuJianWenJianJia}")
//    private String fuJianWenJianJia;
    @Transactional
    public List<Msg> infoEditOfManyAttach(MultipartFile thum ,
                                          List<MultipartFile> attachList,
                                          String prdtSamp1) throws Exception {
//        synchronized (this) {
            String uuid = UUID.randomUUID().toString();//给新的图片和缩略图的名字用,更新的时候并没有用这个uuid ,用的还是原来的
            String projectPath = SpringbootJarPath.JarLuJingGet();


            if (thum != null &&
                    (thum.getOriginalFilename().contains("!")
                            || thum.getOriginalFilename().contains(";"))) {
                return MessageGenerate.generateMessage
                        ("您的图片不能包含有!符号或者;符号",
                        "您的图片不能包含有!符号或者;符号", "", "34");
            }


            PrdtSamp0 prdtSampOb=null;
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//            p.p("");p.p("");p.p("");p.p("");p.p("");p.p("");p.p("");
//            p.p(prdtSamp1);
//            p.p("");p.p("");p.p("");p.p("");p.p("");p.p("");p.p("");
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
            if(prdtSamp1!=null&&!"".equals(prdtSamp1)){
                prdtSampOb = JSON.parseObject(prdtSamp1, PrdtSamp0.class);
            }

            if (NotEmpty.notEmpty(prdtSampOb)) {
                if (!NotEmpty.notEmpty(prdtSampOb.getId())) {
                    return MessageGenerate.generateMessage("保存失败", "保存失败", "前端没有传输过来唯一标志id", "", "40");
                }
            } else {
                return MessageGenerate.generateMessage("保存失败", "保存失败",
                        "前后端传输错误,prdtSamp这个参数后端接收不到", "", "39");
            }


            //得到这个prdtSamp只为了得到当前主键下面的缩略图路径thum字段和附件字段attach
            PrdtSamp prdtSamp = cnst.prdtSampMapper.selectByPrimaryKey(prdtSampOb.getId());

            if(prdtSamp==null){
                return MessageGenerate.generateMessage("保存失败", "保存失败",
                        "您穿过来的主键id在数据库冇存在", "", "46");
            }

            /**
             *下面是将图片路径和其它信息更新到数据库
             * */
            //通过主键得到当前的缩略图路径字段thum
            String imageThumUrl = prdtSamp.getThum();
//        String attachmentUrl = prdtSamp.getAttach();

            /**
             *当thum不是空的时候,我们更新缩略图的存储(数据库更新地址,图库添加新图)
             * */
            if (thum != null) {
                //将缩略图保存在指定的目录
                thum.transferTo(new File(projectPath + cnst.daYangSuoLueTuAndFuJianZongPath.replace(".", "") + cnst.suoLueTuWenJianJia, uuid + "!" + thum.getOriginalFilename()));
                if (!new File(projectPath + cnst.daYangSuoLueTuAndFuJianZongPath.replace(".", "") + cnst.suoLueTuWenJianJia, uuid + "!" + thum.getOriginalFilename()).exists()) {
                    return MessageGenerate.generateMessage("保存失败", "保存失败", "缩略图没有保存成功导致所有数据没保存！", "", "35");
                }

                if (imageThumUrl == null) {
                    imageThumUrl = "";
                }//第一次没上传任何东西可能是空
                //给缩略图添加一个新的路径进去,用;号隔开路径，
                //            imageThumUrl=imageThumUrl+dirUrl+suoLueTuWenJianJia+uuid+"!"+thum.getOriginalFilename()+";";//分号是分隔符
                //新思路,数据库不再存路径,只存名字,返回给前端的时候加上路径dirUrl
                imageThumUrl = imageThumUrl + cnst.suoLueTuWenJianJia + uuid + "!" + thum.getOriginalFilename() + ";";
            }
            if ("".equals(imageThumUrl)) {
                imageThumUrl = null;//为了是null的时候不更新这个字段
            }


            prdtSampOb.setThum(imageThumUrl);
//        prdtSampOb.setAttach(attachmentUrl);//在这里不再更新附件,因为附件有多个,放在最后单独更新
            prdtSampOb = this.prdtSampWhereSpaceToNull(prdtSampOb);//把""变成null,避免不必要的更新
            prdtSampOb.setIsconfirm(null);
            //Selective是不更新null
            if (cnst.prdtSampMapper.updateByPrimaryKeySelective(prdtSampOb) == 0) {
                return MessageGenerate.generateMessage("保存失败", "保存失败", "数据库系统级别错误", "", "38");
            }

            /**
             *下面是保存多个附件8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888
             * */
            for(MultipartFile attach:attachList){
                PrdtSamp0 prdtSampO=new PrdtSamp0();
                //得到这个prdtSamp只为了得到当前主键下面的缩略图路径thum字段和附件字段attach
                PrdtSamp prdtsa = cnst.prdtSampMapper.selectByPrimaryKey(prdtSampOb.getId());
                String attachmentUr = prdtsa.getAttach();
                String uid = UUID.randomUUID().toString();
                ////////////////////////////////////////////////for开始/////////////////////////////////////////////////////
                if (attach != null && (attach.getOriginalFilename().contains("!") || attach.getOriginalFilename().contains(";"))) {
                    return MessageGenerate.generateMessage("您的缩略图不能包含有!符号或者;符号", "您的缩略图不能包含有!符号或者;符号", "", "34");
                }


                String s1 = projectPath + cnst.daYangSuoLueTuAndFuJianZongPath.replace(".", "") + cnst.fuJianWenJianJia;
                if (attach != null) {
                    //将附件保存在指定的目录
                    attach.transferTo(new File(s1, uid + "!" + attach.getOriginalFilename()));
                    if (!new File(s1, uid + "!" + attach.getOriginalFilename()).exists()) {
                        return MessageGenerate.generateMessage("保存失败", "保存失败", "附件没有保存成功导致所有数据没保存！", "", "36");
                    }
                    if (attachmentUr == null) {
                        attachmentUr = "";
                    }//第一次没上传任何东西可能是空

                    //给缩略图添加一个新的路径进去,用;号隔开路径
                    //            attachmentUrl=attachmentUrl+dirUrl+fuJianWenJianJia+uuid+"!"+attach.getOriginalFilename()+";";//分号是分隔符
                    //            attachmentUrl=attachmentUrl+dirUrl+fuJianWenJianJia+uuid+"!"+attach.getOriginalFilename()+";";
                    //新思路,数据库不再存路径,只存名字,返回给前端的时候加上路径dirUrl
                    attachmentUr = attachmentUr + cnst.fuJianWenJianJia + uid + "!" + attach.getOriginalFilename() + ";";
                }
                if ("".equals(attachmentUr)) {
                    attachmentUr = null;//为了是null的时候不更新这个字段
                }


                prdtSampO.setId(prdtSampOb.getId());
                //只更新附件
                prdtSampO.setAttach(attachmentUr);//在这里不再更新附件,因为附件有多个,放在最后单独更新
                prdtSampO = this.prdtSampWhereSpaceToNull(prdtSampO);//把""变成null,避免不必要的更新
                prdtSampO.setIsconfirm(null);//不更新这个
                //Selective是不更新null
                if (cnst.prdtSampMapper.updateByPrimaryKeySelective(prdtSampO) == 0) {
                    return MessageGenerate.generateMessage("保存失败", "保存失败",
                            "数据库系统级别错误,保存某个Attach的路径时候出错", "", "38");
                }else{

                }
                if (attach!=null&&!new File(s1, uid + "!" + attach.getOriginalFilename()).exists()) {
                    throw new RuntimeException(MessageGenerate.generateMessage("保存失败", "保存失败", "附件没有保存成功导致所有数据没保存！", "", "36").toString());
                }
                ////////////////////////////////////////////////for结束/////////////////////////////////////////////////////
            }

            return MessageGenerate.generateMessage("保存成功", "保存成功",
                    "编辑更新一条打样数据成功", "", "37");
        }


//        return MessageGenerate.generateMessage("保存失败", "保存失败", "附件没有保存成功导致所有数据没保存！", "", "36");
//    }

    @Transactional
    public PrdtSamp0 prdtSampWhereSpaceToNull(PrdtSamp0 prdtSamp) {
        if ("".equals(prdtSamp.getPrdCode())) {
            prdtSamp.setPrdCode(null);
        }
        if ("".equals(prdtSamp.getIdxName())) {
            prdtSamp.setIdxName(null);
        }//
        if ("".equals(prdtSamp.getIdxNo())) {
            prdtSamp.setIdxNo(null);
        }//
        if ("".equals(prdtSamp.getMarkName())) {
            prdtSamp.setMarkName(null);
        }//
        if ("".equals(prdtSamp.getMarkNo())) {
            prdtSamp.setMarkNo(null);
        }//
        if ("".equals(prdtSamp.getColour())) {
            prdtSamp.setColour(null);
        }//
        if ("".equals(prdtSamp.getSize())) {
            prdtSamp.setSize(null);
        }//
        if ("".equals(prdtSamp.getSalName())) {
            prdtSamp.setSalName(null);
        }//
        if ("".equals(prdtSamp.getSalNo())) {
            prdtSamp.setSalNo(null);
        }//
        if ("".equals(prdtSamp.getCusNo())) {
            prdtSamp.setCusNo(null);
        }//
        if ("".equals(prdtSamp.getCusName())) {
            prdtSamp.setCusName(null);
        }//
        if ("".equals(prdtSamp.getIsfenjie())) {
            prdtSamp.setIsfenjie(null);
        }//
        if ("".equals(prdtSamp.getSampMakeStamp())) {
            prdtSamp.setSampMakeStamp(null);
        }//
        if ("".equals(prdtSamp.getSampSendStamp())) {
            prdtSamp.setSampSendStamp(null);
        }//
        if ("".equals(prdtSamp.getSampRequ())) {
            prdtSamp.setSampRequ(null);
        }//
        if ("".equals(prdtSamp.getSampDesc())) {
            prdtSamp.setSampDesc(null);
        }//
        if ("".equals(prdtSamp.getThum())) {
            prdtSamp.setThum(null);
        }//
        if ("".equals(prdtSamp.getAttach())) {
            prdtSamp.setAttach(null);
        }//

        if(prdtSamp.getSampSend() != null){
            String format1 = new SimpleDateFormat("yyyy-MM-dd").format(prdtSamp.getSampSend());

            if(p.isFirstDateBig_(p.hanhanBirthday_,format1)){
                prdtSamp.setSampSend(null);
            }

        }


        if(prdtSamp.getSampMake() != null){
            String format = new SimpleDateFormat("yyyy-MM-dd").format(prdtSamp.getSampMake());
            if(p.isFirstDateBig_(p.hanhanBirthday_,format)){
                prdtSamp.setSampMake(null);
            }
        }


        return prdtSamp;

    }

    @Test
    public void  f(){
        String format1 = new SimpleDateFormat("yyyy-MM-dd").
                format(new Date());

        p.p(format1);

    }

}
