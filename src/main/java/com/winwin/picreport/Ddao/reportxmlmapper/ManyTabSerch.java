package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.KeHu;
import com.winwin.picreport.Edto.SalePrdDetailTab1;

import java.util.List;

public interface ManyTabSerch {
        List<SalePrdDetailTab1> salePrdDetailTab1();//销货明细表

        List<KeHu> getAllCustOf_obj_id_1_that_KeHuNotChangShang();
}
