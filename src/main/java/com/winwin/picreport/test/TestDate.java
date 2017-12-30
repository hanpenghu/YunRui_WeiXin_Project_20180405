package com.winwin.picreport.test;

import com.winwin.picreport.Futils.p;

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
    }
}
