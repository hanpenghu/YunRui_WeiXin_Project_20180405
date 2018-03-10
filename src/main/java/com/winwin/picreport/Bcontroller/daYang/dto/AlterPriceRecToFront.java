package com.winwin.picreport.Bcontroller.daYang.dto;

//为了返回给前端界面而定制的修改价格记录的玩意
public class AlterPriceRecToFront {
    protected String dingJiaGuanLian;//定价关联//前端如果是同一次保存的,这个玩意会相同
    protected String userName;//前端登录用户名
    protected String tenantId;//登录用户所在公司名
    protected String alterTime;//字符串形式,2018-03-08 17:35:00.123这种形式
    protected String prdtCode;//产品编码
    protected String prdtSampUuid;//打样主表里的uuid
    protected String qtyBefore;//修改前的数量
    protected String qtyAfter;//数量区间修改后
//    protected String upBefore;//价格修改前
//    protected String upAfter;//价格修改后
    protected String unitBefore;//单位修改前
    protected String unitAfter;//单位修改后
    protected String remFrontBefore;//备注修改前
    protected String remFrontAfter;//备注修改后
//    protected String bilType;//运费类型(对于当次修改,运费类型是确定的没有before与after之分)   01代表没有运费,空字符串代表有运费
   //币别修改前后都指的是外币不是本币,本币RMB是不用修改的
    protected String curIdBefore;//币别修改前     RMB是人民币   USD是usDollor
    protected String curIdAfter;//币别修改后
    protected String saleOrBuy;//是销售的还是采购的模块修改的,需要前端传过来
    //无运费本币修改前
    protected String noTransUpMyBefore;
    //无运费本币修改后
    protected String noTransUpMyAfter;
    //无运费外币修该前
    protected String noTransUpOtherBefore;
    //无运费外币修该后
    protected String noTransUpOtherAfter;


    //有运费本币修改前
    protected String haveTransUpMyBefore;
    //有运费本币修改后
    protected String haveTransUpMyAfter;
    //有运费外币修该前
    protected String haveTransUpOtherBefore;
    //有运费外币修该后
    protected String haveTransUpOtherAfter;


    public String getCurIdBefore() {
        return curIdBefore;
    }

    public AlterPriceRecToFront setCurIdBefore(String curIdBefore) {
        this.curIdBefore = curIdBefore;
        return this;
    }

    public String getCurIdAfter() {
        return curIdAfter;
    }

    public AlterPriceRecToFront setCurIdAfter(String curIdAfter) {
        this.curIdAfter = curIdAfter;
        return this;
    }

    public String getDingJiaGuanLian() {
        return dingJiaGuanLian;
    }

    public AlterPriceRecToFront setDingJiaGuanLian(String dingJiaGuanLian) {
        this.dingJiaGuanLian = dingJiaGuanLian;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public AlterPriceRecToFront setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public AlterPriceRecToFront setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public String getAlterTime() {
        return alterTime;
    }

    public AlterPriceRecToFront setAlterTime(String alterTime) {
        this.alterTime = alterTime;
        return this;
    }

    public String getPrdtCode() {
        return prdtCode;
    }

    public AlterPriceRecToFront setPrdtCode(String prdtCode) {
        this.prdtCode = prdtCode;
        return this;
    }

    public String getPrdtSampUuid() {
        return prdtSampUuid;
    }

    public AlterPriceRecToFront setPrdtSampUuid(String prdtSampUuid) {
        this.prdtSampUuid = prdtSampUuid;
        return this;
    }

    public String getQtyBefore() {
        return qtyBefore;
    }

    public AlterPriceRecToFront setQtyBefore(String qtyBefore) {
        this.qtyBefore = qtyBefore;
        return this;
    }

    public String getQtyAfter() {
        return qtyAfter;
    }

    public AlterPriceRecToFront setQtyAfter(String qtyAfter) {
        this.qtyAfter = qtyAfter;
        return this;
    }

    public String getUnitBefore() {
        return unitBefore;
    }

    public AlterPriceRecToFront setUnitBefore(String unitBefore) {
        this.unitBefore = unitBefore;
        return this;
    }

    public String getUnitAfter() {
        return unitAfter;
    }

    public AlterPriceRecToFront setUnitAfter(String unitAfter) {
        this.unitAfter = unitAfter;
        return this;
    }

    public String getRemFrontBefore() {
        return remFrontBefore;
    }

    public AlterPriceRecToFront setRemFrontBefore(String remFrontBefore) {
        this.remFrontBefore = remFrontBefore;
        return this;
    }

    public String getRemFrontAfter() {
        return remFrontAfter;
    }

    public AlterPriceRecToFront setRemFrontAfter(String remFrontAfter) {
        this.remFrontAfter = remFrontAfter;
        return this;
    }

    public String getSaleOrBuy() {
        return saleOrBuy;
    }

    public AlterPriceRecToFront setSaleOrBuy(String saleOrBuy) {
        this.saleOrBuy = saleOrBuy;
        return this;
    }

    public String getNoTransUpMyBefore() {
        return noTransUpMyBefore;
    }

    public AlterPriceRecToFront setNoTransUpMyBefore(String noTransUpMyBefore) {
        this.noTransUpMyBefore = noTransUpMyBefore;
        return this;
    }

    public String getNoTransUpMyAfter() {
        return noTransUpMyAfter;
    }

    public AlterPriceRecToFront setNoTransUpMyAfter(String noTransUpMyAfter) {
        this.noTransUpMyAfter = noTransUpMyAfter;
        return this;
    }

    public String getNoTransUpOtherBefore() {
        return noTransUpOtherBefore;
    }

    public AlterPriceRecToFront setNoTransUpOtherBefore(String noTransUpOtherBefore) {
        this.noTransUpOtherBefore = noTransUpOtherBefore;
        return this;
    }

    public String getNoTransUpOtherAfter() {
        return noTransUpOtherAfter;
    }

    public AlterPriceRecToFront setNoTransUpOtherAfter(String noTransUpOtherAfter) {
        this.noTransUpOtherAfter = noTransUpOtherAfter;
        return this;
    }

    public String getHaveTransUpMyBefore() {
        return haveTransUpMyBefore;
    }

    public AlterPriceRecToFront setHaveTransUpMyBefore(String haveTransUpMyBefore) {
        this.haveTransUpMyBefore = haveTransUpMyBefore;
        return this;
    }

    public String getHaveTransUpMyAfter() {
        return haveTransUpMyAfter;
    }

    public AlterPriceRecToFront setHaveTransUpMyAfter(String haveTransUpMyAfter) {
        this.haveTransUpMyAfter = haveTransUpMyAfter;
        return this;
    }

    public String getHaveTransUpOtherBefore() {
        return haveTransUpOtherBefore;
    }

    public AlterPriceRecToFront setHaveTransUpOtherBefore(String haveTransUpOtherBefore) {
        this.haveTransUpOtherBefore = haveTransUpOtherBefore;
        return this;
    }

    public String getHaveTransUpOtherAfter() {
        return haveTransUpOtherAfter;
    }

    public AlterPriceRecToFront setHaveTransUpOtherAfter(String haveTransUpOtherAfter) {
        this.haveTransUpOtherAfter = haveTransUpOtherAfter;
        return this;
    }
}
