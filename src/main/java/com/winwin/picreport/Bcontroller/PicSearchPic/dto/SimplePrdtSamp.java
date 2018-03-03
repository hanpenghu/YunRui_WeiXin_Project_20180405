package com.winwin.picreport.Bcontroller.PicSearchPic.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimplePrdtSamp {
    @JsonProperty("prdtName")
    private String prdtName="";
    @JsonProperty("prdtCode")
    private String prdtCode="";

    public String getPrdtName() {
        return prdtName;
    }

    public SimplePrdtSamp setPrdtName(String prdtName) {
        this.prdtName = prdtName;
        return this;
    }

    public String getPrdtCode() {
        return prdtCode;
    }

    public SimplePrdtSamp setPrdtCode(String prdtCode) {
        this.prdtCode = prdtCode;
        return this;
    }
}
