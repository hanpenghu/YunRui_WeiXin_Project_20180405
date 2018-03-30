package com.winwin.picreport.Bcontroller;

public interface I {

    //收获确认主接口//post 返回json
    String receiveConfirm="receiveConfirm";
    //微信页面跳转所需验证接口,主要是验证跳转后的url
    String signToJs="signToJs";
    String returnMsg="returnMsg";
}
