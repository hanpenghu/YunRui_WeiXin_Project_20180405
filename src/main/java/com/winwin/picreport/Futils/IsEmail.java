package com.winwin.picreport.Futils;
import java.util.regex.Pattern;

public class IsEmail {
   private final static String pattern1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    private final static String pattern2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    public static boolean isEmail1(String emailStr){
        if (Pattern.compile(pattern1).matcher(emailStr).find()) {
            return true;
        }
        return false;
    }
    public static boolean isEmail2(String emailStr){
        if (Pattern.compile(pattern2).matcher(emailStr).find()) {
            return true;
        }
        return false;
    }
}
