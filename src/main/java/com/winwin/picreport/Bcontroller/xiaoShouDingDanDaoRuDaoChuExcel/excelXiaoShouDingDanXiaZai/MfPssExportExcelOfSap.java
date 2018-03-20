package com.winwin.picreport.Bcontroller.xiaoShouDingDanDaoRuDaoChuExcel.excelXiaoShouDingDanXiaZai;


import com.alibaba.fastjson.JSON;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Ddao.reportxmlmapper.PrdtSampMapper;
import com.winwin.picreport.Edto.ChaXunTiaoJian;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSampExample;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.arraylist;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 *打样导出excel
 * 打样导出sap对应的excel
 * 对应前台的  "销货明细",提供下载
 *
 * */
@CrossOrigin
@RestController
public class MfPssExportExcelOfSap {
////////////////////////////////////////////////////////////////////////////////////
private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());
    //List<SalePrdDetailTab1>用来储存所有excel数据
    //传参{"startTime":"2018-01-02 13:24:55","endTime":"2018-01-03 14:24:55","cus_no":["C007","C003"]}
    @RequestMapping(value = InterFaceCnst.mfPssExportExcelOfSap,method = RequestMethod.POST)
    public void  f(@RequestBody ChaXunTiaoJian chaXunTiaoJian, HttpServletResponse response){
        //注册所有异常信息
        List<Object> exps = arraylist.b().a("").g();
        String fileName="hanhan.xls";
        //设置响应头和客户端保存文件名
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition", "attachment;fileName=" + fileName);
        //用于记录以完成的下载的数据量，单位是byte
        long downloadedLength = 0l;
        try {
            /**
             *下面开始读取数据库数据
             * */
            List<String> cusNos = chaXunTiaoJian.getCus_no();
            String endTime = chaXunTiaoJian.getEndTime();
            String startTime=chaXunTiaoJian.getStartTime();

            if(p.empty(cusNos)||p.empty(endTime)||p.empty(startTime)){
                throw new RuntimeException("用户穿过来的参数可能是空的:"+ JSON.toJSONString(chaXunTiaoJian));
            }

            for(String cusNo:cusNos){


            }










            /**
             *下面开始把读好的数据库数据封装到excel
             * */



            /**
             *下面开始提供给用户下载
             * */

            //打开本地文件流
            InputStream inputStream = new FileInputStream("D:\\1\\javaNote\\dos.xlsx");
            //激活下载操作
            OutputStream os = response.getOutputStream();
            //循环写入输出流
            byte[] b = new byte[2048];
            int length;
            while ((length = inputStream.read(b)) > 0) {
                os.write(b, 0, length);
                downloadedLength += b.length;
            }

            // 这里主要关闭。
            os.close();
            inputStream.close();


        } catch (Exception e) {
            l.error(e.getMessage(),e);
            e.printStackTrace();
        }




    }







/////////////////////////////////////////////////////////////////////////////////
}
