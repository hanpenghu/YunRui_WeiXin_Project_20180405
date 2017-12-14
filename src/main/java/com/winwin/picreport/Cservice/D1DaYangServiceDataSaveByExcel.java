package com.winwin.picreport.Cservice;

import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Futils.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;

@Service
public class D1DaYangServiceDataSaveByExcel {

@Value("${excelDaoRuDaYangPicLinShiMulu}")
private String excelDaoRuDaYangPicLinShiMulu;



    public List<Msg> dataSaveByExcel(MultipartFile excel){
        List<PrdtSamp> list=new LinkedList<>();
        //list 里面装满了excel中的数据,当然,那个图片除外
        List<Msg> l = this.getPrdtSamp(list, excel);
        if(l!=null){//null代表继续走下去,
            return l;
        }

        return MessageGenerate.generateMessage("保存失败", "保存失败",
                "数据库系统级别错误", "", "50");

    }


/**
 *得到excel中的图片
 * */

    /**
     *得到excel中除了图片以为的数据放入list
     * */
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
            for (int i = 1; i <= map.size(); i++) {
                PrdtSamp prdtSamp=new PrdtSamp();
                prdtSamp.setIsconfirm(0);
                prdtSamp.setMarkName((String)map.get(i).get(0));
                prdtSamp.setId(UUID.randomUUID().toString());
                prdtSamp.setCusName((String)map.get(i).get(1));
                prdtSamp.setIdxNo((String)map.get(i).get(2));
                prdtSamp.setIdxName((String)map.get(i).get(3));
                prdtSamp.setSalName((String)map.get(i).get(4));
                //第五个是图片
                prdtSamp.setPrdCode((String)map.get(i).get(6));
                prdtSamp.setColour((String)map.get(i).get(7));
                prdtSamp.setSize((String)map.get(i).get(8));
                try {prdtSamp.setSampMake((Date)map.get(i).get(9)); } catch (Exception e) { p.p("导入的EXcel打样时间不是日期格式！！");}
                prdtSamp.setSampRequ((String)map.get(i).get(10));
                prdtSamp.setSampDesc((String)map.get(i).get(11));
                list.add(prdtSamp);
            }

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
