package com.winwin.picreport.Cservice;

import com.winwin.picreport.Cnst.msgCnst;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Futils.*;

import com.winwin.picreport.Futils.ListUtils.LstAd;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.MsgGenerate.mg;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Service
public class D1DaYangServiceDataSaveByExcel {

@Value("${excelDaoRuDaYangPicLinShiMulu}")
private String excelDaoRuDaYangPicLinShiMulu;



    public List<Msg> dataSaveByExcel(MultipartFile excel){
        /**
         *得到除了图片以外的所有数据
         * */
        List<PrdtSamp> list=new LinkedList<>();
        List<Msg> l = this.getPrdtSamp(list, excel);
        if(l!=null){//null代表继续走下去,
            return l;
        }
        /**
         *得到所有图片
         * */
        List<byte[]> list0=new LinkedList<>();
        List<Msg> l0 = this.getPicData(list0, excel);
        if(l0!=null){
            return l0;
        }

        /**
         *以上list的一行数据正好对应 list0的那一行数据的图片数据
         * */

        if(NotEmpty.haveSomeEmpty(LstAd.g().ad(list).ad(list0).gt().toArray())){
            return mg.gm(Msg.gmg()
                    .setMsg(msgCnst.failSave.getValue())
                    .setChMsg(msgCnst.failGetExcelData.getValue())
                    .setStatus(msgCnst.failSaveStatus.getValue())
            );
        }


        


        return MessageGenerate.generateMessage("保存失败", "保存失败",
                "数据库系统级别错误", "", "50");

    }


/**
 *得到excel中的图片放入linkedlist
 * */


    public List<Msg> getPicData(List<byte[]> list,MultipartFile excel){
        String uuid = UUID.randomUUID().toString();
        String path=excelDaoRuDaYangPicLinShiMulu+ uuid+".xlsx";
        File file=new File(path);
        try {
            excel.transferTo(file);
            list = new ReadExcelPic().ExceByteData(file);

        } catch (IOException e) {
            e.printStackTrace();
            return MessageGenerate.generateMessage("保存失败", "保存失败",
                    "读取excel得到图片的时候失败！", "", "50");
        }
        return null;
    }

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
