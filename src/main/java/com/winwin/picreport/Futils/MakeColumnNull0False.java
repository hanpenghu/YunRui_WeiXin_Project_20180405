package com.winwin.picreport.Futils;


import com.winwin.picreport.Edto.TfPos;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 该方法
 *不能设置父类的字段为null
 * */
public class MakeColumnNull0False<T> {

    public  T f(T o)  {
        /**
         ******下面一直到while*会得到该类及其父类的所有字段*********************************************************************************
         * */
        List<Field> fieldList=new ArrayList<>();
        Class<?> aClass = o.getClass();
        while (aClass != null) {//用while得到所有超类的字段属性
            fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
            aClass = aClass.getSuperclass(); //得到父类,然后赋给自己
        }
        /**
         *****上面会得到该类及其父类的所有字段***********************************************************************************
         * */
        for(Field field:fieldList){
            field.setAccessible(true);
            Class<?> type = field.getType();
            if("int".equals(type.getName())){
                try {
                    field.setInt(o,0);
                } catch (IllegalAccessException e) {
                    System.out.println("该类的该字段类型为"+type.getName()+"无法转换为null或者0");
                }
            }else if("double".equals(type.getName())){
                try {
                    field.setDouble(o,0d);
                } catch (IllegalAccessException e) {
                    System.out.println("该类的该字段类型为"+type.getName()+"无法转换为null或者0");
                }
            }
            else if("float".equals(type.getName())){
                try {
                    field.setFloat(o,0f);
                } catch (IllegalAccessException e) {
                    System.out.println("该类的该字段类型为"+type.getName()+"无法转换为null或者0");
                }
            }else if("long".equals(type.getName())){
                try {
                    field.setLong(o,0L);
                } catch (IllegalAccessException e) {
                    System.out.println("该类的该字段类型为"+type.getName()+"无法转换为null或者0");
                }
            }else if("short".equals(type.getName())){
                try {
                    field.setShort(o, (short) 0);
                } catch (IllegalAccessException e) {
                    System.out.println("该类的该字段类型为"+type.getName()+"无法转换为null或者0");
                }
            }else if("boolean".equals(type.getName())){
                try {
                    field.setBoolean(o,false);
                } catch (IllegalAccessException e) {
                    System.out.println("该类的该字段类型为"+type.getName()+"无法转换为null或者0");
                }
            }else{
                try {
                    field.set(o,null);
                } catch (IllegalAccessException e) {
                    System.out.println("该类的该字段类型为"+type.getName()+"无法转换为null或者0");
                }
            }

        }

        return o;
    }


    public static void main(String[]args) {
        TfPos a = new TfPos();
        System.out.println(a.getOsId());
        a= new MakeColumnNull0False<TfPos>().f(a);
        System.out.println(a.getOsId());
    }


}


//class A{
//    private String  b="韩寒";
//
//    public String getB() {
//        return b;
//    }
//
//    public A setB(String b) {
//        this.b = b;
//        return this;
//    }
//}