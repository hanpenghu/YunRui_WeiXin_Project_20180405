package com.winwin.picreport.Acomponent;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Edto.PrdtSamp0;
import com.winwin.picreport.Edto.UpDefMy01;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.List;
@Component
public class GetPriceModelUpdef {
    @Autowired
   private Cnst cnst;
    public void GetPriceModel(PrdtSamp0 prdtSampX) {
        String prdNo=prdtSampX.getPrdNo();
        //动态sql,如果第二个参数是null的话就选出来所有的
        List<UpDefMy01> upDefMyList= cnst.a001TongYongMapper.getUpDefMy(prdNo,null);
        ////动态sql,如果第二个参数不是null的话就选出来对应的priceId
        List<UpDefMy01> upDefMyListBuy= cnst.a001TongYongMapper.getUpDefMy(prdNo,Cnst.buyPriceId);
        if(NotEmpty.empty(upDefMyList)){
            UpDefMy01 upDefMy01=new UpDefMy01();
            upDefMy01.setCurId(Cnst.testDataCurrentCode);
            upDefMy01.setCurName(Cnst.testDataCurrentName);
            upDefMy01.setQty(new BigDecimal(1111110));
            upDefMy01.setSDd(p.tod(p.unixBir,p.d3));
            upDefMy01.setUp(new BigDecimal(0));
            //为了给徐勇做实验用
            upDefMyList.addAll(p.gp().setArl(upDefMy01).getArl());
        }

        if(NotEmpty.empty(upDefMyListBuy)){
            UpDefMy01 upDefMy01=new UpDefMy01();
            upDefMy01.setCurId(Cnst.testDataCurrentCode);
            upDefMy01.setCurName(Cnst.testDataCurrentName);
            upDefMy01.setQty(new BigDecimal(1110));
            upDefMy01.setSDd(p.tod(p.unixBir,p.d3));
            upDefMy01.setUp(new BigDecimal(99));
            //为了给徐勇做实验用
            upDefMyList.addAll(p.gp().setArl(upDefMy01).getArl());
        }

        prdtSampX.setUpDefMyList(upDefMyList);
        prdtSampX.setUpDefMyListBuy(upDefMyListBuy);
    }
}
