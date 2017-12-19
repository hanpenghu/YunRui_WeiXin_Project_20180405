package com.winwin.picreport.Bcontroller;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Cservice.*;
import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import com.winwin.picreport.Ddao.reportxmlmapper.PrdtSampMapper;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.*;
import com.winwin.picreport.Futils.ListUtils.ListUtils;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/d")
public class D1DaYangController {
    @Autowired
    private Cnst cnst;
    /**
     * Content-Type:application/x-www-form-urlencoded
     ****************************************************************************************
     * 删除单个附件
     * */
    @RequestMapping(value = "deleteOneAttach", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody List<Msg> deleteOneAttach(@RequestParam(value = "attachUrl", required = false) String attachUrl) {

        return cnst.deleteOneImg.deleteOneAttach(attachUrl);
    }

    /**
     ****************************************************************************************
     * */
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *删除单张图片接口,要求前端传过来图片全路径
     *Content-Type:application/x-www-form-urlencoded
     * ajax请求头设置为:
     * x-www-form-urlencoded
     * */

    @RequestMapping(value = "deleteOneImage", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody List<Msg> deleteOneImage(@RequestParam(value = "imgUrl", required = false) String imgUrl) {
        return cnst.deleteOneImg.deleteOneImage(imgUrl);
    }

    /**
 *delete 一条数据库信息并delete对应的图片和附件资源
 * 支持一次多删除
 * */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
@RequestMapping(value = "deleteSomeRecode", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
public @ResponseBody List<Msg> deleteSomeRecode(@RequestBody List<String>uuidList) {
    System.out.println(uuidList);
    return cnst.deleteSome.deleteSomeRecode(uuidList);
}



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * 对展示的数据进行信息编辑的接口,支持图片再上传和原来的数据修改
     * 这个暂时不用,用下下面那个
     */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    @Transactional
    @RequestMapping(value = "imageUpLoadAndDataSave_InfoEdit", method = RequestMethod.POST,
                                            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
                                            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Msg>
    ImageUpLoadAndDataSave001_InfoEdit(@RequestParam(value = "thum", required = false) MultipartFile thum,
                                       @RequestParam(value = "attach", required = false) MultipartFile attach,
                                       HttpServletRequest request) {
        String prdtSamp1 = request.getParameter("prdtSamp");
        try {
           return cnst.infoEdit.infoEdit(thum,attach,prdtSamp1);
        } catch (Exception e) {
            System.out.println("~~~~~~~~编辑info的时候,估计是保存图片除了问题,如果是IOexception,基本肯定是保存图片和附件有问题了导致正题不能编辑~~~~~~~~~~~~·");
            e.printStackTrace();
        }
        return MessageGenerate.generateMessage("保存失败", "保存失败",
                "数据库系统级别错误", "", "38");
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *这个暂时不用,用下面那个接口
     * */

    @RequestMapping(value = "imageUpLoadAndDataSave_InfoEdit_ManyAttachOf2",
        method = RequestMethod.POST,
        consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody List<Msg>
imageUpLoadAndDataSave_InfoEdit_ManyAttachOf2(HttpServletRequest request) {
    String prdtSamp1 = request.getParameter("prdtSamp");//文本信息
    List<MultipartFile> thumList =
            ((MultipartHttpServletRequest) request).getFiles("thum");

    List<MultipartFile> attachList =
            ((MultipartHttpServletRequest) request).getFiles("attach");


    MultipartFile thum=null;
    if(NotEmpty.notEmpty(thumList)){
        thum=thumList.get(0);
    }
    try {
        return cnst.infoEditOfManyAttach.infoEditOfManyAttach(thum,attachList,prdtSamp1);
    } catch (Exception e) {
        System.out.println("~~~~~~~~编辑info的时候,估计是保存图片除了问题,如果是IOexception," +
                "基本肯定是保存图片和附件有问题了导致正题不能编辑~~~~~~~~~~~~·");
        e.printStackTrace();
    }
    return MessageGenerate.generateMessage("保存失败", "保存失败",
            "数据库系统级别错误", "", "38");
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *用这个进行  信息编辑
     * */
    //    @Transactional
    @RequestMapping(value = "imageUpLoadAndDataSave_InfoEdit_ManyAttach",
            method = RequestMethod.POST,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Msg>
    ImageUpLoadAndDataSave001_InfoEdit_ManyAttach(@RequestParam(value = "thum", required = false) MultipartFile thum,
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
        String prdtSamp1 = request.getParameter("prdtSamp");//文本信息
        List<MultipartFile> attachList =new LinkedList<>();
         new ListUtils<MultipartFile>()
                 .add(attach1,attachList)
                 .add(attach2,attachList)
                 .add(attach3,attachList)
                 .add(attach4,attachList)
                 .add(attach5,attachList)
                 .add(attach6,attachList)
                 .add(attach7,attachList)
                 .add(attach8,attachList)
                 .add(attach9,attachList)
                 .add(attach10,attachList);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println(attachList);
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");

        try {
            return cnst.infoEditOfManyAttach.infoEditOfManyAttach(thum,attachList,prdtSamp1);
        } catch (Exception e) {
            System.out.println("~~~~~~~~编辑info的时候,估计是保存图片除了问题,如果是IOexception," +
                    "基本肯定是保存图片和附件有问题了导致正题不能编辑~~~~~~~~~~~~·");
            e.printStackTrace();
        }
        return MessageGenerate.generateMessage("保存失败", "保存失败",
                "数据库系统级别错误", "", "38");
    }



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *
     * 这个一次能穿好多个附件
     * 用于同时上传缩略图(到springboot所在项目目录下某目录)和附件(到springboot所在项目目录下某目录)
     * 和打样信息(到数据库表prdt_samp)
     * (value = "attach",required = false)
     * 下面弄了那么多attach,意思是一次上传多个,最多上传10个
     *
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
        if(attachList!=null&&attachList.size()>0){
            for(MultipartFile file:attachList){
                if(file!=null){
                    if(file.getSize()>(20*1024*1024)){
                        return MessageGenerate.generateMessage("文件大小超过限制", "文件大小超过限制",
                                "上传的单个文件已经超过20M", "", "41");
                    }
                }
            }
        }

        //上传到指定目录
        try {
            String projectPath=SpringbootJarPath.JarLuJingGet();
            System.out.println();System.out.println();System.out.println(projectPath);System.out.println();System.out.println();
            //将来用作数据库一条数据的唯一标识
            synchronized (this){
                return cnst.d1DaYangService.ImageUpLoadAndDataSave002OfManyAttach(projectPath, thum, attachList,request,cnst.daYangSuoLueTuAndFuJianZongPath,cnst.dirUrl,cnst.suoLueTuWenJianJia,cnst.fuJianWenJianJia);
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
            String projectPath = SpringbootJarPath.JarLuJingGet();
            System.out.println();
            System.out.println();
            System.out.println(projectPath);
            System.out.println();
            System.out.println();
            //将来用作数据库一条数据的唯一标识
            synchronized (this) {
                return cnst.d1DaYangService.ImageUpLoadAndDataSave001(projectPath, thum, attach, request, cnst.daYangSuoLueTuAndFuJianZongPath, cnst.dirUrl, cnst.suoLueTuWenJianJia, cnst.fuJianWenJianJia);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageGenerate.generateMessage("保存失败", "保存失败", "数据库系统级别错误", "", "38");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 上传一个包含信息的excel到数据库
     * 这个一次只能穿一个附件
     * 用于同时上传缩略图(到springboot所在项目目录下某目录)和附件(到springboot所在项目目录下某目录)
     * 和打样信息(到数据库表prdt_samp)
     * 49保存成功,
     * 50保存失败
     */
    @RequestMapping(value = "dataSaveByExcel", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Msg> dataSaveByExcel(@RequestParam(value = "excel", required = false) MultipartFile excel) {
        //上传到指定目录
        try {
           return cnst.d1DaYangServiceDataSaveByExcel.dataSaveByExcel(excel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageGenerate.generateMessage("保存失败", "保存失败",
                "数据库系统级别错误", "", "50");
    }



//////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////
    /**
     *分类实行层级制,这个已经被拦截器放行了     /d/allfenleitest
     * */

    @RequestMapping(value = "allfenleitest", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public @ResponseBody CategoryNameCode allfenleitest() {
        return cnst.fenLei.getAllLayer();
    }

    @RequestMapping(value = "allfenlei", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody CategoryNameCode allfenlei() {
        return cnst.fenLei.getAllLayer();
    }



///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value = "fenlei", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<CategoryNameCode> fenlei() {
        List<CategoryNameCode> categoryNameCodeList = cnst.fenLei.fenlei();
        return categoryNameCodeList;
    }

    @RequestMapping(value = "fenleitest", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<CategoryNameCode> fenleitest() {
        List<CategoryNameCode> categoryNameCodeList = cnst.fenLei.fenlei();
        return categoryNameCodeList;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping(value = "fuZeRen", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<FuZeRen> fuZeRen() {
        List<FuZeRen> fuZeRenList = cnst.fenLei.fuZeRen();
        return fuZeRenList;
    }

    @RequestMapping(value = "fuZeRentest", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<FuZeRen> fuZeRentest() {
        List<FuZeRen> fuZeRenList = cnst.fenLei.fuZeRen();
        return fuZeRenList;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value = "pinPai", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<PinPai> pinPai() {
        List<PinPai> fuZeRenList = cnst.manyTabSerch.pinPai();
        return fuZeRenList;
    }


    @RequestMapping(value = "pinPaitest", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<PinPai> pinPaitest() {
        List<PinPai> fuZeRenList = cnst.manyTabSerch.pinPai();
        return fuZeRenList;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////



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
        FenYe fenYe = cnst.fenLei.daYangZongYeShuHeMeiYeXianShiShu();//主要传过来当前页和每页显示数量
        fenYe.setDangQianYe(1);
        List<PrdtSamp> prdtSampList = cnst.fenLei.dangqianyeData(fenYe);
        fenYe.setPrdtSampList(prdtSampList);
        return fenYe;
    }

    @RequestMapping(value = "daYangZongYeShuHeMeiYeXianShiShutest", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    FenYe daYangZongYeShuHeMeiYeXianShiShutest() {
        FenYe fenYe = this.daYangZongYeShuHeMeiYeXianShiShu();
        return fenYe;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *得到所有打样已确认的单子的所有页,参数只要传过来当前页就行了
     * 作废
     * */

    @RequestMapping(value = "alReadyConfirmOrderPage", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody FenYe alReadyConfirmOrderPage(@RequestBody FenYe fenYe) {
        return cnst.dco.alReadyConfirmOrderPage(fenYe);
    }


    /**
     *得到所有打样未确认的单子第某页,这个不只是能得到第一页,还能得到很多页
     *
     * */
    @RequestMapping(value = "notConfirmOrderFirstPage", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody FenYe notConfirmOrderFirstPage(@RequestBody FenYe fenYe) {
        return cnst.dco.notConfirmOrderFirstPage(fenYe);
    }

    /**
     *确认单子  isconfirm变为1
     *
     * 47 打样确认成功 isconfirm=1

     48 打样确认 没成功 isconfirm=0
     * */
    @RequestMapping(value = "confirmTheOrder", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody List<Msg> confirmTheOrder(@RequestBody PrdtSamp prdtSamp) {
        return cnst.dco.confirmTheOrder(prdtSamp);
    }






 //////////////////////////////徐勇页面,用户大于等于第二次点击某一页的时候调的接口/////////////////////////////////////////
    @RequestMapping(value = "dangqianyeData", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<PrdtSamp> dangqianyeData(@RequestBody FenYe fenYe) {
        List<PrdtSamp> prdtSampList = cnst.fenLei.dangqianyeData(fenYe);//主要传过来当前页和每页显示数量
        return prdtSampList;
    }


    @RequestMapping(value = "dangqianyeDatatest", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public @ResponseBody
    List<PrdtSamp> dangqianyeDatatest(FenYe fenYe) {
        List<PrdtSamp> prdtSampList = cnst.fenLei.dangqianyeData(fenYe);//主要传过来当前页和每页显示数量
        return prdtSampList;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////
    public String getmSecondTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").format(new Date());
    }
/////////////////////////////////////////////////////////////////////////
@Test
    public void f(){
        p.p(getmSecondTime());
}

////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////
}
