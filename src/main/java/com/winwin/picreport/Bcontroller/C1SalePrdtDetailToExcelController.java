package com.winwin.picreport.Bcontroller;

import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import com.winwin.picreport.Edto.ChaXunTiaoJian;
import com.winwin.picreport.Edto.SalePrdDetailTab1;
import com.winwin.picreport.Edto.Sapso;
import com.winwin.picreport.Futils.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/c1")
/**
 *导出excel
 * */
public class C1SalePrdtDetailToExcelController {
    @Autowired
    private ManyTabSerch manyTabSerch;
//    @RequestMapping(value="salePrdDetailTab1",method = RequestMethod.POST,produces ={"application/json;charset=utf-8"})
//    public @ResponseBody List<SalePrdDetailTab1> salePrdDetailTab1(@RequestBody ChaXunTiaoJian chaXunTiaoJian){
//        List<SalePrdDetailTab1> listAll=new ArrayList<>();
//        List<String> cus_nos = chaXunTiaoJian.getCus_no();
//        if(cus_nos==null||cus_nos.size()==0){
//            cus_nos=new ArrayList<>();
//            cus_nos.add("");
//        }
//        //循环所有的cus_no
//        cus_nos.forEach((cus_no)-> listAll.addAll(manyTabSerch.salePrdDetailTab1(chaXunTiaoJian,cus_no)));
//        return listAll;
//    }
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




        //将来要根据客户订单号+货号来通过数量拆分行号saphh,拆行后的数据放到salePrdDetailTab1ListYiChaiHang
        List <SalePrdDetailTab1>salePrdDetailTab1ListYiChaiHang=new ArrayList<>();
        if(!NotEmpty.notEmpty(salePrdDetailTab1ListWeiChaiHang)){return salePrdDetailTab1ListYiChaiHang; }//如果未拆行的list是空的,就暂停掉



//得到将来用于拆行的sapso
        List<Sapso>listSapsoWeiChaiHang=this.listSapsoWeiChaiHang(salePrdDetailTab1ListWeiChaiHang);
        Collections.sort(listSapsoWeiChaiHang);//根据sapso中的qty升序//方便将来从小的qty拆行,拆行本身是根据相同的(货号+单号)根据qty来拆行

       //得到所有用来拆行的sapso的单号+货号的集合
        List<String>danHao_HuoHaoListOfSapso=new ArrayList<>();
        for(Sapso sapso:listSapsoWeiChaiHang){
            danHao_HuoHaoListOfSapso.add(sapso.getDanHao_HuoHao());
        }





        List<SalePrdDetailTab1>xuYaoChaiHangDanShiWeiChaiHangDeSalePrdDetailTab1=new ArrayList<>();//这个放那些需要拆行未拆行的,就是放那些单号+货号在sapso中能找到的
        for(SalePrdDetailTab1 salePrdDetailTab1:salePrdDetailTab1ListWeiChaiHang){
            //如果当前的未拆行的当条数据salePrdDetailTab1的单号+货号在sapsoList中没有,就把他放到已经拆行的集合中(就是说不用拆行了,他在sapso中找不到)
           if(!danHao_HuoHaoListOfSapso.contains(salePrdDetailTab1.getDanHao_HuoHao())){
               salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);//此时不用拆行
           }else{//此时才用拆行
               //拆行是当前的数据对sapso中的每条符合单号+货号的数据根据数量进行拆行
               if(NotEmpty.notEmpty(listSapsoWeiChaiHang)){//当sapsoList非空的时候才能拆行,空的时候其实走最上面那个if了
                    this.diGuiChaiHang(listSapsoWeiChaiHang,salePrdDetailTab1, salePrdDetailTab1ListYiChaiHang);
               }
           }
        }
        return salePrdDetailTab1ListYiChaiHang;
    }



    public  void diGuiChaiHang(List<Sapso>listSapsoWeiChaiHang,SalePrdDetailTab1 salePrdDetailTab1, List <SalePrdDetailTab1>salePrdDetailTab1ListYiChaiHang){
        for(Sapso sapso:listSapsoWeiChaiHang){//双层for循环可以理解为把每个salePrdDetailTab1放到listSapsoWeiChaiHang中过一遍
            //注意:当原始数据的单号+货号跟sapso中的单号加货号一样的时候才考虑拆行
            if(salePrdDetailTab1.getDanHao_HuoHao().equals(sapso.getDanHao_HuoHao())){
                if(salePrdDetailTab1.getQtyDouble()<sapso.getQtyDouble()){
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

                    List<Sapso> newListSapsoWeiChaiHang=new ArrayList();
                    newListSapsoWeiChaiHang.addAll(listSapsoWeiChaiHang);
                    newListSapsoWeiChaiHang.remove(sapso);
                    newListSapsoWeiChaiHang.add(sapso1);Collections.sort(newListSapsoWeiChaiHang);

                   this.diGuiChaiHang(newListSapsoWeiChaiHang,salePrdDetailTab1, salePrdDetailTab1ListYiChaiHang);
                   break;
                }else if(salePrdDetailTab1.getQtyDouble()==sapso.getQtyDouble()){
                    salePrdDetailTab1.setSapph(sapso.getSapph());
                    salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
                    salePrdDetailTab1.setSaphh(sapso.getSaphh());
                    salePrdDetailTab1.setLuoHao(sapso.getLuohao());
                    salePrdDetailTab1.setGangHao(sapso.getGanghao());
                    salePrdDetailTab1.setRealWidth(sapso.getRealwidth());
                    salePrdDetailTab1.setRealLength(sapso.getReallength());
                    List<Sapso> newListSapsoWeiChaiHang=new ArrayList();
                    newListSapsoWeiChaiHang.addAll(listSapsoWeiChaiHang);
                    newListSapsoWeiChaiHang.remove(sapso);Collections.sort(newListSapsoWeiChaiHang);
                    salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
                    this.diGuiChaiHang(newListSapsoWeiChaiHang,salePrdDetailTab1, salePrdDetailTab1ListYiChaiHang);
                    break;
                }else{//salePrdDetailTab1.getQtyDouble()>sapso.getQtyDouble()
                    salePrdDetailTab1.setSapph(sapso.getSapph());
                    salePrdDetailTab1.setCaiGouNo(sapso.getCaigouno());
                    salePrdDetailTab1.setSaphh(sapso.getSaphh());
                    salePrdDetailTab1.setLuoHao(sapso.getLuohao());
                    salePrdDetailTab1.setGangHao(sapso.getGanghao());
                    salePrdDetailTab1.setRealWidth(sapso.getRealwidth());
                    salePrdDetailTab1.setRealLength(sapso.getReallength());
                    salePrdDetailTab1.setQty(String.valueOf(sapso.getQtyDouble()));

                    List<Sapso> newListSapsoWeiChaiHang=new ArrayList();
                    newListSapsoWeiChaiHang.addAll(listSapsoWeiChaiHang);

                    newListSapsoWeiChaiHang.remove(sapso);Collections.sort(newListSapsoWeiChaiHang);
                    salePrdDetailTab1ListYiChaiHang.add(salePrdDetailTab1);
                    salePrdDetailTab1.setQty(String.valueOf(salePrdDetailTab1.getQtyDouble() - sapso.getQtyDouble()));//拆行后数量要减少//因为我们是根据数量拆行的
                    this.diGuiChaiHang(newListSapsoWeiChaiHang,salePrdDetailTab1, salePrdDetailTab1ListYiChaiHang);
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
        List<Sapso> sapsos = manyTabSerch.select001(salePrdDetailTab1WeiChaiShang.getCusOsNo(), salePrdDetailTab1WeiChaiShang.getPrdNo());
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


}
