package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.Date;
//定价表
public class UpDef extends UpDefKey {
    private BigDecimal up;

    private BigDecimal disCnt;

    private Date fDd;

    private Date eDd;

    private String unit;

    private BigDecimal qtyFree;

    private String rem;

    private String chkMan;

    private Date chkDate;

    private String usr;

    private Date sysDate;

    private String hjNo;

    private Integer preItm;

    private BigDecimal rtoBjst;

    private String zdFlag;

    private String olefield;

    private BigDecimal upNet;

    private String flagRkDd;

    private String prmNo;

    private BigDecimal amtDisCnt;

    public BigDecimal getUp() {
        return up;
    }

    public void setUp(BigDecimal up) {
        this.up = up;
    }

    public BigDecimal getDisCnt() {
        return disCnt;
    }

    public void setDisCnt(BigDecimal disCnt) {
        this.disCnt = disCnt;
    }

    public Date getfDd() {
        return fDd;
    }

    public void setfDd(Date fDd) {
        this.fDd = fDd;
    }

    public Date geteDd() {
        return eDd;
    }

    public void seteDd(Date eDd) {
        this.eDd = eDd;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getQtyFree() {
        return qtyFree;
    }

    public void setQtyFree(BigDecimal qtyFree) {
        this.qtyFree = qtyFree;
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem == null ? null : rem.trim();
    }

    public String getChkMan() {
        return chkMan;
    }

    public void setChkMan(String chkMan) {
        this.chkMan = chkMan == null ? null : chkMan.trim();
    }

    public Date getChkDate() {
        return chkDate;
    }

    public void setChkDate(Date chkDate) {
        this.chkDate = chkDate;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr == null ? null : usr.trim();
    }

    public Date getSysDate() {
        return sysDate;
    }

    public void setSysDate(Date sysDate) {
        this.sysDate = sysDate;
    }

    public String getHjNo() {
        return hjNo;
    }

    public void setHjNo(String hjNo) {
        this.hjNo = hjNo == null ? null : hjNo.trim();
    }

    public Integer getPreItm() {
        return preItm;
    }

    public void setPreItm(Integer preItm) {
        this.preItm = preItm;
    }

    public BigDecimal getRtoBjst() {
        return rtoBjst;
    }

    public void setRtoBjst(BigDecimal rtoBjst) {
        this.rtoBjst = rtoBjst;
    }

    public String getZdFlag() {
        return zdFlag;
    }

    public void setZdFlag(String zdFlag) {
        this.zdFlag = zdFlag == null ? null : zdFlag.trim();
    }

    public String getOlefield() {
        return olefield;
    }

    public void setOlefield(String olefield) {
        this.olefield = olefield == null ? null : olefield.trim();
    }

    public BigDecimal getUpNet() {
        return upNet;
    }

    public void setUpNet(BigDecimal upNet) {
        this.upNet = upNet;
    }

    public String getFlagRkDd() {
        return flagRkDd;
    }

    public void setFlagRkDd(String flagRkDd) {
        this.flagRkDd = flagRkDd == null ? null : flagRkDd.trim();
    }

    public String getPrmNo() {
        return prmNo;
    }

    public void setPrmNo(String prmNo) {
        this.prmNo = prmNo == null ? null : prmNo.trim();
    }

    public BigDecimal getAmtDisCnt() {
        return amtDisCnt;
    }

    public void setAmtDisCnt(BigDecimal amtDisCnt) {
        this.amtDisCnt = amtDisCnt;
    }
}