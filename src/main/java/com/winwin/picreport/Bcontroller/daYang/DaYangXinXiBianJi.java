package com.winwin.picreport.Bcontroller.daYang;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Futils.ListUtils.ListUtils;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/d")
public class DaYangXinXiBianJi {
    @Autowired
    private Cnst cnst;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *用这个进行  信息编辑
     * */
    //    @Transactional
    @RequestMapping(value = InterFaceCnst.imageUpLoadAndDataSave_InfoEdit_ManyAttach,
            method = RequestMethod.POST,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Msg>
    infoEdit_ManyAttach(@RequestParam(value = "thum", required = false) MultipartFile thum,
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
        return MessageGenerate.generateMessage
                ("保存失败", "保存失败",
                        "数据库系统级别错误", Cnst.emptyStr, p.s38);
    }





/////////////////////////////////////////////////////////////////////////
}
