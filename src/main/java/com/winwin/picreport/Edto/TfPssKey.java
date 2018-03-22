package com.winwin.picreport.Edto;

public class TfPssKey {
    private String psId;

    private String psNo;

    private Integer itm;

    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId == null ? null : psId.trim();
    }

    public String getPsNo() {
        return psNo;
    }

    public void setPsNo(String psNo) {
        this.psNo = psNo == null ? null : psNo.trim();
    }

    public Integer getItm() {
        return itm;
    }

    public void setItm(Integer itm) {
        this.itm = itm;
    }
}