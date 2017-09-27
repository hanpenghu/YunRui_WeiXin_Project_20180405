package com.winwin.picreport.Edto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChaXunTiaoJian {
    private String startTimeStamp="";//远一点的
    private String endTimeStamp="";//最近的
    private String startTime="";
    private String endTime="";
    private List<String> cus_no=new ArrayList<>();

    public String getStartTimeStamp() {
        return startTimeStamp;
    }

    public void setStartTimeStamp(String startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public String getEndTimeStamp() {
        return endTimeStamp;
    }

    public void setEndTimeStamp(String endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    public String getStartTime() {
        if(this.startTimeStamp==null||"".equals(this.startTimeStamp)||this.startTimeStamp=="undefined"||this.startTimeStamp=="Undefined"){
            //此时客户什么也没弄过来,我们把起始时间最小化
            this.startTime="1970-01-01";
        }else{
            //得到java格式的时间戳
            long javaShiJianChuo = Long.parseLong(this.startTimeStamp);
            //将java格式的时间戳转换成SQLServer实际存储的dateTime的String类型,可以直接个数据库使用
            this.startTime= new SimpleDateFormat("yyyy-MM-dd").format(new Date(javaShiJianChuo));
        }
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    //yyyy-MM-dd是SQLServer直接能读的字符串日期类型
    public String getEndTime() {
        if(this.endTimeStamp==null||"".equals(this.endTimeStamp)||this.endTimeStamp=="undefined"||this.endTimeStamp=="Undefined"){
            //此时客户什么也没弄过来,我们把起始时间最大化
            this.endTime="8888-12-31";
        }else{
            //得到java格式的时间戳
            long javaShiJianChuo = Long.parseLong(this.endTimeStamp);
            //将java格式的时间戳转换成SQLServer实际存储的dateTime的String类型,可以直接个数据库使用
            this.endTime= new SimpleDateFormat("yyyy-MM-dd").format(new Date(javaShiJianChuo));
        }
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public List<String> getCus_no() {
        return cus_no;
    }

    public void setCus_no(List<String> cus_no) {
        this.cus_no = cus_no;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Edto.ChaXunTiaoJian{");
        sb.append("startTimeStamp='").append(startTimeStamp).append('\'');
        sb.append(", endTimeStamp='").append(endTimeStamp).append('\'');
        sb.append(", startTime='").append(startTime).append('\'');
        sb.append(", endTime='").append(endTime).append('\'');
        sb.append(", cus_no=").append(cus_no);
        sb.append('}');
        return sb.toString();
    }



}
