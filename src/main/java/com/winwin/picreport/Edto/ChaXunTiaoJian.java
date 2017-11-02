package com.winwin.picreport.Edto;

import com.alibaba.fastjson.JSON;
import com.winwin.picreport.Futils.NotEmpty;

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
        if(!NotEmpty.notEmpty(this.startTimeStamp)||"undefined".equals(this.startTimeStamp)||"Undefined".equals(this.startTimeStamp)){
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
        if(!NotEmpty.notEmpty(this.endTimeStamp)||"undefined".equals(this.endTimeStamp)||"Undefined".equals(this.endTimeStamp)){
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
//    public static void main(String[]args){
//        ChaXunTiaoJian chaXunTiaoJian=new ChaXunTiaoJian();
//        chaXunTiaoJian.setStartTimeStamp("2131231231");
//        chaXunTiaoJian.setEndTimeStamp("3123123123123");
//        List<String> cus_no=new ArrayList<>();
//        cus_no.add("1");
//        cus_no.add("2");
//        cus_no.add("3");
//        cus_no.add("4");
//        chaXunTiaoJian.setCus_no(cus_no);
//        String s = JSON.toJSONString(chaXunTiaoJian);
//        System.out.println(s);
//    }


}
