package com.winwin.picreport.Futils.MsgGenerate;



import java.util.ArrayList;
import java.util.List;

public class mg {
    public static List<Msg> gm(String message, String chMessage){
        Msg msg=new Msg();
        msg.setMsg(message);
        msg.setChMsg(chMessage);
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }

    public static List<Msg> gm(String message, String chMessage, String token){
        Msg msg=new Msg();
        msg.setMsg(message);
        msg.setChMsg(chMessage);
        msg.setToken(token);
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }
    public static  List<Msg> gm(String message, String chMessage,
                                String token, String status){
        Msg msg=new Msg();
        msg.setMsg(message);
        msg.setChMsg(chMessage);
        msg.setToken(token);
        msg.setStatus(status);
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }
    public static  List<Msg> gm(String message, String chMessage,
                                String otherMsg, String token, String status){
        Msg msg=new Msg();
        msg.setMsg(message);
        msg.setChMsg(chMessage);
        msg.setToken(token);
        msg.setStatus(status);
        msg.setOtherMsg(otherMsg);
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }




    public static  List<Msg> gm(Msg msg){
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }


    public static List<Msg> gm(String message, String chMessage,
                               String token, String status,
                               String tenantId, String tenantName,
                               String userEmail){
        Msg msg=new Msg();
        msg.setMsg(message).setChMsg(chMessage).setToken(token).setStatus(status)
        .setTenantId(tenantId).setTenantName(tenantName).setUserEmail(userEmail);
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }

    public static  List<Msg> gm(String message){
        Msg msg=new Msg();
        msg.setMsg(message);
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }




}
