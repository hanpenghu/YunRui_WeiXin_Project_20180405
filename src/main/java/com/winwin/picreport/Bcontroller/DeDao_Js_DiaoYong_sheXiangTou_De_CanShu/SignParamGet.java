package com.winwin.picreport.Bcontroller.DeDao_Js_DiaoYong_sheXiangTou_De_CanShu;

import com.alibaba.fastjson.JSON;
import com.winwin.picreport.AllConstant.C;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.pp;
import com.winwin.picreport.Futils.hanhan.stra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class SignParamGet {




@Autowired
private Cnst cnst;
    /**
     *参数url是前端穿过来的,他的页面将来的url值
     * */
    public  JsParams f(HttpServletRequest r){

        String url1 = r.getParameter("url");

//这个是前端传过来的他url当时值,这个我不用了,我写死成已知的他的url

        //后来想想还是用他传入的url吧
        //就跟部署在微信官方后端的那个js 域名一样,2个一样,才能进行验证

        p.p("-----------------------徐勇传过来的原版的未动过的url1--------------------------------");
        p.p(url1);
        p.p("-------------------------------------------------------");
        if(url1.contains("?")){
            url1=url1.substring(0,url1.indexOf("?"));
        }




        //读取jsApiTicketTxt
        String jsapi_ticket = p.readAllTxt(C.jsApiTicketTxt);

        //得到随机串
        String noncestr=p.uuid();
        //得到时间戳
        String timestamp = String.valueOf(p.getTimeStamp()/1000);

        String url=null;
        if(p.empty(url1)){
            p.p("-------------------------------------------------------");
            p.p("前端穿过来的url是空的");
            p.p("-------------------------------------------------------");
            //如果前端传过来的url是空,就用自己的url
           url=cnst.c.urlWhoShare;
        }else{
            p.p("-------------------------------------------------------");
            p.p("前端传过来的url非空的");
            p.p("-------------------------------------------------------");
            url=url1;
        }

//        //写死url测试
//        url="http://xywait.imwork.net";
//
//        p.p("--------使用测试的url-----------------------------------------------");
//        p.p(url);
//        p.p("-------------------------------------------------------");


        // 注意这里参数名必须全部小写，且必须有序
       String s= stra.b()
               .a("jsapi_ticket=").a(jsapi_ticket).a(p.qdz).a("noncestr=").a(noncestr)
               .a(p.qdz).a("timestamp=").a(timestamp).a(p.qdz).a("url=").a(url).g();


       //生成签名
        String signature = pp.sha1(s);

        JsParams jsParams = new JsParams().setAppId(cnst.c.AppID)
                .setNonceStr(noncestr)
                .setTimestamp(timestamp)
                .setSignature(signature).setJsapi_ticket(jsapi_ticket);


        p.p("---------------------------最终返回给徐勇的签名----------------------------");
        p.p(JSON.toJSONString(jsParams));
        p.p("-------------------------------------------------------");
        p.p("--------------徐勇穿过来的背截取后的url-----------------------------------------");
        p.p(url);
        p.p("-------------------------------------------------------");



        return jsParams;

    }


    public static void main(String[]args){

      /*  JsParams f = f(new Url());
        p.p("-------------------------------------------------------");
        p.p(JSON.toJSONString(f));
        p.p("-------------------------------------------------------");*/
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