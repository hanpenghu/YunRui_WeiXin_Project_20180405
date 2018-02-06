package com.winwin.picreport.Edto;



import java.util.Date;
/**
 *该类只用于产便打样编码建档的时候的前后端条件传输
 * */

public class PrdtSamp1 {
    /**
     *下面2个时间其实都是传的创建时间条件的开始时间
     * */
    //正规时间格式
    private Date insertdate;
    //固定格式时间格式,2017-12-20,如果前端约定的是时间戳,这个就传时间戳
    private String insertdateStr;
    /**
     *下面2个时间其实都是传的创建时间条件的结束时间
     * */
    //正规时间格式
    private Date insertdateEnd;
    //固定格式时间格式,2017-12-20,如果前端约定的是时间戳,这个就传时间戳
    private String insertdateStrEnd;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *确认时间区段开始时间
     * */
    //确认时间  徐勇说传时间戳
    private String confirmtimestr;
    //确认时间,真正的时间格式
    private Date confirmtime;
    /**
     *确认时间区段结束时间
     * */
    //确认时间  徐勇说传时间戳
    private String confirmtimestrEnd;
    //确认时间,真正的时间格式
    private Date confirmtimeEnd;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //产品名称
    private String idxName;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //产品名称的no
    private String idxNo;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //分类no
    private String fenLeiNo;
    //分类名称
    private String fenLeiName;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //产品编码
    private String prdCode;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *产品负责人,传一个过来就行了
     * */
    //产品负责人
    private String salName;
    //产品负责人编码
    private String salNo;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //由于在查询条件中需要使用  每页显示数和当前页,所以这里添加一下
    private Integer meiYeXianShiShu;
    private Integer dangQianYe;
    //0代表没有确认//1代表确认//用来生成动态sql加条件是否打样的
    private Integer isconfirm;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Date getInsertdate() {
        return insertdate;
    }

    public PrdtSamp1 setInsertdate(Date insertdate) {
        this.insertdate = insertdate;
        return this;
    }

    public String getInsertdateStr() {
        return insertdateStr;
    }

    public PrdtSamp1 setInsertdateStr(String insertdateStr) {
        this.insertdateStr = insertdateStr;
        return this;
    }

    public Date getInsertdateEnd() {
        return insertdateEnd;
    }

    public PrdtSamp1 setInsertdateEnd(Date insertdateEnd) {
        this.insertdateEnd = insertdateEnd;
        return this;
    }

    public String getInsertdateStrEnd() {
        return insertdateStrEnd;
    }

    public PrdtSamp1 setInsertdateStrEnd(String insertdateStrEnd) {
        this.insertdateStrEnd = insertdateStrEnd;
        return this;
    }

    public String getConfirmtimestr() {
        return confirmtimestr;
    }

    public PrdtSamp1 setConfirmtimestr(String confirmtimestr) {
        this.confirmtimestr = confirmtimestr;
        return this;
    }

    public Date getConfirmtime() {
        return confirmtime;
    }

    public PrdtSamp1 setConfirmtime(Date confirmtime) {
        this.confirmtime = confirmtime;
        return this;
    }

    public String getConfirmtimestrEnd() {
        return confirmtimestrEnd;
    }

    public PrdtSamp1 setConfirmtimestrEnd(String confirmtimestrEnd) {
        this.confirmtimestrEnd = confirmtimestrEnd;
        return this;
    }

    public Date getConfirmtimeEnd() {
        return confirmtimeEnd;
    }

    public PrdtSamp1 setConfirmtimeEnd(Date confirmtimeEnd) {
        this.confirmtimeEnd = confirmtimeEnd;
        return this;
    }

    public String getIdxName() {
        return idxName;
    }

    public PrdtSamp1 setIdxName(String idxName) {
        this.idxName = idxName;
        return this;
    }

    public String getIdxNo() {
        return idxNo;
    }

    public PrdtSamp1 setIdxNo(String idxNo) {
        this.idxNo = idxNo;
        return this;
    }

    public String getPrdCode() {
        return prdCode;
    }

    public PrdtSamp1 setPrdCode(String prdCode) {
        this.prdCode = prdCode;
        return this;
    }

    public String getSalName() {
        return salName;
    }

    public PrdtSamp1 setSalName(String salName) {
        this.salName = salName;
        return this;
    }

    public String getSalNo() {
        return salNo;
    }

    public PrdtSamp1 setSalNo(String salNo) {
        this.salNo = salNo;
        return this;
    }

    public Integer getMeiYeXianShiShu() {
        return meiYeXianShiShu;
    }

    public PrdtSamp1 setMeiYeXianShiShu(Integer meiYeXianShiShu) {
        this.meiYeXianShiShu = meiYeXianShiShu;
        return this;
    }

    public Integer getDangQianYe() {
        return dangQianYe;
    }

    public PrdtSamp1 setDangQianYe(Integer dangQianYe) {
        this.dangQianYe = dangQianYe;
        return this;
    }

    public Integer getIsconfirm() {
        return isconfirm;
    }

    public PrdtSamp1 setIsconfirm(Integer isconfirm) {
        this.isconfirm = isconfirm;
        return this;
    }

    public String getFenLeiNo() {
        return fenLeiNo;
    }

    public PrdtSamp1 setFenLeiNo(String fenLeiNo) {
        this.fenLeiNo = fenLeiNo;
        return this;
    }

    public String getFenLeiName() {
        return fenLeiName;
    }

    public PrdtSamp1 setFenLeiName(String fenLeiName) {
        this.fenLeiName = fenLeiName;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Edto.PrdtSamp1{");
        sb.append("insertdate=").append(insertdate);
        sb.append(", insertdateStr='").append(insertdateStr).append('\'');
        sb.append(", insertdateEnd=").append(insertdateEnd);
        sb.append(", insertdateStrEnd='").append(insertdateStrEnd).append('\'');
        sb.append(", confirmtimestr='").append(confirmtimestr).append('\'');
        sb.append(", confirmtime=").append(confirmtime);
        sb.append(", confirmtimestrEnd='").append(confirmtimestrEnd).append('\'');
        sb.append(", confirmtimeEnd=").append(confirmtimeEnd);
        sb.append(", idxName='").append(idxName).append('\'');
        sb.append(", idxNo='").append(idxNo).append('\'');
        sb.append(", fenLeiNo='").append(fenLeiNo).append('\'');
        sb.append(", fenLeiName='").append(fenLeiName).append('\'');
        sb.append(", prdCode='").append(prdCode).append('\'');
        sb.append(", salName='").append(salName).append('\'');
        sb.append(", salNo='").append(salNo).append('\'');
        sb.append(", meiYeXianShiShu=").append(meiYeXianShiShu);
        sb.append(", dangQianYe=").append(dangQianYe);
        sb.append(", isconfirm=").append(isconfirm);
        sb.append('}');
        return sb.toString();
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////