package com.winwin.picreport.Futils;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public strictfp class p {

    public final static String space="";
    public static final String unixBir="1970-01-01";
    public final static String d1="yyyy-MM-dd HH:mm:ss.SS";//最后的SS是毫秒//like//2017-12-16 16:19:23.670
    public final static String d2="yyyy-MM-dd HH:mm:ss";
    public final static String d3="yyyy-MM-dd";

    public final static String d4="yyyy/MM/dd HH:mm:ss.SS";
    public final static String d5="yyyy/MM/dd HH:mm:ss";
    public final static String d6="yyyy/MM/dd";

    public final static String d7="yyyy.MM.dd HH:mm:ss.SS";
    public final static String d8="yyyy.MM.dd HH:mm:ss";
    public final static String d9="yyyy.MM.dd";

    public final static String d10="yyyyMMddHHmmssSS";
    public final static String d11="yyyyMMddHHmmss";
    public final static String d12="yyyyMMdd";

    public final static String d13="yyyy.MM.dd HH.mm.ss.SS";
    public final static String d14="yyyy.MM.dd.HH.mm.ss.SS";
    public final static String d15="yyyy.MM.dd.HH.mm.ss";
    public final static String hanhanBirthday_="1986-12-26";
    public final static String hanhanBirthday="1986/12/26";
    public final static String DateType="java.util.Date";
    public final static String StringType="java.util.String";
    private String ads="";
    private StringBuffer sb=new StringBuffer();
    private List lin=new LinkedList();
    private List arl=new ArrayList();
    /**
     ****************************************************************************************
     * */
    /**
     *g得到s链式连接的字符串
     * */
    public String gad() {
        return ads;
    }

    /**
     * 先用gp得到一个新类,注意,一定要用gp得到new类,才能调用该方法
     *拼接字符串封装
     * 调用该方法链式增加字符串
     * 然后调用gad()得到结果
     * */
    public p sad(String str) {
        ads=sb.append(str).toString();
        return this;
    }

    @Test
    public void g(){
        String gad = p.gp().sad("韩寒").sad("梦如").gad();
        p.p(gad);//韩寒梦如
    }
    /**
     ****************************************************************************************
     * */
    /**
     *生成新类new封装
     * */

    public static p gp(){
        return new p();
    }


    /**
     *打印封装
     * */
    public static void p(Object o){
        System.out.println(o);
    }


    /**
     ****************************************************************************************
     * 生成linkedlist并装上东西
     * */
    public List getLin() {
        return lin;
    }

    public p setLin(Object o) {
        this.lin.add(o);
        return this;
    }

    @Test
    public void f(){
        List lin = p.gp().setLin(1).setLin(2).setLin(3).getLin();
        p.p(lin);//[1,2,3]
    }
    /**
     ****************************************************************************************
     * 生成arraylist并装上东西
     * */
    public List getArl() {
        return arl;
    }

    public p setArl(Object o) {
        this.arl.add(o);
        return this;
    }
    @Test
    public void f1(){
        List arl = p.gp().setArl(11).setArl(22).setArl(33).getArl();
        p.p(arl);////[11,22,33]

    }
    /**
     ****************************************************************************************
     * */
    /**
     *equals缩写
     * */
       public static boolean dy(String str1 ,String str2){
           if(str1!=null){
               if(str1.equals(str2)){
                   return true;
               }else{
                   return false;
               }
           }else if(str2!=null){
               if(str2.equals(str1)){
                   return true;
               }else{
                   return false;
               }
           }else if(str1==null&&str2==null){
               p("str1和str2都是null");
               return false;
           }else{
               //这种情况基本不会发生
               return false;
           }
       }


    public static boolean bdy(String str1 ,String str2){
           if(dy(str1,str2)){
               return false;
           }else{
               return true;
           }

    }


    /**
     ****************************************************************************************
     * */
    /**
     *2个日期相减得到的毫秒数量
     * */
        public static Long xjms(Date bigDate,Date samllDate){
            if(bigDate==null||samllDate==null){
                return null;
            }else{
                return bigDate.getTime()-samllDate.getTime();
            }
        }

    /**
     *2个日期相减得到的秒数量
     * */
    public static Long xjs(Date bigDate,Date samllDate){
        Long xjms = xjms(bigDate, samllDate);
        if(xjms ==null){
            return null;
        }else{
            return xjms/1000;
        }
    }

    /**
     *2个日期相减得到的分钟数量
     * */
    public static  Long xjmin(Date bigDate,Date samllDate){
        Long xjs = xjs(bigDate, samllDate);
        if(xjs ==null){
            return null;
        }else{
            return xjs/60;
        }
    }

    /**
     *2个日期相减得到的小时数量
     * */
    public  static Long xjh(Date bigDate,Date samllDate){
        Long xjmin = xjmin(bigDate, samllDate);
        if(xjmin ==null){
            return null;
        }else{
            return xjmin/60;
        }
    }

    /**
     *2个日期相减得到的天数
     * */
    public static Long xjd(Date bigDate,Date samllDate){
        Long xjh = xjh(bigDate, samllDate);
        if(xjh ==null){
            return null;
        }else{
            return xjh/24;
        }
    }


    @Test
    public void testDD() throws ParseException {
        p.p(xjh(new SimpleDateFormat("yyyy-MM-dd").parse("2017-12-14"),new SimpleDateFormat("yyyy-MM-dd").parse("2017-12-13")));
    }
    /**
     ****************************************************************************************
     * */


    /**
     *字符串日期转化成date
     * yyyy-MM-dd HH:mm:ss.SS
     * */

    public static Date tod(String strDate,String geshi) {
        if(strDate==null){
            return null;
        }
        try {
            return new SimpleDateFormat(geshi).parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     *yyyy-MM-dd转换成默认日期的
     * */
    public static Date tod(String strDate) {
        if(strDate==null){
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     *Date 变成 String
     * */
    public static String  dtoStr(Date date,String geshi) {
        if(date==null){
            return null;
        }

        try {
            return new SimpleDateFormat(geshi).format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").format(date);
        }

    }

    /**
     *Date 变成 String默认格式
     * yyyy-MM-dd HH:mm:ss.SS
     * */
    public static String  dtoStr(Date date) {
        if(date==null){
            return null;
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }
    public String  dtoStrs(Date date) {
        if(date==null){
            return null;
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").format(date);
    }
    /**
     ****************************************************************************************
     * */
    @Test
    public void f2(){
        p(dtoStrs(new Date()));
    }

    /**
     ****************************************************************************************
     * */

    /**
     *时间比大小
     * */
    public static boolean isFirstDateBig(Date first,Date second){
        if(first==null || second==null){
            return false;
        }else{
            if(first.getTime()>second.getTime()){
                return true;
            }else{
                return false;
            }
        }
    }

    /**
     *默认是"yyyy-MM-dd"的str格式才能比较
     * */
    public static boolean isFirstDateBig_(String firstStr,String  secondStr){
        Date first= tod(firstStr);
        Date second=tod(secondStr);
        return isFirstDateBig(first,second);
    }

/**
 *默认是"yyyy/MM/dd"的str格式才能比较
 * 这里说的大小是字面大小,距离1970越远越大
 * */
public static boolean isFirstDateBig(String firstStr,String  secondStr){
    Date first= tod(firstStr,"yyyy/MM/dd");
    Date second=tod(secondStr,"yyyy/MM/dd");
    return isFirstDateBig(first,second);
}
    @Test
   public void f3() {
    p(isFirstDateBig("2017/12/24", "2017/12/23"));//true
}
    /**
     ****************************************************************************************
     * */

    public static boolean isFirstDateBig(Date first,String  secondStr){
        Date second=tod(secondStr,"yyyy/MM/dd");
        return isFirstDateBig(first,second);
    }


    public static boolean isFirstDateBig(String firstStr,Date  second){
        synchronized (ThreadLocal.class) {
            Date first= tod(firstStr,"yyyy/MM/dd");
            return isFirstDateBig(first,second);
        }
    }
    @Test
    public void f4() {
        p(isFirstDateBig(new Date(), "2017/12/02"));//true
    }
    /**
     ****************************************************************************************
     * */

    /**
     *时间戳转换成Date
     * */
    public static Date sjc2Date(String shiJianChuoStr){
        if(null==shiJianChuoStr||"".equals(shiJianChuoStr)){
            return null;
        }else{
            long lt = new Long(shiJianChuoStr);
            Date date= new Date(lt);
            return  date;
        }

    }

    public static Date sjc2Date(Long shiJianChuo){
        if(null==shiJianChuo){
            return null;
        }else{
            Date date= new Date(shiJianChuo);
            return  date;
        }

    }

    /**
     *把所有是类中所有是null的字段,如果是String类型,变成""
     * */
    public static Object StringTypeNull2Space(Object o) throws IllegalAccessException {
        List<Field> fieldList = new ArrayList<>();
        Class<?> aClass = o.getClass();
        while (aClass != null) {//用while得到所有超类的字段属性
            fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
            aClass = aClass.getSuperclass(); //得到父类,然后赋给自己
        }
        for (Field field : fieldList) {
            field.setAccessible(true);
            Class<?> type = field.getType();
            if (StringType.equals(type.getName())) {
                if(null==field.get(o)){//把o穿进去,得到o的属性值
                    //设置o的属性值
                    field.set(o,space);
                }

            }
        }
        return o;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static Object StringTypeSpace2Null(Object o) throws IllegalAccessException {
    List<Field> fieldList = new ArrayList<>();
    Class<?> aClass = o.getClass();
    while (aClass != null) {//用while得到所有超类的字段属性
        fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
        aClass = aClass.getSuperclass(); //得到父类,然后赋给自己
    }
    for (Field field : fieldList) {
        field.setAccessible(true);
        Class<?> type = field.getType();
        if (StringType.equals(type.getName())) {
            if(space.equals(field.get(o))){//把o穿进去,得到o的属性值
                //设置o的属性值
                field.set(o,null);
            }

        }
    }
    return o;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *当日期小于我的生日的时候,证明这个日期不太正确,设置为null
     * 这个是针对某些框架内部会把Date设置为1970或者1899的情况
     * */
    public static Object dateTypeSamll2Null(Object o) throws IllegalAccessException {
        List<Field> fieldList = new ArrayList<>();
        Class<?> aClass = o.getClass();
        while (aClass != null) {//用while得到所有超类的字段属性
            fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
            aClass = aClass.getSuperclass(); //得到父类,然后赋给自己
        }
        for (Field field : fieldList) {
            field.setAccessible(true);
            Class<?> type = field.getType();
            if (DateType.equals(type.getName())) {
                if(isFirstDateBig(hanhanBirthday,(Date)field.get(o))){//把o穿进去,得到o的属性值
                    //设置o的属性值
                    field.set(o,null);
                }

            }
        }
        return o;
    }


    /**
     *把字段是Date的小于1986的都设置为null
     * 把字段是String的是""的都设置为null
     * */
    public static Object dateTypeSamllAndStringTypeSpace2Null(Object o) throws IllegalAccessException {
        List<Field> fieldList = new ArrayList<>();
        Class<?> aClass = o.getClass();
        while (aClass != null) {//用while得到所有超类的字段属性
            fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
            aClass = aClass.getSuperclass(); //得到父类,然后赋给自己
        }
        for (Field field : fieldList) {
            field.setAccessible(true);
            Class<?> type = field.getType();
            if (DateType.equals(type.getName())) {
                if(isFirstDateBig(hanhanBirthday,(Date)field.get(o))){//把o穿进去,得到o的属性值
                    //设置o的属性值
                    field.set(o,null);
                }

            }else if(StringType.equals(type.getName())){
                if(space.equals(field.get(o))){
                    field.set(o,null);
                }
            }
        }
        return o;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void f5(){
        p(Date.class.getName());
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
/**
 ****************************************************************************************
 * */