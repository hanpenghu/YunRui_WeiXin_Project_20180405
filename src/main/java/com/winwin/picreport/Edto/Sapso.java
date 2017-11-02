package com.winwin.picreport.Edto;

import java.math.BigDecimal;

public class Sapso  implements Comparable<Sapso>{
    private Integer id=-1;

    private String timesamebatch="";

    private String uuid="";

    private String osno="";

    private String ebno="";

    private String caigouno="";

    private String prdno="";

    private String saphh="";

    private String sapph="";

    private String sapwlm="";

    private BigDecimal qty=new BigDecimal(0);
    private Double qtyDouble=0D;

    private String maitouno="";

    private String luohao="";

    private String ganghao="";

    private String realwidth="";

    private String reallength="";

    private String danHao_HuoHao="";

    public String getDanHao_HuoHao() {
       this.danHao_HuoHao= this.osno+this.prdno;
        return this.danHao_HuoHao;
    }

    public Sapso setDanHao_HuoHao(String danHao_HuoHao) {
        this.danHao_HuoHao = danHao_HuoHao;
        return this;
    }

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
        return osno;
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
        return prdno;
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

    @Override
    public int compareTo(Sapso o) {
        return this.getQtyDouble().compareTo(o.getQtyDouble());
    }
}