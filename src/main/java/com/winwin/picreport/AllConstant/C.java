package com.winwin.picreport.AllConstant;

import org.springframework.stereotype.Component;

@Component
public class C {

    //accToken存储的文本名字,默认路径
    public static final String accessTokenTxt="accessToken.txt";
    //jsApiTicketTxt存储的文本名字,默认路径
    public static  final String  jsApiTicketTxt="jsApiTicket.txt";


    //系统级参数
    public static final String gongZhongHao="gh_09fba5574ef4";
    public static final String AppID="wxb93896ed3157802e";
    public static final String AppSecret="26ee4f662173be9d375daa75b79f980e";
    public static final String serverUrl="http://hanpenghu123.picp.io/";
    public static final String token="hanpenghulimengruhanjiacheng123";




    //消息加解密密钥
    public static final String EncodingAESKey="hanpenghulimengruhanjiacheng123hanpenghu123";
    public static final String grant_type="client_credential";
    public static final String accessTokenGetUrl="https://api.weixin.qq.com/cgi-bin/token";
    public static final String jsapi_ticketUrl="https://api.weixin.qq.com/cgi-bin/ticket/getticket";

    //当前需要分享的网页的URL
    public static final String urlWhoShare="http://hanpenghu123.picp.io/index.html";











}
