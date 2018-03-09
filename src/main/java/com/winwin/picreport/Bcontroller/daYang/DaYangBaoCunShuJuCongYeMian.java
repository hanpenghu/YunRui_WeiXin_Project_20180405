package com.winwin.picreport.Bcontroller.daYang;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/d")
public class DaYangBaoCunShuJuCongYeMian {
    @Autowired
    private Cnst cnst;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *
     * 这个一次能穿好多个附件
     * 用于同时上传缩略图(到springboot所在项目目录下某目录)和附件(到springboot所在项目目录下某目录)
     * 和打样信息(到数据库表prdt_samp)
     * (value = "attach",required = false)
     * 下面弄了那么多attach,意思是一次上传多个,最多上传10个
     *
     *传过来的参数有prdtSamp这个json,
     * 然后再给这个接口  加一个
     * 参数  放在路径传过来,  usr,用于在产生prd_no的时候存入prdt表
     * 信息保存用,不能用于编辑
     * http://61.177.44.218:8070/d/imageUpLoadAndDataSaveOfManyAttach?token=MTUyMDQxMTM0NjE3NHt-fWlwYWNle359MTM2NDE5Mjg3NDE=
     *
     *
     * 参数,只是写了一部分字段,后来加了userName和tenantId让徐勇传过来是为了记录谁创建的记录,
     * 参数名是prdtSamp,类型multipart
     * {"userName":"hanhan","tenantId":"hanhanCompany","prdCode":"aaa","idxName":"bbb","idxNo":"af","fenLeiNo":"dffas","fenLeiName":"dsfa"}
     *
     */
    //返回数据如下
   /* [
    {
        "data": null,
            "status": "37",
            "xiaoHaoShiJian": "",
            "msg": "1",
            "chMsg": "产品打样新增1条数据",
            "otherMsg": "产品打样新增1条数据",
            "token": "",
            "tenantId": "",
            "tenantName": "",
            "userEmail": "",
            "notExsitThisPrdtNoInPrdtTab": "",
            "weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao": "",
            "auth": {
        "logistics": {
            "salesorder": {
                "page": "F"
            },
            "salesorderForSAP": {
                "page": "F"
            },
            "salesDetail": {
                "page": "F"
            },
            "productCode": {
                "page": "F"
            },
            "purchasePricing": {
                "page": "F"
            },
            "salesPricing": {
                "page": "F",
                        "part": {
                    "purchasePrice": "F",
                            "salesPrice": "F"
                }
            },
            "sampleConfirm": {
                "page": "F"
            }
        }
    }
    }
]*/
    @RequestMapping(value = InterFaceCnst.imageUpLoadAndDataSaveOfManyAttach,
            method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Msg> ImageUpLoadAndDataSave002
    (@RequestParam(value = "thum", required = false) MultipartFile thum,
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
                    if(file.getSize()>(100*1024*1024)){
                        return MessageGenerate.generateMessage("文件大小超过限制", "文件大小超过限制",
                                "上传的单个文件已经超过100M", "", "41");
                    }
                }
            }
        }

        //上传到指定目录
        try {
            String projectPath= Cnst.getProjectPath();
            System.out.println();System.out.println();System.out.println(projectPath);System.out.println();System.out.println();
            //将来用作数据库一条数据的唯一标识

            return cnst.d1DaYangService.ImageUpLoadAndDataSave002OfManyAttach
                    (projectPath, thum, attachList,request,
                            cnst.daYangSuoLueTuAndFuJianZongPath,cnst.dirUrl,
                            cnst.suoLueTuWenJianJia,cnst.fuJianWenJianJia);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageGenerate.generateMessage
                ("保存失败", "保存失败",
                        "数据库系统级别错误",
                        "", "38");
    }





















}
