package com.winwin.picreport.Edto;

public class TfPosZKey {
    private String osId;

    private String osNo;

    private Integer itm;

    public String getOsId() {
        return osId;
    }

    public void setOsId(String osId) {
        this.osId = osId == null ? null : osId.trim();
    }

    public String getOsNo() {
        return osNo;
    }

    public void setOsNo(String osNo) {
        this.osNo = osNo == null ? null : osNo.trim();
    }

    public Integer getItm() {
        return itm;
    }

    public void setItm(Integer itm) {
        this.itm = itm;
    }
}