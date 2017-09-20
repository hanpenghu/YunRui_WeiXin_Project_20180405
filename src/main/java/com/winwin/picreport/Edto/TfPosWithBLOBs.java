package com.winwin.picreport.Edto;

public class TfPosWithBLOBs extends TfPos {
    private String mtnRem;

    private String uncfmRem;

    public String getMtnRem() {
        return mtnRem;
    }

    public void setMtnRem(String mtnRem) {
        this.mtnRem = mtnRem == null ? null : mtnRem.trim();
    }

    public String getUncfmRem() {
        return uncfmRem;
    }

    public void setUncfmRem(String uncfmRem) {
        this.uncfmRem = uncfmRem == null ? null : uncfmRem.trim();
    }

}