package com.winwin.picreport.Bcontroller.loginRegistModul.auth.dto.AuthJsonObj;

public class Auth {
    private SalesOrder salesorder=new SalesOrder();
    private SalesOrderForSap salesorderForSAP=new SalesOrderForSap();
    private SalesDetail salesDetail=new SalesDetail();
    private ProdectCode productCode=new ProdectCode();
    private PurchasePricing purchasePricing=new PurchasePricing();
    private SalesPricing salesPricing=new SalesPricing();
    private SampleConfirm sampleConfirm=new SampleConfirm();

    public SalesOrder getSalesorder() {
        return salesorder;
    }

    public Auth setSalesorder(SalesOrder salesorder) {
        this.salesorder = salesorder;
        return this;
    }

    public SalesOrderForSap getSalesorderForSAP() {
        return salesorderForSAP;
    }

    public Auth setSalesorderForSAP(SalesOrderForSap salesorderForSAP) {
        this.salesorderForSAP = salesorderForSAP;
        return this;
    }

    public SalesDetail getSalesDetail() {
        return salesDetail;
    }

    public Auth setSalesDetail(SalesDetail salesDetail) {
        this.salesDetail = salesDetail;
        return this;
    }

    public ProdectCode getProductCode() {
        return productCode;
    }

    public Auth setProductCode(ProdectCode productCode) {
        this.productCode = productCode;
        return this;
    }

    public PurchasePricing getPurchasePricing() {
        return purchasePricing;
    }

    public Auth setPurchasePricing(PurchasePricing purchasePricing) {
        this.purchasePricing = purchasePricing;
        return this;
    }

    public SalesPricing getSalesPricing() {
        return salesPricing;
    }

    public Auth setSalesPricing(SalesPricing salesPricing) {
        this.salesPricing = salesPricing;
        return this;
    }

    public SampleConfirm getSampleConfirm() {
        return sampleConfirm;
    }

    public Auth setSampleConfirm(SampleConfirm sampleConfirm) {
        this.sampleConfirm = sampleConfirm;
        return this;
    }
}
