package com.winwin.picreport.Edto;
import java.math.BigDecimal;
import java.util.Date;

/**
 *该类是数据库映射出来的原始类
 * */
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class PrdtSamp201803071441 {
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

    public String getId() {
        return id;
    }

    public PrdtSamp201803071441 setId(String id) {
        this.id = id;
        return this;
    }

    public String getPrdCode() {
        return prdCode;
    }

    public PrdtSamp201803071441 setPrdCode(String prdCode) {
        this.prdCode = prdCode;
        return this;
    }

    public String getIdxName() {
        return idxName;
    }

    public PrdtSamp201803071441 setIdxName(String idxName) {
        this.idxName = idxName;
        return this;
    }

    public String getIdxNo() {
        return idxNo;
    }

    public PrdtSamp201803071441 setIdxNo(String idxNo) {
        this.idxNo = idxNo;
        return this;
    }

    public String getFenLeiNo() {
        return fenLeiNo;
    }

    public PrdtSamp201803071441 setFenLeiNo(String fenLeiNo) {
        this.fenLeiNo = fenLeiNo;
        return this;
    }

    public String getFenLeiName() {
        return fenLeiName;
    }

    public PrdtSamp201803071441 setFenLeiName(String fenLeiName) {
        this.fenLeiName = fenLeiName;
        return this;
    }

    public String getMarkName() {
        return markName;
    }

    public PrdtSamp201803071441 setMarkName(String markName) {
        this.markName = markName;
        return this;
    }

    public String getMarkNo() {
        return markNo;
    }

    public PrdtSamp201803071441 setMarkNo(String markNo) {
        this.markNo = markNo;
        return this;
    }

    public String getColour() {
        return colour;
    }

    public PrdtSamp201803071441 setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public String getSize() {
        return size;
    }

    public PrdtSamp201803071441 setSize(String size) {
        this.size = size;
        return this;
    }

    public String getSalName() {
        return salName;
    }

    public PrdtSamp201803071441 setSalName(String salName) {
        this.salName = salName;
        return this;
    }

    public String getSalNo() {
        return salNo;
    }

    public PrdtSamp201803071441 setSalNo(String salNo) {
        this.salNo = salNo;
        return this;
    }

    public String getCusNo() {
        return cusNo;
    }

    public PrdtSamp201803071441 setCusNo(String cusNo) {
        this.cusNo = cusNo;
        return this;
    }

    public String getCusName() {
        return cusName;
    }

    public PrdtSamp201803071441 setCusName(String cusName) {
        this.cusName = cusName;
        return this;
    }

    public String getIsfenjie() {
        return isfenjie;
    }

    public PrdtSamp201803071441 setIsfenjie(String isfenjie) {
        this.isfenjie = isfenjie;
        return this;
    }

    public Date getSampMake() {
        return sampMake;
    }

    public PrdtSamp201803071441 setSampMake(Date sampMake) {
        this.sampMake = sampMake;
        return this;
    }

    public Date getSampSend() {
        return sampSend;
    }

    public PrdtSamp201803071441 setSampSend(Date sampSend) {
        this.sampSend = sampSend;
        return this;
    }

    public String getSampRequ() {
        return sampRequ;
    }

    public PrdtSamp201803071441 setSampRequ(String sampRequ) {
        this.sampRequ = sampRequ;
        return this;
    }

    public String getSampDesc() {
        return sampDesc;
    }

    public PrdtSamp201803071441 setSampDesc(String sampDesc) {
        this.sampDesc = sampDesc;
        return this;
    }

    public String getThum() {
        return thum;
    }

    public PrdtSamp201803071441 setThum(String thum) {
        this.thum = thum;
        return this;
    }

    public String getAttach() {
        return attach;
    }

    public PrdtSamp201803071441 setAttach(String attach) {
        this.attach = attach;
        return this;
    }

    public Date getInsertdate() {
        return insertdate;
    }

    public PrdtSamp201803071441 setInsertdate(Date insertdate) {
        this.insertdate = insertdate;
        return this;
    }

    public String getConfirmman() {
        return confirmman;
    }

    public PrdtSamp201803071441 setConfirmman(String confirmman) {
        this.confirmman = confirmman;
        return this;
    }

    public String getConfirmtimestr() {
        return confirmtimestr;
    }

    public PrdtSamp201803071441 setConfirmtimestr(String confirmtimestr) {
        this.confirmtimestr = confirmtimestr;
        return this;
    }

    public Integer getIsconfirm() {
        return isconfirm;
    }

    public PrdtSamp201803071441 setIsconfirm(Integer isconfirm) {
        this.isconfirm = isconfirm;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public PrdtSamp201803071441 setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getTeamname() {
        return teamname;
    }

    public PrdtSamp201803071441 setTeamname(String teamname) {
        this.teamname = teamname;
        return this;
    }

    public String getConfirmrem() {
        return confirmrem;
    }

    public PrdtSamp201803071441 setConfirmrem(String confirmrem) {
        this.confirmrem = confirmrem;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public PrdtSamp201803071441 setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getBusinessdesc() {
        return businessdesc;
    }

    public PrdtSamp201803071441 setBusinessdesc(String businessdesc) {
        this.businessdesc = businessdesc;
        return this;
    }

    public String getFinancedesc() {
        return financedesc;
    }

    public PrdtSamp201803071441 setFinancedesc(String financedesc) {
        this.financedesc = financedesc;
        return this;
    }

    public BigDecimal getStartsellcount() {
        return startsellcount;
    }

    public PrdtSamp201803071441 setStartsellcount(BigDecimal startsellcount) {
        this.startsellcount = startsellcount;
        return this;
    }

    public BigDecimal getModelcost() {
        return modelcost;
    }

    public PrdtSamp201803071441 setModelcost(BigDecimal modelcost) {
        this.modelcost = modelcost;
        return this;
    }

    public BigDecimal getEstimateprice() {
        return estimateprice;
    }

    public PrdtSamp201803071441 setEstimateprice(BigDecimal estimateprice) {
        this.estimateprice = estimateprice;
        return this;
    }

    public BigDecimal getLittleorderprice() {
        return littleorderprice;
    }

    public PrdtSamp201803071441 setLittleorderprice(BigDecimal littleorderprice) {
        this.littleorderprice = littleorderprice;
        return this;
    }

    public String getModelcostinvoiceno() {
        return modelcostinvoiceno;
    }

    public PrdtSamp201803071441 setModelcostinvoiceno(String modelcostinvoiceno) {
        this.modelcostinvoiceno = modelcostinvoiceno;
        return this;
    }

    public BigDecimal getFinancestartsellcount() {
        return financestartsellcount;
    }

    public PrdtSamp201803071441 setFinancestartsellcount(BigDecimal financestartsellcount) {
        this.financestartsellcount = financestartsellcount;
        return this;
    }

    public BigDecimal getFinancemodelcost() {
        return financemodelcost;
    }

    public PrdtSamp201803071441 setFinancemodelcost(BigDecimal financemodelcost) {
        this.financemodelcost = financemodelcost;
        return this;
    }

    public BigDecimal getFinancelittleorderprice() {
        return financelittleorderprice;
    }

    public PrdtSamp201803071441 setFinancelittleorderprice(BigDecimal financelittleorderprice) {
        this.financelittleorderprice = financelittleorderprice;
        return this;
    }

    public String getBuyerdesc() {
        return buyerdesc;
    }

    public PrdtSamp201803071441 setBuyerdesc(String buyerdesc) {
        this.buyerdesc = buyerdesc;
        return this;
    }

    public String getPrdNo() {
        return prdNo;
    }

    public PrdtSamp201803071441 setPrdNo(String prdNo) {
        this.prdNo = prdNo;
        return this;
    }

    public String getSalemandesc() {
        return salemandesc;
    }

    public PrdtSamp201803071441 setSalemandesc(String salemandesc) {
        this.salemandesc = salemandesc;
        return this;
    }

    public Date getStopusedate() {
        return stopusedate;
    }

    public PrdtSamp201803071441 setStopusedate(Date stopusedate) {
        this.stopusedate = stopusedate;
        return this;
    }

    public String getCusNoGive() {
        return cusNoGive;
    }

    public PrdtSamp201803071441 setCusNoGive(String cusNoGive) {
        this.cusNoGive = cusNoGive;
        return this;
    }

    public String getCusNameGive() {
        return cusNameGive;
    }

    public PrdtSamp201803071441 setCusNameGive(String cusNameGive) {
        this.cusNameGive = cusNameGive;
        return this;
    }
}