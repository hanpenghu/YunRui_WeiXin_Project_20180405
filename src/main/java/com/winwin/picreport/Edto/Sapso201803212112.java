//package com.winwin.picreport.Edto;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Sapso备注 implements Comparable<Sapso备注>{
//    private Integer id=-1;
//
//    private String timesamebatch="";
//
//    private String uuid="";
//
//    private String osno="";
//
//    private String ebno="";
//
//    private String caigouno="";
//
//    private String prdno="";
//
//    private String saphh="";
//
//    private Double saphhDouble=0d;
//
//
//
//    private String sapph="";
//
//    private String sapwlm="";
//
//    private BigDecimal qty=new BigDecimal(0);
//    private Double qtyDouble=0D;
//
//    private String maitouno="";
//
//    private String luohao="";
//
//    private String ganghao="";
//
//    private String realwidth="";
//
//    private String reallength="";
//
//    private String danHao_HuoHao_ChengFenDaiMa="";
//
//    private String chengFenDaiMa="";
//
//
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Edto.Sapso{");
//        sb.append("id=").append(id);
//        sb.append(", timesamebatch='").append(timesamebatch).append('\'');
//        sb.append(", uuid='").append(uuid).append('\'');
//        sb.append(", osno='").append(osno).append('\'');
//        sb.append(", ebno='").append(ebno).append('\'');
//        sb.append(", caigouno='").append(caigouno).append('\'');
//        sb.append(", prdno='").append(prdno).append('\'');
//        sb.append(", saphh='").append(saphh).append('\'');
//        sb.append(", saphhDouble=").append(saphhDouble);
//        sb.append(", sapph='").append(sapph).append('\'');
//        sb.append(", sapwlm='").append(sapwlm).append('\'');
//        sb.append(", qty=").append(qty);
//        sb.append(", qtyDouble=").append(qtyDouble);
//        sb.append(", maitouno='").append(maitouno).append('\'');
//        sb.append(", luohao='").append(luohao).append('\'');
//        sb.append(", ganghao='").append(ganghao).append('\'');
//        sb.append(", realwidth='").append(realwidth).append('\'');
//        sb.append(", reallength='").append(reallength).append('\'');
//        sb.append(", danHao_HuoHao_ChengFenDaiMa='").append(danHao_HuoHao_ChengFenDaiMa).append('\'');
//        sb.append(", chengFenDaiMa='").append(chengFenDaiMa).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
//
//    public static void main(String[]args){
//
//        List<Sapso备注> list=new ArrayList<>();
//        Sapso备注 sapso1=new Sapso备注();
//        sapso1.setSaphh("34");
//        Sapso备注 sapso2=new Sapso备注();
//        sapso2.setSaphh("29");
//        Sapso备注 sapso3=new Sapso备注();
//        sapso3.setSaphh("56");
//        Sapso备注 sapso4=new Sapso备注();
//        sapso4.setSaphh("1");
//        list.add(sapso1);
//        list.add(sapso2);
//        list.add(sapso3);
//        list.add(sapso4);
//        Collections.sort(list);
//        for(Sapso备注 sapso:list){
//            System.out.println(sapso.getSaphh());
//        }
//    }
//
//
//}