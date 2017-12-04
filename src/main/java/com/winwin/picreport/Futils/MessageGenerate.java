package com.winwin.picreport.Futils;
import java.util.ArrayList;
import java.util.List;

public class MessageGenerate {
    public static List<Msg> generateMessage(String message,String chMessage){
        Msg msg=new Msg();
        msg.setMsg(message);
        msg.setChMsg(chMessage);
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }

    public static List<Msg> generateMessage(String message,String chMessage,String token){
        Msg msg=new Msg();
        msg.setMsg(message);
        msg.setChMsg(chMessage);
        msg.setToken(token);
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }
    public static  List<Msg> generateMessage(String message,String chMessage,String token,String status){
        Msg msg=new Msg();
        msg.setMsg(message);
        msg.setChMsg(chMessage);
        msg.setToken(token);
        msg.setStatus(status);
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }
    public static  List<Msg> generateMessage(String message,String chMessage,String otherMsg,String token,String status){
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


    public static List<Msg> generateMessage(String message,String chMessage,
                                            String token,String status,
                                            String tenantId,String tenantName,
                                            String userEmail){
        Msg msg=new Msg();
        msg.setMsg(message).setChMsg(chMessage).setToken(token).setStatus(status)
                .setTenantId(tenantId).setTenantName(tenantName).setUserEmail(userEmail);
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }

    public static List<Msg> generateMessage(String message){
        Msg msg=new Msg();
        msg.setMsg(message);
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }
}
