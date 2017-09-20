package com.winwin.picreport.Futils;

public class Msg {
    private String Msg="";

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getMsg() {
        return Msg;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Futils.Msg{");
        sb.append("Msg='").append(Msg).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
