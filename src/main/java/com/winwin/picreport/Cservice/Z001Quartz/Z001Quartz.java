package com.winwin.picreport.Cservice.Z001Quartz;


import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Futils.p;
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
    private Cnst cnst;

    public final static long thirty_Second =  30 * 1000;
    public final static long two_Second =  2 * 1000;


    @Scheduled(fixedDelay=thirty_Second)//执行完毕后1分钟再执行
    public void fixedDelayJob(){
        this.onlineBugXiuFuSql();
    }

    @Scheduled(fixedDelay=two_Second)//执行完毕后1分钟再执行
    public void fixedDelayJob001(){
        this.onlineBugXiuFuSql001();

        try {
//            --013处理外币冲全掉了，人民币差几分的。以下按次序2秒执行一次
            cnst.manyTabSerch.chuLiWaiBiQuanChongDiao();
        } catch (Exception e) {
            p.p("-------------------------------------------------------");
            p.p("013处理外币冲全掉了，人民币差几分的2秒执行一次《异常》");
            p.p("-------------------------------------------------------");
        }

    }

    private void onlineBugXiuFuSql001() {


        try {
            cnst.manyTabSerch.update011_1_OfOnlineBug();

        } catch (Exception e) {
            p.p("011执行异常");
        }

        try {
            cnst.manyTabSerch.update009_1OfOnlineBug();
        } catch (Exception e) {
            p.p("009-1执行异常");
        }


        try {
            cnst.manyTabSerch.update009_2OfOnlineBug();
        } catch (Exception e) {
            p.p("009-2执行异常");
        }


        try {
            cnst.manyTabSerch.update009_3OfOnlineBug();
        } catch (Exception e) {
            p.p("009-3执行异常");
        }

        try {
            cnst.manyTabSerch.update009_4OfOnlineBug();
        } catch (Exception e) {
                p.p("定时任务009-4出现异常！");
        }


        //2018_1_19   weekday(5)   9:37:19添加  2秒执行一次
        try {
            //更新采购单表身客户内部单号 2秒执行一次
            cnst.manyTabSerch.gengXin_CaiGouDan_BiaoShen_KeHu_NeiBu_DanHao_OfOnlineBug();
        } catch (Exception e) {
            p.p("--012更新采购单表身客户内部单号 2秒执行一次 异常");
        }



    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        public void onlineBugXiuFuSql(){
            try {
                cnst.manyTabSerch.update001OfOnlineBug();
            } catch (Exception e) {
                p.p("001执行异常");
            }


            try {
               cnst.manyTabSerch.update002OfOnlineBug();
            } catch (Exception e) {
                p.p("002执行异常");
            }


            try {
                cnst.manyTabSerch.update003OfOnlineBug();
            } catch (Exception e) {
                p.p("003执行异常");
            }


            try {
                cnst.manyTabSerch.update004OfOnlineBug();
            } catch (Exception e) {
                p.p("004执行异常");
            }


            try {
                 cnst.manyTabSerch.update005OfOnlineBug();
            } catch (Exception e) {
                p.p("005执行异常");
            }


            try {
                cnst.manyTabSerch.update006OfOnlineBug();
            } catch (Exception e) {
                p.p("006执行异常");
            }

            try {

                 cnst.manyTabSerch.update007_1_OfOnlineBug();
            } catch (Exception e) {
                p.p("007-1执行异常");
            }

            try {
                cnst.manyTabSerch.update007_2_OfOnlineBug();
            } catch (Exception e) {
                p.p("007-2执行异常");
            }


            try {

                cnst.manyTabSerch.update007_3_OfOnlineBug();
            } catch (Exception e) {
                p.p("007-3执行异常");
            }



            try {
               cnst.manyTabSerch.update007_4_OfOnlineBug();
            } catch (Exception e) {
                p.p("007-4执行异常");
            }






            try {
                cnst.manyTabSerch.update010_1OfOnlineBug();
            } catch (Exception e) {
                p.p("010-1执行异常");
            }


            try {
                cnst.manyTabSerch.update010_2OfOnlineBug();
            } catch (Exception e) {
                p.p("010-2执行异常");
            }

        }

}
