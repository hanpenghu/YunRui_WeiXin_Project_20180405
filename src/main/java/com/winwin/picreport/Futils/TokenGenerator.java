package com.winwin.picreport.Futils;

//import com.ipacedev.tcode.dto.LoginInfo;

import com.winwin.picreport.Edto.LoginInfo;

import java.util.Base64;
import java.util.Date;

public class TokenGenerator {
    public static String generatorToken(LoginInfo info){
        long time = new Date().getTime();
        String timestr = String.valueOf(time);
        //时间戳+公司id+用户id加密后作为token//{~}作为截取字符串的分隔符
        String tokenYuanXing=timestr + "{~}" + info.getTenantId() + "{~}"+ info.getUserEmail();
        String token = Base64.getUrlEncoder().encodeToString((tokenYuanXing).getBytes());
        return token;
    }
}
