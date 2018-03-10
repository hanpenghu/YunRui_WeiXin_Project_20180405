package com.winwin.picreport.Edto;

public class AlterPriceRec {
    protected String dingJiaGuanLian;//定价关联
    protected String userName;//前端登录用户名
    protected String tenantId;//登录用户所在公司名
    protected String alterTime;//字符串形式,2018-03-08 17:35:00.123这种形式
    protected String prdtCode;//产品编码
    protected String prdtSampUuid;//打样主表里的uuid
    protected String qtyBefore;//修改前的数量
    protected String qtyAfter;//数量区间修改后
    protected String upBefore;//价格修改前
    protected String upAfter;//价格修改后
    protected String unitBefore;//单位修改前
    protected String unitAfter;//单位修改后
    protected String remFrontBefore;//备注修改前
    protected String remFrontAfter;//备注修改后
    protected String bilType;//运费类型(对于当次修改,运费类型是确定的没有before与after之分)   01代表没有运费,空字符串代表有运费
    protected String curIdBefore;//币别修改前     RMB是人民币   USD是usDollor
    protected String curIdAfter;//币别修改后


    protected String saleOrBuy;//是销售的还是采购的模块修改的,需要前端传过来

    //不含运费单价本币 修改前
    protected String noTransUpMyBefore;
//不含运费单价本币修改后
    protected String noTransUpMyAfter;
//不含含运费单价外币修改 前
    protected String noTransUpOtherBefore;
//不含运费单价外币修改后
    protected String noTransUpOtherAfter;
//含运费单价本币修改前
    protected String haveTransUpMyBefore;
//含运费单价本币修改后
    protected String haveTransUpMyAfter;
//含运费单价外币修改前
    protected String haveTransUpOtherBefore;
//含运费单价外币修改后
    protected String haveTransUpOtherAfter;

    public String getDingJiaGuanLian() {
        return dingJiaGuanLian;
    }

    public void setDingJiaGuanLian(String dingJiaGuanLian) {
        this.dingJiaGuanLian = dingJiaGuanLian == null ? null : dingJiaGuanLian.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getAlterTime() {
        return alterTime;
    }

    public void setAlterTime(String alterTime) {
        this.alterTime = alterTime == null ? null : alterTime.trim();
    }

    public String getPrdtCode() {
        return prdtCode;
    }

    public void setPrdtCode(String prdtCode) {
        this.prdtCode = prdtCode == null ? null : prdtCode.trim();
    }

    public String getPrdtSampUuid() {
        return prdtSampUuid;
    }

    public void setPrdtSampUuid(String prdtSampUuid) {
        this.prdtSampUuid = prdtSampUuid == null ? null : prdtSampUuid.trim();
    }

    public String getQtyBefore() {
        return qtyBefore;
    }

    public void setQtyBefore(String qtyBefore) {
        this.qtyBefore = qtyBefore == null ? null : qtyBefore.trim();
    }

    public String getQtyAfter() {
        return qtyAfter;
    }

    public void setQtyAfter(String qtyAfter) {
        this.qtyAfter = qtyAfter == null ? null : qtyAfter.trim();
    }

    public String getUpBefore() {
        return upBefore;
    }

    public void setUpBefore(String upBefore) {
        this.upBefore = upBefore == null ? null : upBefore.trim();
    }

    public String getUpAfter() {
        return upAfter;
    }

    public void setUpAfter(String upAfter) {
        this.upAfter = upAfter == null ? null : upAfter.trim();
    }

    public String getUnitBefore() {
        return unitBefore;
    }

    public void setUnitBefore(String unitBefore) {
        this.unitBefore = unitBefore == null ? null : unitBefore.trim();
    }

    public String getUnitAfter() {
        return unitAfter;
    }

    public void setUnitAfter(String unitAfter) {
        this.unitAfter = unitAfter == null ? null : unitAfter.trim();
    }

    public String getRemFrontBefore() {
        return remFrontBefore;
    }

    public void setRemFrontBefore(String remFrontBefore) {
        this.remFrontBefore = remFrontBefore == null ? null : remFrontBefore.trim();
    }

    public String getRemFrontAfter() {
        return remFrontAfter;
    }

    public void setRemFrontAfter(String remFrontAfter) {
        this.remFrontAfter = remFrontAfter == null ? null : remFrontAfter.trim();
    }

    public String getBilType() {
        return bilType;
    }

    public void setBilType(String bilType) {
        this.bilType = bilType == null ? null : bilType.trim();
    }

    public String getCurIdBefore() {
        return curIdBefore;
    }

    public void setCurIdBefore(String curIdBefore) {
        this.curIdBefore = curIdBefore == null ? null : curIdBefore.trim();
    }

    public String getCurIdAfter() {
        return curIdAfter;
    }

    public void setCurIdAfter(String curIdAfter) {
        this.curIdAfter = curIdAfter == null ? null : curIdAfter.trim();
    }

    public String getSaleOrBuy() {
        return saleOrBuy;
    }

    public void setSaleOrBuy(String saleOrBuy) {
        this.saleOrBuy = saleOrBuy == null ? null : saleOrBuy.trim();
    }

    public String getNoTransUpMyBefore() {
        return noTransUpMyBefore;
    }

    public void setNoTransUpMyBefore(String noTransUpMyBefore) {
        this.noTransUpMyBefore = noTransUpMyBefore == null ? null : noTransUpMyBefore.trim();
    }

    public String getNoTransUpMyAfter() {
        return noTransUpMyAfter;
    }

    public void setNoTransUpMyAfter(String noTransUpMyAfter) {
        this.noTransUpMyAfter = noTransUpMyAfter == null ? null : noTransUpMyAfter.trim();
    }

    public String getNoTransUpOtherBefore() {
        return noTransUpOtherBefore;
    }

    public void setNoTransUpOtherBefore(String noTransUpOtherBefore) {
        this.noTransUpOtherBefore = noTransUpOtherBefore == null ? null : noTransUpOtherBefore.trim();
    }

    public String getNoTransUpOtherAfter() {
        return noTransUpOtherAfter;
    }

    public void setNoTransUpOtherAfter(String noTransUpOtherAfter) {
        this.noTransUpOtherAfter = noTransUpOtherAfter == null ? null : noTransUpOtherAfter.trim();
    }

    public String getHaveTransUpMyBefore() {
        return haveTransUpMyBefore;
    }

    public void setHaveTransUpMyBefore(String haveTransUpMyBefore) {
        this.haveTransUpMyBefore = haveTransUpMyBefore == null ? null : haveTransUpMyBefore.trim();
    }

    public String getHaveTransUpMyAfter() {
        return haveTransUpMyAfter;
    }

    public void setHaveTransUpMyAfter(String haveTransUpMyAfter) {
        this.haveTransUpMyAfter = haveTransUpMyAfter == null ? null : haveTransUpMyAfter.trim();
    }

    public String getHaveTransUpOtherBefore() {
        return haveTransUpOtherBefore;
    }

    public void setHaveTransUpOtherBefore(String haveTransUpOtherBefore) {
        this.haveTransUpOtherBefore = haveTransUpOtherBefore == null ? null : haveTransUpOtherBefore.trim();
    }

    public String getHaveTransUpOtherAfter() {
        return haveTransUpOtherAfter;
    }

    public void setHaveTransUpOtherAfter(String haveTransUpOtherAfter) {
        this.haveTransUpOtherAfter = haveTransUpOtherAfter == null ? null : haveTransUpOtherAfter.trim();
    }
}