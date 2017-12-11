package com.winwin.picreport.Futils;

import javax.servlet.http.HttpServletResponse;

public class ResponseKuaYu {
    public static void kuaYuAndUtf8Response(HttpServletResponse response, String Content_type, String charset){
//        response.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding(charset);
//        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setHeader("Content-type", Content_type);
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers", "X-Requested-With,content-type,token");
        response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");
    }
}
