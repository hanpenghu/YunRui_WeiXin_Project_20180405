package com.winwin.picreport.Edto;

public class MfPosWithBLOBs extends MfPos {
    private String adr;

    private String rem;

    private String rpNo1;

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr == null ? null : adr.trim();
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem == null ? null : rem.trim();
    }

    public String getRpNo1() {
        return rpNo1;
    }

    public void setRpNo1(String rpNo1) {
        this.rpNo1 = rpNo1 == null ? null : rpNo1.trim();
    }
}