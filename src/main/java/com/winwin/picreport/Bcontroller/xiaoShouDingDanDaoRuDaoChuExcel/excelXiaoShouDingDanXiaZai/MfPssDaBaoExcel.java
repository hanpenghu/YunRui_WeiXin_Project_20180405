package com.winwin.picreport.Bcontroller.xiaoShouDingDanDaoRuDaoChuExcel.excelXiaoShouDingDanXiaZai;


import com.alibaba.fastjson.JSON;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Edto.ChaXunTiaoJian;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.arraylist;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 *导出exce前奏---打包
 * */
@CrossOrigin
@RestController
public class MfPssDaBaoExcel {

    @Autowired
    private Cnst cnst;


    private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());
    @RequestMapping(value = InterFaceCnst.mfPssDaBao,method = RequestMethod.POST)
    public @ResponseBody
    Msg f(@RequestBody ChaXunTiaoJian chaXunTiaoJian, HttpServletResponse response){
//注册所有异常信息
        List<Object> exps =
                arraylist.b()
                        .a("客户代号是空的")
                        .a("结束时间是空的")
                        .a("开始时间是空的")
                        .g();
        //用于记录以完成的下载的数据量，单位是byte
        long downloadedLength = 0l;
        try {
            /**
             *下面开始读取数据库数据
             * */
            List<String> cusNos = chaXunTiaoJian.getCus_no();
            String endTime = chaXunTiaoJian.getEndTime();
            String startTime=chaXunTiaoJian.getStartTime();

            if(p.empty(cusNos)){
                throw new RuntimeException("客户代号是空的");
            }
            if(p.empty(endTime)){
                throw new RuntimeException("结束时间是空的");
            }
            if(p.empty(startTime)){
                throw new RuntimeException("开始时间是空的");
            }


            for(String cusNo:cusNos){
//                  cnst.manyTabSerch.selectMfpssOsNo(cusNo,startTime,endTime);
            }










            /**
             *下面开始把读好的数据库数据封装到excel
             * */




            return null;
        } catch (Exception e) {
            String s = e.getMessage();
            l.error(s,e);
            if(exps.contains(s)){
                return Msg.gmg().setStatus(p.s0).setMsg(s);
            }else{
                return Msg.gmg().setStatus(p.s0).setMsg("未知异常");
            }
        }





    }





}
