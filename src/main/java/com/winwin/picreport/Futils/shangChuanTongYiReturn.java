package com.winwin.picreport.Futils;

import com.winwin.picreport.AllConstant.Constant.msgCnst;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.MsgGenerate.mg;

import java.util.List;

public class shangChuanTongYiReturn {
    public static List<Msg> yourPicNameCanNotHaveIgll(){
        return mg.gm(Msg.gmg()
                     .setMsg(msgCnst.yourPicNameCanNotHaveIgll.getValue())
                .setChMsg(msgCnst.yourPicNameCanNotHaveIgll.getValue())
                .setStatus(msgCnst.yourPicNameCanNotHaveIgllStatus.getValue())
        );
    }

    public static boolean isHavaIgll(String str){
        if (str != null && (str.contains("!") || str.contains(";"))) {

                return true;
        }else{
            return false;
        }
    }
}
