package com.winwin.picreport.Edto;


import java.util.List;

public class ImgSaveEntity {

    private List<String> base64Strs;

    private String osNo;


    public List<String> getBase64Strs() {
        return base64Strs;
    }

    public ImgSaveEntity setBase64Strs(List<String> base64Strs) {
        this.base64Strs = base64Strs;
        return this;
    }

    public String getOsNo() {
        return osNo;
    }

    public ImgSaveEntity setOsNo(String osNo) {
        this.osNo = osNo;
        return this;
    }
}
