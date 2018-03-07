package com.winwin.picreport.Cservice;

import com.alibaba.fastjson.JSON;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.StatusCnst;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service

public class D1DaYangService {
    @Autowired
    private Cnst cnst;
/*
    @Transactional
    public List<Msg> ImageUpLoadAndDataSave001
            (String projectPath, MultipartFile thum,
             MultipartFile attach, HttpServletRequest request,
             String daYangSuoLueTuAndFuJianZongPath,
             String dirUrl, String suoLueTuWenJianJia,
             String fuJianWenJianJia) {
        try {

            String uuidstr = UUID.randomUUID().toString();
            String imageThumUrl = "";
            String attachmentUrl = "";
            *//**
             *下面是保存缩略图和附件
             * *//*

            if (thum != null) {
                String thumImg = thum.getOriginalFilename();
                //缩略图和附件不能包含截取字符串的符号
                if (thumImg.contains("!") || thumImg.contains(";")) {
                    return MessageGenerate.generateMessage("您的图片不能包含有!符号或者;符号",
                            "您的图片不能包含有!符号或者;符号！", "", "34");
                } else {

                    thumImg = uuidstr + "!" + thumImg;
                }
                //将缩略图保存在指定的目录
                thum.transferTo(new File(projectPath + daYangSuoLueTuAndFuJianZongPath.replace
                        (".", "") + suoLueTuWenJianJia, thumImg));
                //将缩略图在springboot中的资源定位url搞出来,将来给徐勇用于显示在页面,暂时保存在数据库
//                imageThumUrl=dirUrl+suoLueTuWenJianJia+thumImg+";";//分号是分隔符
                //新思路,数据库不再存路径,只存名字,返回给前端的时候加上路径dirUrl
                imageThumUrl = suoLueTuWenJianJia + thumImg + ";";
                if (!new File(projectPath + daYangSuoLueTuAndFuJianZongPath.replace
                        (".", "") + suoLueTuWenJianJia, thumImg).exists()) {
                    return MessageGenerate.generateMessage("保存失败", "保存失败",
                            "缩略图没有保存成功导致所有数据没保存", "", "35");
                }

            }


            if (attach != null) {
                String attachment = attach.getOriginalFilename();
                //缩略图和附件不能包含截取字符串的符号
                if (attachment.contains("!") || attachment.contains(";")) {
                    return MessageGenerate.generateMessage("您的缩略图不能包含有!符号或者;符号",
                            "您的缩略图不能包含有!符号或者;符号", "", "34");
                } else {
                    attachment = uuidstr + "!" + attachment;
                }
                //将附件保存在指定的目录
                attach.transferTo(new File(projectPath + daYangSuoLueTuAndFuJianZongPath
                        .replace(".", "") + fuJianWenJianJia, attachment));

                //将缩略图在springboot中的资源定位url搞出来,将来给徐勇用于显示在页面,暂时保存在数据库
//                attachmentUrl=dirUrl+fuJianWenJianJia+attachment+";";//分号是分隔符
                //新思路,数据库不再存路径,只存名字,返回给前端的时候加上路径dirUrl
                attachmentUrl = fuJianWenJianJia + attachment + ";";
                if (!new File(projectPath + daYangSuoLueTuAndFuJianZongPath.replace
                        (".", "") + fuJianWenJianJia, attachment).exists()) {
                    return MessageGenerate.generateMessage("保存失败", "保存失败",
                            "附件没有保存成功导致所有数据没保存", "", "36");
                }
            }


            *//**suoLueTuWenJianJia=suoLueTuWenJianJia/
             *   @Value("${suoLueTuWenJianJia}") private String suoLueTuWenJianJia;

             @Value("${fuJianWenJianJia}") private String fuJianWenJianJia;
              * *//*

            *//**
             *下面是插入数据库数据用的
             * *//*
            String prdtSamp = request.getParameter("prdtSamp");//得到其他的text数据(PrdtSamp)
            PrdtSamp0 prdtSampOb = JSON.parseObject(prdtSamp, PrdtSamp0.class);
            //注意,产品建档的时候直接插入缩略图url字段,将来update的时候得到原来的加上去
            prdtSampOb.setThum(imageThumUrl);//所有的缩略图都放在一个字段,将来分隔字符串拿到所有
            prdtSampOb.setAttach(attachmentUrl);
            prdtSampOb.setId(uuidstr);
            List<Msg> list = this.insertDaYang(prdtSampOb);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageGenerate.generateMessage("保存失败", "保存失败",
                "数据库系统级别错误", "", "38");
    }*/


    @Transactional
    public List<Msg> ImageUpLoadAndDataSave002OfManyAttach
            (String projectPath, MultipartFile thum, List<MultipartFile> attachList,
             HttpServletRequest request, String daYangSuoLueTuAndFuJianZongPath,
             String dirUrl, String suoLueTuWenJianJia, String fuJianWenJianJia) throws Exception {

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            //下面主要是判断产品编码是否存在,存在就return

            String prdtSamp0 = request.getParameter("prdtSamp");//得到其他的text数据(PrdtSamp)
//            p.p(prdtSamp);
            PrdtSamp0 prdtSampOb = JSON.parseObject(prdtSamp0, PrdtSamp0.class);

            //老郑说暂时不需要判断数据库产品重复,只要判断前端不要重复提交

          /*  Integer it = cnst.a001TongYongMapper.isPrdCodeExist(prdtSampOb.getPrdCode());
            if (it > 0) {
                return mg.gm(Msg.gmg().setStatus(
                        StatusCnst.dbMistakeCausePrdtSampFalse)
                        .setMsg("产品编码已经存在")
                        .setChMsg("有重复的PrdCode")
                        .setOtherMsg("有重复数据"));
            }
*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            String uuidstr = UUID.randomUUID().toString();
            String imageThumUrl = "";
            String attachmentUrl = "";
            /**
             *下面是保存缩略图和附件
             * */
            if (thum != null) {
                String thumImg = thum.getOriginalFilename();
                //缩略图和附件不能包含截取字符串的符号
                if (thumImg.contains("!") || thumImg.contains(";")) {
                    return MessageGenerate.generateMessage("您的图片不能包含有!符号或者;符号",
                            "您的图片不能包含有!符号或者;符号", "", "34");
                } else {

                    thumImg = uuidstr + "!" + thumImg;
                }
                //将缩略图保存在指定的目录
                thum.transferTo(new File(projectPath + daYangSuoLueTuAndFuJianZongPath.replace(".", "") + suoLueTuWenJianJia, thumImg));
                //将缩略图在springboot中的资源定位url搞出来,将来给徐勇用于显示在页面,暂时保存在数据库
//                imageThumUrl=dirUrl+suoLueTuWenJianJia+thumImg+";";//分号是分隔符
                //新思路,数据库不再存路径,只存名字,返回给前端的时候加上路径dirUrl
                imageThumUrl = suoLueTuWenJianJia + thumImg + ";";
                if (!new File(projectPath + daYangSuoLueTuAndFuJianZongPath.replace
                        (".", "") + suoLueTuWenJianJia, thumImg).exists()) {
                    return MessageGenerate.generateMessage("保存失败", "保存失败",
                            "缩略图没有保存成功导致所有数据没保存!", "", "35");
                }

            }

            for (MultipartFile attach : attachList) {
                if (attach != null) {
                    String attachment = attach.getOriginalFilename();
                    //缩略图和附件不能包含截取字符串的符号
                    if (attachment.contains("!") || attachment.contains(";")) {
                        return MessageGenerate.generateMessage("您的附件不能包含有!符号或者;符号",
                                "您的附件不能包含有!符号或者;符号", "", "34");
                    } else {
                        attachment = uuidstr + "!" + attachment;
                    }
                    //将附件保存在指定的目录
                    attach.transferTo(new File(projectPath + daYangSuoLueTuAndFuJianZongPath
                            .replace(".", "") + fuJianWenJianJia, attachment));

                    if (!new File(projectPath + daYangSuoLueTuAndFuJianZongPath.replace
                            (".", "") + fuJianWenJianJia, attachment).exists()) {
                        return MessageGenerate.generateMessage("保存失败",
                                "保存失败", "附件没有保存成功导致所有数据没保存!", "", "36");
                    }
                    //将缩略图在springboot中的资源定位url搞出来,将来给徐勇用于显示在页面,暂时保存在数据库
//                attachmentUrl=dirUrl+fuJianWenJianJia+attachment+";";//分号是分隔符
                    //新思路,数据库不再存路径,只存名字,返回给前端的时候加上路径dirUrl
                    attachmentUrl = attachmentUrl + fuJianWenJianJia + attachment + ";";
                }
            }


            /**suoLueTuWenJianJia=suoLueTuWenJianJia/
             *   @Value("${suoLueTuWenJianJia}") private String suoLueTuWenJianJia;

             @Value("${fuJianWenJianJia}") private String fuJianWenJianJia;
              * */

            /**
             *下面是插入数据库数据用的
             * */
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~测试时间戳~~~~~~~~~~~~~~~~~~~~~~~~");
//            p.p("                   ");p.p("                   ");p.p("                   ");

//            p.p(prdtSampOb);
//            p.p("                   ");p.p("                   ");p.p("                   ");
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~测试时间戳~~~~~~~~~~~~~~~~~~~~~~~~");
            //注意,产品建档的时候直接插入缩略图url字段,将来update的时候得到原来的加上去
            prdtSampOb.setThum(imageThumUrl);//所有的缩略图都放在一个字段,将来分隔字符串拿到所有
            prdtSampOb.setAttach(attachmentUrl);
            prdtSampOb.setId(uuidstr);
            List<Msg> list = this.insertDaYang(prdtSampOb);
            return list;



    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Transactional
    public List<Msg> insertDaYang(PrdtSamp0 prdtSamp) {
        Integer ii = null;
        List<Msg> list;
//        try {


            prdtSamp.setInsertdate(new Date());//该条记录创建时间
            prdtSamp.setIsconfirm(0);//0是没有进行确认的意思
            //获取prdNo//下面是void方法的暗地修改

            cnst.gPrdNo.prdtSampObjGetPrdNo(prdtSamp);
//            this.prdtSampObjGetPrdNo(prdtSamp);
            //如果时间没有,直接设置当前时间
            if (prdtSamp.getSampMake() == null || !p.isFirstDateBig(prdtSamp.getSampMake(), "1986/12/26")) {
                prdtSamp.setSampMake(new Date());
            }
            ii = cnst.prdtSampMapper.insert(prdtSamp);
//        } catch (Exception e) {
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~打样保存一条数据失败!~~~~~~~~~~~~~~~~~~~~~~~~");
//            return MessageGenerate.generateMessage("保存失败", "保存失败", "数据库系统级别错误", "", "38");
//        }
        list = new MessageGenerate().generateMessage
                ("" + ii + "", "产品打样新增" + ii + "条数据",
                        "产品打样新增" + ii + "条数据", "", "37");
        return list;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Transactional//37成功,38失败
    public Msg getOneRecordFromAId(String id) {
        PrdtSamp prdtSamp = cnst.prdtSampMapper.selectByPrimaryKey(id);
        if(NotEmpty.empty(prdtSamp)){
            return Msg.gmg().setStatus(StatusCnst.dbMistakeCausePrdtSampFalse)
                    .setMsg("获取一条信息失败").setChMsg("getOneRecordFromAId这个方法获取一条信息失败!");
        }


        List<Object> prdtSampList=new ArrayList<>();
        PrdtSamp0 p0 = cnst.fenLei.getP0(prdtSamp);
        prdtSampList.add(p0);
        return Msg.gmg().setData(Data.gD().setObjs(prdtSampList))
                .setStatus(StatusCnst.prdtSampSaveOneDataSucc)
                .setMsg("得到一条数据成功").setChMsg("根据id得到一条数据成功");


    }






































    /**
     *判断前端传过来的要存的prdtSamp里面的prdCode
     * 是否在表prdt中有一个name字段对应_对应就找到第一个prd_no用_
     * 不对应就到idx表找到对应的分类_然后找到idx分类的最大no,然后加一流水到prdt中插入一项
     * */

//    @Transactional
//    public void prdtSampObjGetPrdNo(PrdtSamp prdtSamp,String usr,String chkMan){
//        //得到前端传过来的prdt_code//在prdt里面其实对应的name
//        String prdCode = prdtSamp.getPrdCode();
//        //在prdt表中找该prdtCode是否对应一个name字段,有可能多个,但是我们只要一个,所以,我们要自己写sql找到top 1
//        String prdtNo=cnst.a001TongYongMapper.selectTop1PrdtNo(prdCode);
//        if(NotEmpty.notEmpty(prdtNo)){
//            //如果不是空的,我们就要把这个prdtNo放到prdtSamp里面,将来进行插入prdt_samp表用
//            prdtSamp.setPrdNo(prdtNo);
//        }else{
//            //此时代表prdt表中没有对应的prd_no,这时候需要到idx表流水一个
//            //通过prd_code(name)到表idx中找最后一个流水
//            this.prdtSampObjGetPrdNoByIndxGenerate(prdtSamp,usr,chkMan);
//        }
//    }
//
//
//
//    //其实usr和chkMan用的都是usr,就是登录的时候的那个人
//    @Transactional
//    public void prdtSampObjGetPrdNoByIndxGenerate(PrdtSamp prdtSamp,String usr,String chkMan){
//        synchronized (this) {
//            //得到中类代号
//            String indx1=prdtSamp.getIdxNo();
//            //在prdt里面找到相同的indx1的prdNo流水最大的那个
//            String prdNoMax= cnst.a001TongYongMapper.selectTop1MaxPrdtNo(indx1);
//            //将prdNoMax转化成long
//            if(NotEmpty.notEmpty(prdNoMax)){
//                long l = Long.parseLong(prdNoMax);
//                l=l+1;
//                String prdNo = String.valueOf(l);
//                //给prdtSamp添加货号
//                prdtSamp.setPrdNo(prdNo);
//                //对应数据库的name
//                String prdCode = prdtSamp.getPrdCode();
//                //给prdt也添加一个货号
//                cnst.a001TongYongMapper.insertPrdtOnePrdNo(prdNo,indx1,prdCode,usr,chkMan);
//
//            }
//        }
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//


}
