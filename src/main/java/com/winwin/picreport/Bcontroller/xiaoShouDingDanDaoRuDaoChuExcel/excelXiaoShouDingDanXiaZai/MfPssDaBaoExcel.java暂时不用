package com.winwin.picreport.Bcontroller.xiaoShouDingDanDaoRuDaoChuExcel.excelXiaoShouDingDanXiaZai;



import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.hanhan.p;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.util.*;

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
    Msg f(@RequestBody ChaXunTiaoJian chaXunTiaoJian){
//注册所有异常信息

        //用于记录以完成的下载的数据量，单位是byte
        long downloadedLength = 0l;
        try {
            /**
             *下面开始读取数据库数据
             * */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            List<String> cus_nos = chaXunTiaoJian.getCus_no();
            if(cus_nos==null||cus_nos.size()==0){
                cus_nos=new ArrayList<>();
                cus_nos.add("");
            }

            List<SalePrdDetailTab1> salePrdDetailTab1s
                    = this.salePrdDetailTab1ListWeiChaiHang
                    (cus_nos,chaXunTiaoJian);



//        //将来要根据客户订单号+货号来通过数量拆分行号saphh,拆行后的数据放到salePrdDetailTab1ListYiChaiHang
            List <SalePrdDetailTab1>salePrdDetailTab1ListYiChaiHang=new ArrayList<>();
            if(p.empty(salePrdDetailTab1s)){
                throw new RuntimeException("没有符合要求的信息"+p.knownExceptionSign);
            }//如果未拆行的list是空的,就暂停掉

//
//
////得到将来用于拆行的sapso
            List<Sapso>listSapsoWeiChaiHang=this.listSapsoWeiChaiHang(salePrdDetailTab1s);


            List<String>danHao_HuoHao_ChenFenDaiMaListOfSapsoWeiChaiHang=new ArrayList<>();
            for(Sapso sapso:listSapsoWeiChaiHang){
                danHao_HuoHao_ChenFenDaiMaListOfSapsoWeiChaiHang
                        .add(sapso.getDanHao_HuoHao_ChengFenDaiMa());
            }

            for(SalePrdDetailTab1 salePrdDetailTab1:salePrdDetailTab1s){

                if(danHao_HuoHao_ChenFenDaiMaListOfSapsoWeiChaiHang
                        .contains(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa())){//是通过excel导入的

                    //此时拆行,
                    //统计包sapso里面包含几个salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa()
                    int sapsoBaoHanPssBiaoShuLiang=0;

                    List<Sapso>sapsoYongYuChai1Ge_salePrdDetailTab1_de_List=new ArrayList<>();
                    for(Sapso sapso:listSapsoWeiChaiHang){
                        if(sapso.getDanHao_HuoHao_ChengFenDaiMa().equals(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa())) {

                            sapsoYongYuChai1Ge_salePrdDetailTab1_de_List.add(sapso);
                            sapsoBaoHanPssBiaoShuLiang++;
                        }
                    }
                    if(sapsoBaoHanPssBiaoShuLiang==1){
                        for(Sapso sapso:sapsoYongYuChai1Ge_salePrdDetailTab1_de_List){
                            if(sapso.getDanHao_HuoHao_ChengFenDaiMa().equals(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa())){
                                salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
                                salePrdDetailTab1.setSapph(sapso.getSapph());
                                salePrdDetailTab1.setSaphh(sapso.getSaphh());
                                salePrdDetailTab1.setLuoHao(sapso.getLuohao());
                                salePrdDetailTab1.setGangHao(sapso.getGanghao());
                                salePrdDetailTab1.setRealWidth(sapso.getRealwidth());
                                salePrdDetailTab1.setRealLength(sapso.getReallength());
                                salePrdDetailTab1.setAmt(String.valueOf(Double.parseDouble(salePrdDetailTab1.getQty())*Double.parseDouble(salePrdDetailTab1.getUp())));
//                                salePrdDetailTab1.setEbNo
//                                        (cnst.manyTabSerch.selectEbNoFromSapso(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa()).get(0));
                                salePrdDetailTab1.setEbNo
                                        (cnst.manyTabSerch.selectEbNoFromSapso(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa_saphh()).get(0));

                                salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
                                break;
                            }
                        }
                        //此时sapso里面只有一个salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa(),不用拆行,直接放入将要返回的list
//                        salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
                    }else{//此时有多个(至少2个),需要拆行


                        //此时的salePrdDetailTab1对应的多个sapso在sapsoYongYuChai1Ge_salePrdDetailTab1_de_List里面
                        Collections.sort(sapsoYongYuChai1Ge_salePrdDetailTab1_de_List);//通过saphh升序
                        //下面for里面才是对sapso里面的数据正式拆行
                        Iterator<Sapso> iterator = sapsoYongYuChai1Ge_salePrdDetailTab1_de_List.iterator();
                        while(iterator.hasNext()){
                            //salePrdDetailTab2用来存放改变的数量,其他不变
                            SalePrdDetailTab1 salePrdDetailTab2=new SalePrdDetailTab1();
                            BeanUtils.copyProperties(salePrdDetailTab1,salePrdDetailTab2);
                            Sapso sapso = iterator.next();


                            if(sapso.getQtyDouble()-salePrdDetailTab1.getQtyDouble()>=0){
//
//                                salePrdDetailTab1
//                                        .setEbNo(cnst.manyTabSerch.selectEbNoFromSapso
//                                                (salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa()).get(0));
                                //此时用自己的数量,不拆行
                                salePrdDetailTab1.setSapph(sapso.getSapph());
                                salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
                                salePrdDetailTab1.setSaphh(sapso.getSaphh());
                                salePrdDetailTab1.setLuoHao(sapso.getLuohao());
                                salePrdDetailTab1.setGangHao(sapso.getGanghao());
                                salePrdDetailTab1.setRealWidth(sapso.getRealwidth());
                                salePrdDetailTab1.setRealLength(sapso.getReallength());
                                salePrdDetailTab1.setAmt(String.valueOf(Double.parseDouble(salePrdDetailTab1.getQty())*Double.parseDouble(salePrdDetailTab1.getUp())));
                                salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
//                                p.p("-------------------------------------------------------");
//                                p.p(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa_saphh());
//                                p.p("-------------------------------------------------------");
                                salePrdDetailTab1
                                        .setEbNo(cnst.manyTabSerch.selectEbNoFromSapso(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa_saphh()).get(0));
                                break;//此时不再拆行
                            }else{
//                                salePrdDetailTab1
//                                        .setEbNo(cnst.manyTabSerch.selectEbNoFromSapso
//                                                (salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa()).get(0));
                                salePrdDetailTab1.setSapph(sapso.getSapph());
                                salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
                                salePrdDetailTab1.setSaphh(sapso.getSaphh());
                                salePrdDetailTab1.setLuoHao(sapso.getLuohao());
                                salePrdDetailTab1.setGangHao(sapso.getGanghao());
                                salePrdDetailTab1.setRealWidth(sapso.getRealwidth());
                                salePrdDetailTab1.setRealLength(sapso.getReallength());
                                //因为此时比sapso的qty大,需要继续拆行,就使用sapso的qty,进行下次对比sapso拆行,一直拆到只用自己的,因为自己的总数永远是小于等于sapso的qty的
                                double chaiHangHouQtyDouble = salePrdDetailTab1.getQtyDouble() - sapso.getQtyDouble();
                                salePrdDetailTab1.setQty(String.valueOf(sapso.getQty()));
                                salePrdDetailTab1.setAmt(String.valueOf(sapso.getQty().doubleValue()*Double.parseDouble(salePrdDetailTab1.getUp())));
//                                p.p("-------------------------------------------------------");
//                                p.p(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa_saphh());
//                                p.p("-------------------------------------------------------");
                                salePrdDetailTab1
                                        .setEbNo(cnst.manyTabSerch.selectEbNoFromSapso(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa_saphh()).get(0));
                                salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);

                                //改变salePrdDetailTab1的数量,准备下次拆行
                                salePrdDetailTab2.setQty(String.valueOf(chaiHangHouQtyDouble));//为下一次拆行准备
                                salePrdDetailTab1=salePrdDetailTab2;//然后把2再赋给1,2除了数量变了,其他地方都保持原样
                                iterator.remove();
                            }
                        }

                    }
                }else{//不是通过excel导入的//此时不拆行//也不会有ebno
//                    salePrdDetailTab1
//                            .setEbNo(manyTabSerch.selectEbNoFromSapso(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa()));
                    salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
                }

            }


//            salePrdDetailTab1ListYiChaiHang就是拆完行的


            /**
             *下面开始把读好的数据库数据封装到excel
             * */


            //第一步，创建一个workbook对应一个excel文件
            HSSFWorkbook workbook = new HSSFWorkbook();
            //第二部，在workbook中创建一个sheet对应excel中的sheet
            HSSFSheet sheet = workbook.createSheet("销货明细");
            //第三部，在sheet表中添加表头第0行，老版本的poi对sheet的行列有限制
            HSSFRow row = sheet.createRow(0);
            //第四步，创建单元格，设置表头
            HSSFCell cell = row.createCell(0);
            cell.setCellValue("采购订单号");
            cell = row.createCell(1);
            cell.setCellValue("供应商送货单号");
            cell = row.createCell(2);
            cell.setCellValue("客户订单");
            cell = row.createCell(3);
            cell.setCellValue("物料名称");
            cell = row.createCell(4);
            cell.setCellValue("计量单位");
            cell = row.createCell(5);
            cell.setCellValue("数量");
            cell = row.createCell(6);
            cell.setCellValue("单价");
            cell = row.createCell(7);
            cell.setCellValue("本位币");
            cell = row.createCell(8);
            cell.setCellValue("中类名称");
            cell = row.createCell(9);
            cell.setCellValue("EB单号");
            cell = row.createCell(10);
            cell.setCellValue("采购订单行号");
            cell = row.createCell(11);
            cell.setCellValue("供应商送货单行号");
            cell = row.createCell(12);
            cell.setCellValue("供应商物料参考编号");
            cell = row.createCell(13);
            cell.setCellValue("物料编码");
            cell = row.createCell(14);
            cell.setCellValue("批次号");
            cell = row.createCell(15);
            cell.setCellValue("备次");
            cell = row.createCell(16);
            cell.setCellValue("备注");
            cell = row.createCell(17);
            cell.setCellValue("摘要");
            cell = row.createCell(18);
            cell.setCellValue("毛重");
            cell = row.createCell(19);
            cell.setCellValue("皮重");
            cell = row.createCell(20);
            cell.setCellValue("落号");
            cell = row.createCell(21);
            cell.setCellValue("缸号");
            cell = row.createCell(22);
            cell.setCellValue("实际幅宽");
            cell = row.createCell(23);
            cell.setCellValue("实际长度");


            //第五步，写入实体数据，实际应用中这些数据从数据库得到,对象封装数据，集合包对象。对象的属性值对应表的每行的值

            for (int i = 0; i < salePrdDetailTab1ListYiChaiHang.size(); i++) {
                HSSFRow row1 = sheet.createRow(i + 1);
                SalePrdDetailTab1 s = salePrdDetailTab1ListYiChaiHang.get(i);
                //创建单元格设值
                row1.createCell(0).setCellValue(s.getCaiGouNo());
                row1.createCell(1).setCellValue(s.getPsNo());
                row1.createCell(2).setCellValue(s.getCusOsNo());
                row1.createCell(3).setCellValue(s.getPrdName());
                row1.createCell(4).setCellValue(s.getUnit());
                row1.createCell(5).setCellValue(s.getQty());
                row1.createCell(6).setCellValue(s.getUp());
                row1.createCell(7).setCellValue(s.getAmt());
                row1.createCell(8).setCellValue(s.getIndxName());
                row1.createCell(9).setCellValue(s.getEbNo());
                row1.createCell(10).setCellValue(s.getSaphh());
                row1.createCell(11).setCellValue(s.getItm());
                row1.createCell(12).setCellValue(s.getPrdNo());
                row1.createCell(13).setCellValue(s.getSapph());
                row1.createCell(14).setCellValue(s.getBat_no());
                row1.createCell(15).setCellValue(s.getBc());
                row1.createCell(16).setCellValue(s.getRemHead());
                row1.createCell(17).setCellValue(s.getRemBody());
                row1.createCell(18).setCellValue(s.getMz());
                row1.createCell(19).setCellValue(s.getPz());
                row1.createCell(20).setCellValue(s.getLuoHao());
                row1.createCell(21).setCellValue(s.getGangHao());
                row1.createCell(22).setCellValue(s.getRealWidth());
                row1.createCell(23).setCellValue(s.getRealLength());
            }

            //将文件保存到指定的位置
            try {
                FileOutputStream fos = new FileOutputStream(p.jarPath()+"/销货明细.xlsx");
                workbook.write(fos);
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
                p.throwE("将内存excel写入硬盘Excel失败"+p.knownExceptionSign);
            }






            return Msg.gmg().setStatus(p.s1).setMsg("excel打包已完成！");
        } catch (Exception e) {
            String s = e.getMessage();
            l.error(s,e);
            if(s.contains(p.knownExceptionSign)){
                return Msg.gmg().setStatus(p.s0).setMsg(s);
            }else{
                return Msg.gmg().setStatus(p.s0).setMsg("未知异常");
            }
        }





    }





    public List<SalePrdDetailTab1> salePrdDetailTab1ListWeiChaiHang( List<String> cus_nos,ChaXunTiaoJian chaXunTiaoJian){
        List<SalePrdDetailTab1> salePrdDetailTab1ListWeiChaiHang=new ArrayList<>();//用来存放未拆行的
        //得到前端所需要的没有匹配sapso行号和数量的原始数据全部放入listAll
        for(String cus_no:cus_nos){
            List<SalePrdDetailTab1> salePrdDetailTab1sOfDangQianCusNoXia =
                    cnst.manyTabSerch.salePrdDetailTab1(chaXunTiaoJian, cus_no);
            if(p.empty(salePrdDetailTab1sOfDangQianCusNoXia)){
                continue;
            }
            salePrdDetailTab1ListWeiChaiHang.addAll(salePrdDetailTab1sOfDangQianCusNoXia);
        }
        return salePrdDetailTab1ListWeiChaiHang;
    }









    public List<Sapso> listSapsoWeiChaiHang(List<SalePrdDetailTab1> salePrdDetailTab1ListWeiChaiHang){
        List<Sapso>listSapsoWeiChaiHang=new ArrayList<>();
        for(SalePrdDetailTab1 salePrdDetailTab1WeiChaiShang:salePrdDetailTab1ListWeiChaiHang){
            List<Sapso> sapsos = cnst.manyTabSerch.select001
                    (salePrdDetailTab1WeiChaiShang.getCusOsNo(),
                    salePrdDetailTab1WeiChaiShang.getPrdNo()
                            ,salePrdDetailTab1WeiChaiShang.getChengFenDaiMa());
            if(NotEmpty.notEmpty(sapsos)){
                listSapsoWeiChaiHang.addAll(sapsos);
            }
        }
        return listSapsoWeiChaiHang;
    }


}
