package com.winwin.picreport.Bcontroller.xiaoShouDingDanDaoRuDaoChuExcel.excelXiaoShouDingDanXiaZai;

public class Order2Excel {

    private String remHead;//表头备注//mfpss

    private String psNo;//销货单号//mfpss

    private String cusOsNo;//客户订单号//mfpss
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private String prdName;//货品名称//tfpss

    private String prdNo;//货号//tfpss

    private String qty;//数量//tfpss

    private String up;//单价//tfpss

    private String amtnNet;//未税本位币//tfpss

    private String amt;//本位币//tfpss

    private String ebNo;//ebNo//tfpss

    private String batNo;//批号//tfpss

    private String remBody;//表身备注//tfpss

    private String itm;//供应商送货单行号//tfpss
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private String indxName;//中类名称//indx
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private String bc;//备次//tfz

    private String mz;//毛重//tfz

    private String pz;//皮重//tfz

    private String cfdm;//成分代码//tfz
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private String unit;//单位//prdt
    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getRemHead() {
        return remHead;
    }

    public Order2Excel setRemHead(String remHead) {
        this.remHead = remHead;
        return this;
    }

    public String getPsNo() {
        return psNo;
    }

    public Order2Excel setPsNo(String psNo) {
        this.psNo = psNo;
        return this;
    }

    public String getCusOsNo() {
        return cusOsNo;
    }

    public Order2Excel setCusOsNo(String cusOsNo) {
        this.cusOsNo = cusOsNo;
        return this;
    }

    public String getPrdName() {
        return prdName;
    }

    public Order2Excel setPrdName(String prdName) {
        this.prdName = prdName;
        return this;
    }

    public String getPrdNo() {
        return prdNo;
    }

    public Order2Excel setPrdNo(String prdNo) {
        this.prdNo = prdNo;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public Order2Excel setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getQty() {
        return qty;
    }

    public Order2Excel setQty(String qty) {
        this.qty = qty;
        return this;
    }

    public String getUp() {
        return up;
    }

    public Order2Excel setUp(String up) {
        this.up = up;
        return this;
    }

    public String getAmtnNet() {
        return amtnNet;
    }

    public Order2Excel setAmtnNet(String amtnNet) {
        this.amtnNet = amtnNet;
        return this;
    }

    public String getAmt() {
        return amt;
    }

    public Order2Excel setAmt(String amt) {
        this.amt = amt;
        return this;
    }

    public String getEbNo() {
        return ebNo;
    }

    public Order2Excel setEbNo(String ebNo) {
        this.ebNo = ebNo;
        return this;
    }

    public String getBatNo() {
        return batNo;
    }

    public Order2Excel setBatNo(String batNo) {
        this.batNo = batNo;
        return this;
    }

    public String getRemBody() {
        return remBody;
    }

    public Order2Excel setRemBody(String remBody) {
        this.remBody = remBody;
        return this;
    }

    public String getItm() {
        return itm;
    }

    public Order2Excel setItm(String itm) {
        this.itm = itm;
        return this;
    }

    public String getIndxName() {
        return indxName;
    }

    public Order2Excel setIndxName(String indxName) {
        this.indxName = indxName;
        return this;
    }

    public String getBc() {
        return bc;
    }

    public Order2Excel setBc(String bc) {
        this.bc = bc;
        return this;
    }

    public String getMz() {
        return mz;
    }

    public Order2Excel setMz(String mz) {
        this.mz = mz;
        return this;
    }

    public String getPz() {
        return pz;
    }

    public Order2Excel setPz(String pz) {
        this.pz = pz;
        return this;
    }

    public String getCfdm() {
        return cfdm;
    }

    public Order2Excel setCfdm(String cfdm) {
        this.cfdm = cfdm;
        return this;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Bcontroller.xiaoShouDingDanDaoRuDaoChuExcel.excelXiaoShouDingDanXiaZai.Order2Excel{");
        sb.append("remHead='").append(remHead).append('\'');
        sb.append(", psNo='").append(psNo).append('\'');
        sb.append(", cusOsNo='").append(cusOsNo).append('\'');
        sb.append(", prdName='").append(prdName).append('\'');
        sb.append(", prdNo='").append(prdNo).append('\'');
        sb.append(", unit='").append(unit).append('\'');
        sb.append(", qty='").append(qty).append('\'');
        sb.append(", up='").append(up).append('\'');
        sb.append(", amtnNet='").append(amtnNet).append('\'');
        sb.append(", amt='").append(amt).append('\'');
        sb.append(", ebNo='").append(ebNo).append('\'');
        sb.append(", batNo='").append(batNo).append('\'');
        sb.append(", remBody='").append(remBody).append('\'');
        sb.append(", itm='").append(itm).append('\'');
        sb.append(", indxName='").append(indxName).append('\'');
        sb.append(", bc='").append(bc).append('\'');
        sb.append(", mz='").append(mz).append('\'');
        sb.append(", pz='").append(pz).append('\'');
        sb.append(", cfdm='").append(cfdm).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
