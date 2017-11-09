package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sapso  implements Comparable<Sapso>{
    private Integer id=-1;

    private String timesamebatch="";

    private String uuid="";

    private String osno="";

    private String ebno="";

    private String caigouno="";

    private String prdno="";

    private String saphh="";

    private Double saphhDouble=0d;



    private String sapph="";

    private String sapwlm="";

    private BigDecimal qty=new BigDecimal(0);
    private Double qtyDouble=0D;

    private String maitouno="";

    private String luohao="";

    private String ganghao="";

    private String realwidth="";

    private String reallength="";

    private String danHao_HuoHao_ChengFenDaiMa="";

    private String chengFenDaiMa="";



    public Double getSaphhDouble() {

        if("".equals(this.saphh)){
            this.saphhDouble=0d;
        }else{
            try {
                this.saphhDouble= Double.parseDouble(this.saphh);
            } catch (NumberFormatException e) {
                this.saphhDouble=0d;
            }
        }

        return saphhDouble;
    }

    public Sapso setSaphhDouble(double saphhDouble) {
        this.saphhDouble = saphhDouble;
        return this;
    }



    public String getDanHao_HuoHao_ChengFenDaiMa() {
        this.danHao_HuoHao_ChengFenDaiMa=this.osno.trim()+this.prdno.trim()+this.chengFenDaiMa.trim();
        return danHao_HuoHao_ChengFenDaiMa;
    }

    public Sapso setDanHao_HuoHao_ChengFenDaiMa(String danHao_HuoHao_ChengFenDaiMa) {
        this.danHao_HuoHao_ChengFenDaiMa = danHao_HuoHao_ChengFenDaiMa;
        return this;
    }

    public String getChengFenDaiMa() {
        return chengFenDaiMa.trim();
    }

    public Sapso setChengFenDaiMa(String chengFenDaiMa) {
        this.chengFenDaiMa = chengFenDaiMa;
        return this;
    }

//    public String getDanHao_HuoHao() {
//       this.danHao_HuoHao= this.osno+this.prdno;
//        return this.danHao_HuoHao;
//    }
//
//    public Sapso setDanHao_HuoHao(String danHao_HuoHao) {
//        this.danHao_HuoHao = danHao_HuoHao;
//        return this;
//    }

    public Double getQtyDouble() {
        try {
            this.qtyDouble=qty.doubleValue();
        } catch (Exception e) {
            this.qtyDouble=0D;
        }


        return this.qtyDouble;
    }

    public Sapso setQtyDouble(Double qtyDouble) {
        this.qtyDouble = qtyDouble;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTimesamebatch() {
        return timesamebatch;
    }

    public void setTimesamebatch(String timesamebatch) {
        this.timesamebatch = timesamebatch == null ? null : timesamebatch.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getOsno() {
        return osno.trim();
    }

    public void setOsno(String osno) {
        this.osno = osno == null ? null : osno.trim();
    }

    public String getEbno() {
        return ebno;
    }

    public void setEbno(String ebno) {
        this.ebno = ebno == null ? null : ebno.trim();
    }

    public String getCaigouno() {
        return caigouno;
    }

    public void setCaigouno(String caigouno) {
        this.caigouno = caigouno == null ? null : caigouno.trim();
    }

    public String getPrdno() {
        return prdno.trim();
    }

    public void setPrdno(String prdno) {
        this.prdno = prdno == null ? null : prdno.trim();
    }

    public String getSaphh() {
        return saphh;
    }

    public void setSaphh(String saphh) {
        this.saphh = saphh == null ? null : saphh.trim();
    }

    public String getSapph() {
        return sapph;
    }

    public void setSapph(String sapph) {
        this.sapph = sapph == null ? null : sapph.trim();
    }

    public String getSapwlm() {
        return sapwlm;
    }

    public void setSapwlm(String sapwlm) {
        this.sapwlm = sapwlm == null ? null : sapwlm.trim();
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getMaitouno() {
        return maitouno;
    }

    public void setMaitouno(String maitouno) {
        this.maitouno = maitouno == null ? null : maitouno.trim();
    }

    public String getLuohao() {
        return luohao;
    }

    public void setLuohao(String luohao) {
        this.luohao = luohao == null ? null : luohao.trim();
    }

    public String getGanghao() {
        return ganghao;
    }

    public void setGanghao(String ganghao) {
        this.ganghao = ganghao == null ? null : ganghao.trim();
    }

    public String getRealwidth() {
        return realwidth;
    }

    public void setRealwidth(String realwidth) {
        this.realwidth = realwidth == null ? null : realwidth.trim();
    }

    public String getReallength() {
        return reallength;
    }

    public void setReallength(String reallength) {
        this.reallength = reallength == null ? null : reallength.trim();
    }

    @Override//
    public int compareTo(Sapso o) {
///this在后是降序,this在前是升序

        return this.getSaphhDouble().compareTo(o.getSaphhDouble());//降序

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Edto.Sapso{");
        sb.append("id=").append(id);
        sb.append(", timesamebatch='").append(timesamebatch).append('\'');
        sb.append(", uuid='").append(uuid).append('\'');
        sb.append(", osno='").append(osno).append('\'');
        sb.append(", ebno='").append(ebno).append('\'');
        sb.append(", caigouno='").append(caigouno).append('\'');
        sb.append(", prdno='").append(prdno).append('\'');
        sb.append(", saphh='").append(saphh).append('\'');
        sb.append(", saphhDouble=").append(saphhDouble);
        sb.append(", sapph='").append(sapph).append('\'');
        sb.append(", sapwlm='").append(sapwlm).append('\'');
        sb.append(", qty=").append(qty);
        sb.append(", qtyDouble=").append(qtyDouble);
        sb.append(", maitouno='").append(maitouno).append('\'');
        sb.append(", luohao='").append(luohao).append('\'');
        sb.append(", ganghao='").append(ganghao).append('\'');
        sb.append(", realwidth='").append(realwidth).append('\'');
        sb.append(", reallength='").append(reallength).append('\'');
        sb.append(", danHao_HuoHao_ChengFenDaiMa='").append(danHao_HuoHao_ChengFenDaiMa).append('\'');
        sb.append(", chengFenDaiMa='").append(chengFenDaiMa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[]args){

        List<Sapso> list=new ArrayList<>();
        Sapso sapso1=new Sapso();
        sapso1.setSaphh("34");
        Sapso sapso2=new Sapso();
        sapso2.setSaphh("29");
        Sapso sapso3=new Sapso();
        sapso3.setSaphh("56");
        Sapso sapso4=new Sapso();
        sapso4.setSaphh("1");
        list.add(sapso1);
        list.add(sapso2);
        list.add(sapso3);
        list.add(sapso4);
        Collections.sort(list);
        for(Sapso  sapso:list){
            System.out.println(sapso.getSaphh());
        }
    }


}