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
    private String os_no = "";// ,----osno
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
    private String danHao_HuoHao_ChengFenDaiMa="";
    private String danHao_HuoHao_ChengFenDaiMa_saphh="";
    private String chengFenDaiMa="";
    private String ebNo="";

    public String getEbNo() {
        return ebNo;
    }

    public SalePrdDetailTab1 setEbNo(String ebNo) {
        this.ebNo = ebNo;
        return this;
    }

    public String getChengFenDaiMa() {
        return chengFenDaiMa.trim();
    }

    public SalePrdDetailTab1 setChengFenDaiMa(String chengFenDaiMa) {
        this.chengFenDaiMa = chengFenDaiMa;
        return this;
    }

    public String getDanHao_HuoHao_ChengFenDaiMa() {
        this.danHao_HuoHao_ChengFenDaiMa=this.cusOsNo.trim()+this.prdNo.trim()+this.chengFenDaiMa.trim();
        return danHao_HuoHao_ChengFenDaiMa;
    }

    public String getDanHao_HuoHao_ChengFenDaiMa_saphh() {
        this.danHao_HuoHao_ChengFenDaiMa_saphh=this.cusOsNo.trim()+this.prdNo.trim()+this.chengFenDaiMa.trim()+this.saphh.trim();
        return danHao_HuoHao_ChengFenDaiMa_saphh;
    }

    public SalePrdDetailTab1 setDanHao_HuoHao_ChengFenDaiMa(String danHao_HuoHao_ChengFenDaiMa) {
        this.danHao_HuoHao_ChengFenDaiMa = danHao_HuoHao_ChengFenDaiMa;
        return this;
    }

    //    public String getDanHao_HuoHao() {
//        this.danHao_HuoHao= this.cusOsNo+this.prdNo;
//        return this.danHao_HuoHao;
//    }
//
//    public SalePrdDetailTab1 setDanHao_HuoHao(String danHao_HuoHao) {
//        this.danHao_HuoHao = danHao_HuoHao;
//        return this;
//    }
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

    public SalePrdDetailTab1 setAmt(String amt) {
        this.amt = amt;return this;
    }

    public String getSaphh() {
        return saphh;
    }

    public SalePrdDetailTab1 setSaphh(String saphh) {
        this.saphh = saphh;
        return this;
    }

    public String getSapph() {
        return sapph;
    }

    public SalePrdDetailTab1 setSapph(String sapph) {
        this.sapph = sapph;return this;
    }

    public String getPrdNo() {
        return prdNo.trim();
    }

    public SalePrdDetailTab1 setPrdNo(String prdNo) {
        this.prdNo = prdNo;return this;
    }

    public String getItm() {
        return itm;
    }

    public SalePrdDetailTab1 setItm(String itm) {
        this.itm = itm;return this;
    }

    public String getCaiGouNo() {
        return caiGouNo;
    }

    public SalePrdDetailTab1 setCaiGouNo(String caiGouNo) {
        this.caiGouNo = caiGouNo;return this;
    }

    public String getRemHead() {
        return remHead;
    }

    public SalePrdDetailTab1 setRemHead(String remHead) {
        this.remHead = remHead;return this;
    }

    public String getPsNo() {
        return psNo;
    }

    public SalePrdDetailTab1 setPsNo(String psNo) {
        this.psNo = psNo;return this;
    }

    public String getCusOsNo() {
        return cusOsNo.trim();
    }

    public SalePrdDetailTab1 setCusOsNo(String cusOsNo) {
        this.cusOsNo = cusOsNo;return this;
    }

    public String getPrdName() {
        return prdName;
    }

    public SalePrdDetailTab1 setPrdName(String prdName) {
        this.prdName = prdName;return this;
    }

    public String getUnit() {
        return unit;
    }

    public SalePrdDetailTab1 setUnit(String unit) {
        this.unit = unit;return this;
    }

    public String getQty() {
        if(NotEmpty.notEmpty(this.qty)&&this.qty.contains(".")&&TongJiXiaoShuDianHouDeWeiShu.f(this.qty)>5){
            this.qty=this.qty.trim().substring(0,this.qty.indexOf(".")+5);
        }
        return qty;
    }

    public SalePrdDetailTab1 setQty(String qty) {
        this.qty = qty;return this; 
    }

    public String getUp() {
        if(NotEmpty.notEmpty(this.up)&&this.up.contains(".")&& TongJiXiaoShuDianHouDeWeiShu.f(this.up)>5){
            this.up=this.up.trim().substring(0,this.up.indexOf(".")+5);
        }
        return up;
    }

    public SalePrdDetailTab1 setUp(String up) {
        this.up = up;return this;
    }

    public String getAmtnNet() {
        if(NotEmpty.notEmpty(this.amtnNet)&&this.amtnNet.contains(".")&&TongJiXiaoShuDianHouDeWeiShu.f(this.amtnNet)>5){
            this.amtnNet=this.amtnNet.trim().substring(0,this.amtnNet.indexOf(".")+5);
        }
        return amtnNet;
    }

    public SalePrdDetailTab1 setAmtnNet(String amtnNet) {
        this.amtnNet = amtnNet;return this;
    }

    public String getOs_no() {
        return os_no.trim();
    }

    public SalePrdDetailTab1 setOs_no(String os_no) {
        this.os_no = os_no;return this;
    }

    public String getBat_no() {
        return bat_no;
    }

    public SalePrdDetailTab1 setBat_no(String bat_no) {
        this.bat_no = bat_no;return this;
    }

    public String getRemBody() {
        return remBody;
    }

    public SalePrdDetailTab1 setRemBody(String remBody) {
        this.remBody = remBody;return this;
    }

    public String getIndxName() {
        return indxName;
    }

    public SalePrdDetailTab1 setIndxName(String indxName) {
        this.indxName = indxName;return this;
    }

    public String getBc() {
        return bc;
    }

    public SalePrdDetailTab1 setBc(String bc) {
        this.bc = bc;return this;
    }

    public String getMz() {
        return mz;
    }

    public SalePrdDetailTab1 setMz(String mz) {
        this.mz = mz;return this;
    }

    public String getPz() {
        return pz;
    }

    public SalePrdDetailTab1 setPz(String pz) {
        this.pz = pz;return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Edto.SalePrdDetailTab1{");
        sb.append("remHead='").append(remHead).append('\'');
        sb.append(", psNo='").append(psNo).append('\'');
        sb.append(", cusOsNo='").append(cusOsNo).append('\'');
        sb.append(", prdName='").append(prdName).append('\'');
        sb.append(", unit='").append(unit).append('\'');
        sb.append(", qty='").append(qty).append('\'');
        sb.append(", qtyDouble=").append(qtyDouble);
        sb.append(", up='").append(up).append('\'');
        sb.append(", amt='").append(amt).append('\'');
        sb.append(", amtnNet='").append(amtnNet).append('\'');
        sb.append(", os_no='").append(os_no).append('\'');
        sb.append(", bat_no='").append(bat_no).append('\'');
        sb.append(", remBody='").append(remBody).append('\'');
        sb.append(", indxName='").append(indxName).append('\'');
        sb.append(", bc='").append(bc).append('\'');
        sb.append(", mz='").append(mz).append('\'');
        sb.append(", pz='").append(pz).append('\'');
        sb.append(", caiGouNo='").append(caiGouNo).append('\'');
        sb.append(", itm='").append(itm).append('\'');
        sb.append(", prdNo='").append(prdNo).append('\'');
        sb.append(", sapph='").append(sapph).append('\'');
        sb.append(", saphh='").append(saphh).append('\'');
        sb.append(", luoHao='").append(luoHao).append('\'');
        sb.append(", gangHao='").append(gangHao).append('\'');
        sb.append(", realWidth='").append(realWidth).append('\'');
        sb.append(", realLength='").append(realLength).append('\'');
        sb.append(", danHao_HuoHao_ChengFenDaiMa='").append(danHao_HuoHao_ChengFenDaiMa).append('\'');
        sb.append(", chengFenDaiMa='").append(chengFenDaiMa).append('\'');
        sb.append(", ebNo='").append(ebNo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
