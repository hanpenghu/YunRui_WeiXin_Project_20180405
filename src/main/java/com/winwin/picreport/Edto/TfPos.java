package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.Date;

public class TfPos extends TfPosKey {
    private String qtNo;

    private String prdNo;

    private String prdName;

    private String prdMark;

    private String wh;

    private String unit;

    private Date osDd;

    private BigDecimal qty;

    private BigDecimal up;

    private BigDecimal disCnt;

    private BigDecimal amt;

    private BigDecimal amtn;

    private BigDecimal tax;

    private BigDecimal qty1;

    private BigDecimal qtyPs;

    private BigDecimal qtyPsUnsh;

    private BigDecimal qty1Ps;

    private BigDecimal qty1PsUnsh;

    private Date estDd;

    private String pakUnit;

    private BigDecimal pakExc;

    private BigDecimal pakNw;

    private String pakWeightUnit;

    private BigDecimal pakGw;

    private BigDecimal pakMeast;

    private String pakMeastUnit;

    private Date validDd;

    private String rem;

    private BigDecimal amtnCom;

    private String clsMpId;

    private BigDecimal cstStd;

    private BigDecimal upQty1;

    private Integer estItm;

    private String sendWh;

    private String ut;

    private String codeNo;

    private String attr;

    private BigDecimal qtyRk;

    private BigDecimal qtyRkUnsh;

    private String batNo;

    private Date preEstDd;

    private BigDecimal qtyPo;

    private BigDecimal qtyPoUnsh;

    private BigDecimal qtyPre;

    private BigDecimal qtyPreUnsh;

    private Integer preItm;

    private String idNo;

    private BigDecimal qtyYs;

    private BigDecimal qtyYsUnsh;

    private String freeId;

    private String bilId;

    private String bzKnd;

    private String priceId;

    private Integer othItm;

    private BigDecimal taxRto;

    private BigDecimal amtLc;

    private BigDecimal qtyBack;

    private String chkTax;

    private String supPrdNo;

    private String composeIdno;

    private BigDecimal qtySl;

    private BigDecimal qtySlUnsh;

    private String cusOsNo;

    private String othId;

    private String othNo;

    private String isvir;

    private String jhId;

    private BigDecimal qtyFh;

    private BigDecimal qtyFhUnsh;

    private String prdNoSoRes;

    private String fhNo;

    private Date fhDd;

    private BigDecimal qtyIc;

    private BigDecimal qtyIcUnsh;

    private Integer boxItm;

    private BigDecimal qtyArk;

    private BigDecimal qtyPsArk;

    private BigDecimal qtyPreArk;

    private BigDecimal qtyCkArk;

    private String maiNo;

    private String scmUsr;

    private Date scmDd;

    private BigDecimal qtySq;

    private BigDecimal qtySqUnsh;

    private BigDecimal upPo;

    private String sqId;

    private String sqNo;

    private Integer sqItm;

    private BigDecimal qtyFrac1;

    private BigDecimal qtyFrac2;

    private BigDecimal qtyFrac3;

    private BigDecimal qtyFrac4;

    private BigDecimal qtyUseWh;

    private String trdId;

    private String trdNo;

    private Integer trdItm;

    private String prdNameSoRes;

    private String picpath;

    private String chkRtn;

    private String moNo;

    private String moId;

    private String wcNo;

    private String mtnType;

    private String mtnAllId;

    private Date mtnDd;

    private Date rtnDd;

    private BigDecimal amtDisCnt;

    private Integer othItm1;

    private String freeIdDef;

    private BigDecimal upStd;

    private BigDecimal qtyAe;

    private String supPrdNm;

    private String detail;

    private String tbOid;

    private String supPrdMark;

    private String defNo;

    private Integer matrixItm;

    private String cfId;

    private Integer ttRng;

    private String ttTypeIfrs;

    private Date ttYmE;

    private BigDecimal qtyIo;

    private BigDecimal qtyIoUnsh;

    private String isSp;

    private String mrpNos;

    private Integer orItm;

    private String kindNo;

    private String xpmNo;

    private String xpmNo1;

    private Integer xpprdItm;

    private Integer xpprdItm1;

    private String clsMeId;

    private BigDecimal upSal;

    private BigDecimal amtnSal;

    private String taskNo;

    private String prmNo;

    private BigDecimal qtyLock;

    private BigDecimal qtyLockCk;

    private BigDecimal qtyLockCkUnsh;

    private String chkRep;

    private String remXp;

    private String promoId;

    private String frelation;

    private Short recordType;

    private String zpBeizsmm;

    private String zpChkval;

    private Integer keyItm;

    private String remark;

    private String remarkEng;

    private String cusKhNo;

    private String groupDep;

    private BigDecimal qty1Pre;

    private BigDecimal qty1PreUnsh;

    private BigDecimal qty1Lock;

    private BigDecimal qty1LockCk;

    private BigDecimal qty1LockCkUnsh;

    private String mallTid;

    private String issplit;

    private String chkXzl;

    private String uncfmId;

    private String uncfmUsr;

    private Date uncfmDate;

    private String scTbNo;

    private Date supRepDate1;

    private Date supRepDate2;

    private Date supRepDate3;

    private String repRem;

    public String getQtNo() {
        return qtNo;
    }

    public void setQtNo(String qtNo) {
        this.qtNo = qtNo == null ? null : qtNo.trim();
    }

    public String getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(String prdNo) {
        this.prdNo = prdNo == null ? null : prdNo.trim();
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName == null ? null : prdName.trim();
    }

    public String getPrdMark() {
        return prdMark;
    }

    public void setPrdMark(String prdMark) {
        this.prdMark = prdMark == null ? null : prdMark.trim();
    }

    public String getWh() {
        return wh;
    }

    public void setWh(String wh) {
        this.wh = wh == null ? null : wh.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Date getOsDd() {
        return osDd;
    }

    public void setOsDd(Date osDd) {
        this.osDd = osDd;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

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

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getAmtn() {
        return amtn;
    }

    public void setAmtn(BigDecimal amtn) {
        this.amtn = amtn;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getQty1() {
        return qty1;
    }

    public void setQty1(BigDecimal qty1) {
        this.qty1 = qty1;
    }

    public BigDecimal getQtyPs() {
        return qtyPs;
    }

    public void setQtyPs(BigDecimal qtyPs) {
        this.qtyPs = qtyPs;
    }

    public BigDecimal getQtyPsUnsh() {
        return qtyPsUnsh;
    }

    public void setQtyPsUnsh(BigDecimal qtyPsUnsh) {
        this.qtyPsUnsh = qtyPsUnsh;
    }

    public BigDecimal getQty1Ps() {
        return qty1Ps;
    }

    public void setQty1Ps(BigDecimal qty1Ps) {
        this.qty1Ps = qty1Ps;
    }

    public BigDecimal getQty1PsUnsh() {
        return qty1PsUnsh;
    }

    public void setQty1PsUnsh(BigDecimal qty1PsUnsh) {
        this.qty1PsUnsh = qty1PsUnsh;
    }

    public Date getEstDd() {
        return estDd;
    }

    public void setEstDd(Date estDd) {
        this.estDd = estDd;
    }

    public String getPakUnit() {
        return pakUnit;
    }

    public void setPakUnit(String pakUnit) {
        this.pakUnit = pakUnit == null ? null : pakUnit.trim();
    }

    public BigDecimal getPakExc() {
        return pakExc;
    }

    public void setPakExc(BigDecimal pakExc) {
        this.pakExc = pakExc;
    }

    public BigDecimal getPakNw() {
        return pakNw;
    }

    public void setPakNw(BigDecimal pakNw) {
        this.pakNw = pakNw;
    }

    public String getPakWeightUnit() {
        return pakWeightUnit;
    }

    public void setPakWeightUnit(String pakWeightUnit) {
        this.pakWeightUnit = pakWeightUnit == null ? null : pakWeightUnit.trim();
    }

    public BigDecimal getPakGw() {
        return pakGw;
    }

    public void setPakGw(BigDecimal pakGw) {
        this.pakGw = pakGw;
    }

    public BigDecimal getPakMeast() {
        return pakMeast;
    }

    public void setPakMeast(BigDecimal pakMeast) {
        this.pakMeast = pakMeast;
    }

    public String getPakMeastUnit() {
        return pakMeastUnit;
    }

    public void setPakMeastUnit(String pakMeastUnit) {
        this.pakMeastUnit = pakMeastUnit == null ? null : pakMeastUnit.trim();
    }

    public Date getValidDd() {
        return validDd;
    }

    public void setValidDd(Date validDd) {
        this.validDd = validDd;
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem == null ? null : rem.trim();
    }

    public BigDecimal getAmtnCom() {
        return amtnCom;
    }

    public void setAmtnCom(BigDecimal amtnCom) {
        this.amtnCom = amtnCom;
    }

    public String getClsMpId() {
        return clsMpId;
    }

    public void setClsMpId(String clsMpId) {
        this.clsMpId = clsMpId == null ? null : clsMpId.trim();
    }

    public BigDecimal getCstStd() {
        return cstStd;
    }

    public void setCstStd(BigDecimal cstStd) {
        this.cstStd = cstStd;
    }

    public BigDecimal getUpQty1() {
        return upQty1;
    }

    public void setUpQty1(BigDecimal upQty1) {
        this.upQty1 = upQty1;
    }

    public Integer getEstItm() {
        return estItm;
    }

    public void setEstItm(Integer estItm) {
        this.estItm = estItm;
    }

    public String getSendWh() {
        return sendWh;
    }

    public void setSendWh(String sendWh) {
        this.sendWh = sendWh == null ? null : sendWh.trim();
    }

    public String getUt() {
        return ut;
    }

    public void setUt(String ut) {
        this.ut = ut == null ? null : ut.trim();
    }

    public String getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(String codeNo) {
        this.codeNo = codeNo == null ? null : codeNo.trim();
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr == null ? null : attr.trim();
    }

    public BigDecimal getQtyRk() {
        return qtyRk;
    }

    public void setQtyRk(BigDecimal qtyRk) {
        this.qtyRk = qtyRk;
    }

    public BigDecimal getQtyRkUnsh() {
        return qtyRkUnsh;
    }

    public void setQtyRkUnsh(BigDecimal qtyRkUnsh) {
        this.qtyRkUnsh = qtyRkUnsh;
    }

    public String getBatNo() {
        return batNo;
    }

    public void setBatNo(String batNo) {
        this.batNo = batNo == null ? null : batNo.trim();
    }

    public Date getPreEstDd() {
        return preEstDd;
    }

    public void setPreEstDd(Date preEstDd) {
        this.preEstDd = preEstDd;
    }

    public BigDecimal getQtyPo() {
        return qtyPo;
    }

    public void setQtyPo(BigDecimal qtyPo) {
        this.qtyPo = qtyPo;
    }

    public BigDecimal getQtyPoUnsh() {
        return qtyPoUnsh;
    }

    public void setQtyPoUnsh(BigDecimal qtyPoUnsh) {
        this.qtyPoUnsh = qtyPoUnsh;
    }

    public BigDecimal getQtyPre() {
        return qtyPre;
    }

    public void setQtyPre(BigDecimal qtyPre) {
        this.qtyPre = qtyPre;
    }

    public BigDecimal getQtyPreUnsh() {
        return qtyPreUnsh;
    }

    public void setQtyPreUnsh(BigDecimal qtyPreUnsh) {
        this.qtyPreUnsh = qtyPreUnsh;
    }

    public Integer getPreItm() {
        return preItm;
    }

    public void setPreItm(Integer preItm) {
        this.preItm = preItm;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public BigDecimal getQtyYs() {
        return qtyYs;
    }

    public void setQtyYs(BigDecimal qtyYs) {
        this.qtyYs = qtyYs;
    }

    public BigDecimal getQtyYsUnsh() {
        return qtyYsUnsh;
    }

    public void setQtyYsUnsh(BigDecimal qtyYsUnsh) {
        this.qtyYsUnsh = qtyYsUnsh;
    }

    public String getFreeId() {
        return freeId;
    }

    public void setFreeId(String freeId) {
        this.freeId = freeId == null ? null : freeId.trim();
    }

    public String getBilId() {
        return bilId;
    }

    public void setBilId(String bilId) {
        this.bilId = bilId == null ? null : bilId.trim();
    }

    public String getBzKnd() {
        return bzKnd;
    }

    public void setBzKnd(String bzKnd) {
        this.bzKnd = bzKnd == null ? null : bzKnd.trim();
    }

    public String getPriceId() {
        return priceId;
    }

    public void setPriceId(String priceId) {
        this.priceId = priceId == null ? null : priceId.trim();
    }

    public Integer getOthItm() {
        return othItm;
    }

    public void setOthItm(Integer othItm) {
        this.othItm = othItm;
    }

    public BigDecimal getTaxRto() {
        return taxRto;
    }

    public void setTaxRto(BigDecimal taxRto) {
        this.taxRto = taxRto;
    }

    public BigDecimal getAmtLc() {
        return amtLc;
    }

    public void setAmtLc(BigDecimal amtLc) {
        this.amtLc = amtLc;
    }

    public BigDecimal getQtyBack() {
        return qtyBack;
    }

    public void setQtyBack(BigDecimal qtyBack) {
        this.qtyBack = qtyBack;
    }

    public String getChkTax() {
        return chkTax;
    }

    public void setChkTax(String chkTax) {
        this.chkTax = chkTax == null ? null : chkTax.trim();
    }

    public String getSupPrdNo() {
        return supPrdNo;
    }

    public void setSupPrdNo(String supPrdNo) {
        this.supPrdNo = supPrdNo == null ? null : supPrdNo.trim();
    }

    public String getComposeIdno() {
        return composeIdno;
    }

    public void setComposeIdno(String composeIdno) {
        this.composeIdno = composeIdno == null ? null : composeIdno.trim();
    }

    public BigDecimal getQtySl() {
        return qtySl;
    }

    public void setQtySl(BigDecimal qtySl) {
        this.qtySl = qtySl;
    }

    public BigDecimal getQtySlUnsh() {
        return qtySlUnsh;
    }

    public void setQtySlUnsh(BigDecimal qtySlUnsh) {
        this.qtySlUnsh = qtySlUnsh;
    }

    public String getCusOsNo() {
        return cusOsNo;
    }

    public void setCusOsNo(String cusOsNo) {
        this.cusOsNo = cusOsNo == null ? null : cusOsNo.trim();
    }

    public String getOthId() {
        return othId;
    }

    public void setOthId(String othId) {
        this.othId = othId == null ? null : othId.trim();
    }

    public String getOthNo() {
        return othNo;
    }

    public void setOthNo(String othNo) {
        this.othNo = othNo == null ? null : othNo.trim();
    }

    public String getIsvir() {
        return isvir;
    }

    public void setIsvir(String isvir) {
        this.isvir = isvir == null ? null : isvir.trim();
    }

    public String getJhId() {
        return jhId;
    }

    public void setJhId(String jhId) {
        this.jhId = jhId == null ? null : jhId.trim();
    }

    public BigDecimal getQtyFh() {
        return qtyFh;
    }

    public void setQtyFh(BigDecimal qtyFh) {
        this.qtyFh = qtyFh;
    }

    public BigDecimal getQtyFhUnsh() {
        return qtyFhUnsh;
    }

    public void setQtyFhUnsh(BigDecimal qtyFhUnsh) {
        this.qtyFhUnsh = qtyFhUnsh;
    }

    public String getPrdNoSoRes() {
        return prdNoSoRes;
    }

    public void setPrdNoSoRes(String prdNoSoRes) {
        this.prdNoSoRes = prdNoSoRes == null ? null : prdNoSoRes.trim();
    }

    public String getFhNo() {
        return fhNo;
    }

    public void setFhNo(String fhNo) {
        this.fhNo = fhNo == null ? null : fhNo.trim();
    }

    public Date getFhDd() {
        return fhDd;
    }

    public void setFhDd(Date fhDd) {
        this.fhDd = fhDd;
    }

    public BigDecimal getQtyIc() {
        return qtyIc;
    }

    public void setQtyIc(BigDecimal qtyIc) {
        this.qtyIc = qtyIc;
    }

    public BigDecimal getQtyIcUnsh() {
        return qtyIcUnsh;
    }

    public void setQtyIcUnsh(BigDecimal qtyIcUnsh) {
        this.qtyIcUnsh = qtyIcUnsh;
    }

    public Integer getBoxItm() {
        return boxItm;
    }

    public void setBoxItm(Integer boxItm) {
        this.boxItm = boxItm;
    }

    public BigDecimal getQtyArk() {
        return qtyArk;
    }

    public void setQtyArk(BigDecimal qtyArk) {
        this.qtyArk = qtyArk;
    }

    public BigDecimal getQtyPsArk() {
        return qtyPsArk;
    }

    public void setQtyPsArk(BigDecimal qtyPsArk) {
        this.qtyPsArk = qtyPsArk;
    }

    public BigDecimal getQtyPreArk() {
        return qtyPreArk;
    }

    public void setQtyPreArk(BigDecimal qtyPreArk) {
        this.qtyPreArk = qtyPreArk;
    }

    public BigDecimal getQtyCkArk() {
        return qtyCkArk;
    }

    public void setQtyCkArk(BigDecimal qtyCkArk) {
        this.qtyCkArk = qtyCkArk;
    }

    public String getMaiNo() {
        return maiNo;
    }

    public void setMaiNo(String maiNo) {
        this.maiNo = maiNo == null ? null : maiNo.trim();
    }

    public String getScmUsr() {
        return scmUsr;
    }

    public void setScmUsr(String scmUsr) {
        this.scmUsr = scmUsr == null ? null : scmUsr.trim();
    }

    public Date getScmDd() {
        return scmDd;
    }

    public void setScmDd(Date scmDd) {
        this.scmDd = scmDd;
    }

    public BigDecimal getQtySq() {
        return qtySq;
    }

    public void setQtySq(BigDecimal qtySq) {
        this.qtySq = qtySq;
    }

    public BigDecimal getQtySqUnsh() {
        return qtySqUnsh;
    }

    public void setQtySqUnsh(BigDecimal qtySqUnsh) {
        this.qtySqUnsh = qtySqUnsh;
    }

    public BigDecimal getUpPo() {
        return upPo;
    }

    public void setUpPo(BigDecimal upPo) {
        this.upPo = upPo;
    }

    public String getSqId() {
        return sqId;
    }

    public void setSqId(String sqId) {
        this.sqId = sqId == null ? null : sqId.trim();
    }

    public String getSqNo() {
        return sqNo;
    }

    public void setSqNo(String sqNo) {
        this.sqNo = sqNo == null ? null : sqNo.trim();
    }

    public Integer getSqItm() {
        return sqItm;
    }

    public void setSqItm(Integer sqItm) {
        this.sqItm = sqItm;
    }

    public BigDecimal getQtyFrac1() {
        return qtyFrac1;
    }

    public void setQtyFrac1(BigDecimal qtyFrac1) {
        this.qtyFrac1 = qtyFrac1;
    }

    public BigDecimal getQtyFrac2() {
        return qtyFrac2;
    }

    public void setQtyFrac2(BigDecimal qtyFrac2) {
        this.qtyFrac2 = qtyFrac2;
    }

    public BigDecimal getQtyFrac3() {
        return qtyFrac3;
    }

    public void setQtyFrac3(BigDecimal qtyFrac3) {
        this.qtyFrac3 = qtyFrac3;
    }

    public BigDecimal getQtyFrac4() {
        return qtyFrac4;
    }

    public void setQtyFrac4(BigDecimal qtyFrac4) {
        this.qtyFrac4 = qtyFrac4;
    }

    public BigDecimal getQtyUseWh() {
        return qtyUseWh;
    }

    public void setQtyUseWh(BigDecimal qtyUseWh) {
        this.qtyUseWh = qtyUseWh;
    }

    public String getTrdId() {
        return trdId;
    }

    public void setTrdId(String trdId) {
        this.trdId = trdId == null ? null : trdId.trim();
    }

    public String getTrdNo() {
        return trdNo;
    }

    public void setTrdNo(String trdNo) {
        this.trdNo = trdNo == null ? null : trdNo.trim();
    }

    public Integer getTrdItm() {
        return trdItm;
    }

    public void setTrdItm(Integer trdItm) {
        this.trdItm = trdItm;
    }

    public String getPrdNameSoRes() {
        return prdNameSoRes;
    }

    public void setPrdNameSoRes(String prdNameSoRes) {
        this.prdNameSoRes = prdNameSoRes == null ? null : prdNameSoRes.trim();
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public String getChkRtn() {
        return chkRtn;
    }

    public void setChkRtn(String chkRtn) {
        this.chkRtn = chkRtn == null ? null : chkRtn.trim();
    }

    public String getMoNo() {
        return moNo;
    }

    public void setMoNo(String moNo) {
        this.moNo = moNo == null ? null : moNo.trim();
    }

    public String getMoId() {
        return moId;
    }

    public void setMoId(String moId) {
        this.moId = moId == null ? null : moId.trim();
    }

    public String getWcNo() {
        return wcNo;
    }

    public void setWcNo(String wcNo) {
        this.wcNo = wcNo == null ? null : wcNo.trim();
    }

    public String getMtnType() {
        return mtnType;
    }

    public void setMtnType(String mtnType) {
        this.mtnType = mtnType == null ? null : mtnType.trim();
    }

    public String getMtnAllId() {
        return mtnAllId;
    }

    public void setMtnAllId(String mtnAllId) {
        this.mtnAllId = mtnAllId == null ? null : mtnAllId.trim();
    }

    public Date getMtnDd() {
        return mtnDd;
    }

    public void setMtnDd(Date mtnDd) {
        this.mtnDd = mtnDd;
    }

    public Date getRtnDd() {
        return rtnDd;
    }

    public void setRtnDd(Date rtnDd) {
        this.rtnDd = rtnDd;
    }

    public BigDecimal getAmtDisCnt() {
        return amtDisCnt;
    }

    public void setAmtDisCnt(BigDecimal amtDisCnt) {
        this.amtDisCnt = amtDisCnt;
    }

    public Integer getOthItm1() {
        return othItm1;
    }

    public void setOthItm1(Integer othItm1) {
        this.othItm1 = othItm1;
    }

    public String getFreeIdDef() {
        return freeIdDef;
    }

    public void setFreeIdDef(String freeIdDef) {
        this.freeIdDef = freeIdDef == null ? null : freeIdDef.trim();
    }

    public BigDecimal getUpStd() {
        return upStd;
    }

    public void setUpStd(BigDecimal upStd) {
        this.upStd = upStd;
    }

    public BigDecimal getQtyAe() {
        return qtyAe;
    }

    public void setQtyAe(BigDecimal qtyAe) {
        this.qtyAe = qtyAe;
    }

    public String getSupPrdNm() {
        return supPrdNm;
    }

    public void setSupPrdNm(String supPrdNm) {
        this.supPrdNm = supPrdNm == null ? null : supPrdNm.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getTbOid() {
        return tbOid;
    }

    public void setTbOid(String tbOid) {
        this.tbOid = tbOid == null ? null : tbOid.trim();
    }

    public String getSupPrdMark() {
        return supPrdMark;
    }

    public void setSupPrdMark(String supPrdMark) {
        this.supPrdMark = supPrdMark == null ? null : supPrdMark.trim();
    }

    public String getDefNo() {
        return defNo;
    }

    public void setDefNo(String defNo) {
        this.defNo = defNo == null ? null : defNo.trim();
    }

    public Integer getMatrixItm() {
        return matrixItm;
    }

    public void setMatrixItm(Integer matrixItm) {
        this.matrixItm = matrixItm;
    }

    public String getCfId() {
        return cfId;
    }

    public void setCfId(String cfId) {
        this.cfId = cfId == null ? null : cfId.trim();
    }

    public Integer getTtRng() {
        return ttRng;
    }

    public void setTtRng(Integer ttRng) {
        this.ttRng = ttRng;
    }

    public String getTtTypeIfrs() {
        return ttTypeIfrs;
    }

    public void setTtTypeIfrs(String ttTypeIfrs) {
        this.ttTypeIfrs = ttTypeIfrs == null ? null : ttTypeIfrs.trim();
    }

    public Date getTtYmE() {
        return ttYmE;
    }

    public void setTtYmE(Date ttYmE) {
        this.ttYmE = ttYmE;
    }

    public BigDecimal getQtyIo() {
        return qtyIo;
    }

    public void setQtyIo(BigDecimal qtyIo) {
        this.qtyIo = qtyIo;
    }

    public BigDecimal getQtyIoUnsh() {
        return qtyIoUnsh;
    }

    public void setQtyIoUnsh(BigDecimal qtyIoUnsh) {
        this.qtyIoUnsh = qtyIoUnsh;
    }

    public String getIsSp() {
        return isSp;
    }

    public void setIsSp(String isSp) {
        this.isSp = isSp == null ? null : isSp.trim();
    }

    public String getMrpNos() {
        return mrpNos;
    }

    public void setMrpNos(String mrpNos) {
        this.mrpNos = mrpNos == null ? null : mrpNos.trim();
    }

    public Integer getOrItm() {
        return orItm;
    }

    public void setOrItm(Integer orItm) {
        this.orItm = orItm;
    }

    public String getKindNo() {
        return kindNo;
    }

    public void setKindNo(String kindNo) {
        this.kindNo = kindNo == null ? null : kindNo.trim();
    }

    public String getXpmNo() {
        return xpmNo;
    }

    public void setXpmNo(String xpmNo) {
        this.xpmNo = xpmNo == null ? null : xpmNo.trim();
    }

    public String getXpmNo1() {
        return xpmNo1;
    }

    public void setXpmNo1(String xpmNo1) {
        this.xpmNo1 = xpmNo1 == null ? null : xpmNo1.trim();
    }

    public Integer getXpprdItm() {
        return xpprdItm;
    }

    public void setXpprdItm(Integer xpprdItm) {
        this.xpprdItm = xpprdItm;
    }

    public Integer getXpprdItm1() {
        return xpprdItm1;
    }

    public void setXpprdItm1(Integer xpprdItm1) {
        this.xpprdItm1 = xpprdItm1;
    }

    public String getClsMeId() {
        return clsMeId;
    }

    public void setClsMeId(String clsMeId) {
        this.clsMeId = clsMeId == null ? null : clsMeId.trim();
    }

    public BigDecimal getUpSal() {
        return upSal;
    }

    public void setUpSal(BigDecimal upSal) {
        this.upSal = upSal;
    }

    public BigDecimal getAmtnSal() {
        return amtnSal;
    }

    public void setAmtnSal(BigDecimal amtnSal) {
        this.amtnSal = amtnSal;
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo == null ? null : taskNo.trim();
    }

    public String getPrmNo() {
        return prmNo;
    }

    public void setPrmNo(String prmNo) {
        this.prmNo = prmNo == null ? null : prmNo.trim();
    }

    public BigDecimal getQtyLock() {
        return qtyLock;
    }

    public void setQtyLock(BigDecimal qtyLock) {
        this.qtyLock = qtyLock;
    }

    public BigDecimal getQtyLockCk() {
        return qtyLockCk;
    }

    public void setQtyLockCk(BigDecimal qtyLockCk) {
        this.qtyLockCk = qtyLockCk;
    }

    public BigDecimal getQtyLockCkUnsh() {
        return qtyLockCkUnsh;
    }

    public void setQtyLockCkUnsh(BigDecimal qtyLockCkUnsh) {
        this.qtyLockCkUnsh = qtyLockCkUnsh;
    }

    public String getChkRep() {
        return chkRep;
    }

    public void setChkRep(String chkRep) {
        this.chkRep = chkRep == null ? null : chkRep.trim();
    }

    public String getRemXp() {
        return remXp;
    }

    public void setRemXp(String remXp) {
        this.remXp = remXp == null ? null : remXp.trim();
    }

    public String getPromoId() {
        return promoId;
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId == null ? null : promoId.trim();
    }

    public String getFrelation() {
        return frelation;
    }

    public void setFrelation(String frelation) {
        this.frelation = frelation == null ? null : frelation.trim();
    }

    public Short getRecordType() {
        return recordType;
    }

    public void setRecordType(Short recordType) {
        this.recordType = recordType;
    }

    public String getZpBeizsmm() {
        return zpBeizsmm;
    }

    public void setZpBeizsmm(String zpBeizsmm) {
        this.zpBeizsmm = zpBeizsmm == null ? null : zpBeizsmm.trim();
    }

    public String getZpChkval() {
        return zpChkval;
    }

    public void setZpChkval(String zpChkval) {
        this.zpChkval = zpChkval == null ? null : zpChkval.trim();
    }

    public Integer getKeyItm() {
        return keyItm;
    }

    public void setKeyItm(Integer keyItm) {
        this.keyItm = keyItm;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemarkEng() {
        return remarkEng;
    }

    public void setRemarkEng(String remarkEng) {
        this.remarkEng = remarkEng == null ? null : remarkEng.trim();
    }

    public String getCusKhNo() {
        return cusKhNo;
    }

    public void setCusKhNo(String cusKhNo) {
        this.cusKhNo = cusKhNo == null ? null : cusKhNo.trim();
    }

    public String getGroupDep() {
        return groupDep;
    }

    public void setGroupDep(String groupDep) {
        this.groupDep = groupDep == null ? null : groupDep.trim();
    }

    public BigDecimal getQty1Pre() {
        return qty1Pre;
    }

    public void setQty1Pre(BigDecimal qty1Pre) {
        this.qty1Pre = qty1Pre;
    }

    public BigDecimal getQty1PreUnsh() {
        return qty1PreUnsh;
    }

    public void setQty1PreUnsh(BigDecimal qty1PreUnsh) {
        this.qty1PreUnsh = qty1PreUnsh;
    }

    public BigDecimal getQty1Lock() {
        return qty1Lock;
    }

    public void setQty1Lock(BigDecimal qty1Lock) {
        this.qty1Lock = qty1Lock;
    }

    public BigDecimal getQty1LockCk() {
        return qty1LockCk;
    }

    public void setQty1LockCk(BigDecimal qty1LockCk) {
        this.qty1LockCk = qty1LockCk;
    }

    public BigDecimal getQty1LockCkUnsh() {
        return qty1LockCkUnsh;
    }

    public void setQty1LockCkUnsh(BigDecimal qty1LockCkUnsh) {
        this.qty1LockCkUnsh = qty1LockCkUnsh;
    }

    public String getMallTid() {
        return mallTid;
    }

    public void setMallTid(String mallTid) {
        this.mallTid = mallTid == null ? null : mallTid.trim();
    }

    public String getIssplit() {
        return issplit;
    }

    public void setIssplit(String issplit) {
        this.issplit = issplit == null ? null : issplit.trim();
    }

    public String getChkXzl() {
        return chkXzl;
    }

    public void setChkXzl(String chkXzl) {
        this.chkXzl = chkXzl == null ? null : chkXzl.trim();
    }

    public String getUncfmId() {
        return uncfmId;
    }

    public void setUncfmId(String uncfmId) {
        this.uncfmId = uncfmId == null ? null : uncfmId.trim();
    }

    public String getUncfmUsr() {
        return uncfmUsr;
    }

    public void setUncfmUsr(String uncfmUsr) {
        this.uncfmUsr = uncfmUsr == null ? null : uncfmUsr.trim();
    }

    public Date getUncfmDate() {
        return uncfmDate;
    }

    public void setUncfmDate(Date uncfmDate) {
        this.uncfmDate = uncfmDate;
    }

    public String getScTbNo() {
        return scTbNo;
    }

    public void setScTbNo(String scTbNo) {
        this.scTbNo = scTbNo == null ? null : scTbNo.trim();
    }

    public Date getSupRepDate1() {
        return supRepDate1;
    }

    public void setSupRepDate1(Date supRepDate1) {
        this.supRepDate1 = supRepDate1;
    }

    public Date getSupRepDate2() {
        return supRepDate2;
    }

    public void setSupRepDate2(Date supRepDate2) {
        this.supRepDate2 = supRepDate2;
    }

    public Date getSupRepDate3() {
        return supRepDate3;
    }

    public void setSupRepDate3(Date supRepDate3) {
        this.supRepDate3 = supRepDate3;
    }

    public String getRepRem() {
        return repRem;
    }

    public void setRepRem(String repRem) {
        this.repRem = repRem == null ? null : repRem.trim();
    }
}