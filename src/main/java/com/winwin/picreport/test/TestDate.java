package com.winwin.picreport.test;

import com.alibaba.fastjson.JSON;
import com.winwin.picreport.Futils.DateUtils.MakeDate1970Null;
import com.winwin.picreport.Futils.p;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestDate {

    public static void main(String[]args){
        Date date1= p.tod("2017-12-26 13:14:16.222",p.d1);
        Date date2= p.tod("2017-12-26 13:14:16.222",p.d1);
        Date date3= p.tod("2017-12-26 13:14:16.223",p.d1);
        p.p(date1==date2);//false
        p.p(date1.equals(date2));//true

        Map<Date,String>map=new HashMap<>();
        map.put(date1,"1");
        p.p(map.containsKey(date1));//ture
        p.p(map.containsKey(date2));//ture
        p.p(map.containsKey(date3));//false
        Map<Date,String>map1=new HashMap<>();
        map1.put(date1,"11");
        map1.put(date2,"22");
        p.p(map1);//{Tue Dec 26 13:14:16 CST 2017=22}//证明date也能作为相同的被后一个挤掉

        p.p("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");

        String str="{\"date\":\"1514877020753\"}";
        D d = JSON.parseObject(str, D.class);

        p.p(d.getDate());
        p.p("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");

        Date tod = p.tod("1970-01-01", p.d3);
        D dd=new D();
        dd.setDate(tod);
        dd.setBd(new BigDecimal(1111));
        MakeDate1970Null.make1970null(dd);
        String s = JSON.toJSONString(dd);
        p.p(s);

    }
}
