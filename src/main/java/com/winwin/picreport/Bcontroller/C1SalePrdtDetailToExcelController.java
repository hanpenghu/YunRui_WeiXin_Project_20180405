package com.winwin.picreport.Bcontroller;

import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import com.winwin.picreport.Edto.ChaXunTiaoJian;
import com.winwin.picreport.Edto.SalePrdDetailTab1;
import com.winwin.picreport.Edto.Sapso;
import com.winwin.picreport.Futils.NotEmpty;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/c1")
/**
 *导出excel
 * */
public class C1SalePrdtDetailToExcelController {
    @Autowired
    private ManyTabSerch manyTabSerch;

//     {"cus_no":[""],"startTimeStamp":"1506787200000","endTimeStamp":"1506873600000"}
    @RequestMapping(value="salePrdDetailTab1",method = RequestMethod.POST,produces ={"application/json;charset=utf-8"})
    public @ResponseBody List<SalePrdDetailTab1> salePrdDetailTab1(@RequestBody ChaXunTiaoJian chaXunTiaoJian){
        //listAll用来储存所有没有匹配sapso表的原始数据

        List<String> cus_nos = chaXunTiaoJian.getCus_no();
        if(cus_nos==null||cus_nos.size()==0){
            cus_nos=new ArrayList<>();
            cus_nos.add("");
        }

        //得到客户条件的所有未拆行的数据
        List<SalePrdDetailTab1> salePrdDetailTab1ListWeiChaiHang = this.salePrdDetailTab1ListWeiChaiHang(cus_nos, chaXunTiaoJian);
//return salePrdDetailTab1ListWeiChaiHang;



//        //将来要根据客户订单号+货号来通过数量拆分行号saphh,拆行后的数据放到salePrdDetailTab1ListYiChaiHang
        List <SalePrdDetailTab1>salePrdDetailTab1ListYiChaiHang=new ArrayList<>();
        if(!NotEmpty.notEmpty(salePrdDetailTab1ListWeiChaiHang)){return salePrdDetailTab1ListYiChaiHang; }//如果未拆行的list是空的,就暂停掉

//
//
////得到将来用于拆行的sapso
        List<Sapso>listSapsoWeiChaiHang=this.listSapsoWeiChaiHang(salePrdDetailTab1ListWeiChaiHang);


//        for(Sapso sapso:listSapsoWeiChaiHang){
//            if("EBNE1701310XZ16467".equals(sapso.getOsno())&&"10400761".equals(sapso.getPrdno())){
//                 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~存在~~~~"+sapso.getChengFenDaiMa()+"~~~~~~~~~~~");
//            }else{
//                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~不存在~~~~~~~~~~~~~~");
//            }
//        }


        List<String>danHao_HuoHao_ChenFenDaiMaListOfSapsoWeiChaiHang=new ArrayList<>();
        for(Sapso sapso:listSapsoWeiChaiHang){
            danHao_HuoHao_ChenFenDaiMaListOfSapsoWeiChaiHang.add(sapso.getDanHao_HuoHao_ChengFenDaiMa());
        }

//        if(danHao_HuoHao_ChenFenDaiMaListOfSapsoWeiChaiHang.contains("EBNE1701310XZ1646710400761")){
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~有~~~~~~~~~~~~~~");
//        }else{
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~没有~~~~~~~~~~~~~~~~~");
//        }

//        System.out.println(danHao_HuoHao_ChenFenDaiMaListOfSapso);
//        Collections.sort(listSapsoWeiChaiHang);//根据sapso中的qty升序//方便将来从小的qty拆行,拆行本身是根据相同的(货号+单号)根据qty来拆行
            for(SalePrdDetailTab1 salePrdDetailTab1:salePrdDetailTab1ListWeiChaiHang){
//                if(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa().equals("EBNE1701310XZ1646710400761")){
//                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~"+salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa()+"~~~~~~~~~~~~~~~");
//                }

                if(danHao_HuoHao_ChenFenDaiMaListOfSapsoWeiChaiHang.contains(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa())){//是通过excel导入的
//                    if(danHao_HuoHao_ChenFenDaiMaListOfSapsoWeiChaiHang.contains("EBNE1701310XZ1646710400761")){
//                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~有~~~~~~~~~~~~~~");
//                    }else{
//                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~没有~~~~~~~~~~~~~~~~~");
//                    }

                    //此时拆行,
                    int sapsoBaoHanPssBiaoShuLiang=0;//统计包sapso里面包含几个salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa()

                    List<Sapso>sapsoYongYuChai1Ge_salePrdDetailTab1_de_List=new ArrayList<>();
                    for(Sapso sapso:listSapsoWeiChaiHang){
                        if(sapso.getDanHao_HuoHao_ChengFenDaiMa().equals(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa())) {
//                            if("EBNE1701310XZ1646710400761".equals(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa())){
//                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~"+String.valueOf(sapso.getQtyDouble()-salePrdDetailTab1.getQtyDouble())+"~~~1~~~~~~~~~~~~~~~~");
//                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//                            }
//                            if("EBNE1701310XZ1646710400761".equals(sapso.getDanHao_HuoHao_ChengFenDaiMa())){
//                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~"+salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa()+"~~2~~~~~~~~~~~~~~~~~~~~");
//                            }
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
                            SalePrdDetailTab1 salePrdDetailTab2=new SalePrdDetailTab1();
                            BeanUtils.copyProperties(salePrdDetailTab1,salePrdDetailTab2);
                            Sapso sapso = iterator.next();
                            /*if(sapso.getQtyDouble()-salePrdDetailTab1.getQtyDouble()==0){
                                //就是说第一次就遇上跟自己一样的数量了,那就不用拆数量,直接用自己数量
                                salePrdDetailTab1.setSapph(sapso.getSapph());
                                salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
                                salePrdDetailTab1.setSaphh(sapso.getSaphh());
                                salePrdDetailTab1.setLuoHao(sapso.getLuohao());
                                salePrdDetailTab1.setGangHao(sapso.getGanghao());
                                salePrdDetailTab1.setRealWidth(sapso.getRealwidth());
                                salePrdDetailTab1.setRealLength(sapso.getReallength());
                                salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
                                //此时不用再拆行了,当前的这个salePrdDetailTab1大循环算是过去了
                                break;//不在拆当前的salePrdDetailTab1
                            }else*/
//                             if("EBNE1701310XZ16467".equals(sapso.getOsno())&&"10400761".equals(sapso.getPrdno())){
//                                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//                                    System.out.println(sapso.getCaigouno());
//                                    System.out.println(sapso.getQtyDouble()-salePrdDetailTab1.getQtyDouble());
//                                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~"+salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa()+"~~~~~~~~~~~~~~~~~~~~~~");
//                                }

//                            if("EBNE1701310XZ1646710400761".equals(sapso.getDanHao_HuoHao_ChengFenDaiMa())){
//                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//                                System.out.println(sapso.getCaigouno());
//                                System.out.println(sapso.getQtyDouble()-salePrdDetailTab1.getQtyDouble());
//                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~"+salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa()+"~~~~~~~~~~~~~~~~~~~~~~");
//                            }

                            if(sapso.getQtyDouble()-salePrdDetailTab1.getQtyDouble()>=0){
//                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//                                System.out.println(sapso.getDanHao_HuoHao_ChengFenDaiMa());
//                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
                               /* if("EBNE1701310XZ16467".equals(sapso.getOsno())&&"10400761".equals(sapso.getPrdno())&&"".equals(sapso.getChengFenDaiMa())){
                                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
                                    System.out.println(sapso.getCaigouno());
                                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
                                }*/
                                //此时用自己的数量,不拆行
                                salePrdDetailTab1.setSapph(sapso.getSapph());
                                salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
                                salePrdDetailTab1.setSaphh(sapso.getSaphh());
                                salePrdDetailTab1.setLuoHao(sapso.getLuohao());
                                salePrdDetailTab1.setGangHao(sapso.getGanghao());
                                salePrdDetailTab1.setRealWidth(sapso.getRealwidth());
                                salePrdDetailTab1.setRealLength(sapso.getReallength());
                                salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
                                break;//此时不再拆行
                            }else{//sapso.getQtyDouble()-salePrdDetailTab1.getQtyDouble()<0
                                /*if("EBNE1701310XZ1646711501696".equals(sapso.getDanHao_HuoHao_ChengFenDaiMa())){
                                    System.out.println("~~~~~~~~~~~~~~~"+sapso.getQty()+"~~~~~~~~~实验~~~~~"+sapso.getQtyDouble()+"~~~~~~~~~~~~~~~~~~~");
                                }*/

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
                                salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);

                                //改变salePrdDetailTab1的数量,准备下次拆行
                                salePrdDetailTab2.setQty(String.valueOf(chaiHangHouQtyDouble));//为下一次拆行准备
                                salePrdDetailTab1=salePrdDetailTab2;//然后把2再赋给1,2除了数量变了,其他地方都保持原样
                                iterator.remove();
//                                sapsoYongYuChai1Ge_salePrdDetailTab1_de_List.remove(sapso);
//                                Collections.sort(sapsoYongYuChai1Ge_salePrdDetailTab1_de_List);//
//                                iterator = sapsoYongYuChai1Ge_salePrdDetailTab1_de_List.iterator();
                            }
                        }

                    }

//                    for(Sapso sapso:listSapsoWeiChaiHang) {
//                        if(sapso.getDanHao_HuoHao_ChengFenDaiMa().equals(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa())){
//                            salePrdDetailTab1.setSapph(sapso.getSapph());
//                            salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
//                            salePrdDetailTab1.setSaphh(sapso.getSaphh());
//                            salePrdDetailTab1.setLuoHao(sapso.getLuohao());salePrdDetailTab1.setGangHao(sapso.getGanghao());
//                            salePrdDetailTab1.setRealWidth(sapso.getRealwidth());salePrdDetailTab1.setRealLength(sapso.getReallength());
//                            salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
//                            break;
//                        }
//                    }
                }else{//不是通过excel导入的//此时不拆行
                    salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
                }

            }

//       //得到所有用来拆行的sapso的单号+货号的集合
//        List<String>danHao_HuoHao_ChenFenDaiMaListOfSapso=new ArrayList<>();
//        for(Sapso sapso:listSapsoWeiChaiHang){
//            danHao_HuoHao_ChenFenDaiMaListOfSapso.add(sapso.getDanHao_HuoHao_ChengFenDaiMa());
//        }
//
//
//
//
//
////        List<SalePrdDetailTab1>xuYaoChaiHangDanShiWeiChaiHangDeSalePrdDetailTab1=new ArrayList<>();//这个放那些需要拆行未拆行的,就是放那些单号+货号在sapso中能找到的
//        for(SalePrdDetailTab1 salePrdDetailTab1:salePrdDetailTab1ListWeiChaiHang){
//            //如果当前的未拆行的当条数据salePrdDetailTab1的单号+货号在sapsoList中没有,就把他放到已经拆行的集合中(就是说不用拆行了,他在sapso中找不到)
//           if(!danHao_HuoHao_ChenFenDaiMaListOfSapso.contains(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa())){
//               salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);//此时不用拆行
//           }else{//此时才用拆行
//               //拆行是当前的数据对sapso中的每条符合单号+货号的数据根据数量进行拆行
//               if(NotEmpty.notEmpty(listSapsoWeiChaiHang)){//当sapsoList非空的时候才能拆行,空的时候其实走最上面那个if了
//                    this.diGuiChaiHang(listSapsoWeiChaiHang,salePrdDetailTab1, salePrdDetailTab1ListYiChaiHang);
//               }
//           }
//        }
        for(SalePrdDetailTab1 salePrdDetailTab1:salePrdDetailTab1ListYiChaiHang){
                if("EBNE1701310XZ1646711501696".equals(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa())){
                        System.out.println("~~~~~~~~~~~~~"+salePrdDetailTab1.getSaphh()+"~~~~~~~~~~~实验~~"+salePrdDetailTab1.getQty()+"~~~~~~~~~~~~~~~~~~~~~~");
                }
        }
        return salePrdDetailTab1ListYiChaiHang;
    }


//把salePrdDetailTab1放进listSapsoWeiChaiHang拆行,salePrdDetailTab1ListYiChaiHang负责收集
    public  void diGuiChaiHang(List<Sapso> listSapsoWeiChaiHang,SalePrdDetailTab1 salePrdDetailTab1,
                               List <SalePrdDetailTab1> salePrdDetailTab1ListYiChaiHang){
        Collections.sort(listSapsoWeiChaiHang);
        Iterator<Sapso> iterator = listSapsoWeiChaiHang.iterator();
        while(iterator.hasNext()){

            Sapso sapso = iterator.next();

            //注意:当原始数据的单号+货号跟sapso中的单号加货号一样的时候才考虑拆行
            if(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa().equals(sapso.getDanHao_HuoHao_ChengFenDaiMa())){
//                System.out.println("~~~~~~~~"+salePrdDetailTab1.getQtyDouble()+"~~~~~~~~~~~~~~~~实验~~~"+sapso.getQtyDouble()+"~~~~~~~~~~~~~~~~~~~~~");
                if(salePrdDetailTab1.getQtyDouble()<sapso.getQtyDouble()){
//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~小于《《《《《《？？？？~~~~~~~~~~~~~~~~");
                    salePrdDetailTab1.setSapph(sapso.getSapph());
                    salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
                    salePrdDetailTab1.setSaphh(sapso.getSaphh());
                    salePrdDetailTab1.setLuoHao(sapso.getLuohao());salePrdDetailTab1.setGangHao(sapso.getGanghao());
                    salePrdDetailTab1.setRealWidth(sapso.getRealwidth());salePrdDetailTab1.setRealLength(sapso.getReallength());
                    //把当前拆完行的东西放进来
                    salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
                    //数量改变后替换
                    Sapso sapso1=new Sapso();
                    sapso1.setQty(new BigDecimal(sapso.getQtyDouble()-salePrdDetailTab1.getQtyDouble()));


                    sapso1.setSapph(sapso.getSapph());
                    sapso1.setCaigouno(sapso.getCaigouno());
                    sapso1.setSaphh(sapso.getSaphh());
                    sapso1.setLuohao(sapso.getLuohao());
                    sapso1.setGanghao(sapso.getGanghao());
                    sapso1.setRealwidth(sapso.getRealwidth());
                    sapso1.setReallength(sapso.getReallength());
                    if(sapso.getQtyDouble()-salePrdDetailTab1.getQtyDouble()<=0){
                        listSapsoWeiChaiHang.remove(sapso);
                        break;//这是为了不再添加有0和负数的sapso给后来对比
                    }
                    listSapsoWeiChaiHang.add(sapso1);
                    listSapsoWeiChaiHang.remove(sapso);

                    Collections.sort(listSapsoWeiChaiHang);
//                    iterator = listSapsoWeiChaiHang.iterator();
//                    this.diGuiChaiHang(newListSapsoWeiChaiHang0,salePrdDetailTab1, salePrdDetailTab1ListYiChaiHang);
                    break;
                }else if(salePrdDetailTab1.getQtyDouble()-sapso.getQtyDouble()<0.000000001||salePrdDetailTab1.getQtyDouble()-sapso.getQtyDouble()<-0.000000001){
//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~相等？？？？？~~~~~~~~~~~~~~");
                    salePrdDetailTab1.setSapph(sapso.getSapph());
                    salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
                    salePrdDetailTab1.setSaphh(sapso.getSaphh());
                    salePrdDetailTab1.setLuoHao(sapso.getLuohao());
                    salePrdDetailTab1.setGangHao(sapso.getGanghao());
                    salePrdDetailTab1.setRealWidth(sapso.getRealwidth());
                    salePrdDetailTab1.setRealLength(sapso.getReallength());
                    //收集已经拆行的
                    salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);



                    listSapsoWeiChaiHang.remove(sapso);





//                    Collections.sort(listSapsoWeiChaiHang);

//                    iterator = listSapsoWeiChaiHang.iterator();


                    break;
                }else{//salePrdDetailTab1.getQtyDouble()>sapso.getQtyDouble()
                    salePrdDetailTab1.setSapph(sapso.getSapph());
                    salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
                    salePrdDetailTab1.setSaphh(sapso.getSaphh());
                    salePrdDetailTab1.setLuoHao(sapso.getLuohao());
                    salePrdDetailTab1.setGangHao(sapso.getGanghao());
                    salePrdDetailTab1.setRealWidth(sapso.getRealwidth());
                    salePrdDetailTab1.setRealLength(sapso.getReallength());
                    if(sapso.getQtyDouble()==0){
                        //此时salePrdDetailTab1的qty用自己的  不再用sapso的
                        salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
                        listSapsoWeiChaiHang.remove(sapso);
                        break;
                    }
                    salePrdDetailTab1.setQty(String.valueOf(sapso.getQtyDouble()));
                    //收集已经拆行的
                    salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);

                    listSapsoWeiChaiHang.remove(sapso);


                    Collections.sort(listSapsoWeiChaiHang);
                    salePrdDetailTab1.setQty(String.valueOf(salePrdDetailTab1.getQtyDouble() - sapso.getQtyDouble()));//拆行后数量要减少//因为我们是根据数量拆行的
                    iterator = listSapsoWeiChaiHang.iterator();

                }
            }
        }

    }



////////////////////////////////////////////////////////////////////////////////////////////////////////////

public List<SalePrdDetailTab1> salePrdDetailTab1ListWeiChaiHang( List<String> cus_nos,ChaXunTiaoJian chaXunTiaoJian){
    List<SalePrdDetailTab1> salePrdDetailTab1ListWeiChaiHang=new ArrayList<>();//用来存放未拆行的
    //得到前端所需要的没有匹配sapso行号和数量的原始数据全部放入listAll
    for(String cus_no:cus_nos){
        List<SalePrdDetailTab1> salePrdDetailTab1sOfDangQianCusNoXia = manyTabSerch.salePrdDetailTab1(chaXunTiaoJian, cus_no);
        if(!NotEmpty.notEmpty(salePrdDetailTab1sOfDangQianCusNoXia)){
            continue;
        }
        salePrdDetailTab1ListWeiChaiHang.addAll(salePrdDetailTab1sOfDangQianCusNoXia);
    }
    return salePrdDetailTab1ListWeiChaiHang;
}




public List<Sapso> listSapsoWeiChaiHang(List<SalePrdDetailTab1> salePrdDetailTab1ListWeiChaiHang){
    List<Sapso>listSapsoWeiChaiHang=new ArrayList<>();
    for(SalePrdDetailTab1 salePrdDetailTab1WeiChaiShang:salePrdDetailTab1ListWeiChaiHang){
        List<Sapso> sapsos = manyTabSerch.select001(salePrdDetailTab1WeiChaiShang.getCusOsNo(), salePrdDetailTab1WeiChaiShang.getPrdNo(),salePrdDetailTab1WeiChaiShang.getChengFenDaiMa());
        if(NotEmpty.notEmpty(sapsos)){
            listSapsoWeiChaiHang.addAll(sapsos);
        }
    }
    return listSapsoWeiChaiHang;
}







//    @RequestMapping(value = "salePrdDetailTab1", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
//    public @ResponseBody
//    List<SalePrdDetailTab1> salePrdDetailTab1(@RequestBody ChaXunTiaoJian chaXunTiaoJian) {
//        List<SalePrdDetailTab1> listAll = new ArrayList<>();
//        List<String> cus_nos = chaXunTiaoJian.getCus_no();
//        if (cus_nos == null || cus_nos.size() == 0) {
//            cus_nos = new ArrayList<>();
//            cus_nos.add("");
//        }
//        //循环所有的cus_no
//        for(String cus_no:cus_nos){
//
//
////        cus_nos.forEach(cus_no -> {
//
//            //找到当前客户代号下面的所有tf_pss中的数据
//            List<SalePrdDetailTab1> salePrdDetailTab1s = manyTabSerch.salePrdDetailTab1(chaXunTiaoJian, cus_no);
//          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~"+salePrdDetailTab1s+"~~~~~~~~~~~~~~~~~~~");
//            Set<String> set=new HashSet();
//            //给cusosno+prdno相同的去重
////            salePrdDetailTab1s.forEach(salePrdDetailTab1 -> {
////
////            });
//
//            for(SalePrdDetailTab1 salePrdDetailTab1:salePrdDetailTab1s){
//                set.add(salePrdDetailTab1.getCusOsNo()+salePrdDetailTab1.getPrdNo());
//            }
//
//            List<List<SalePrdDetailTab1>> list=new ArrayList<>();//给cusosno+prdno相同的分组
//            //给cusosno+prdno相同的分组
//            for(String  str:set){
//                List<SalePrdDetailTab1> list1=new ArrayList<>();
//                for(SalePrdDetailTab1 SalePrdDetailTab1:salePrdDetailTab1s){
//                    if(str.equals(SalePrdDetailTab1.getCusOsNo()+SalePrdDetailTab1.getPrdNo())){
//                        list1.add(SalePrdDetailTab1);
//                    }
//                }
////                salePrdDetailTab1s.forEach(SalePrdDetailTab1->{
////
////                });
//                list.add(list1);
//            }////给cusosno+prdno相同的分组成功
////            set.forEach(str->{
////
////            });
//
//
//            //循环所有  cusosno+prdno相同的分组
//            for(List<SalePrdDetailTab1> SalePrdDetailTab1s:list){
//
//
////            list.forEach(SalePrdDetailTab1s->{//SalePrdDetailTab1s中的cusosno+prdno都相同
//                if(SalePrdDetailTab1s!=null&&SalePrdDetailTab1s.size()>0){
//                    List<Sapso>sapsos=manyTabSerch.select001(SalePrdDetailTab1s.get(0).getCusOsNo(),SalePrdDetailTab1s.get(0).getPrdNo());
//                    Collections.sort(sapsos);//通过qty升序
//
//                    for(SalePrdDetailTab1 SalePrdDetailTab1:SalePrdDetailTab1s){
//
//                     if(NotEmpty.notEmpty(sapsos)){
//                         for(Sapso sapso:sapsos){
//                             double v = 0;
//                             try { v = Double.parseDouble(SalePrdDetailTab1.getQty()); } catch (NumberFormatException e) { v=0D; }
//                             if(v <sapso.getQty().doubleValue()){
//                                 SalePrdDetailTab1.setSapph(sapso.getSapph());
//                                 SalePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
//                                 SalePrdDetailTab1.setSaphh(sapso.getSaphh());
//                                 SalePrdDetailTab1.setLuoHao(sapso.getLuohao());
//                                 SalePrdDetailTab1.setGangHao(sapso.getGanghao());
//                                 SalePrdDetailTab1.setRealWidth(sapso.getRealwidth());
//                                 SalePrdDetailTab1.setRealLength(sapso.getReallength());
//                                 listAll.add(SalePrdDetailTab1);
//                                 //数量改变后替换
//                                 Sapso sapso1=new Sapso();
//                                 sapso1.setQty(new BigDecimal(sapso.getQty().doubleValue()-Double.parseDouble(SalePrdDetailTab1.getQty())));
//                                 sapso1.setSapph(sapso.getSapph());
//                                 sapso1.setCaigouno(sapso.getCaigouno());
//                                 sapso1.setSaphh(sapso.getSaphh());
//                                 sapso1.setLuohao(sapso.getLuohao());
//                                 sapso1.setGanghao(sapso.getGanghao());
//                                 sapso1.setRealwidth(sapso.getRealwidth());
//                                 sapso1.setReallength(sapso.getReallength());
//                                 sapsos.remove(sapso);sapsos.add(sapso1);Collections.sort(sapsos);
//                                 break;
//                             }else if(v ==sapso.getQty().doubleValue()){
//
//                                 SalePrdDetailTab1.setSapph(sapso.getSapph());
//                                 SalePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
//                                 SalePrdDetailTab1.setSaphh(sapso.getSaphh());
//                                 SalePrdDetailTab1.setLuoHao(sapso.getLuohao());
//                                 SalePrdDetailTab1.setGangHao(sapso.getGanghao());
//                                 SalePrdDetailTab1.setRealWidth(sapso.getRealwidth());
//                                 SalePrdDetailTab1.setRealLength(sapso.getReallength());
//                                 sapsos.remove(sapso);Collections.sort(sapsos);
//                                 listAll.add(SalePrdDetailTab1);
//                                 break;
//                             }else{
//
//                                 SalePrdDetailTab1.setSapph(sapso.getSapph());
//                                 SalePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
//                                 SalePrdDetailTab1.setSaphh(sapso.getSaphh());
//                                 SalePrdDetailTab1.setLuoHao(sapso.getLuohao());
//                                 SalePrdDetailTab1.setGangHao(sapso.getGanghao());
//                                 SalePrdDetailTab1.setRealWidth(sapso.getRealwidth());
//                                 SalePrdDetailTab1.setRealLength(sapso.getReallength());
//                                 SalePrdDetailTab1.setQty(String.valueOf(sapso.getQty().doubleValue()));
//                                 sapsos.remove(sapso);Collections.sort(sapsos);
//                                 listAll.add(SalePrdDetailTab1);
//                                 //此时不要break,继续拆行
//                                 double v1 = Double.parseDouble(SalePrdDetailTab1.getQty()) - sapso.getQty().doubleValue();
//                                 SalePrdDetailTab1.setQty(String.valueOf(v1));//拆行后数量要减少
//                             }
//                         }
//                     }
////                    SalePrdDetailTab1s.forEach(SalePrdDetailTab1->{//循环cusosno+prdno相同的一组
//
//                    }
////                    });
//                }
//            }
////            });
////        });
//        }
//
//        return listAll;
//    }
//    public static void main(String[]args){
//            Object o1=new Object();
//            System.out.println(o1);
//            Object o2=new Object ();
//            System.out.println(o2);
//            o1=o2;
//            System.out.println(o1);
//
//    }
}
