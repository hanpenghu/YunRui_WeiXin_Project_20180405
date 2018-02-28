package com.winwin.picreport.Futils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampToDate {
/**
 * lg是毫秒
 */
    public static Date timeStampToDate(long lg) throws ParseException {
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        long time=lg;
        String d = format.format(time);
        Date date= null;

        date = format.parse(d);


        return date;
    }


    public static void main(String[]args) throws ParseException {
           System.out.println( new TimeStampToDate().timeStampToDate(1483891200000L));

          System.out.println( new SimpleDateFormat("yyyy-MM-dd").parse("2017-12-20").getTime());

    }

}
