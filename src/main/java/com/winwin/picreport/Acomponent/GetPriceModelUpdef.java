package com.winwin.picreport.Acomponent;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.UpDefMy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetPriceModelUpdef {
    @Autowired
   private Cnst cnst;
    public void GetPriceModel(PrdtSamp prdtSampX) {
        String prdNo=prdtSampX.getPrdNo();
        List<UpDefMy> upDefMyListSale= cnst.a001TongYongMapper.getUpDefMy(prdNo,Cnst.salPriceId);
        List<UpDefMy>upDefMyListByer=cnst.a001TongYongMapper.getUpDefMy(prdNo,Cnst.buyPriceId);
        prdtSampX.setUpDefMyListSale(upDefMyListSale);
        prdtSampX.setUpDefMyListByer(upDefMyListByer);
    }
}
