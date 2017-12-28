package com.winwin.picreport.Acomponent;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSamp0;
import com.winwin.picreport.Edto.UpDefMy;
import com.winwin.picreport.Edto.UpDefMy01;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Component
public class GetPriceModelUpdef {
    @Autowired
   private Cnst cnst;
    public void GetPriceModel(PrdtSamp0 prdtSampX) {
        String prdNo=prdtSampX.getPrdNo();
        List<UpDefMy01> upDefMyListSale= cnst.a001TongYongMapper.getUpDefMy(prdNo,Cnst.salPriceId);
        List<UpDefMy01>upDefMyListByer=cnst.a001TongYongMapper.getUpDefMy(prdNo,Cnst.buyPriceId);
        if(NotEmpty.empty(upDefMyListSale)){
            //为了给徐勇做实验用
            upDefMyListSale.addAll(p.gp().setArl(UpDefMy.builder()
                            .curId(Cnst.testDataCurrentCode)
                            .curName(Cnst.testDataCurrentName)
                            .qty(new BigDecimal(0))
                            .sDd(p.tod(p.unixBir,p.d3))
                            .unit(Cnst.testDataUnit)
                            .up(new BigDecimal(0))
                            .build()).getArl());
        }
        if(NotEmpty.empty(upDefMyListByer)){
            //为了给徐勇做实验用
            upDefMyListByer.addAll(p.gp().setArl(UpDefMy.builder()
                    .curId(Cnst.testDataCurrentCode)
                    .curName(Cnst.testDataCurrentName)
                    .qty(new BigDecimal(0))
                    .sDd(p.tod(p.unixBir,p.d3))
                    .unit(Cnst.testDataUnit)
                    .up(new BigDecimal(0))
                    .build()).getArl());
        }
        prdtSampX.setUpDefMyListSale(upDefMyListSale);
        prdtSampX.setUpDefMyListByer(upDefMyListByer);
    }
}
