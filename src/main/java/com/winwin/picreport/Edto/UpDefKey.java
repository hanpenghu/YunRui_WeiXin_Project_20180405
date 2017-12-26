package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.Date;

public class UpDefKey {
    private String priceId;

    private String cusNo;

    private String curId;

    private String prdNo;

    private String prdMark;

    private String bzKnd;

    private String knd;

    private BigDecimal qty;

    private Date sDd;

    private String bilType;

    private String supPrdNo;

    private String cusAre;

    public String getPriceId() {
        return priceId;
    }

    public void setPriceId(String priceId) {
        this.priceId = priceId == null ? null : priceId.trim();
    }

    public String getCusNo() {
        return cusNo;
    }

    public void setCusNo(String cusNo) {
        this.cusNo = cusNo == null ? null : cusNo.trim();
    }

    public String getCurId() {
        return curId;
    }

    public void setCurId(String curId) {
        this.curId = curId == null ? null : curId.trim();
    }

    public String getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(String prdNo) {
        this.prdNo = prdNo == null ? null : prdNo.trim();
    }

    public String getPrdMark() {
        return prdMark;
    }

    public void setPrdMark(String prdMark) {
        this.prdMark = prdMark == null ? null : prdMark.trim();
    }

    public String getBzKnd() {
        return bzKnd;
    }

    public void setBzKnd(String bzKnd) {
        this.bzKnd = bzKnd == null ? null : bzKnd.trim();
    }

    public String getKnd() {
        return knd;
    }

    public void setKnd(String knd) {
        this.knd = knd == null ? null : knd.trim();
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public Date getsDd() {
        return sDd;
    }

    public void setsDd(Date sDd) {
        this.sDd = sDd;
    }

    public String getBilType() {
        return bilType;
    }

    public void setBilType(String bilType) {
        this.bilType = bilType == null ? null : bilType.trim();
    }

    public String getSupPrdNo() {
        return supPrdNo;
    }

    public void setSupPrdNo(String supPrdNo) {
        this.supPrdNo = supPrdNo == null ? null : supPrdNo.trim();
    }

    public String getCusAre() {
        return cusAre;
    }

    public void setCusAre(String cusAre) {
        this.cusAre = cusAre == null ? null : cusAre.trim();
    }
}