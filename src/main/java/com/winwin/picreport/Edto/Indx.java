package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.Date;

public class Indx {
    private String idxNo;

    private String name;

    private String idxUp;

    private Date stopDd;

    private String rem;

    private BigDecimal upStd;

    private String webTitle;

    private String webDescription;

    private String webKeywords;

    private String daySupply;

    private String chkYh;

    private BigDecimal losRto;

    private String chkPos;

    private String idxType;

    private String chkB2c;

    private byte[] upDd;

    public String getIdxNo() {
        return idxNo;
    }

    public void setIdxNo(String idxNo) {
        this.idxNo = idxNo == null ? null : idxNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdxUp() {
        return idxUp;
    }

    public void setIdxUp(String idxUp) {
        this.idxUp = idxUp == null ? null : idxUp.trim();
    }

    public Date getStopDd() {
        return stopDd;
    }

    public void setStopDd(Date stopDd) {
        this.stopDd = stopDd;
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem == null ? null : rem.trim();
    }

    public BigDecimal getUpStd() {
        return upStd;
    }

    public void setUpStd(BigDecimal upStd) {
        this.upStd = upStd;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public void setWebTitle(String webTitle) {
        this.webTitle = webTitle == null ? null : webTitle.trim();
    }

    public String getWebDescription() {
        return webDescription;
    }

    public void setWebDescription(String webDescription) {
        this.webDescription = webDescription == null ? null : webDescription.trim();
    }

    public String getWebKeywords() {
        return webKeywords;
    }

    public void setWebKeywords(String webKeywords) {
        this.webKeywords = webKeywords == null ? null : webKeywords.trim();
    }

    public String getDaySupply() {
        return daySupply;
    }

    public void setDaySupply(String daySupply) {
        this.daySupply = daySupply == null ? null : daySupply.trim();
    }

    public String getChkYh() {
        return chkYh;
    }

    public void setChkYh(String chkYh) {
        this.chkYh = chkYh == null ? null : chkYh.trim();
    }

    public BigDecimal getLosRto() {
        return losRto;
    }

    public void setLosRto(BigDecimal losRto) {
        this.losRto = losRto;
    }

    public String getChkPos() {
        return chkPos;
    }

    public void setChkPos(String chkPos) {
        this.chkPos = chkPos == null ? null : chkPos.trim();
    }

    public String getIdxType() {
        return idxType;
    }

    public void setIdxType(String idxType) {
        this.idxType = idxType == null ? null : idxType.trim();
    }

    public String getChkB2c() {
        return chkB2c;
    }

    public void setChkB2c(String chkB2c) {
        this.chkB2c = chkB2c == null ? null : chkB2c.trim();
    }

    public byte[] getUpDd() {
        return upDd;
    }

    public void setUpDd(byte[] upDd) {
        this.upDd = upDd;
    }
}