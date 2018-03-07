package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.Date;

public class PrdtSamp {
    protected String id;//一条录入记录的唯一标识符号
    protected String prdCode;//产品编码
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //下面2个用作产品名称,的name和no,   分类的再加两个
    //原来徐勇的界面上改了框里面的东西,其他地方不用改,前端的分类框中填范围小的,前端的名称框放范围 大的
    protected String idxName;//产品名称

    protected String idxNo;//产品的no
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //下面2个用于界面上产品分类那一栏//注意,存的时候不存,只是返回的时候返回给前端

    protected String fenLeiNo;

    protected String fenLeiName;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    protected String markName;//品牌

    protected String markNo;//品牌编号

    protected String colour;//颜色

    protected String size;//尺寸
    //产品负责人
    protected String salName;
    //产品负责人编码
    protected String salNo;

    protected String cusNo;//客户编号

    protected String cusName;//客户名称

    protected String isfenjie;//是否分解//是否分解, y代表分解, n代表不分解
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    protected Date sampMake;//打样时间

    protected Date sampSend;//----样品寄出时间
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //样品要求
    protected String sampRequ;
    //样品描述
    protected String sampDesc;
    //---缩略图名字包含的路径字符串,用;隔开,路径里面有!导致用户的缩略名字不能有!和;
    protected String thum;

    //附件路径字符串,多个用;隔开,名字中的！做分隔符号
    protected String attach;
    ///////////////////////////////////////////////////////////////////////////
    //该条记录插入时间,数据库自动会添加DEFAULT一个getdate()
    protected Date insertdate;

    protected String confirmman;//确认人

    protected String confirmtimestr;//确认时间   直接带-的字符串

    protected Integer isconfirm;//是否确认，1代表已经确认  0代表未确认

    protected String category;//未知//老郑让弄得

    protected String teamname;//未知//老郑让弄得

    protected String confirmrem;//确认备注

    protected String unit;//单位

    protected String businessdesc;//业务描述

    protected String financedesc;//财务描述

    protected BigDecimal startsellcount;//起订数量//json可以直接转换输出给外部

    protected BigDecimal modelcost;//模具费

    protected BigDecimal estimateprice;//预估价

    protected BigDecimal littleorderprice;//小单费

    protected String modelcostinvoiceno;//模具费用发票号
    //财务起订量
    protected BigDecimal financestartsellcount;
    //财务模具费
    protected BigDecimal financemodelcost;
    //财务小单费
    protected BigDecimal financelittleorderprice;
    //采购描述
    protected String buyerdesc;
    //货号
    protected String prdNo;

    //销售描述
    protected String salemandesc;
    //停用时间
    protected Date stopusedate;
    //供应商编号
    protected String cusNoGive;

    //供应商名字
    protected String cusNameGive;

    //创建人的userName,实际上我传给徐勇的放在userEmail字段了
    protected String userName;
    //创建人所在的公司,
    protected String tenantId;

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

    public Date getSampMake() {
        return sampMake;
    }

    public void setSampMake(Date sampMake) {
        this.sampMake = sampMake;
    }

    public Date getSampSend() {
        return sampSend;
    }

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

    public Date getInsertdate() {
        return insertdate;
    }

    public void setInsertdate(Date insertdate) {
        this.insertdate = insertdate;
    }

    public String getCusNoGive() {
        return cusNoGive;
    }

    public void setCusNoGive(String cusNoGive) {
        this.cusNoGive = cusNoGive == null ? null : cusNoGive.trim();
    }

    public String getCusNameGive() {
        return cusNameGive;
    }

    public void setCusNameGive(String cusNameGive) {
        this.cusNameGive = cusNameGive == null ? null : cusNameGive.trim();
    }

    public String getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(String prdNo) {
        this.prdNo = prdNo == null ? null : prdNo.trim();
    }

    public String getConfirmman() {
        return confirmman;
    }

    public void setConfirmman(String confirmman) {
        this.confirmman = confirmman == null ? null : confirmman.trim();
    }

    public String getConfirmtimestr() {
        return confirmtimestr;
    }

    public void setConfirmtimestr(String confirmtimestr) {
        this.confirmtimestr = confirmtimestr == null ? null : confirmtimestr.trim();
    }

    public Integer getIsconfirm() {
        return isconfirm;
    }

    public void setIsconfirm(Integer isconfirm) {
        this.isconfirm = isconfirm;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }

    public String getConfirmrem() {
        return confirmrem;
    }

    public void setConfirmrem(String confirmrem) {
        this.confirmrem = confirmrem == null ? null : confirmrem.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getFinancestartsellcount() {
        return financestartsellcount;
    }

    public void setFinancestartsellcount(BigDecimal financestartsellcount) {
        this.financestartsellcount = financestartsellcount;
    }

    public BigDecimal getStartsellcount() {
        return startsellcount;
    }

    public void setStartsellcount(BigDecimal startsellcount) {
        this.startsellcount = startsellcount;
    }

    public String getModelcostinvoiceno() {
        return modelcostinvoiceno;
    }

    public void setModelcostinvoiceno(String modelcostinvoiceno) {
        this.modelcostinvoiceno = modelcostinvoiceno == null ? null : modelcostinvoiceno.trim();
    }

    public BigDecimal getModelcost() {
        return modelcost;
    }

    public void setModelcost(BigDecimal modelcost) {
        this.modelcost = modelcost;
    }

    public BigDecimal getFinancemodelcost() {
        return financemodelcost;
    }

    public void setFinancemodelcost(BigDecimal financemodelcost) {
        this.financemodelcost = financemodelcost;
    }

    public BigDecimal getEstimateprice() {
        return estimateprice;
    }

    public void setEstimateprice(BigDecimal estimateprice) {
        this.estimateprice = estimateprice;
    }

    public BigDecimal getLittleorderprice() {
        return littleorderprice;
    }

    public void setLittleorderprice(BigDecimal littleorderprice) {
        this.littleorderprice = littleorderprice;
    }

    public BigDecimal getFinancelittleorderprice() {
        return financelittleorderprice;
    }

    public void setFinancelittleorderprice(BigDecimal financelittleorderprice) {
        this.financelittleorderprice = financelittleorderprice;
    }

    public String getBusinessdesc() {
        return businessdesc;
    }

    public void setBusinessdesc(String businessdesc) {
        this.businessdesc = businessdesc == null ? null : businessdesc.trim();
    }

    public String getFinancedesc() {
        return financedesc;
    }

    public void setFinancedesc(String financedesc) {
        this.financedesc = financedesc == null ? null : financedesc.trim();
    }

    public String getSalemandesc() {
        return salemandesc;
    }

    public void setSalemandesc(String salemandesc) {
        this.salemandesc = salemandesc == null ? null : salemandesc.trim();
    }

    public String getBuyerdesc() {
        return buyerdesc;
    }

    public void setBuyerdesc(String buyerdesc) {
        this.buyerdesc = buyerdesc == null ? null : buyerdesc.trim();
    }

    public Date getStopusedate() {
        return stopusedate;
    }

    public void setStopusedate(Date stopusedate) {
        this.stopusedate = stopusedate;
    }

    public String getFenLeiNo() {
        return fenLeiNo;
    }

    public void setFenLeiNo(String fenLeiNo) {
        this.fenLeiNo = fenLeiNo == null ? null : fenLeiNo.trim();
    }

    public String getFenLeiName() {
        return fenLeiName;
    }

    public void setFenLeiName(String fenLeiName) {
        this.fenLeiName = fenLeiName == null ? null : fenLeiName.trim();
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
}