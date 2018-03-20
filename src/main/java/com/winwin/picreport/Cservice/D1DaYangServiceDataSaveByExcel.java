package com.winwin.picreport.Cservice;
import com.alibaba.fastjson.JSON;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.Constant.msgCnst;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSamp0;
import com.winwin.picreport.Edto.PrdtSampCreateUser;
import com.winwin.picreport.Edto.PrdtSampExample;
import com.winwin.picreport.Futils.*;
import com.winwin.picreport.Futils.ListUtils.LstAd;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.MsgGenerate.mg;
import com.winwin.picreport.Futils.excel.huoQuTuPianWenZhiHeWenZiNengYongDe.GetImgFromExcel;
import com.winwin.picreport.Futils.excel.huoQuTuPianWenZhiHeWenZiNengYongDe.ReadExcelCotent;
import com.winwin.picreport.Futils.fileUtil.hanhanFileUtil;
import com.winwin.picreport.Futils.hanhan.p;
import org.apache.commons.io.IOUtils;
import org.apache.poi.ss.usermodel.PictureData;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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
    public List<Msg> dataSaveByExcel(MultipartFile excel,HttpServletRequest r) throws IOException, ParseException {

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String user = r.getParameter("user");
        String userName="",tenantId="";
        PrdtSampCreateUser prdtSampCreateUser =null;

        try {
            if(p.notEmpty(user)){
                    //将来跟随excel中每条数据倒要插入userName和tenantId的对象
                try {
                    prdtSampCreateUser = JSON.parseObject(user, PrdtSampCreateUser.class);
                } catch (Exception e) {
                    String s="前端传过来的user的格式不是   {\"tenantId\":\"\",\"userName\":\"\"}   这种,可能是参数名被前端写错了";
                    Msg msg = Msg.gmg().setStatus(msgCnst.failSaveStatus.getValue()).setMsg(s).setChMsg(s).setOtherMsg(s);
                    p.throwE(JSON.toJSONString(msg));
                }
                userName=prdtSampCreateUser.getUserName()==null?"":prdtSampCreateUser.getUserName();
                tenantId=prdtSampCreateUser.getTenantId()==null?"":prdtSampCreateUser.getTenantId();
            }else{
                String s="前端传过来的user是空的,至少是   {\"tenantId\":\"\",\"userName\":\"\"}   这种格式";
                Msg msg = Msg.gmg().setStatus(msgCnst.failSaveStatus.getValue()).setMsg(s).setChMsg(s).setOtherMsg(s);
                p.throwE(JSON.toJSONString(msg));
            }

            p.p("-------------得到前端穿过来的用户对象------------------------------------------");
            p.p(JSON.toJSONString(prdtSampCreateUser));
            p.p("-------------------------------------------------------");
        } catch (RuntimeException e) {
            e.printStackTrace();
            p.p("-------------------------------------------------------");
            p.p("我在这里catch掉是因为害怕  这个   EXcel保存打样信息的模块出错引起不能打样, ");
            p.p(" 等前端做对后,这里try catch应该删掉");
            p.p("-------------------------------------------------------");
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //判断是否有！或者 ;  ,有的话不通过,因为这2个是我的分隔符
        if(shangChuanTongYiReturn.isHavaIgll(excel.getOriginalFilename())){
            return shangChuanTongYiReturn.yourPicNameCanNotHaveIgll();
        }
        String path=p.gp()
                .sad(Cnst.getProjectPath())
                .sad(Cnst.javaXieGang)
                .sad(UUID.randomUUID().toString())
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
///////////////////////////////////////////////////////////////////////////////
        //判断prdCode是否存在于数据库,存在于数据库就抛出异常


/////////////////////////////////////////////////////////////////////////////

        /**
         *得到所有图片
         * */
        List<Map<String, PictureData>> list1=new LinkedList();
        List<Msg> ll = this.getPic(list1,file);
        if(ll!=null){
            return ll;
        }

        /**
         *以上list的一行数据正好对应 list0的那一行数据的图片数据
         * */
//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//         p.p(list.size());
//         p.p(list1.size());
//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
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
////////////////////////货号流水模块//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           //如果没有货号,就流水一个
            if(NotEmpty.empty(ps.getPrdNo())){
//                try {
                    PrdtSamp0 p0=new PrdtSamp0();
//                    p0.setPrdCode(ps.getPrdCode());
                    BeanUtils.copyProperties(ps,p0);

                    p.p("---------------1111111111--------------------");
                    p.p(p0.getPrdCode());
                    p.p(p0.getPrdNo());
                    p.p(p0);
                    p.p("---------------1111111111--------------------");

                    //给当前的prdtSamp流水一个货号
                    cnst.gPrdNo.prdtSampObjGetPrdNo(p0);



                    //如果流水不到prdNo,就抛出异常,最后在controller层捕捉到具体信息
                    if(p.empty(p0.getPrdNo())){
                        String s=p.gp().sad("产品编码为：《")
                                .sad(p0.getPrdCode())
                                .sad("》的产品中类《")
                                .sad(p0.getFenLeiName())
                                .sad("》无法匹配,所有数据未导入").gad();
                        Msg msg = Msg.gmg().setStatus(msgCnst.failSaveStatus.getValue()).setMsg(s).setChMsg(s).setOtherMsg(s);
                        p.p("-------------------------------------------------------");
                        p.p(s);
                        p.p("-------------------------------------------------------");
                        throw new RuntimeException(JSON.toJSONString(msg));
                    }


                    p.p("---------------22222222222222--------------------");
                    p.p(p0.getPrdCode());
                    p.p(p0.getPrdNo());
                    p.p(p0);
                    p.p("---------------22222222222222--------------------");

                    ps.setPrdNo(p0.getPrdNo());

                    p.p("---------------33333333333--------------------");
                    p.p(ps.getPrdCode());
                    p.p(ps.getPrdNo());
                    p.p(ps);
                    p.p("---------------33333333333--------------------");
//                } catch (Exception e) {
//                    throw new RuntimeException(p.gp().sad(p.dexhx)
//                            .sad("excel打样的时候,生成流水号的时候产生异常,导致一条数据也没有打样成功")
//                            .sad(p.dexhx)
//                            .sad("excel da yang de shi hou ,sheng cheng liu ")
//                            .sad("shui hao de shi hou chan sheng mistake ,")
//                            .sad(p.dexhx)
//                            .gad());
//                }
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
            ps.setUserName(userName);
            ps.setTenantId(tenantId);
            //把数据存入数据库
            int i1 = cnst.prdtSampMapper.insertSelective(ps);
            if(i1==0){
                p.p(msgCnst.fgf.getValue());
                p.p(msgCnst.excelSaveFail.getValue());
                p.p(msgCnst.failOfDbMistake.getValue());
                p.p(msgCnst.fgf.getValue());
                throw new RuntimeException(msgCnst.excelSaveFailOfDbMistakeJson.getValue());//excel保存失败码,数据库级别错误

            }
            //


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

//                //产品分类
//                prdtSamp.setIdxNo((String)hashmap.get(i).get(2));
                //excel的产品名称就是产品名称,
                prdtSamp.setIdxName((String)map.get(i).get(3));

               String idxNo=cnst.a001TongYongMapper.getIdxNoFromIdxName(prdtSamp.getIdxName());

                prdtSamp.setIdxNo(idxNo);



                //excel的产品分类就是产品分类
                prdtSamp.setFenLeiName((String)map.get(i).get(2));

                String fenLeiNo=cnst.a001TongYongMapper.getIdxNoFromIdxName(prdtSamp.getFenLeiName());

                prdtSamp.setFenLeiNo(fenLeiNo);

                prdtSamp.setSalName((String)map.get(i).get(4));
                //第五个是图片
                prdtSamp.setPrdCode((String)map.get(i).get(6));
                prdtSamp.setColour((String)map.get(i).get(7));
                prdtSamp.setSize((String)map.get(i).get(8));
                try {prdtSamp.setSampMake((Date)map.get(i).get(9)); } catch (Exception e) { p.p("导入的EXcel打样时间不是日期格式！！");}
                prdtSamp.setCategory((String)map.get(i).get(10));
                prdtSamp.setTeamname((String)map.get(i).get(11));
                prdtSamp.setSampRequ((String)map.get(i).get(12));
                prdtSamp.setSampDesc((String)map.get(i).get(13));
                prdtSamp.setMainUnit((String)map.get(i).get(14));
                /**
                 *下面判断是否有重复数据在数据库,有的话就停止导入excel
                 * //这个判断重复的其实已经做了,但是后来老郑说只要prdtCode重复就 不能导入,
                 * */
                PrdtSampExample pse=new PrdtSampExample();
                pse.createCriteria()
//                        .andMarkNameEqualTo(prdtSamp.getMarkName())
//                .andCusNameEqualTo(prdtSamp.getCusName())
//                .andIdxNoEqualTo(prdtSamp.getIdxNo())
//                .andIdxNameEqualTo(prdtSamp.getIdxName())
//                .andSalNameEqualTo(prdtSamp.getSalName())
                .andPrdCodeEqualTo(prdtSamp.getPrdCode())
//                .andColourEqualTo(prdtSamp.getColour())
//                .andSizeEqualTo(prdtSamp.getSize())
//                .andSampMakeEqualTo(prdtSamp.getSampMake())
//                .andSampRequEqualTo(prdtSamp.getSampRequ())
//                .andSampDescEqualTo(prdtSamp.getSampDesc())
                     ;
                if(cnst.prdtSampMapper.countByExample(pse)>0){
                    hanhanFileUtil.Del(file);
                    return mg.gm(Msg.gmg()
//                            .setMsg(msgCnst.failSave.getValue())
                            .setMsg(msgCnst.excelYouChongFuShuJuZaiDB.getValue())
                            .setChMsg(msgCnst.excelYouChongFuShuJuZaiDB.getValue())
                            .setStatus(msgCnst.failSaveStatus.getValue()));
                }

                //判断prdtSamp的几个非空 字段是否是空的,为空的return


                if(p.empty(prdtSamp.getMarkName())){
                    return mg.gm(Msg.gmg()
//                            .setMsg(msgCnst.failSave.getValue())
                            .setMsg("你的excel中有品牌是空的！")
                            .setStatus(msgCnst.failSaveStatus.getValue()));
                }

                if(p.empty(prdtSamp.getCusName())){
                    return mg.gm(Msg.gmg()
//                            .setMsg(msgCnst.failSave.getValue())
                            .setMsg("你的excel中有客户名字是空的！")
                            .setStatus(msgCnst.failSaveStatus.getValue()));
                }

                if(p.empty(prdtSamp.getFenLeiName())){
                    return mg.gm(Msg.gmg()
//                            .setMsg(msgCnst.failSave.getValue())
                            .setMsg("你的excel中有产品分类是空的！")
                            .setStatus(msgCnst.failSaveStatus.getValue()));
                }

                if(p.empty(prdtSamp.getIdxName())){
                    return mg.gm(Msg.gmg()
//                            .setMsg(msgCnst.failSave.getValue())
                            .setMsg("你的excel中有产品名称是空的！")
                            .setStatus(msgCnst.failSaveStatus.getValue()));
                }

                if(p.empty(prdtSamp.getSalName())){
                    return mg.gm(Msg.gmg()
//                            .setMsg(msgCnst.failSave.getValue())
                            .setMsg("你的excel中有产品负责人是空的！")
                            .setStatus(msgCnst.failSaveStatus.getValue()));
                }


                if(p.empty(prdtSamp.getPrdCode())){
                    return mg.gm(Msg.gmg()
//                            .setMsg(msgCnst.failSave.getValue())
                            .setMsg("你的excel中有产品编码是空的！")
                            .setStatus(msgCnst.failSaveStatus.getValue()));
                }
                if(p.empty(prdtSamp.getSampMake())){
                    return mg.gm(Msg.gmg()
//                            .setMsg(msgCnst.failSave.getValue())
                            .setMsg("你的excel中有打样时间是空的！")
                            .setStatus(msgCnst.failSaveStatus.getValue()));
                }
                if(p.empty(prdtSamp.getMainUnit())){
                    return mg.gm(Msg.gmg()
//                            .setMsg(msgCnst.failSave.getValue())
                            .setMsg("你的excel中有主单位是空的！")
                            .setStatus(msgCnst.failSaveStatus.getValue()));
                }


                /**
                 *没有重复数据在数据库的话才能继续搜集excel中的数据
                 * */
                list.add(prdtSamp);
            }
            //下面是判断所有的prdtSamp里面有没有prdtCode是重复的,如果有,就不能导入
            int sizeBefor = list.size();
            Set<PrdtSamp> prdtSampSet = new TreeSet<>(Comparator.comparing(PrdtSamp::getPrdCode));
            prdtSampSet.addAll(list);
            int sizeAfter = prdtSampSet.size();
            if(sizeBefor!=sizeAfter){
                hanhanFileUtil.Del(file);
                return mg.gm(Msg.gmg()
//                            .setMsg(msgCnst.failSave.getValue())
                        .setMsg("您的excel中prdtCode有重复数据,请检查！")
                        .setStatus(msgCnst.failSaveStatus.getValue()));
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