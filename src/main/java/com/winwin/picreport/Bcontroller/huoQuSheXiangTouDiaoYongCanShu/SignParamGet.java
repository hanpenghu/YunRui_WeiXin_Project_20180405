package com.winwin.picreport.Bcontroller.huoQuSheXiangTouDiaoYongCanShu;

import com.alibaba.fastjson.JSON;
import com.winwin.picreport.AllConstant.C;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.pp;
import com.winwin.picreport.Futils.hanhan.stra;

public class SignParamGet {


    public static JsParams f(){

        //读取jsApiTicketTxt
        String jsapi_ticket = p.readAllTxt(C.jsApiTicketTxt);

        //得到随机串
        String noncestr=p.uuid();
        //得到时间戳
        String timestamp = String.valueOf(p.getTimeStamp()/1000);
        //得到url
        String url=C.urlWhoShare;


        // 注意这里参数名必须全部小写，且必须有序
       String s= stra.b()
               .a("jsapi_ticket=").a(jsapi_ticket).a(p.qdz).a("noncestr=").a(noncestr)
               .a(p.qdz).a("timestamp=").a(timestamp).a(p.qdz).a("url=").a(url).g();


       //生成签名
        String signature = pp.sha1(s);

        return new JsParams().setAppId(C.AppID)
                .setNonceStr(noncestr)
                .setTimestamp(timestamp)
                .setSignature(signature);

    }


    public static void main(String[]args){
        JsParams f = f();
        p.p("-------------------------------------------------------");
        p.p(JSON.toJSONString(f));
        p.p("-------------------------------------------------------");
    }




}


/**
 {
 "appId": "wxb93896ed3157802e",
 "nonceStr": "06b17c84-2037-4805-a4fd-88f9f0392fc0",
 "signature": "8bd5830b794e8bbc2cbc61d791d45a4300dd2498",
 "timestamp": "1522380955"
 }
 * */