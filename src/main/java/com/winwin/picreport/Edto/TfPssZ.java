package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.Date;

public class TfPssZ extends TfPssZKey {
    private BigDecimal bc;

    private String khnbdh;

    private BigDecimal mz;

    private String pz;

    private String qdl;

    private String xqsl;

    private Date fhrq;

    private String fdw;

    private String cfdm;

    private String jz;

    private String saphh;

    private String sapwlm;

    private String zlmc;

    private String sapph;

    private String sddh;

    private String bz;

    public BigDecimal getBc() {
        return bc;
    }

    public void setBc(BigDecimal bc) {
        this.bc = bc;
    }

    public String getKhnbdh() {
        return khnbdh;
    }

    public void setKhnbdh(String khnbdh) {
        this.khnbdh = khnbdh == null ? null : khnbdh.trim();
    }

    public BigDecimal getMz() {
        return mz;
    }

    public void setMz(BigDecimal mz) {
        this.mz = mz;
    }

    public String getPz() {
        return pz;
    }

    public void setPz(String pz) {
        this.pz = pz == null ? null : pz.trim();
    }

    public String getQdl() {
        return qdl;
    }

    public void setQdl(String qdl) {
        this.qdl = qdl == null ? null : qdl.trim();
    }

    public String getXqsl() {
        return xqsl;
    }

    public void setXqsl(String xqsl) {
        this.xqsl = xqsl == null ? null : xqsl.trim();
    }

    public Date getFhrq() {
        return fhrq;
    }

    public void setFhrq(Date fhrq) {
        this.fhrq = fhrq;
    }

    public String getFdw() {
        return fdw;
    }

    public void setFdw(String fdw) {
        this.fdw = fdw == null ? null : fdw.trim();
    }

    public String getCfdm() {
        return cfdm;
    }

    public void setCfdm(String cfdm) {
        this.cfdm = cfdm == null ? null : cfdm.trim();
    }

    public String getJz() {
        return jz;
    }

    public void setJz(String jz) {
        this.jz = jz == null ? null : jz.trim();
    }

    public String getSaphh() {
        return saphh;
    }

    public void setSaphh(String saphh) {
        this.saphh = saphh == null ? null : saphh.trim();
    }

    public String getSapwlm() {
        return sapwlm;
    }

    public void setSapwlm(String sapwlm) {
        this.sapwlm = sapwlm == null ? null : sapwlm.trim();
    }

    public String getZlmc() {
        return zlmc;
    }

    public void setZlmc(String zlmc) {
        this.zlmc = zlmc == null ? null : zlmc.trim();
    }

    public String getSapph() {
        return sapph;
    }

    public void setSapph(String sapph) {
        this.sapph = sapph == null ? null : sapph.trim();
    }

    public String getSddh() {
        return sddh;
    }

    public void setSddh(String sddh) {
        this.sddh = sddh == null ? null : sddh.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Edto.TfPssZ{");
        sb.append("bc=").append(bc);
        sb.append(", khnbdh='").append(khnbdh).append('\'');
        sb.append(", mz=").append(mz);
        sb.append(", pz='").append(pz).append('\'');
        sb.append(", qdl='").append(qdl).append('\'');
        sb.append(", xqsl='").append(xqsl).append('\'');
        sb.append(", fhrq=").append(fhrq);
        sb.append(", fdw='").append(fdw).append('\'');
        sb.append(", cfdm='").append(cfdm).append('\'');
        sb.append(", jz='").append(jz).append('\'');
        sb.append(", saphh='").append(saphh).append('\'');
        sb.append(", sapwlm='").append(sapwlm).append('\'');
        sb.append(", zlmc='").append(zlmc).append('\'');
        sb.append(", sapph='").append(sapph).append('\'');
        sb.append(", sddh='").append(sddh).append('\'');
        sb.append(", bz='").append(bz).append('\'');
        sb.append('}');
        return sb.toString();
    }
}