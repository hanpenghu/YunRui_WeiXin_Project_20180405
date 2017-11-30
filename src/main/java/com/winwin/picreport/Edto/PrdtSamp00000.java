package com.winwin.picreport.Edto;

import java.util.Date;

public class PrdtSamp00000 {
    private String id;

    private String prdCode;
    private String sampMakeStamp;//打样时间戳//传给我这个
    private String sampSendStamp;//样品寄出时间戳//传给我这个
    /////////////////////////////用于跟前端沟通增加的时间戳转换字段//////////////////////////////////////////////////////////
    public String getSampMakeStamp() {
        return sampMakeStamp;
    }

    public PrdtSamp00000 setSampMakeStamp(String sampMakeStamp) {
        this.sampMakeStamp = sampMakeStamp;
        return this;
    }

    public String getSampSendStamp() {
        return sampSendStamp;
    }

    public PrdtSamp00000 setSampSendStamp(String sampSendStamp) {
        this.sampSendStamp = sampSendStamp;
        return this;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////使用转换字段转换过来的时间/////////////////////////////////////////////////////////////
    public Date getSampMake() {
        //        String res;
        //        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            long lt = new Long(this.sampMakeStamp);
            date = new Date(lt);
        } catch (NumberFormatException e) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~前端穿过来的打样时间戳无法解析成时间~"+this.sampMakeStamp+"~~~~~~~~~~~~~~~~~~~~~~~");
        }
        //        res = simpleDateFormat.format(date);
        this.sampMake=date;
        return date;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////使用转换字段转换过来的时间//////////////////////////////////////////////////////////////////
    public Date getSampSend() {
        Date date = null;
        try {
            long lt = new Long(this.sampSendStamp);
            date = new Date(lt);
        } catch (NumberFormatException e) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~前端穿过来的打样时间戳无法解析成时间~"+this.sampSendStamp+"~~~~~~~~~~~~~~~~~~~~~~~");
        }
        this.sampSend=date;
        return date;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    private String idxName;

    private String idxNo;

    private String markName;

    private String markNo;

    private String colour;

    private String size;

    private String salName;

    private String salNo;

    private String cusNo;

    private String cusName;

    private String isfenjie;

    private Date sampMake;

    private Date sampSend;

    private String sampRequ;

    private String sampDesc;

    private String thum;

    private String attach;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPrdCode() {
        return prdCode;
    }

    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode == null ? null : prdCode.trim();
    }

    public String getIdxName() {
        return idxName;
    }

    public void setIdxName(String idxName) {
        this.idxName = idxName == null ? null : idxName.trim();
    }

    public String getIdxNo() {
        return idxNo;
    }

    public void setIdxNo(String idxNo) {
        this.idxNo = idxNo == null ? null : idxNo.trim();
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName == null ? null : markName.trim();
    }

    public String getMarkNo() {
        return markNo;
    }

    public void setMarkNo(String markNo) {
        this.markNo = markNo == null ? null : markNo.trim();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour == null ? null : colour.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getSalName() {
        return salName;
    }

    public void setSalName(String salName) {
        this.salName = salName == null ? null : salName.trim();
    }

    public String getSalNo() {
        return salNo;
    }

    public void setSalNo(String salNo) {
        this.salNo = salNo == null ? null : salNo.trim();
    }

    public String getCusNo() {
        return cusNo;
    }

    public void setCusNo(String cusNo) {
        this.cusNo = cusNo == null ? null : cusNo.trim();
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getIsfenjie() {
        return isfenjie;
    }

    public void setIsfenjie(String isfenjie) {
        this.isfenjie = isfenjie == null ? null : isfenjie.trim();
    }

//    public Date getSampMake() {
//        return sampMake;
//    }

    public void setSampMake(Date sampMake) {
        this.sampMake = sampMake;
    }

//    public Date getSampSend() {
//        return sampSend;
//    }

    public void setSampSend(Date sampSend) {
        this.sampSend = sampSend;
    }

    public String getSampRequ() {
        return sampRequ;
    }

    public void setSampRequ(String sampRequ) {
        this.sampRequ = sampRequ == null ? null : sampRequ.trim();
    }

    public String getSampDesc() {
        return sampDesc;
    }

    public void setSampDesc(String sampDesc) {
        this.sampDesc = sampDesc == null ? null : sampDesc.trim();
    }

    public String getThum() {
        return thum;
    }

    public void setThum(String thum) {
        this.thum = thum == null ? null : thum.trim();
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }
}