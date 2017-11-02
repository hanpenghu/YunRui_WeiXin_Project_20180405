package com.winwin.picreport.Edto;

import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.TongJiXiaoShuDianHouDeWeiShu;


public class SalePrdDetailTab1 {//导出excel用
    private String remHead = "";//,	 // ---表头备注
    private String psNo = "";//,//---销货单号
    private String cusOsNo = "";//,//----客户订单号-------对应sapso的osno
    private String prdName = "";//, //----货品名称
    private String unit = "";//,//---------单位
    private String qty = "";//,---数量
    private Double qtyDouble=0D;
    private String up = "";//,----单价
    private String amt="";//---本位币
    private String amtnNet = "";//,---未税本位币
    private String os_no = "";// ,----EB单号
    private String bat_no = "";//,-----批号
    private String remBody = "";//,	----表身摘要
    private String indxName = "";//,----种类名称
    private String bc = "";//,---------备次
    private String mz = "";//,-------毛重
    private String pz = "";//----皮重
    private String caiGouNo="";//采购单号
    private String itm="";//供应商送货单行号
    private String prdNo="";//供应商物料参考编号-------------------------------------货号对应sapso的prdno
    private String sapph="";//物料编码  =原始数据表SAPSO.SAP 品号
    private String saphh="";//采购订单行号  =原始数据表SAPSO.SAP行号
    private String luoHao="";//落号,来自sapso
    private String gangHao="";//缸号,来自sapso
    private String realWidth="";//实际幅宽  来自sapsoN
    private String realLength="";//实际长度来自sapso
    private String danHao_HuoHao="";
    public String getDanHao_HuoHao() {
        this.danHao_HuoHao= this.cusOsNo+this.prdNo;
        return this.danHao_HuoHao;
    }

    public SalePrdDetailTab1 setDanHao_HuoHao(String danHao_HuoHao) {
        this.danHao_HuoHao = danHao_HuoHao;
        return this;
    }
    public Double getQtyDouble() {
        try {
            this.qtyDouble=Double.parseDouble(qty);
        } catch (NumberFormatException e) {
            this.qtyDouble=0D;
        }
        return this.qtyDouble;
    }

    public SalePrdDetailTab1 setQtyDouble(Double qtyDouble) {
        this.qtyDouble = qtyDouble;
        return this;
    }

    public String getLuoHao() {
        return luoHao;
    }

    public SalePrdDetailTab1 setLuoHao(String luoHao) {
        this.luoHao = luoHao;
        return this;
    }

    public String getGangHao() {
        return gangHao;
    }

    public SalePrdDetailTab1 setGangHao(String gangHao) {
        this.gangHao = gangHao;
        return this;
    }

    public String getRealWidth() {
        return realWidth;
    }

    public SalePrdDetailTab1 setRealWidth(String realWidth) {
        this.realWidth = realWidth;
        return this;
    }

    public String getRealLength() {
        return realLength;
    }

    public SalePrdDetailTab1 setRealLength(String realLength) {
        this.realLength = realLength;
        return this;
    }

    public String getAmt() {
        if(NotEmpty.notEmpty(this.amt)&&this.amt.contains(".")&&TongJiXiaoShuDianHouDeWeiShu.f(this.amt)>5){
            this.amt=this.amt.trim().substring(0,this.amt.indexOf(".")+5);
        }
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getSaphh() {
        return saphh;
    }

    public void setSaphh(String saphh) {
        this.saphh = saphh;
    }

    public String getSapph() {
        return sapph;
    }

    public void setSapph(String sapph) {
        this.sapph = sapph;
    }

    public String getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(String prdNo) {
        this.prdNo = prdNo;
    }

    public String getItm() {
        return itm;
    }

    public void setItm(String itm) {
        this.itm = itm;
    }

    public String getCaiGouNo() {
        return caiGouNo;
    }

    public void setCaiGouNo(String caiGouNo) {
        this.caiGouNo = caiGouNo;
    }

    public String getRemHead() {
        return remHead;
    }

    public void setRemHead(String remHead) {
        this.remHead = remHead;
    }

    public String getPsNo() {
        return psNo;
    }

    public void setPsNo(String psNo) {
        this.psNo = psNo;
    }

    public String getCusOsNo() {
        return cusOsNo;
    }

    public void setCusOsNo(String cusOsNo) {
        this.cusOsNo = cusOsNo;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getQty() {
        if(NotEmpty.notEmpty(this.qty)&&this.qty.contains(".")&&TongJiXiaoShuDianHouDeWeiShu.f(this.qty)>5){
            this.qty=this.qty.trim().substring(0,this.qty.indexOf(".")+5);
        }
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getUp() {
        if(NotEmpty.notEmpty(this.up)&&this.up.contains(".")&& TongJiXiaoShuDianHouDeWeiShu.f(this.up)>5){
            this.up=this.up.trim().substring(0,this.up.indexOf(".")+5);
        }
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getAmtnNet() {
        if(NotEmpty.notEmpty(this.amtnNet)&&this.amtnNet.contains(".")&&TongJiXiaoShuDianHouDeWeiShu.f(this.amtnNet)>5){
            this.amtnNet=this.amtnNet.trim().substring(0,this.amtnNet.indexOf(".")+5);
        }
        return amtnNet;
    }

    public void setAmtnNet(String amtnNet) {
        this.amtnNet = amtnNet;
    }

    public String getOs_no() {
        return os_no;
    }

    public void setOs_no(String os_no) {
        this.os_no = os_no;
    }

    public String getBat_no() {
        return bat_no;
    }

    public void setBat_no(String bat_no) {
        this.bat_no = bat_no;
    }

    public String getRemBody() {
        return remBody;
    }

    public void setRemBody(String remBody) {
        this.remBody = remBody;
    }

    public String getIndxName() {
        return indxName;
    }

    public void setIndxName(String indxName) {
        this.indxName = indxName;
    }

    public String getBc() {
        return bc;
    }

    public void setBc(String bc) {
        this.bc = bc;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getPz() {
        return pz;
    }

    public void setPz(String pz) {
        this.pz = pz;
    }

}
