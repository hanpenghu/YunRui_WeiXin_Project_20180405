package com.winwin.picreport.Cservice.Z001Quartz;


import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *fixedRate就是每多次分钟一次，不论你业务执行花费了多少时间。
 * 我都是1分钟执行1次，而fixedDelay是当任务执行完毕后1分钟在执行。所以根据实际业务不同，
 * 我们会选择不同的方式。
 * */
@Component
public class Z001Quartz {
    @Autowired
    private ManyTabSerch manyTabSerch;

    public final static long ONE_Minute =  60 * 1000;
    public final static long ONE_Second =  1 * 1000;


    @Scheduled(fixedDelay=ONE_Minute)//执行完毕后1分钟再执行
    public void fixedDelayJob(){
        System.out.println("==========================定时任务A一分钟一次开始======================");
        String str001="UPDATE A SET A.REM=B.REM FROM TF_POS A,TF_POS B,TF_SQ C \n" +
                "WHERE A.os_id='PO' AND A.qt_no like 'SQ%' AND (A.REM IS NULL or A.rem='') AND \n" +
                "B.os_id='SO' AND (B.REM IS NOT NULL AND B.rem<>'') AND A.SQ_NO=C.SQ_NO AND \n" +
                "A.OTH_ITM=C.ITM AND C.SO_NO=B.OS_NO AND C.EST_ITM=B.ITM";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务001一分钟一次~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~执行update sql开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Integer  i001= manyTabSerch.update001OfOnlineBug();
        System.out.println(str001);
        System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("执行条数="+i001+"条");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务001一分钟一次~~~~~~~~~~~~~~~~~~~~~~~~");



        String str002="UPDATE  A SET A.SUP_PRD_NO=B.SUP_PRD_NO FROM TF_POS A,TF_POS B,TF_SQ C\n" +
                "WHERE A.os_id='PO' AND A.qt_no like 'SQ%' AND (A.SUP_PRD_NO IS NULL or A.SUP_PRD_NO='') AND \n" +
                "B.os_id='SO' AND (B.SUP_PRD_NO IS NOT NULL AND B.SUP_PRD_NO<>'') AND A.SQ_NO=C.SQ_NO AND \n" +
                "A.OTH_ITM=C.ITM AND C.SO_NO=B.OS_NO AND C.EST_ITM=B.ITM";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务002一分钟一次~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~执行update sql开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Integer  i002= manyTabSerch.update002OfOnlineBug();
        System.out.println(str002);
        System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("执行条数="+i002+"条");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务002一分钟一次~~~~~~~~~~~~~~~~~~~~~~~~");



        String str003="UPDATE  C SET C.SUP_PRD_NO=B.SUP_PRD_NO FROM TF_POS B,TF_SQ C\n" +
                "WHERE B.os_id='SO' AND (B.SUP_PRD_NO IS NOT NULL AND B.SUP_PRD_NO<>'') AND \n" +
                "C.SO_NO=B.OS_NO AND C.EST_ITM=B.ITM";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务003一分钟一次~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~执行update sql开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Integer  i003= manyTabSerch.update003OfOnlineBug();
        System.out.println(str003);
        System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("执行条数="+i003+"条");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务003一分钟一次~~~~~~~~~~~~~~~~~~~~~~~~");



        String str004="update  tf_pos set wh='1000' where os_id='PO' AND wh='00000000'";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务004一分钟一次~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~执行update sql开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Integer  i004= manyTabSerch.update004OfOnlineBug();
        System.out.println(str004);
        System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("执行条数="+i004+"条");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务004一分钟一次~~~~~~~~~~~~~~~~~~~~~~~~");



        String str005="update  tf_pos set wh='2000' where os_id='PO' and os_no in \n" +
                "(select os_no from mf_pos where cus_no='F031') and  wh<>'2000' \n";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务005一分钟一次~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~执行update sql开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Integer  i005= manyTabSerch.update005OfOnlineBug();
        System.out.println(str005);
        System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("执行条数="+i005+"条");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务005一分钟一次~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("==========================定时任务A一分钟一次结束======================");
    }

//    @Scheduled(fixedRate=ONE_Minute)//不管上次有没有执行完,都是1分钟开始一个线程执行
//    public void fixedRateJob(){
//
//    }
//
//    @Scheduled(cron="0 15 3 * * ?")//每天的3点15分执行
//    public void cronJob(){
//
//    }



}
