package com.winwin.picreport.Cservice;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.Constant.msgCnst;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Futils.*;

import com.winwin.picreport.Futils.ListUtils.LstAd;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.MsgGenerate.mg;
import com.winwin.picreport.Futils.excel.ReadExcelPic;
import com.winwin.picreport.Futils.excel.huoQuTuPianWenZhiHeWenZiNengYongDe.GetImgFromExcel;
import com.winwin.picreport.Futils.excel.huoQuTuPianWenZhiHeWenZiNengYongDe.ReadExcelCotent;
import org.apache.poi.ss.usermodel.PictureData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Service
@Transactional
public class D1DaYangServiceDataSaveByExcel {
    @Autowired
    private Cnst cnst;



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
        List<Map<String, PictureData>> list1=new LinkedList<>();
        List<Msg> ll = getPic(list1, excel);
        if(ll!=null){
            return ll;
        }

        /**
         *以上list的一行数据正好对应 list0的那一行数据的图片数据
         * */

        if(NotEmpty.haveSomeEmpty(LstAd.g().ad(list).ad(list1).gt().toArray())){
            return mg.gm(Msg.gmg()
                    .setMsg(msgCnst.failSave.getValue())
                    .setChMsg(msgCnst.failGetExcelData.getValue())
                    .setStatus(msgCnst.failSaveStatus.getValue())
            );
        }


        /**
         *提取数据到db,对应的图片到缩略图文件夹
         * */

        for(int i=0;i<list.size();i++){
            //得到要入数据库的第i条数据
            PrdtSamp ps = list.get(i);
            //比如  0_1_5,第0个Sheet  第1个行,  第5个列
            String s = Cnst.sheetNo + Cnst.picFgf + String.valueOf(i + 1) + Cnst.picFgf + Cnst.picColumn;
            //得到要保存的第i个图片
            PictureData pictureData=null;
            for(Map<String, PictureData> map:list1){
                if(map.keySet().contains(s)){
                    pictureData=map.get(s);
                }else{
                    pictureData=null;
                }
            }

            if(pictureData==null){
                //不用再存这个图片
                p.p(msgCnst.excelHaveNoPicInThisRow.getValue());
            }else{
                //需要存这个图片
                p.p(msgCnst.excelHaveOnePicInThisRow.getValue());



            }
            //把数据存入数据库




        }//for结束






        return mg.gm(Msg.gmg()
                .setMsg(msgCnst.failSave.getValue())
                .setChMsg(msgCnst.failGetExcelData.getValue())
                .setStatus(msgCnst.failSaveStatus.getValue())
                .setOtherMsg(msgCnst.failOfDbMistake.getValue())
        );

    }


/**
 *得到excel中的图片放入linkedlist
 * */
public List<Msg>  getPic(List<Map<String, PictureData>> list, MultipartFile excel){

    String uuid = UUID.randomUUID().toString();
    String path=cnst.excelDaoRuDaYangPicLinShiMulu+ uuid+".xlsx";
    File file=new File(path);

    try {
        excel.transferTo(file);
        list = GetImgFromExcel.g().gPicZb(file);
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

    /**
     *得到excel中除了图片以为的数据放入list
     * */
    public List<Msg>  getPrdtSamp(List<PrdtSamp> list,MultipartFile excel){
        String uuid = UUID.randomUUID().toString();
        String path=cnst.excelDaoRuDaYangPicLinShiMulu+ uuid+".xlsx";
        File file=new File(path);
        try {
            Map<Integer, Map<Integer, Object>> map;
            excel.transferTo(file);
            map= new ReadExcelCotent(file).readExcelContent();
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
