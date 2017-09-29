package com.winwin.picreport.Edto;

import java.math.BigDecimal;

public class Sapso {
    private Integer id;

    private String timesamebatch;

    private String uuid;

    private String osno;

    private String ebno;

    private String caigouno;

    private String prdno;

    private String saphh;

    private String sapph;

    private String sapwlm;

    private BigDecimal qty;

    private String maitouno;

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
}