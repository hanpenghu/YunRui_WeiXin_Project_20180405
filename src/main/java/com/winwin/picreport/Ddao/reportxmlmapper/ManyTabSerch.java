package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.ChaXunTiaoJian;
import com.winwin.picreport.Edto.KeHu;
import com.winwin.picreport.Edto.MfPosWithBLOBs;
import com.winwin.picreport.Edto.SalePrdDetailTab1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManyTabSerch {
        List<SalePrdDetailTab1> salePrdDetailTab1(@Param("chaXunTiaoJian") ChaXunTiaoJian chaXunTiaoJian,@Param("cus_no")String cus_no);//销货明细表

        List<KeHu> getAllCustOf_obj_id_1_that_KeHuNotChangShang();

        Integer updateMfPosNullToNothing001(@Param("mfPosWithBLOBs") MfPosWithBLOBs mfPosWithBLOBs);
        Integer updateTfPosNullToNothing001(@Param("mfPosWithBLOBs") MfPosWithBLOBs mfPosWithBLOBs);


}
