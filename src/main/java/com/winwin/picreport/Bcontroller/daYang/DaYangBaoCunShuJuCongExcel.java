package com.winwin.picreport.Bcontroller.daYang;

import com.alibaba.fastjson.JSON;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.Constant.msgCnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.MsgGenerate.mg;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/d")
public class DaYangBaoCunShuJuCongExcel {
    @Autowired
    private Cnst cnst;


    /**
     * 上传一个包含信息的excel到数据库
     * 这个一次只能穿一个附件
     * 用于同时上传缩略图(到springboot所在项目目录下某目录)和附件(到springboot所在项目目录下某目录)
     * 和打样信息(到数据库表prdt_samp)
     * 49保存成功,
     * 50保存失败
     *
     *
     *
     * 传输格式form-data
     * http://127.0.0.1:8070/d/dataSaveByExcel?token=MTUyMDQxNDgzMzAwNHt-fWlwYWNle359MTM2NDE5Mjg3NDE=
     *
     *key     user
     *value    {"tenantId":"1","userName":"1"}
     * 外加一个
     * key  excel
     * value  具体的excel
     *
     *
     *
     */
    @RequestMapping(value = InterFaceCnst.dataSaveByExcel,
            method = RequestMethod.POST, //客户端请求的类型
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,//接受的类型
            produces = MediaType.APPLICATION_JSON_VALUE)//返回的类型
    public @ResponseBody
    List<Msg> dataSaveByExcel(
            @RequestParam(value = p.excel, required = false) MultipartFile excel
            ,HttpServletRequest r
    ) {





        //上传到指定目录
        try {
            return cnst.d1DaYangServiceDataSaveByExcel.dataSaveByExcel(excel,r);
        } catch (Exception e) {
//            e.printStackTrace();
            try {
                p.p("-------------------------------------------------------");
                p.p(e.getMessage());
                p.p("-------------------------------------------------------");
                return mg.gm(JSON.parseObject(e.getMessage(),Msg.class));
            } catch (Exception e1) {
                e1.printStackTrace();

                return mg.gm(Msg.gmg()
                        .setStatus(msgCnst.failSaveStatus.getValue())
                        .setMsg(msgCnst.failSave.getValue()));
            }
        }
    }



//////////////////////////////////////////////////////////////
}
