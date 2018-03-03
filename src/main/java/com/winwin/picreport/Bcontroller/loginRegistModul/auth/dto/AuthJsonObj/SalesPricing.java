package com.winwin.picreport.Bcontroller.loginRegistModul.auth.dto.AuthJsonObj;

public class SalesPricing {//销售定价
    private String page="F";

    private Part part=new Part();

    public Part getPart() {
        return part;
    }

    public SalesPricing setPart(Part part) {
        this.part = part;
        return this;
    }

    public String getPage() {
        return page;
    }

    public SalesPricing setPage(String page) {
        this.page = page;
        return this;
    }
}
