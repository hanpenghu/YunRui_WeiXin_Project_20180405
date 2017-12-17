package com.winwin.picreport.Futils;

import com.winwin.picreport.Edto.ShouDingDanFromExcel;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;

import java.util.List;

public class AmtAndAmtnAndTaxChongXinSuan {
    public static void f(Double amt,Double amtn,Double tax,Double qty,ShouDingDanFromExcel shouDingDanFromExcel){
        if(amt==0){
            try {
                amt=Double.parseDouble(shouDingDanFromExcel.getUp())*qty;
            } catch (NumberFormatException e) {
                amt=0D;
            }
        }
        if(amtn==0){
            amtn=amt-amt/1.17*0.17;
            if(amtn<0){amtn=0D;}
        }
        if(tax==0){
            tax=amt/1.17*0.17;
        }
    }


    public static void g(ShouDingDanFromExcel shouDingDanFromExcel,List<Msg> listmsg){
        String amtstr = shouDingDanFromExcel.getAmt();
        String amtnstr = shouDingDanFromExcel.getAmtn();
        String qtystr=shouDingDanFromExcel.getQty();
        String taxstr=shouDingDanFromExcel.getTax();
        double amt;
        double amtn;
        double qty;
        double tax;
        try {
            amt = Double.parseDouble(amtstr);
        } catch (NumberFormatException e) {
            amt=0;
//            listmsg.addAll(new MessageGenerate().generateMessage("amt 金额不是数字"));
//            throw new RuntimeException("amt 金额不是数字");
        }

        try {
            amtn = Double.parseDouble(amtnstr);
        } catch (NumberFormatException e) {
            amtn=0;
//            listmsg.addAll(new MessageGenerate().generateMessage("amtn 未税金额不是数字"));
//            throw new RuntimeException("amtn 未税金额不是数字");
        }

        try {
            qty = Double.parseDouble(qtystr);
        } catch (NumberFormatException e) {
            qty=0;
            listmsg.addAll(new MessageGenerate().generateMessage("qty 数量不是数字"));
            throw new RuntimeException("qty 数量不是数字");
        }



        try {
            tax = Double.parseDouble(taxstr);
        } catch (NumberFormatException e) {
            tax=0;
//            listmsg.addAll(new MessageGenerate().generateMessage("tax 税额不是数字"));
//            throw new RuntimeException("tax 税额不是数字");
        }


        if(amt==0){
            try {
                amt=Double.parseDouble(shouDingDanFromExcel.getUp())*qty;
            } catch (NumberFormatException e) {
                amt=0D;
            }
        }
        if(amtn==0){
            amtn=amt-amt/1.17*0.17;
            if(amtn<0){amtn=0D;}
        }
        if(tax==0){
            tax=amt/1.17*0.17;
        }

        shouDingDanFromExcel.setAmt(String.valueOf(amt));
        shouDingDanFromExcel.setAmtn(String.valueOf(amtn));
        shouDingDanFromExcel.setTax(String.valueOf(tax));

    }


}
