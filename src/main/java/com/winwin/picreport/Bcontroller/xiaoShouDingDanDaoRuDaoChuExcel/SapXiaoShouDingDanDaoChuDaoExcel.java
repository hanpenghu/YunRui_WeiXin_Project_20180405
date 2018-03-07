package com.winwin.picreport.Bcontroller.xiaoShouDingDanDaoRuDaoChuExcel;

import com.winwin.picreport.AllConstant.Cnst;
//import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import com.winwin.picreport.Edto.ChaXunTiaoJian;
import com.winwin.picreport.Edto.SalePrdDetailTab1;
import com.winwin.picreport.Edto.Sapso;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/c1")
/**
 *导出excel  销售订单
 * */
public class SapXiaoShouDingDanDaoChuDaoExcel {
    @Autowired
    private Cnst cnst;

//     {"cus_no":[""],"startTimeStamp":"1506787200000","endTimeStamp":"1506873600000"}
    @RequestMapping(value="salePrdDetailTab1",method = RequestMethod.POST,
            produces ={"application/json;charset=utf-8"})
    public @ResponseBody List<SalePrdDetailTab1> salePrdDetailTab1
        (@RequestBody ChaXunTiaoJian chaXunTiaoJian){
        //listAll用来储存所有没有匹配sapso表的原始数据

        List<String> cus_nos = chaXunTiaoJian.getCus_no();
        if(cus_nos==null||cus_nos.size()==0){
            cus_nos=new ArrayList<>();
            cus_nos.add("");
        }

        //得到客户条件的所有未拆行的数据
        List<SalePrdDetailTab1> salePrdDetailTab1ListWeiChaiHang =
                this.salePrdDetailTab1ListWeiChaiHang(cus_nos, chaXunTiaoJian);
//return salePrdDetailTab1ListWeiChaiHang;
        for(SalePrdDetailTab1 v:salePrdDetailTab1ListWeiChaiHang){
            if(p.dy(v.getPrdNo(),"11201043")&&p.dy(v.getCusOsNo(),"170856BR3SSYZYP84771")){
                p.p(p.gp().sad(p.dexhx).sad(p.nStr(p.zhifgf,p.n3)).sad(p.dexhx).gad());
                p.p(v);
                p.p(p.gp().sad(p.dexhx).sad(p.nStr(p.zhifgf,p.n3)).sad(p.dexhx).gad());
            }
        }




//        //将来要根据客户订单号+货号来通过数量拆分行号saphh,拆行后的数据放到salePrdDetailTab1ListYiChaiHang
        List <SalePrdDetailTab1>salePrdDetailTab1ListYiChaiHang=new ArrayList<>();
        if(!NotEmpty.notEmpty(salePrdDetailTab1ListWeiChaiHang)){
            return salePrdDetailTab1ListYiChaiHang;
        }//如果未拆行的list是空的,就暂停掉

//
//
////得到将来用于拆行的sapso
        List<Sapso>listSapsoWeiChaiHang=this.listSapsoWeiChaiHang(salePrdDetailTab1ListWeiChaiHang);


        List<String>danHao_HuoHao_ChenFenDaiMaListOfSapsoWeiChaiHang=new ArrayList<>();
        for(Sapso sapso:listSapsoWeiChaiHang){
            danHao_HuoHao_ChenFenDaiMaListOfSapsoWeiChaiHang
                    .add(sapso.getDanHao_HuoHao_ChengFenDaiMa());
        }

        for(SalePrdDetailTab1 salePrdDetailTab1:salePrdDetailTab1ListWeiChaiHang){

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

//                                p.p("-------------------------------------------------------");
//                                p.p(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa_saphh());
//                                p.p("-------------------------------------------------------");
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

        return salePrdDetailTab1ListYiChaiHang;
    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*public void tfPssDuiYingDuoGeSapsoChaiHangSaphh(){
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
            }else{

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
            }
        }
    }*/


////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public List<SalePrdDetailTab1> salePrdDetailTab1ListWeiChaiHang( List<String> cus_nos,ChaXunTiaoJian chaXunTiaoJian){
        List<SalePrdDetailTab1> salePrdDetailTab1ListWeiChaiHang=new ArrayList<>();//用来存放未拆行的
        //得到前端所需要的没有匹配sapso行号和数量的原始数据全部放入listAll
        for(String cus_no:cus_nos){
            List<SalePrdDetailTab1> salePrdDetailTab1sOfDangQianCusNoXia =
                    cnst.manyTabSerch.salePrdDetailTab1(chaXunTiaoJian, cus_no);
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
            List<Sapso> sapsos = cnst.manyTabSerch.select001(salePrdDetailTab1WeiChaiShang.getCusOsNo(), salePrdDetailTab1WeiChaiShang.getPrdNo(),salePrdDetailTab1WeiChaiShang.getChengFenDaiMa());
            if(NotEmpty.notEmpty(sapsos)){
                listSapsoWeiChaiHang.addAll(sapsos);
            }
        }
        return listSapsoWeiChaiHang;
    }

}























































































































































































































//    //把salePrdDetailTab1放进listSapsoWeiChaiHang拆行,salePrdDetailTab1ListYiChaiHang负责收集
//    public  void diGuiChaiHang(List<Sapso> listSapsoWeiChaiHang,SalePrdDetailTab1 salePrdDetailTab1,
//                               List <SalePrdDetailTab1> salePrdDetailTab1ListYiChaiHang){
//        Collections.sort(listSapsoWeiChaiHang);
//        Iterator<Sapso> iterator = listSapsoWeiChaiHang.iterator();
//        while(iterator.hasNext()){
//
//            Sapso sapso = iterator.next();
//
//            //注意:当原始数据的单号+货号跟sapso中的单号加货号一样的时候才考虑拆行
//            if(salePrdDetailTab1.getDanHao_HuoHao_ChengFenDaiMa().equals(sapso.getDanHao_HuoHao_ChengFenDaiMa())){
//                if(salePrdDetailTab1.getQtyDouble()<sapso.getQtyDouble()){
//                    salePrdDetailTab1.setSapph(sapso.getSapph());
//                    salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
//                    salePrdDetailTab1.setSaphh(sapso.getSaphh());
//                    salePrdDetailTab1.setLuoHao(sapso.getLuohao());salePrdDetailTab1.setGangHao(sapso.getGanghao());
//                    salePrdDetailTab1.setRealWidth(sapso.getRealwidth());salePrdDetailTab1.setRealLength(sapso.getReallength());
//                    //把当前拆完行的东西放进来
//                    salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
//                    //数量改变后替换
//                    Sapso sapso1=new Sapso();
//                    sapso1.setQty(new BigDecimal(sapso.getQtyDouble()-salePrdDetailTab1.getQtyDouble()));
//
//
//                    sapso1.setSapph(sapso.getSapph());
//                    sapso1.setCaigouno(sapso.getCaigouno());
//                    sapso1.setSaphh(sapso.getSaphh());
//                    sapso1.setLuohao(sapso.getLuohao());
//                    sapso1.setGanghao(sapso.getGanghao());
//                    sapso1.setRealwidth(sapso.getRealwidth());
//                    sapso1.setReallength(sapso.getReallength());
//                    if(sapso.getQtyDouble()-salePrdDetailTab1.getQtyDouble()<=0){
//                        listSapsoWeiChaiHang.remove(sapso);
//                        break;//这是为了不再添加有0和负数的sapso给后来对比
//                    }
//                    listSapsoWeiChaiHang.add(sapso1);
//                    listSapsoWeiChaiHang.remove(sapso);
//
//                    Collections.sort(listSapsoWeiChaiHang);
//                    break;
//                }else if(salePrdDetailTab1.getQtyDouble()-sapso.getQtyDouble()<0.000000001||salePrdDetailTab1.getQtyDouble()-sapso.getQtyDouble()<-0.000000001){
//                    salePrdDetailTab1.setSapph(sapso.getSapph());
//                    salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
//                    salePrdDetailTab1.setSaphh(sapso.getSaphh());
//                    salePrdDetailTab1.setLuoHao(sapso.getLuohao());
//                    salePrdDetailTab1.setGangHao(sapso.getGanghao());
//                    salePrdDetailTab1.setRealWidth(sapso.getRealwidth());
//                    salePrdDetailTab1.setRealLength(sapso.getReallength());
//                    //收集已经拆行的
//                    salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
//
//
//
//                    listSapsoWeiChaiHang.remove(sapso);
//
//                    break;
//                }else{//salePrdDetailTab1.getQtyDouble()>sapso.getQtyDouble()
//                    salePrdDetailTab1.setSapph(sapso.getSapph());
//                    salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
//                    salePrdDetailTab1.setSaphh(sapso.getSaphh());
//                    salePrdDetailTab1.setLuoHao(sapso.getLuohao());
//                    salePrdDetailTab1.setGangHao(sapso.getGanghao());
//                    salePrdDetailTab1.setRealWidth(sapso.getRealwidth());
//                    salePrdDetailTab1.setRealLength(sapso.getReallength());
//                    if(sapso.getQtyDouble()==0){
//                        //此时salePrdDetailTab1的qty用自己的  不再用sapso的
//                        salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
//                        listSapsoWeiChaiHang.remove(sapso);
//                        break;
//                    }
//                    salePrdDetailTab1.setQty(String.valueOf(sapso.getQtyDouble()));
//                    //收集已经拆行的
//                    salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
//
//                    listSapsoWeiChaiHang.remove(sapso);
//
//
//                    Collections.sort(listSapsoWeiChaiHang);
//                    salePrdDetailTab1.setQty(String.valueOf(salePrdDetailTab1.getQtyDouble() - sapso.getQtyDouble()));//拆行后数量要减少//因为我们是根据数量拆行的
//                    iterator = listSapsoWeiChaiHang.iterator();
//
//                }
//            }
//        }
//
//    }