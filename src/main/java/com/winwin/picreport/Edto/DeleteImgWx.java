package com.winwin.picreport.Edto;

public class DeleteImgWx {
    private String osNo;//单号
    private String url;//要删除的url

    public String getOsNo() {
        return osNo;
    }

    public DeleteImgWx setOsNo(String osNo) {
        this.osNo = osNo;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public DeleteImgWx setUrl(String url) {
        this.url = url;
        return this;
    }
}
