package com.winwin.picreport.Bcontroller.loginRegistModul.auth.dto.AuthJsonObj;

public class Part {
    private String purchasePrice="F";//采购价格
    private String salesPrice="F";//销售价格

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public Part setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }

    public String getSalesPrice() {
        return salesPrice;
    }

    public Part setSalesPrice(String salesPrice) {
        this.salesPrice = salesPrice;
        return this;
    }
}
