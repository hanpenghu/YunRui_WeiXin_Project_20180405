package com.winwin.picreport.Futils;
/**
 *统计小数点后面的位数
 */
public class TongJiXiaoShuDianHouDeWeiShu {
    public static Integer f(String shuZi){
        //截取到shuZi小数点后面(不包括)所有的位数
        shuZi = shuZi.substring(shuZi.indexOf(".")+1);
        //这个长度说的是字符长度,汉字跟字母数字都一样
        Integer length = shuZi.length();
        return length;
    }
    public static Integer f(Double shuZi){
        return f(String.valueOf(shuZi));
    }

}
