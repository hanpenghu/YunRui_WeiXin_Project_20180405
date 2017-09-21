package com.winwin.picreport.Edto;

import java.math.BigDecimal;

public class BeforeSamePrdnoMerge {
    private Integer id;

    private String timesamebatch;

    private String uuid;

    private String osno;

    private String prdno;

    private String saphh;

    private BigDecimal qty;

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

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }
}