package com.winwin.picreport.Cservice;

import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Futils.MessageGenerate;
import com.winwin.picreport.Futils.Msg;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.ReadExcelUtils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class D1DaYangServiceDataSaveByExcel {

@Value("${excelDaoRuDaYangPicLinShiMulu}")
private String excelDaoRuDaYangPicLinShiMulu;
    public List<Msg> dataSaveByExcel(MultipartFile excel){
        List<PrdtSamp> list=new LinkedList<>();
        List<Msg> l = this.getPrdtSamp(list, excel);
        if(l!=null){//null代表继续走下去,
            return l;
        }

        return MessageGenerate.generateMessage("保存失败", "保存失败",
                "数据库系统级别错误", "", "50");

    }


    public List<Msg>  getPrdtSamp(List<PrdtSamp> list,MultipartFile excel){
        String uuid = UUID.randomUUID().toString();
        String path=excelDaoRuDaYangPicLinShiMulu+ uuid+".xlsx";
        File file=new File(path);
        try {
            Map<Integer, Map<Integer, Object>> map;
            excel.transferTo(file);
            map= new ReadExcelUtils(file).readExcelContent();
            if(!NotEmpty.notEmpty(map)){
                return MessageGenerate.generateMessage("保存失败", "保存失败",
                        "读取excel出错001！", "", "50");
            }
            PrdtSamp prdtSamp=new PrdtSamp();
            for (int i = 1; i <= map.size(); i++) {
                System.out.println(map.get(i));
//                prdtSamp.setMarkName((String)map.get(i).get(0));
            }
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//            System.out.println(map.get(1).get(0));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        } catch (Exception e) {
            if(NotEmpty.notEmpty(file)&&file.exists()){
                file.delete();
            }
            return MessageGenerate.generateMessage("保存失败", "保存失败",
                    "读取excel出错002！", "", "50");
        }finally {
            if(NotEmpty.notEmpty(file)&&file.exists()){
                file.delete();
            }
        }

        return null;
    }





















}
