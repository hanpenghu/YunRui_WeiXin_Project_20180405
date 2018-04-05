package com.winwin.picreport.Bcontroller.DeDao_Js_DiaoYong_sheXiangTou_De_CanShu;



public class JsParams {

    private String jsapi_ticket;
    private String appId;
    private String timestamp;
    private String nonceStr;
    private String signature;


    public String getJsapi_ticket() {
        return jsapi_ticket;
    }

    public JsParams setJsapi_ticket(String jsapi_ticket) {
        this.jsapi_ticket = jsapi_ticket;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public JsParams setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public JsParams setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public JsParams setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
        return this;
    }

    public String getSignature() {
        return signature;
    }

    public JsParams setSignature(String signature) {
        this.signature = signature;
        return this;
    }
}
