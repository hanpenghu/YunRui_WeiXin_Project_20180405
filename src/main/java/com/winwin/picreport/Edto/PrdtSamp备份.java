//package com.winwin.picreport.Edto;
//
//import com.winwin.picreport.Futils.ConstantInit;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//
//public class PrdtSamp备份 {
//
//    private String id="";
//
//    private String prdCode="";
//
//
//    private String idxName="";
//
//    private String idxNo="";
//
//    private String markName="";
//
//    private String markNo="";
//
//    private String colour="";
//
//    private String size="";
//
//    private String salName="";
//
//    private String salNo="";
//
//    private String cusNo="";
//
//    private String cusName="";
//
//    private String isfenjie="";
//
//    private Date sampMake=null;//new SimpleDateFormat("yyyy-MM-dd").parse("1900-01-01");
//
//    private Date sampSend=null;//new SimpleDateFormat("yyyy-MM-dd").parse("1900-01-01");
//
//
//    private String sampMakeStamp="";//打样时间戳//传给我这个
//    private String sampSendStamp="";//样品寄出时间戳//传给我这个
//
//    private String sampMakeStr="";//给徐勇用
//    private String sampSendStr="";//给徐勇用
//
//
//    private String sampRequ="";//样品要求
//
//    private String sampDesc="";//详情
//
//    private String thum="";//缩略图
//
//
//
//    private String attach="";//附件
//    //缩略图和附件的地址
////private String dirUrl="http://116.62.224.172:8070/";//网址
//    private String dirUrl="http://10.0.3.101:8070/";
///////////////////////////////////////////////////////////////////////////////////////
//    private List<String> thumUrlList=new ArrayList<>();
//    private List<String> attachUrlList=new ArrayList<>();
//
//    private Date insertdate;
//    private String insertdateStr;
//
//    public String getInsertdateStr() {
//        return insertdateStr;
//    }
//
//    public PrdtSamp备份 setInsertdateStr(String insertdateStr) {
//        this.insertdateStr = insertdateStr;
//        return this;
//    }
//
//    public Date getInsertdate() {
//        return insertdate;
//    }
//
//    public PrdtSamp备份 setInsertdate(Date insertdate) {
//        this.insertdate = insertdate;
//        return this;
//    }
//    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    /**
//     *增加字段,用于打样是否确认
//     * */
//    private String confirmMan="";//确认人
//
//
//    private String confirmTimeStr="";//确认时间
//
//    private int isConfirm=0;//0代表没有确认,1代表确认了,-1代表数据没有得到
//
//    public String getConfirmMan() {
//        return confirmMan;
//    }
//
//    public PrdtSamp备份 setConfirmMan(String confirmMan) {
//        this.confirmMan = confirmMan;
//        return this;
//    }
//
//    public String getConfirmTimeStr() {
//        return confirmTimeStr;
//    }
//
//    public PrdtSamp备份 setConfirmTimeStr(String confirmTimeStr) {
//        this.confirmTimeStr = confirmTimeStr;
//        return this;
//    }
//
//    public int getIsConfirm() {
//        return isConfirm;
//    }
//
//    public PrdtSamp备份 setIsConfirm(int isConfirm) {
//        this.isConfirm = isConfirm;
//        return this;
//    }
//    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    private String TeamName;
//    private String Category;
//
//    public String getTeamName() {
//        return TeamName;
//    }
//
//    public PrdtSamp备份 setTeamName(String teamName) {
//        TeamName = teamName;
//        return this;
//    }
//
//    public String getCategory() {
//        return Category;
//    }
//
//    public PrdtSamp备份 setCategory(String category) {
//        Category = category;
//        return this;
//    }
//
//    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    /**
//     *确认备注    confirmRem
//     *
//     * */
//    private String confirmRem;
//private String  unit;
//
//    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //构造函数初始化网址
//public PrdtSamp备份() throws ParseException {
//    this.dirUrl=ConstantInit.getDirUrl001();
//}
//
//
//    public List<String> getThumUrlList() {
//
//        String thum1=this.getThum();
//        //把得到的缩略图的一堆路径拆成数组
//        if(thum1!=null&&!"".equals(thum1)){
//            List<String> strings = Arrays.asList(thum1.split(";"));
//            List<String>strList=new ArrayList<>();
//            //给每个图片加上地址
//            for(String  str:strings){
//                strList.add(dirUrl+str);
//            }
//            this.thumUrlList=strList;
//        }
//        return thumUrlList;
//    }
////    public static void main(String[]args){
////        String[] split = "1;2;".split(";");
////        System.out.println(Arrays.asList(split));
////    }
//    public PrdtSamp备份 setThumUrlList(List<String> thumUrlList) {
//        this.thumUrlList = thumUrlList;
//        return this;
//    }
//
//
//
//
//
//    public List<String> getAttachUrlList() {
//        String attach1=this.getAttach();
//        //把得到的缩略图的一堆路径拆成数组
//        if(attach1!=null&&!"".equals(attach1)){
//            List<String> strings = Arrays.asList(attach1.split(";"));
//            List<String>strList=new ArrayList<>();
//            for(String str:strings){
//                strList.add(dirUrl+str);
//            }
//            this.attachUrlList=strList;
//        }
//        return attachUrlList;
//    }
//
//    public PrdtSamp备份 setAttachUrlList(List<String> attachUrlList) {
//        this.attachUrlList = attachUrlList;
//        return this;
//    }
//
//    ///////////////////////////////////////////////////////////////////////////////////////////////
//
//
//    public String getSampMakeStr() {
//System.out.println(this.getSampMake());
//        String s = null;
//        try {
//            s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.getSampMake());
////        sampMakeStr=s;
//        } catch (Exception e) {
//
//        }
//        return s;
//    }
//
//    public PrdtSamp备份 setSampMakeStr(String sampMakeStr) {
//        this.sampMakeStr = sampMakeStr;
//        return this;
//    }
//
//    public String getSampSendStr() {
//        String s = null;
//        try {
//            s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.getSampSend());
////        sampSendStr=s;
//        } catch (Exception e) {
//
//        }
//        return s;
//    }
//
//    public PrdtSamp备份 setSampSendStr(String sampSendStr) {
//        this.sampSendStr = sampSendStr;
//        return this;
//    }
//
//    /////////////////////////////用于跟前端沟通增加的时间戳转换字段//////////////////////////////////////////////////////////
//    public String getSampMakeStamp() {
//        return sampMakeStamp;
//    }
//
//    public PrdtSamp备份 setSampMakeStamp(String sampMakeStamp) {
//        this.sampMakeStamp = sampMakeStamp;
//        return this;
//    }
//
//    public String getSampSendStamp() {
//        return sampSendStamp;
//    }
//
//    public PrdtSamp备份 setSampSendStamp(String sampSendStamp) {
//        this.sampSendStamp = sampSendStamp;
//        return this;
//    }
//    ///////////////////////////////////////////////////////////////////////////////////////////
//    /////////////////////////使用转换字段转换过来的时间/////////////////////////////////////////////////////////////
//    public Date getSampMake() {
//        //        String res;
//        //        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        if(this.sampMake!=null){//用于从数据库选出来的时候
//            return this.sampMake;
//        }
//        Date date = null;
//        try {
//            long lt = new Long(this.sampMakeStamp);
//            date = new Date(lt);
//        } catch (NumberFormatException e) {
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~前端穿过来的打样时间戳无法解析成时间~"+this.sampMakeStamp+"~~~~~~~~~~~~~~~~~~~~~~~");
//        }
//        //        res = simpleDateFormat.format(date);
//
//        if(date!=null){
//            String format1 = new SimpleDateFormat("yyyy-MM-dd").format(date);
//
//            if ("1900-01-01".equals(format1)||"1970-01-01".equals(format1)) {
//                date=null;
//            }
//        }
//
//
//        this.sampMake=date;
//        return date;
//    }
//    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////使用转换字段转换过来的时间//////////////////////////////////////////////////////////////////
//    public Date getSampSend() {
//        if(this.sampSend!=null){//用于从数据库选出来的时候
//            return this.sampSend;
//        }
//        //下面是插入数据库的时候用的,因为插入的时候徐勇传过来的sampSendStamp,所以此时sampSend肯定是空的
//        Date date = null;
//        try {
//            long lt = new Long(this.sampSendStamp);
//            date = new Date(lt);
//        } catch (NumberFormatException e) {
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~前端穿过来的打样时间戳无法解析成时间~"+this.sampSendStamp+"~~~~~~~~~~~~~~~~~~~~~~~");
//        }
//
//        if(date!=null){
//            String format1 = new SimpleDateFormat("yyyy-MM-dd").format(date);
//            if ("1900-01-01".equals(format1)||"1970-01-01".equals(format1)) {
//                date=null;
//            }
//        }
//
//
//        this.sampSend=date;
//        return date;
//    }
//    /////////////////////////////////////////////////////////////////////////////////////////////
//
//
//
//
//
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id == null ? null : id.trim();
//    }
//
//    public String getPrdCode() {
//        return prdCode;
//    }
//
//    public void setPrdCode(String prdCode) {
//        this.prdCode = prdCode == null ? null : prdCode.trim();
//    }
//
//    public String getIdxName() {
//        return idxName;
//    }
//
//    public void setIdxName(String idxName) {
//        this.idxName = idxName == null ? null : idxName.trim();
//    }
//
//    public String getIdxNo() {
//        return idxNo;
//    }
//
//    public void setIdxNo(String idxNo) {
//        this.idxNo = idxNo == null ? null : idxNo.trim();
//    }
//
//    public String getMarkName() {
//        return markName;
//    }
//
//    public void setMarkName(String markName) {
//        this.markName = markName == null ? null : markName.trim();
//    }
//
//    public String getMarkNo() {
//        return markNo;
//    }
//
//    public void setMarkNo(String markNo) {
//        this.markNo = markNo == null ? null : markNo.trim();
//    }
//
//    public String getColour() {
//        return colour;
//    }
//
//    public void setColour(String colour) {
//        this.colour = colour == null ? null : colour.trim();
//    }
//
//    public String getSize() {
//        return size;
//    }
//
//    public void setSize(String size) {
//        this.size = size == null ? null : size.trim();
//    }
//
//    public String getSalName() {
//        return salName;
//    }
//
//    public void setSalName(String salName) {
//        this.salName = salName == null ? null : salName.trim();
//    }
//
//    public String getSalNo() {
//        return salNo;
//    }
//
//    public void setSalNo(String salNo) {
//        this.salNo = salNo == null ? null : salNo.trim();
//    }
//
//    public String getCusNo() {
//        return cusNo;
//    }
//
//    public void setCusNo(String cusNo) {
//        this.cusNo = cusNo == null ? null : cusNo.trim();
//    }
//
//    public String getCusName() {
//        return cusName;
//    }
//
//    public void setCusName(String cusName) {
//        this.cusName = cusName == null ? null : cusName.trim();
//    }
//
//    public String getIsfenjie() {
//        return isfenjie;
//    }
//
//    public void setIsfenjie(String isfenjie) {
//        this.isfenjie = isfenjie == null ? null : isfenjie.trim();
//    }
//
////    public Date getSampMake() {
////        return sampMake;
////    }
//
//    public void setSampMake(Date sampMake) {
//        this.sampMake = sampMake;
//    }
//
////    public Date getSampSend() {
////        return sampSend;
////    }
//
//    public void setSampSend(Date sampSend) {
//        this.sampSend = sampSend;
//    }
//
//    public String getSampRequ() {
//        return sampRequ;
//    }
//
//    public void setSampRequ(String sampRequ) {
//        this.sampRequ = sampRequ == null ? null : sampRequ.trim();
//    }
//
//    public String getSampDesc() {
//        return sampDesc;
//    }
//
//    public void setSampDesc(String sampDesc) {
//        this.sampDesc = sampDesc == null ? null : sampDesc.trim();
//    }
//
//    public String getThum() {
//        return thum;
//    }
//
//    public void setThum(String thum) {
//        this.thum = thum == null ? null : thum.trim();
//    }
//
//    public String getAttach() {
//        return attach;
//    }
//
//    public void setAttach(String attach) {
//        this.attach = attach == null ? null : attach.trim();
//    }
//
//
//}