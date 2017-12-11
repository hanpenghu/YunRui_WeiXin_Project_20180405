package com.winwin.picreport.Futils;

import java.util.regex.Pattern;

public class IsPhoneNo {
    private final static String pattern1 = "^1[3|4|5|7|8][0-9]\\d{8}$";

    public static boolean isPhoneNo(String phoneNoStr){
        if (Pattern.compile(pattern1).matcher(phoneNoStr).find()) {
            return true;
        }
        return false;
    }

    public static void main(String[]args){
        System.out.println(IsPhoneNo.isPhoneNo("18641928741"));
    }
}
