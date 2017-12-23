package com.winwin.picreport.Edto;
import com.winwin.picreport.AllConstant.Constant.ConstantInit;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
public class PrdtSamp {
    private String id;//一条录入记录的唯一标识符号

    private String prdCode;//产品编码

    private String idxName;//产品名称

    private String idxNo;//产品分类

    private String markName;//品牌

    private String markNo;//品牌编号

    private String colour;//颜色

    private String size;//尺寸
    //产品负责人
    private String salName;
    //产品负责人编码
    private String salNo;

    private String cusNo;//客户编号

    private String cusName;//客户名称

    private String isfenjie;//是否分解//是否分解, y代表分解, n代表不分解
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private Date sampMake;//打样时间

    private Date sampSend;//----样品寄出时间



    //打样时间戳  //前端传过来时间戳的时候变成Date赋给sampMake
    public Date getSampMake() {
        //        String res;
        //        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(this.sampMake!=null){//用于从数据库选出来的时候
            return this.sampMake;
        }
        Date date = null;
        try {
            long lt = new Long(this.sampMakeStamp);
            date = new Date(lt);
        } catch (NumberFormatException e) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~前端穿过来的打样时间戳无法解析成时间~"+this.sampMakeStamp+"~~~~~~~~~~~~~~~~~~~~~~~");
        }
        //        res = simpleDateFormat.format(date);

        if(date!=null){
            String format1 = new SimpleDateFormat("yyyy-MM-dd").format(date);

            if ("1900-01-01".equals(format1)||"1970-01-01".equals(format1)) {
                date=null;
            }
        }


        this.sampMake=date;
        return date;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////使用转换字段转换过来的时间//////////////////////////////////////////////////////////////////

    //样品寄出时间戳  //前端传过来时间戳的时候变成Date赋给sampSend
    public Date getSampSend() {
        if(this.sampSend!=null){//用于从数据库选出来的时候
            return this.sampSend;
        }
        //下面是插入数据库的时候用的,因为插入的时候徐勇传过来的sampSendStamp,所以此时sampSend肯定是空的
        Date date = null;
        try {
            long lt = new Long(this.sampSendStamp);
            date = new Date(lt);
        } catch (NumberFormatException e) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~前端穿过来的打样时间戳无法解析成时间~"+this.sampSendStamp+"~~~~~~~~~~~~~~~~~~~~~~~");
        }

        if(date!=null){
            String format1 = new SimpleDateFormat("yyyy-MM-dd").format(date);
            if ("1900-01-01".equals(format1)||"1970-01-01".equals(format1)) {
                date=null;
            }
        }


        this.sampSend=date;
        return date;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////


    private String sampMakeStamp="";//打样时间戳//传给我这个
    private String sampSendStamp="";//样品寄出时间戳//传给我这个





    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //这个是转后的时间String格式,专门给徐勇用的在前端显示的
    private String sampMakeStr="";//给徐勇用
    private String sampSendStr="";//给徐勇用

    public String getSampMakeStr() {
        System.out.println(this.getSampMake());
        String s = null;
        try {
            s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.getSampMake());
//        sampMakeStr=s;
        } catch (Exception e) {

        }
        return s;
    }

    public PrdtSamp setSampMakeStr(String sampMakeStr) {
        this.sampMakeStr = sampMakeStr;
        return this;
    }

    public String getSampSendStr() {
        String s = null;
        try {
            s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.getSampSend());
//        sampSendStr=s;
        } catch (Exception e) {

        }
        return s;
    }

    public PrdtSamp setSampSendStr(String sampSendStr) {
        this.sampSendStr = sampSendStr;
        return this;
    }



    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //样品要求
    private String sampRequ="";
    //样品描述
    private String sampDesc="";
    //---缩略图名字包含的路径字符串,用;隔开,路径里面有!导致用户的缩略名字不能有!和;
    private String thum="";

    //附件路径字符串,多个用;隔开,名字中的！做分隔符号
    private String attach="";
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //服务器的和图片所在的ip和域名,用于拼接附件和图片的地址
    private String dirUrl="http://10.0.3.101:8070/";
    //构造函数初始化网址
    public PrdtSamp() throws ParseException {
        this.dirUrl= ConstantInit.getDirUrl001();
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //该条记录插入时间,数据库自动会添加DEFAULT一个getdate()
    private Date insertdate;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //给徐勇显示在前端用的该条记录插入时间
    private String insertdateStr;

    public String getInsertdateStr() {
        return insertdateStr;
    }

    public PrdtSamp setInsertdateStr(String insertdateStr) {
        this.insertdateStr = insertdateStr;
        return this;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    private String confirmman="";//确认人

    private String confirmtimestr="";//确认时间   直接带-的字符串

    private Integer isconfirm;//是否确认，1代表已经确认  0代表未确认

    private String category;//未知

    private String teamname;//未知

    private String confirmrem;//确认备注

    private String unit;//单位

    private String businessdesc;//业务描述

    private String financedesc;//财务描述

    private BigDecimal startsellcount;//起订数量

    private BigDecimal modelcost;//财务模具费

    private BigDecimal estimateprice;//预估价

    private BigDecimal littleorderprice;//财务小单费

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //该条记录的所有缩略图路径的集合,用上面的dirUrl来拼接
    private List<String> thumUrlList=new ArrayList<>();
    //该条记录的所有附件路径的集合,用上面的dirUrl来拼接
    private List<String> attachUrlList=new ArrayList<>();

    public List<String> getThumUrlList() {

        String thum1=this.getThum();
        //把得到的缩略图的一堆路径拆成数组
        if(thum1!=null&&!"".equals(thum1)){
            List<String> strings = Arrays.asList(thum1.split(";"));
            List<String>strList=new ArrayList<>();
            //给每个图片加上地址、
            for(String  str:strings){
                strList.add(dirUrl+str);
            }
            this.thumUrlList=strList;
        }
        return thumUrlList;
    }


    public PrdtSamp setThumUrlList(List<String> thumUrlList) {
        this.thumUrlList = thumUrlList;
        return this;
    }


    public List<String> getAttachUrlList() {
        String attach1=this.getAttach();
        //把得到的缩略图的一堆路径拆成数组
        if(attach1!=null&&!"".equals(attach1)){
            List<String> strings = Arrays.asList(attach1.split(";"));
            List<String>strList=new ArrayList<>();
            for(String str:strings){
                strList.add(dirUrl+str);
            }
            this.attachUrlList=strList;
        }
        return attachUrlList;
    }

    public PrdtSamp setAttachUrlList(List<String> attachUrlList) {
        this.attachUrlList = attachUrlList;
        return this;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


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



    public void setSampMake(Date sampMake) {
        this.sampMake = sampMake;
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

    public BigDecimal getStartsellcount() {
        return startsellcount;
    }

    public void setStartsellcount(BigDecimal startsellcount) {
        this.startsellcount = startsellcount;
    }

    public BigDecimal getModelcost() {
        return modelcost;
    }

    public void setModelcost(BigDecimal modelcost) {
        this.modelcost = modelcost;
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

    public String getSampMakeStamp() {
        return sampMakeStamp;
    }

    public PrdtSamp setSampMakeStamp(String sampMakeStamp) {
        this.sampMakeStamp = sampMakeStamp;
        return this;
    }

    public String getSampSendStamp() {
        return sampSendStamp;
    }

    public PrdtSamp setSampSendStamp(String sampSendStamp) {
        this.sampSendStamp = sampSendStamp;
        return this;
    }

}