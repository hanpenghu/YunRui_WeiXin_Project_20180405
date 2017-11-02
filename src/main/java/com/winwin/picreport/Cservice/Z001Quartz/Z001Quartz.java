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

    public final static long thirty_Second =  30 * 1000;
    public final static long two_Second =  2 * 1000;


    @Scheduled(fixedDelay=thirty_Second)//执行完毕后1分钟再执行
    public void fixedDelayJob(){
        this.onlineBugXiuFuSql();
    }

    @Scheduled(fixedDelay=two_Second)//执行完毕后1分钟再执行
    public void fixedDelayJob001(){
        this.onlineBugXiuFuSql001();
    }

    private void onlineBugXiuFuSql001() {
        System.out.println("===========009===============定时任务B 2秒一次开始======================");

        System.out.println("~~~~~~~~~~~~~009-1~~~~~~~" +
                "~~~~定时任务B001 2秒一次执行完毕~~更新"+manyTabSerch.update009_1OfOnlineBug()+"条~~~~~~~~~~" +
                "~~~~~~~UPDATE A SET A.REM=B.SO_NO FROM MF_SQ A,TF_SQ B \n" +
                "WHERE A.CLS_ID='F' AND A.SQ_NO=B.SQ_NO AND B.ITM=1~~~~~~~~");


        System.out.println("~~~~~~~~~~~009-2~~~~~~" +
                "~~~~~~~定时任务B002 2秒一次执行完毕~~更新"+manyTabSerch.update009_2OfOnlineBug()+"条~~~" +
                "~~~~~~~UPDATE B SET B.SO_NO=A.REM FROM MF_SQ A,TF_SQ B \n" +
                "WHERE A.CLS_ID='F' AND A.SQ_NO=B.SQ_NO AND (B.SO_NO is NULL or B.SO_NO='')~~~~~~~~~~~~~~~~~~~");


        System.out.println("~~~~~~~~~~~009-3~~~~~~~~~~~" +
                "~~定时任务B003 2秒一次执行完毕~~更新"+manyTabSerch.update009_3OfOnlineBug()+"条~~~~~~" +
                "~~~~~~~~~~UPDATE B SET B.est_dd=A.est_dd FROM MF_SQ A,TF_SQ B \n" +
                "WHERE A.SQ_NO=B.SQ_NO AND (B.EST_DD IS NULL)~~~~~~~~~~~~~");



        System.out.println("=============009=============定时任务B 2秒一次结束======================");
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

        public void onlineBugXiuFuSql(){
            System.out.println("==========================定时任务A 30秒一次开始======================");
            try {
                String str001="UPDATE A SET A.REM=B.REM FROM TF_POS A,TF_POS B,TF_SQ C \n" +
                        "WHERE A.os_id='PO' AND A.qt_no like 'SQ%' AND (A.REM IS NULL or A.rem='') AND \n" +
                        "B.os_id='SO' AND (B.REM IS NOT NULL AND B.rem<>'') AND A.SQ_NO=C.SQ_NO AND \n" +
                        "A.OTH_ITM=C.ITM AND C.SO_NO=B.OS_NO AND C.EST_ITM=B.ITM";
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务001 30秒一次~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~执行update sql开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                Integer  i001= manyTabSerch.update001OfOnlineBug();
                System.out.println(str001);
                System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("执行条数="+i001+"条");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务 30秒一次~~~~~~~~~~~~~~~~~~~~~~~~");
            } catch (Exception e) {
                e.printStackTrace();
            }


            try {
                String str002="UPDATE  A SET A.SUP_PRD_NO=B.SUP_PRD_NO FROM TF_POS A,TF_POS B,TF_SQ C\n" +
                        "WHERE A.os_id='PO' AND A.qt_no like 'SQ%' AND (A.SUP_PRD_NO IS NULL or A.SUP_PRD_NO='') AND \n" +
                        "B.os_id='SO' AND (B.SUP_PRD_NO IS NOT NULL AND B.SUP_PRD_NO<>'') AND A.SQ_NO=C.SQ_NO AND \n" +
                        "A.OTH_ITM=C.ITM AND C.SO_NO=B.OS_NO AND C.EST_ITM=B.ITM";
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务002 30秒一次~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~执行update sql开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                Integer  i002= manyTabSerch.update002OfOnlineBug();
                System.out.println(str002);
                System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("执行条数="+i002+"条");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务002 30秒一次~~~~~~~~~~~~~~~~~~~~~~~~");
            } catch (Exception e) {
                e.printStackTrace();
            }


            try {
                String str003="UPDATE  C SET C.SUP_PRD_NO=B.SUP_PRD_NO FROM TF_POS B,TF_SQ C\n" +
                        "WHERE B.os_id='SO' AND (B.SUP_PRD_NO IS NOT NULL AND B.SUP_PRD_NO<>'') AND \n" +
                        "C.SO_NO=B.OS_NO AND C.EST_ITM=B.ITM";
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务003 30秒一次~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~执行update sql开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                Integer  i003= manyTabSerch.update003OfOnlineBug();
                System.out.println(str003);
                System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("执行条数="+i003+"条");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务003 30秒一次~~~~~~~~~~~~~~~~~~~~~~~~");
            } catch (Exception e) {
                e.printStackTrace();
            }


            try {
                String str004="update  tf_pos set wh='1000' where os_id='PO' AND wh='00000000'";
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务004 30秒一次~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~执行update sql开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                Integer  i004= manyTabSerch.update004OfOnlineBug();
                System.out.println(str004);
                System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("执行条数="+i004+"条");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务004 30秒一次~~~~~~~~~~~~~~~~~~~~~~~~");
            } catch (Exception e) {
                e.printStackTrace();
            }


            try {
                String str005="update  tf_pos set wh='2000' where os_id='PO' and os_no in \n" +
                        "(select os_no from mf_pos where cus_no='F031') and  wh<>'2000' \n";
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务005 30秒一次~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~执行update sql开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                Integer  i005= manyTabSerch.update005OfOnlineBug();
                System.out.println(str005);
                System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("执行条数="+i005+"条");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务005 30秒一次~~~~~~~~~~~~~~~~~~~~~~~~");
            } catch (Exception e) {
                e.printStackTrace();
            }


            try {
                String str006="UPDATE D SET D.SDDH=B.OS_NO FROM TF_POS A,TF_POS B,TF_SQ C,TF_POS_Z D \n" +
                        "WHERE A.os_id='PO' AND A.qt_no like 'SQ%'  AND \n" +
                        "B.os_id='SO'  AND A.SQ_NO=C.SQ_NO AND \n" +
                        "A.OTH_ITM=C.ITM AND C.SO_NO=B.OS_NO AND C.EST_ITM=B.ITM AND \n" +
                        "D.OS_NO=A.OS_NO AND (D.SDDH IS NULL OR D.SDDH='')";
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务006 30秒一次~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~执行update sql开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                Integer  i006= manyTabSerch.update006OfOnlineBug();
                System.out.println(str006);
                System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("执行条数="+i006+"条");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务006 30秒一次~~~~~~~~~~~~~~~~~~~~~~~~");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务007 30秒一次开始~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~执行update sql开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            try {
                System.out.println();
                System.out.println();
                String str007_1="UPDATE A SET A.CK_DD=B.FHRQ FROM MF_CK A,MF_CK_Z B\n" +
                        "WHERE A.CK_NO=B.CK_NO AND  B.FHRQ is NOT NULL AND A.SA_CLS_ID='F'";

                Integer  i007_1= manyTabSerch.update007_1_OfOnlineBug();
                System.out.println(str007_1);
                System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("执行条数="+i007_1+"条");
                System.out.println();
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                System.out.println();
                System.out.println();
                String str007_2="UPDATE A SET A.CK_DD=B.FHRQ FROM TF_CK A,MF_CK_Z B,MF_CK C\n" +
                        "WHERE A.CK_NO=B.CK_NO AND  B.FHRQ is NOT NULL AND A.CK_NO=C.CK_NO AND C.SA_CLS_ID='F'";

                Integer  i007_2= manyTabSerch.update007_2_OfOnlineBug();
                System.out.println(str007_2);
                System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("执行条数="+i007_2+"条");
                System.out.println();
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }


            try {
                System.out.println();
                System.out.println();
                String str007_3="UPDATE A SET A.CK_DD=Datename(year,GetDate())+'-'+Datename(month,GetDate())+'-'+Datename(day,GetDate())\n" +
                        "FROM MF_CK A,MF_CK_Z B\n" +
                        "WHERE A.CK_NO=B.CK_NO AND  B.FHRQ is NULL  AND A.SA_CLS_ID='F'";

                Integer  i007_3= manyTabSerch.update007_3_OfOnlineBug();
                System.out.println(str007_3);
                System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("执行条数="+i007_3+"条");
                System.out.println();
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }



            try {
                System.out.println();
                System.out.println();
                String str007_4="UPDATE A SET A.CK_DD=Datename(year,GetDate())+'-'+Datename(month,GetDate())+'-'+Datename(day,GetDate())\n" +
                        "FROM TF_CK A,MF_CK_Z B,MF_CK C\n" +
                        "WHERE A.CK_NO=B.CK_NO AND  B.FHRQ is NULL AND A.CK_NO=C.CK_NO AND C.SA_CLS_ID='F'";

                Integer  i007_4= manyTabSerch.update007_4_OfOnlineBug();
                System.out.println(str007_4);
                System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("执行条数="+i007_4+"条");
                System.out.println();
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }



            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务007 30秒一次结束~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务008 30秒一次开始~~~~~~~~~~~~~~~~~~~~~~~~");


            try {
                System.out.println();
                System.out.println();
                String str008_1="update a set a.wh=b.chkw from tf_ck a,mf_ck_z b\n" +
                        "where a.ck_no=b.ck_no and (b.CHKW is not NULL AND b.CHKW<>'')";

                Integer  i008_1= manyTabSerch.update008_1_OfOnlineBug();
                System.out.println(str008_1);
                System.out.println("~~~~~~~~~~~~~~~~~~~~执行update sql结束~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("执行条数="+i008_1+"条");
                System.out.println();
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~定时任务008 30秒一次结束~~~~~~~~~~~~~~~~~~~~~~~~");


            System.out.println("==========================定时任务A 30秒一次结束======================");
        }

}
