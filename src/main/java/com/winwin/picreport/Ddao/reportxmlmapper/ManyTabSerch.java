package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ManyTabSerch {


        //得到数据库当前时间
        @Select("SELECT GETDATE()")
        java.util.Date getDate();


        List<SalePrdDetailTab1> salePrdDetailTab1(@Param("chaXunTiaoJian") ChaXunTiaoJian chaXunTiaoJian,@Param("cus_no")String cus_no);//销货明细表

        List<KeHu> getAllCustOf_obj_id_1_that_KeHuNotChangShang();

        Integer updateMfPosNullToNothing001(@Param("mfPosWithBLOBs") MfPosWithBLOBs mfPosWithBLOBs);
        Integer updateTfPosNullToNothing001(@Param("mfPosWithBLOBs") MfPosWithBLOBs mfPosWithBLOBs);


        Integer update001OfOnlineBug();

        Integer update002OfOnlineBug();

        Integer update003OfOnlineBug();

        Integer update004OfOnlineBug();

        Integer update005OfOnlineBug();

        Integer update006OfOnlineBug();
        Integer update007_1_OfOnlineBug();
        Integer update007_2_OfOnlineBug();
        Integer update007_3_OfOnlineBug();
        Integer update007_4_OfOnlineBug();

        @Update("update a set a.wh=b.chkw from tf_ck a,mf_ck_z b\n" +
                "where a.ck_no=b.ck_no and (b.CHKW is not NULL AND b.CHKW<>'')")
        Integer update008_1_OfOnlineBug();







//        @Update("UPDATE A SET A.REM=B.SO_NO FROM MF_SQ A,TF_SQ B \n" +
//                "WHERE A.CLS_ID='F' AND A.SQ_NO=B.SQ_NO AND B.ITM=1")
//        Integer update009_1OfOnlineBug();
//
//        @Update("UPDATE B SET B.SO_NO=A.REM FROM MF_SQ A,TF_SQ B \n" +
//                "WHERE A.CLS_ID='F' AND A.SQ_NO=B.SQ_NO AND (B.SO_NO is NULL or B.SO_NO='')")
//        Integer update009_2OfOnlineBug();
//
//        @Update("UPDATE B SET B.est_dd=A.est_dd FROM MF_SQ A,TF_SQ B \n" +
//                "WHERE A.SQ_NO=B.SQ_NO AND (B.EST_DD IS NULL)")
//        Integer update009_3OfOnlineBug();




        @Update("UPDATE  A SET A.REM=B.SO_NO FROM MF_SQ A,TF_SQ B \n" +
                "WHERE A.CLS_ID='F' AND A.SQ_NO=B.SQ_NO AND B.ITM=1 AND (A.REM IS NULL or A.REM like '')")
        Integer update009_1OfOnlineBug();


        @Update("UPDATE  B SET B.SO_NO=A.REM FROM MF_SQ A,TF_SQ B \n" +
                "WHERE A.CLS_ID='F' AND A.SQ_NO=B.SQ_NO AND (B.SO_NO is NULL or B.SO_NO='')")
        Integer update009_2OfOnlineBug();

        @Update("UPDATE  B SET B.est_dd=A.est_dd FROM MF_SQ A,TF_SQ B \n" +
                "WHERE A.SQ_NO=B.SQ_NO AND (B.EST_DD IS NULL)")
        Integer update009_3OfOnlineBug();








        @Select("select osno,prdno,saphh,qty,sapph,caigouno,luohao,ganghao,realwidth,reallength,chengFenDaiMa " +
                "from sapso where RTRIM(LTRIM(isnull(chengFenDaiMa,'')))=#{chengFenDaiMa} and RTRIM(LTRIM(isnull(osno,'')))=#{cusOsNo} and  RTRIM(LTRIM(isnull(prdno,'')))=#{prdNo}")
        List<Sapso> select001( @Param("cusOsNo") String cusOsNo, @Param("prdNo") String prdNo,@Param("chengFenDaiMa") String chengFenDaiMa);


        @Delete("delete  from tf_pos_z where os_no not in (select os_no from mf_pos)")
        Integer update010_1OfOnlineBug();

        @Delete("delete  from mf_pos_z where os_no not in (select os_no from mf_pos)")
        Integer update010_2OfOnlineBug();

        @Select("")
        List<YeWuYuan> getAllYeWuYuan();
}
