package com.winwin.picreport.Futils;
import java.util.ArrayList;
import java.util.List;

public class MessageGenerate {
    public List<Msg> generateMessage(String message){
        Msg msg=new Msg();
        msg.setMsg(message);
        List<Msg> list=new ArrayList<Msg>();
        list.add(msg);
        return list;
    }
}
