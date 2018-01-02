package com.winwin.picreport.Futils.DateUtils;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import  java.util.Date;

public class MakeDate1970Null {
    public static void make1970null(Object o){
        List<Field> fieldList=new ArrayList<>();
        Class<?> aClass = o.getClass();
        while (aClass != null) {//用while得到所有超类的字段属性
            fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
            aClass = aClass.getSuperclass(); //得到父类,然后赋给自己
        }
        for(Field field:fieldList){
            field.setAccessible(true);
            //得到当前字段类型
            String typeName = field.getClass().getTypeName();
            if("java.util.Date".equals(typeName)){
                //得到我的生日
                try {
                    if(field.get(o)!=null){
                        Date date=null;
                        try {  date = new SimpleDateFormat("yyyy-MM-dd").parse("1986-12-26"); } catch (ParseException e) { e.printStackTrace(); }
                        long mybrith = date.getTime();
                        long time = ((Date) field.get(o)).getTime();
                        if(time<=mybrith){
                            //如果这个时间小于我的生日,证明这个时间是在1986年以前的时间,需要变成NULL
                            field.set(o,null);
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

    }

//    public static void main(String[]args){
//        System.out.println(Date.class.getTypeName());
//    }

}
