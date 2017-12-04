package com.winwin.picreport.Bcontroller;

import com.alibaba.fastjson.JSON;
import com.winwin.picreport.Cservice.D1DaYangService;
import com.winwin.picreport.Cservice.FenLei;
import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import com.winwin.picreport.Ddao.reportxmlmapper.PrdtSampMapper;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.FenYe;
import com.winwin.picreport.Futils.MessageGenerate;
import com.winwin.picreport.Futils.Msg;
import com.winwin.picreport.Futils.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/d")
public class D1DaYangController打样 {
    @Autowired
    private D1DaYangService d1DaYangService;
    @Value("${dirUrl}")
    private String dirUrl;

    @Value("${suoLueTuWenJianJia}")
    private String suoLueTuWenJianJia;

    @Value("${fuJianWenJianJia}")
    private String fuJianWenJianJia;


    //daYangSuoLueTuAndFuJianZongPath=./daYangSuoLueTuAndFuJianZongPath/
    @Value("${daYangSuoLueTuAndFuJianZongPath}")//./1234567/
    private String daYangSuoLueTuAndFuJianZongPath;
    @Autowired
    private FenLei fenLei;
    @Autowired
    private ManyTabSerch manyTabSerch;
    @Autowired
    private PrdtSampMapper prdtSampMapper;

    /**
     * 对展示的数据进行信息编辑的接口,支持图片再上传和原来的数据修改
     */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Transactional
    @RequestMapping(value = "imageUpLoadAndDataSave_InfoEdit", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Msg> ImageUpLoadAndDataSave001_InfoEdit(@RequestParam(value = "thum", required = false) MultipartFile thum, @RequestParam(value = "attach", required = false) MultipartFile attach, HttpServletRequest request) {
//    String prdtSamp = request.getParameter("prdtSamp");//得到其他的text数据(PrdtSamp)

        try {
            if (thum != null && (thum.getOriginalFilename().contains("!") || thum.getOriginalFilename().contains(";"))) {
                return MessageGenerate.generateMessage("您的图片不能包含有!符号或者;符号", "您的图片不能包含有!符号或者;符号", "", "34");
            }
            if (attach != null && (attach.getOriginalFilename().contains("!") || attach.getOriginalFilename().contains(";"))) {
                return MessageGenerate.generateMessage("您的缩略图不能包含有!符号或者;符号", "您的缩略图不能包含有!符号或者;符号", "", "34");
            }
            String uuid = UUID.randomUUID().toString();//给新的图片和缩略图的名字用,更新的时候并没有用这个uuid ,用的还是原来的
            PrdtSamp prdtSampOb = JSON.parseObject(request.getParameter("prdtSamp"), PrdtSamp.class);
            if (NotEmpty.notEmpty(prdtSampOb)) {
                if (!NotEmpty.notEmpty(prdtSampOb.getId())) {
                    return MessageGenerate.generateMessage("保存失败", "保存失败", "前端没有传输过来唯一标志id", "", "40");
                }
            } else {
                return MessageGenerate.generateMessage("保存失败", "保存失败", "前后端传输错误,prdtSamp这个参数后端接收不到", "", "39");
            }

            String projectPath = this.JarLuJingGet();


            //得到这个prdtSamp只为了得到当前主键下面的缩略图路径thum字段和附件字段attach
            PrdtSamp prdtSamp = prdtSampMapper.selectByPrimaryKey(prdtSampOb.getId());

            /**
             *下面是将图片路径和其它信息更新到数据库
             * */
            //通过主键得到当前的缩略图路径字段thum
            String imageThumUrl = prdtSamp.getThum();
            String attachmentUrl = prdtSamp.getAttach();

            /**
             *当thum不是空的时候,我们更新缩略图的存储(数据库更新地址,图库添加新图)
             * */
            if (thum != null) {
                //将缩略图保存在指定的目录
                thum.transferTo(new File(projectPath + daYangSuoLueTuAndFuJianZongPath.replace(".", "") + suoLueTuWenJianJia, uuid + "!" + thum.getOriginalFilename()));
                if (!new File(projectPath + daYangSuoLueTuAndFuJianZongPath.replace(".", "") + suoLueTuWenJianJia, uuid + "!" + thum.getOriginalFilename()).exists()) {
                    return MessageGenerate.generateMessage("保存失败", "保存失败", "缩略图没有保存成功导致所有数据没保存", "", "35");
                }

                if (imageThumUrl == null) {
                    imageThumUrl = "";
                }//第一次没上传任何东西可能是空
                //给缩略图添加一个新的路径进去,用;号隔开路径
//            imageThumUrl=imageThumUrl+dirUrl+suoLueTuWenJianJia+uuid+"!"+thum.getOriginalFilename()+";";//分号是分隔符
                //新思路,数据库不再存路径,只存名字,返回给前端的时候加上路径dirUrl
                imageThumUrl = imageThumUrl + suoLueTuWenJianJia + uuid + "!" + thum.getOriginalFilename() + ";";
            }
            if ("".equals(imageThumUrl)) {
                imageThumUrl = null;//为了是null的时候不更新这个字段
            }

            if (attach != null) {
                //将附件保存在指定的目录
                attach.transferTo(new File(projectPath + daYangSuoLueTuAndFuJianZongPath.replace(".", "") + fuJianWenJianJia, uuid + "!" + attach.getOriginalFilename()));
                if (!new File(projectPath + daYangSuoLueTuAndFuJianZongPath.replace(".", "") + fuJianWenJianJia, uuid + "!" + attach.getOriginalFilename()).exists()) {
                    return MessageGenerate.generateMessage("保存失败", "保存失败", "附件没有保存成功导致所有数据没保存", "", "36");
                }
                if (attachmentUrl == null) {
                    attachmentUrl = "";
                }//第一次没上传任何东西可能是空

                //给缩略图添加一个新的路径进去,用;号隔开路径
//            attachmentUrl=attachmentUrl+dirUrl+fuJianWenJianJia+uuid+"!"+attach.getOriginalFilename()+";";//分号是分隔符
//            attachmentUrl=attachmentUrl+dirUrl+fuJianWenJianJia+uuid+"!"+attach.getOriginalFilename()+";";
                //新思路,数据库不再存路径,只存名字,返回给前端的时候加上路径dirUrl
                attachmentUrl = attachmentUrl + fuJianWenJianJia + uuid + "!" + attach.getOriginalFilename() + ";";
            }
            if ("".equals(attachmentUrl)) {
                attachmentUrl = null;//为了是null的时候不更新这个字段
            }

            prdtSampOb.setThum(imageThumUrl);
            prdtSampOb.setAttach(attachmentUrl);
            prdtSampOb = this.prdtSampWhereSpaceToNull(prdtSampOb);//把""变成null,避免不必要的更新
            //Selective是不更新null
            if (prdtSampMapper.updateByPrimaryKeySelective(prdtSampOb) == 0) {
                return MessageGenerate.generateMessage("保存失败", "保存失败", "数据库系统级别错误", "", "38");
            } else {
                return new MessageGenerate().generateMessage("1", "产品打样更新1条数据", "产品打样新增1条数据", "", "37");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return MessageGenerate.generateMessage("保存失败", "保存失败", "数据库系统级别错误", "", "38");
    }


///////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 该接口测试失败,不能一次传过个form-data文件
     * 这个一次只能穿好多个附件
     * 用于同时上传缩略图(到springboot所在项目目录下某目录)和附件(到springboot所在项目目录下某目录)
     * 和打样信息(到数据库表prdt_samp)
     * (value = "attach",required = false)
     */
    @RequestMapping(value = "imageUpLoadAndDataSaveOfManyAttach", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Msg> ImageUpLoadAndDataSave002(@RequestParam(value = "thum", required = false) MultipartFile thum,
                                        @RequestParam(value = "attach1", required = false) MultipartFile attach1,
                                        @RequestParam(value = "attach2", required = false) MultipartFile attach2,
                                        @RequestParam(value = "attach3", required = false) MultipartFile attach3,
                                        @RequestParam(value = "attach4", required = false) MultipartFile attach4,
                                        @RequestParam(value = "attach5", required = false) MultipartFile attach5,
                                        @RequestParam(value = "attach6", required = false) MultipartFile attach6,
                                        @RequestParam(value = "attach7", required = false) MultipartFile attach7,
                                        @RequestParam(value = "attach8", required = false) MultipartFile attach8,
                                        @RequestParam(value = "attach9", required = false) MultipartFile attach9,
                                        @RequestParam(value = "attach10", required = false) MultipartFile attach10,
                                        HttpServletRequest request) {

        List<MultipartFile> attachList = new ArrayList();
        attachList.add(attach1);attachList.add(attach2);attachList.add(attach3);attachList.add(attach4);attachList.add(attach5);
        attachList.add(attach6);attachList.add(attach7);attachList.add(attach8);attachList.add(attach9);attachList.add(attach10);

        //上传到指定目录
        try {
            String projectPath=this.JarLuJingGet();
            System.out.println();System.out.println();System.out.println(projectPath);System.out.println();System.out.println();
            //将来用作数据库一条数据的唯一标识
            synchronized (this){
                return d1DaYangService.ImageUpLoadAndDataSave002OfManyAttach(projectPath, thum, attachList,request,daYangSuoLueTuAndFuJianZongPath,dirUrl,suoLueTuWenJianJia,fuJianWenJianJia);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageGenerate.generateMessage("保存失败", "保存失败", "数据库系统级别错误", "", "38");
    }


    /**
     * 这个一次只能穿一个附件
     * 用于同时上传缩略图(到springboot所在项目目录下某目录)和附件(到springboot所在项目目录下某目录)
     * 和打样信息(到数据库表prdt_samp)
     */
    @RequestMapping(value = "imageUpLoadAndDataSave", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Msg> ImageUpLoadAndDataSave001(@RequestParam(value = "thum", required = false) MultipartFile thum, @RequestParam(value = "attach", required = false) MultipartFile attach, HttpServletRequest request) {
        //上传到指定目录
        try {
            String projectPath = this.JarLuJingGet();
            System.out.println();
            System.out.println();
            System.out.println(projectPath);
            System.out.println();
            System.out.println();
            //将来用作数据库一条数据的唯一标识
            synchronized (this) {
                return d1DaYangService.ImageUpLoadAndDataSave001(projectPath, thum, attach, request, daYangSuoLueTuAndFuJianZongPath, dirUrl, suoLueTuWenJianJia, fuJianWenJianJia);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageGenerate.generateMessage("保存失败", "保存失败", "数据库系统级别错误", "", "38");
    }

    /////////////////////////////////////////////////////////////////
//    file:/E:/1/000/LinZhan/pic-report-0.0.1-SNAPSHOT.jar!/BOOT-INF/classes!/
    public String JarLuJingGet() {
        /**
         *得到类似路径
         * E:/1/000/LinZhan
         * 我们打包后的springboot 的jar包就在LinZhan文件夹里面
         * */
        String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
        synchronized (this) {
            path = path.replace("file:/", "");
            int i = path.lastIndexOf("!");
            i = i - 18;
            path = path.substring(0, i);
            path = path.substring(0, path.lastIndexOf("/"));
        }

        return path;
    }

//    public static void main(String[]args){
//        System.out.println(new D1DaYangController打样().JarLuJingGet());
//    }

//////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value = "fenlei", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<CategoryNameCode> fenlei() {
        List<CategoryNameCode> categoryNameCodeList = fenLei.fenlei();
        return categoryNameCodeList;
    }

    @RequestMapping(value = "fenleitest", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<CategoryNameCode> fenleitest() {
        List<CategoryNameCode> categoryNameCodeList = fenLei.fenlei();
        return categoryNameCodeList;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping(value = "fuZeRen", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<FuZeRen> fuZeRen() {
        List<FuZeRen> fuZeRenList = fenLei.fuZeRen();
        return fuZeRenList;
    }

    @RequestMapping(value = "fuZeRentest", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<FuZeRen> fuZeRentest() {
        List<FuZeRen> fuZeRenList = fenLei.fuZeRen();
        return fuZeRenList;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value = "pinPai", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<PinPai> pinPai() {
        List<PinPai> fuZeRenList = manyTabSerch.pinPai();
        return fuZeRenList;
    }


    @RequestMapping(value = "pinPaitest", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<PinPai> pinPaitest() {
        List<PinPai> fuZeRenList = manyTabSerch.pinPai();
        return fuZeRenList;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//客户以前写过了,在A0BaseInfoController

    /*@RequestMapping(value="keHutest",method = RequestMethod.GET,produces ={"application/json;charset=utf-8"})
public @ResponseBody List<KeHu> keHutest(){
    List<PinPai> fuZeRenList=manyTabSerch.keHu();
    return fuZeRenList;
}*/


    /////////////////////////////////////////////list///////////////////////////////////////////////////////
    @RequestMapping(value = "insertDaYang", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<Msg> insertDaYang(@RequestBody PrdtSamp prdtSamp) {
//        List<Msg> list=fenLei.insertDaYang(prdtSamp);
        return MessageGenerate.generateMessage("该接口已经废弃,请调用新的接口   imageUpLoadAndDataSave");
    }
///////////////////////////////////////////////////////////////////////////////////////////////

    /////////////////////////徐勇页面展示第一次调的接口,注意顺带返回了第一页的信息////////////////////////////////////////////////////////////////////
    @RequestMapping(value = "daYangZongYeShuHeMeiYeXianShiShu", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    FenYe daYangZongYeShuHeMeiYeXianShiShu() {
        FenYe fenYe = fenLei.daYangZongYeShuHeMeiYeXianShiShu();//主要传过来当前页和每页显示数量
        fenYe.setDangQianYe(1);
        List<PrdtSamp> prdtSampList = fenLei.dangqianyeData(fenYe);
        fenYe.setPrdtSampList(prdtSampList);
        return fenYe;
    }

    @RequestMapping(value = "daYangZongYeShuHeMeiYeXianShiShutest", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    FenYe daYangZongYeShuHeMeiYeXianShiShutest() {
        FenYe fenYe = this.daYangZongYeShuHeMeiYeXianShiShu();
        return fenYe;
    }


    //////////////////////////////徐勇页面,用户大于等于第二次点击某一页的时候调的接口/////////////////////////////////////////
    @RequestMapping(value = "dangqianyeData", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<PrdtSamp> dangqianyeData(@RequestBody FenYe fenYe) {
        List<PrdtSamp> prdtSampList = fenLei.dangqianyeData(fenYe);//主要传过来当前页和每页显示数量
        return prdtSampList;
    }


    @RequestMapping(value = "dangqianyeDatatest", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<PrdtSamp> dangqianyeDatatest(FenYe fenYe) {
        List<PrdtSamp> prdtSampList = fenLei.dangqianyeData(fenYe);//主要传过来当前页和每页显示数量
        return prdtSampList;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public static void main(String[]args){
//        System.out.println();
//    }
////////////////////////////////////////////////////////////////////////////////////////////
    public String daiHaoMiaoShiJian() {
        return new SimpleDateFormat("yyyy-MM-dd HH mm ss SS").format(new Date());
    }
/////////////////////////////////////////////////////////////////////////


    @Transactional
    public PrdtSamp prdtSampWhereSpaceToNull(PrdtSamp prdtSamp) {
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


        if (prdtSamp.getSampSend() != null && "1900-01-01".equals(new SimpleDateFormat("yyyy-MM-dd").format(prdtSamp.getSampSend()))) {
            prdtSamp.setSampSend(null);
        }
        if (prdtSamp.getSampMake() != null && "1900-01-01".equals(new SimpleDateFormat("yyyy-MM-dd").format(prdtSamp.getSampMake()))) {
            prdtSamp.setSampMake(null);
        }
        return prdtSamp;

    }


////////////////////////////////////////////////////////////////////////////////////////////////

    public class Attachs {
        private MultipartFile attach1;
        private MultipartFile attach2;
        private MultipartFile attach3;
        private MultipartFile attach4;
        private MultipartFile attach5;
        private MultipartFile attach6;
        private MultipartFile attach7;
        private MultipartFile attach8;
        private MultipartFile attach9;
        private MultipartFile attach10;

        public MultipartFile getAttach1() {
            return attach1;
        }

        public Attachs setAttach1(MultipartFile attach1) {
            this.attach1 = attach1;
            return this;
        }

        public MultipartFile getAttach2() {
            return attach2;
        }

        public Attachs setAttach2(MultipartFile attach2) {
            this.attach2 = attach2;
            return this;
        }

        public MultipartFile getAttach3() {
            return attach3;
        }

        public Attachs setAttach3(MultipartFile attach3) {
            this.attach3 = attach3;
            return this;
        }

        public MultipartFile getAttach4() {
            return attach4;
        }

        public Attachs setAttach4(MultipartFile attach4) {
            this.attach4 = attach4;
            return this;
        }

        public MultipartFile getAttach5() {
            return attach5;
        }

        public Attachs setAttach5(MultipartFile attach5) {
            this.attach5 = attach5;
            return this;
        }

        public MultipartFile getAttach6() {
            return attach6;
        }

        public Attachs setAttach6(MultipartFile attach6) {
            this.attach6 = attach6;
            return this;
        }

        public MultipartFile getAttach7() {
            return attach7;
        }

        public Attachs setAttach7(MultipartFile attach7) {
            this.attach7 = attach7;
            return this;
        }

        public MultipartFile getAttach8() {
            return attach8;
        }

        public Attachs setAttach8(MultipartFile attach8) {
            this.attach8 = attach8;
            return this;
        }

        public MultipartFile getAttach9() {
            return attach9;
        }

        public Attachs setAttach9(MultipartFile attach9) {
            this.attach9 = attach9;
            return this;
        }

        public MultipartFile getAttach10() {
            return attach10;
        }

        public Attachs setAttach10(MultipartFile attach10) {
            this.attach10 = attach10;
            return this;
        }


    }

////////////////////////////////////////////////////////////////////////////////////////////////////
}


//
//    final MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
//    List<MultipartFile> files = multiRequest.getFiles("attach");
//for(MultipartFile file:files){
//        System.out.println(file.getOriginalFilename());
//        }
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//        for(MultipartFile attac:attach){
//        System.out.println(attac.getOriginalFilename());
//        }
//        System.out.println("-------------------------------------------");
//        Enumeration<String> parameterNames = request.getParameterNames();
//
//        boolean b = parameterNames.hasMoreElements();
//        if(b){
//        System.out.println(new String (parameterNames.nextElement().getBytes()));
//        }