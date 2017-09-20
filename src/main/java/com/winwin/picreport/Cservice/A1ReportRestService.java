package com.winwin.picreport.Cservice;
import com.winwin.picreport.Ddao.reportxmlmapper.MfPosMapper;
import com.winwin.picreport.Ddao.reportxmlmapper.PrdtMapper;
import com.winwin.picreport.Ddao.reportxmlmapper.TfPosMapper;
import com.winwin.picreport.Ddao.reportxmlmapper.TfPosZMapper;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.TimeStampToDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Service("a1")

public class A1ReportRestService {
    @Autowired
    private TfPosMapper tfPosMapper;
    @Autowired
    private MfPosMapper mfPosMapper;
     @Autowired
     private TfPosZMapper tfPosZMapper;
    @Autowired
    private PrdtMapper prdtMapper;
/////////////////////////////////////////////////////////////////////
   /* public void saveShouDingDanFromExcelToTable(List<ShouDingDanFromExcel> shouDingDanFromExcels) {
        for(ShouDingDanFromExcel s:shouDingDanFromExcels){
            boolean a=(s==null);
            boolean b = "".equals(s.getOsNo());
            if((!a)&&(!b)){
                saveOneShouDingDanFromExcelToTable(s);
            }

        }

    }*/
//////////////////////////////////////////////////////////////////////////
    @Transactional
    public void saveOneShouDingDanFromExcelToTable(ShouDingDanFromExcel s){
        MfPosWithBLOBs m=new MfPosWithBLOBs();
        TfPosWithBLOBs t=new TfPosWithBLOBs();
        TfPosZ tz=new TfPosZ();
        PrdtWithBLOBs pdt=new PrdtWithBLOBs();

        String osDd=s.getOsDd();
        String estDd=s.getEstDd();
        System.out.println("没有转换前");
        System.out.println("===osDd===="+osDd+"=======estDd===="+estDd+"=============");
        System.out.println("没有转换前");
        if(osDd==null||"".equals(osDd)){
//            osDd="32503564800000";//2999-12-31
            osDd=null;
        }
        if(estDd==null||"".equals(estDd)){
            estDd=null;//2999-12-31
//            estDd="32503564800000";
        }
        //////////////////////////////////////
        m.setOsNo(s.getOsNo());
        m.setRem(s.getRemhead());
        m.setCurId(s.getCurId());
        m.setExcRto(new BigDecimal(s.getExcRto()));
        m.setCusNo(s.getCusNo());
        m.setTaxId(s.getTaxId());
        m.setCusOsNo(s.getCusOsNo());
        m.setOsId("SO");
        if(osDd==null) {
            m.setOsDd(null);
        }else{
            m.setOsDd(TimeStampToDate.timeStampToDate(Long.parseLong(osDd)));
        }


///////////////////////
        t.setOsNo(s.getOsNo());
        t.setOsId("SO");
        t.setPrdNo(s.getPrdNo());
        t.setPrdName(s.getPrdName());
        t.setQty(new BigDecimal(s.getQty()));
//        t.setUnit(s.getUnit());
        t.setUnit("1");
        t.setAmtn(new BigDecimal(s.getAmtn()));
        t.setTax(new BigDecimal(s.getTax()));
        t.setAmt(new BigDecimal(s.getAmt()));
        t.setTaxRto(new BigDecimal(s.getTaxRto()));
        t.setRem(s.getRemBody());
        t.setUp(new BigDecimal(s.getUp()));
        if(estDd==null){
            t.setEstDd(null);
        }else{
            t.setEstDd(TimeStampToDate.timeStampToDate(Long.parseLong(estDd)));
        }

        if(osDd==null){
            t.setOsDd(null);
        }else{
            t.setOsDd(TimeStampToDate.timeStampToDate(Long.parseLong(osDd)));
        }

        //t.setItm();
 ////////////////////////////////////////////////
        tz.setOsNo(s.getOsNo());
        tz.setSapwlm(s.getSapwlm());
        tz.setSaphh(s.getSaphh());
        tz.setSapph(s.getSapph());
        tz.setCfdm(s.getCfdm());
        tz.setOsId("SO");
        //tz.setItm();
////////////////////////////////////////////////
        pdt.setPrdNo(s.getPrdNo());
        pdt.setName(s.getPrdName());
////////////////////////////////////////////////
        System.out.println("转换后");
        System.out.println("===osDd===="+t.getOsDd()+"=======estDd===="+t.getEstDd()+"=============");
        System.out.println("转换后");

        saveOneShouDingDanFromExcelToTableInsert(m, t, tz,pdt);
///////////////////////////////////////////
    }
////////////////////////////////////////////////////////////////////////////////////////////////
@Transactional
    public void saveOneShouDingDanFromExcelToTableInsert(MfPosWithBLOBs m,TfPosWithBLOBs t,TfPosZ tz,PrdtWithBLOBs pdt){
        //注册商品到商品库
            PrdtExample prdtExample=new PrdtExample();
            prdtExample.createCriteria().andPrdNoEqualTo(pdt.getPrdNo());
            long l2 = prdtMapper.countByExample(prdtExample);
            if(l2==0){
                prdtMapper.insert(pdt);
            }
        //单独分出来是为了只在下面的几个插入使用事务
        saveChuLePrdtDe(m,t,tz);

    }
//////////////////////////////////////////////////////////////////////////////////
@Transactional
    public void saveChuLePrdtDe(MfPosWithBLOBs m,TfPosWithBLOBs t,TfPosZ tz){
            MfPosExample mfe=new MfPosExample();
            mfe.createCriteria().andOsNoEqualTo(m.getOsNo());
            long l1 = mfPosMapper.countByExample(mfe);
            if(l1==0){
                mfPosMapper.insert(m);
            }
            //测试事务
//            System.out.println(1/0);
            TfPosExample tfe=new TfPosExample();
            tfe.createCriteria().andOsNoEqualTo(m.getOsNo());
            long l = tfPosMapper.countByExample(tfe);
            t.setItm(new Long(l).intValue()+1);
            tfPosMapper.insert(t);


            TfPosZExample tfze=new TfPosZExample();
            tfze.createCriteria().andOsNoEqualTo(m.getOsNo());
            long ll = tfPosZMapper.countByExample(tfze);
            tz.setItm(new Long(ll).intValue()+1);
            tfPosZMapper.insert(tz);


    }
//////////////////////////////////////////////////////////////////////////////////
}
