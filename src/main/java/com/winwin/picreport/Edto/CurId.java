package com.winwin.picreport.Edto;

import java.math.BigDecimal;

public class CurId extends CurIdKey {
    private String name;

    private BigDecimal excRto;

    private String accNoIr;

    private String accNoIp;

    private String accNoChk;

    private BigDecimal excRtoE;

    private BigDecimal excRtoI;

    private BigDecimal excRtoO;

    private String idSgt;

    private String dep;

    private String deproNo;

    private byte[] upDd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getExcRto() {
        return excRto;
    }

    public void setExcRto(BigDecimal excRto) {
        this.excRto = excRto;
    }

    public String getAccNoIr() {
        return accNoIr;
    }

    public void setAccNoIr(String accNoIr) {
        this.accNoIr = accNoIr == null ? null : accNoIr.trim();
    }

    public String getAccNoIp() {
        return accNoIp;
    }

    public void setAccNoIp(String accNoIp) {
        this.accNoIp = accNoIp == null ? null : accNoIp.trim();
    }

    public String getAccNoChk() {
        return accNoChk;
    }

    public void setAccNoChk(String accNoChk) {
        this.accNoChk = accNoChk == null ? null : accNoChk.trim();
    }

    public BigDecimal getExcRtoE() {
        return excRtoE;
    }

    public void setExcRtoE(BigDecimal excRtoE) {
        this.excRtoE = excRtoE;
    }

    public BigDecimal getExcRtoI() {
        return excRtoI;
    }

    public void setExcRtoI(BigDecimal excRtoI) {
        this.excRtoI = excRtoI;
    }

    public BigDecimal getExcRtoO() {
        return excRtoO;
    }

    public void setExcRtoO(BigDecimal excRtoO) {
        this.excRtoO = excRtoO;
    }

    public String getIdSgt() {
        return idSgt;
    }

    public void setIdSgt(String idSgt) {
        this.idSgt = idSgt == null ? null : idSgt.trim();
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep == null ? null : dep.trim();
    }

    public String getDeproNo() {
        return deproNo;
    }

    public void setDeproNo(String deproNo) {
        this.deproNo = deproNo == null ? null : deproNo.trim();
    }

    public byte[] getUpDd() {
        return upDd;
    }

    public void setUpDd(byte[] upDd) {
        this.upDd = upDd;
    }
}