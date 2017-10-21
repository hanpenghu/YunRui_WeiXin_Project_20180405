package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.ChaXunTiaoJian;
import com.winwin.picreport.Edto.KeHu;
import com.winwin.picreport.Edto.MfPosWithBLOBs;
import com.winwin.picreport.Edto.SalePrdDetailTab1;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ManyTabSerch {
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

        @Update("UPDATE  mf_pos set pay_rem='结帐期:2017-11-01;票据到期日:2017-12-02' ,PAY_DD='2017-11-01 00:00:00.000',\n" +
                "CHK_DD='2017-11-01 00:00:00.000',INT_DAYs=30 where usr='ADMIN' and chk_man='ADMIN' AND os_dd>='2017-10-1' and (INT_DAYS='' or INT_DAYS IS NULL)")
    Integer update008_1_OfOnlineBug();
}
