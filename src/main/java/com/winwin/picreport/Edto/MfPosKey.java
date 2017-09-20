package com.winwin.picreport.Edto;

public class MfPosKey {
    private String osId="";

    private String osNo;

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
}