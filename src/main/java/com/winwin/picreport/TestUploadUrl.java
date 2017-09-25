package com.winwin.picreport;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TestUploadUrl {
    public void f(){
//        x-ca-version	STRING	True	API版本，当前请填写'1'
//        x-ca-accesskeyid	STRING	True	分配给用户调用API的id。请在对应服务的“测试服务”功能界面或前往“账户设置”获取
//        x-ca-timestamp	STRING	True	请求时间戳，从1970年１月１日开始至现在的秒数，通常为浮点数
//        x-ca-signaturenonce	STRING	True	随机字符串，每次请求必须不一样
//        requestmethod	STRING	True	使用大写POST
        //需要参与签名的字段：
        // x-ca-accesskeyid、x-ca-version、x-ca-timestamp、
        // x-ca-signaturenonce、requestmethod、url、loc、count。
        String key1="x-ca-version";
        String value1="1";
        String  key2="x-ca-accesskeyid";
        String value2="b9c6156c60b5776b7547d46475f670b3";
        String key3="x-ca-timestamp";
        String value3=String.valueOf(new Date().getTime()/1000);
        String  key4="x-ca-signaturenonce";
        String value4= UUID.randomUUID().toString();
        String key5="requestmethod";
        String value5="POST";
        String key6="x-ca-signature";
        String value6="";
        String url="https://api.productai.cn/image_sets/_0000014/7wgcw399";//7wgcw399在服务界面获取的image_set_id


        //将参数与签名的键值对放入map
        Map<String,String> map=new HashMap<String,String>();
        map.put(key2,value2);
        map.put(key1,value1);
        map.put(key3,value3);
        map.put(key4,value4);
        map.put(key5,value5);





    }


    public static void main(String[]args){
        new TestUploadUrl().f();
    }
}
