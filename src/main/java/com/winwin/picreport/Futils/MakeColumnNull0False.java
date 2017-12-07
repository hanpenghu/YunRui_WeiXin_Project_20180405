package com.winwin.picreport.Futils;


import java.lang.reflect.Field;

/**
 * 该方法
 *不能设置父类的字段为null
 * */
public class MakeColumnNull0False<T> {

    public  T f(T o)  {
        Field[] fs = o.getClass().getDeclaredFields();
        for(Field field:fs){
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


//    public static void main(String[]args) {
//        BatRec1 a = new BatRec1();
//        System.out.println(a.getPass());
//        a= new MakeColumnNull0False<BatRec1>().f(a);
//        System.out.println(a.getPass());
//    }


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