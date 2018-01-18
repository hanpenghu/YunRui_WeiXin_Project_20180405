package com.winwin.picreport.Cservice;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.Constant.msgCnst;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSamp0;
import com.winwin.picreport.Edto.PrdtSampExample;
import com.winwin.picreport.Futils.*;
import com.winwin.picreport.Futils.ListUtils.LstAd;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.MsgGenerate.mg;
import com.winwin.picreport.Futils.excel.huoQuTuPianWenZhiHeWenZiNengYongDe.GetImgFromExcel;
import com.winwin.picreport.Futils.excel.huoQuTuPianWenZhiHeWenZiNengYongDe.ReadExcelCotent;
import com.winwin.picreport.Futils.fileUtil.hanhanFileUtil;
import org.apache.commons.io.IOUtils;
import org.apache.poi.ss.usermodel.PictureData;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import java.text.ParseException;
import java.util.*;
@Service
@Transactional
public class D1DaYangServiceDataSaveByExcel {
    @Autowired
    private Cnst cnst;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     ****************************************************************************************
     * */
//状态码只有50(失败)跟37(成功)
    public List<Msg> dataSaveByExcel(MultipartFile excel) throws IOException, ParseException {

        //判断是否有！或者 ;  ,有的话不通过,因为这2个是我的分隔符
        if(shangChuanTongYiReturn.isHavaIgll(excel.getOriginalFilename())){
            return shangChuanTongYiReturn.yourPicNameCanNotHaveIgll();
        }
        String path=p.gp().sad(Cnst.getProjectPath())
                .sad(Cnst.javaXieGang).sad(UUID.randomUUID().toString())
                .sad(excel.getOriginalFilename()).gad();
//        p.p(msgCnst.fgf.getValue());
//        p.p(path);
//        p.p(msgCnst.fgf.getValue());
        File file=new File(path);
        excel.transferTo(file);
        /**
         *得到除了图片以外的所有数据
         * */
        List<PrdtSamp> list=new LinkedList<>();
        List<Msg> l = this.getPrdtSamp(list, file);
        if(l!=null){//null代表继续走下去,
            return l;
        }


        /**
         *得到所有图片
         * */
        List<Map<String, PictureData>> list1=new LinkedList();
        List<Msg> ll = getPic(list1,file);
        if(ll!=null){
            return ll;
        }

        /**
         *以上list的一行数据正好对应 list0的那一行数据的图片数据
         * */
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
         p.p(list.size());
         p.p(list1.size());
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        if(NotEmpty.haveSomeEmpty(LstAd.g().ad(list).ad(list1).gt().toArray())){
            hanhanFileUtil.Del(file);
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
            String uuid= UUID.randomUUID().toString();
            //得到要入数据库的第i条数据
            PrdtSamp ps = list.get(i);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           //如果没有货号,就流水一个
            if(NotEmpty.empty(ps.getPrdNo())){
                PrdtSamp0 p0=new PrdtSamp0();
                BeanUtils.copyProperties(ps,p0);
                cnst.gPrdNo.prdtSampObjGetPrdNo(p0);
                ps.setPrdNo(p0.getPrdNo());
            }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //定义imageurl,准备放入数据库
            String imageurl=Cnst.emptyStr;
            //比如  0_1_5,第0个Sheet  第i+1个行,  第5个列
            String s=p.gp().sad(Cnst.sheetNo).sad(Cnst.picFgf)
                    .sad(String.valueOf(i+1)).sad(Cnst.picFgf)
                    .sad(Cnst.picColumn).gad();
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

                String fp = p.gp()
                        .sad(cnst.getSpringbootJarSuoLueTuFilePath())
                        .sad(uuid).sad(Cnst.ganTanHao)
                        .sad(ps.getPrdCode())
                        .sad(Cnst.dian)
                        .sad(Cnst.pngWuDian).gad();
                IOUtils.write(pictureData.getData(),new FileOutputStream(fp));
                if(hanhanFileUtil.exists(fp)){
                    //此时保存成功,不用管,顺便把缩略图的url半成品生成,将来放入数据库
                    imageurl=p.gp().sad(cnst.suoLueTuWenJianJia)
                            .sad(uuid).sad(Cnst.ganTanHao)
                            .sad(ps.getPrdCode())
                            .sad(Cnst.dian)
                            .sad(Cnst.pngWuDian).sad(Cnst.fenHao).gad();
                    ps.setThum(imageurl);
                }else{
                    //此时保存不成功,要return
                    throw new RuntimeException(msgCnst.picFailSaveJson.getValue());
                }
            }

            //设置插入时间
            ps.setInsertdate(cnst.getDbDate());
            //把数据存入数据库
            int i1 = cnst.prdtSampMapper.insertSelective(ps);
            if(i1==0){
                p.p(msgCnst.fgf.getValue());
                p.p(msgCnst.excelSaveFail.getValue());
                p.p(msgCnst.failOfDbMistake.getValue());
                p.p(msgCnst.fgf.getValue());
                throw new RuntimeException(msgCnst.excelSaveFailOfDbMistakeJson.getValue());//excel保存失败码,数据库级别错误

            }
        }//for结束
        hanhanFileUtil.Del(file);
        //返回成功信息
        return mg.gm(Msg.gmg()
                .setMsg(msgCnst.chanPinDaYangInsertOneDataSuccMsg.getValue())
                .setChMsg(msgCnst.chanPinDaYangInsertOneDataSuccChMsg.getValue())
                .setStatus(msgCnst.chanPinDaYangInsertOneDataSuccStatus.getValue())
        );

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     ****************************************************************************************
     * */
    /**
     *得到excel中的图片放入linkedlist
     * */
    public List<Msg>  getPic(List<Map<String, PictureData>> list1,File file) throws IOException {

        try {

             GetImgFromExcel.g().gPicZb(file,list1);
    //        System.out.println("~~~~GetImgFromExcel.g().gPicZb(file).size="+list1.size()+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } catch (Exception e) {
            e.printStackTrace();
            hanhanFileUtil.Del(file);
            return mg.gm(Msg.gmg().setMsg(msgCnst.excelSaveFail.getValue())
                    .setChMsg(msgCnst.excelSaveFail.getValue())
                    .setStatus( msgCnst.failSaveStatus.getValue()));
        }

        return null;

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *得到excel中除了图片以外的数据放入list
     * */
    public List<Msg>  getPrdtSamp(List<PrdtSamp> list,File file){

        try {
            Map<Integer, Map<Integer, Object>> map;

            map= new ReadExcelCotent(file).readExcelContent();
            if(NotEmpty.empty(map)){
                return mg.gm(Msg.gmg().setStatus(msgCnst.failSaveStatus.getValue())
                        .setMsg(msgCnst.excelSaveFail.getValue())
                        .setChMsg(msgCnst.failGetExcelData.getValue()));
            }
            for (int i = 1; i <= map.size(); i++) {
                PrdtSamp prdtSamp=new PrdtSamp();
                prdtSamp.setIsconfirm(0);
                prdtSamp.setMarkName((String)map.get(i).get(0));
                prdtSamp.setId(UUID.randomUUID().toString());
                prdtSamp.setCusName((String)map.get(i).get(1));

                //产品分类
                prdtSamp.setIdxNo((String)map.get(i).get(2));
                //产品名称
                prdtSamp.setIdxName((String)map.get(i).get(3));
                prdtSamp.setSalName((String)map.get(i).get(4));
                //第五个是图片
                prdtSamp.setPrdCode((String)map.get(i).get(6));
                prdtSamp.setColour((String)map.get(i).get(7));
                prdtSamp.setSize((String)map.get(i).get(8));
                try {prdtSamp.setSampMake((Date)map.get(i).get(9)); } catch (Exception e) { p.p("导入的EXcel打样时间不是日期格式！！");}
                prdtSamp.setSampRequ((String)map.get(i).get(10));
                prdtSamp.setSampDesc((String)map.get(i).get(11));

                /**
                 *下面判断是否有重复数据在数据库,有的话就停止导入excel
                 * */
                PrdtSampExample pse=new PrdtSampExample();
                pse.createCriteria()
                        .andMarkNameEqualTo(prdtSamp.getMarkName())
                .andCusNameEqualTo(prdtSamp.getCusName())
                .andIdxNoEqualTo(prdtSamp.getIdxNo())
                .andIdxNameEqualTo(prdtSamp.getIdxName())
                .andSalNameEqualTo(prdtSamp.getSalName())
                .andPrdCodeEqualTo(prdtSamp.getPrdCode())
                .andColourEqualTo(prdtSamp.getColour())
                .andSizeEqualTo(prdtSamp.getSize())
                .andSampMakeEqualTo(prdtSamp.getSampMake())
                .andSampRequEqualTo(prdtSamp.getSampRequ())
                .andSampDescEqualTo(prdtSamp.getSampDesc());
                if(cnst.prdtSampMapper.countByExample(pse)>0){
                    hanhanFileUtil.Del(file);
                    return mg.gm(Msg.gmg().setMsg(msgCnst.failSave.getValue())
                            .setChMsg(msgCnst.excelYouChongFuShuJuZaiDB.getValue())
                            .setStatus(msgCnst.failSaveStatus.getValue()));
                }
                /**
                 *没有重复数据在数据库的话才能继续搜集excel中的数据
                 * */
                list.add(prdtSamp);
            }

        } catch (Exception e) {
            e.printStackTrace();
            hanhanFileUtil.Del(file);
            return mg.gm(Msg.gmg().setStatus(msgCnst.failSaveStatus.getValue())
                    .setMsg(msgCnst.excelSaveFail.getValue())
                    .setChMsg(msgCnst.failGetExcelData.getValue()));
        }

        return null;
    }




















//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////