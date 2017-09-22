package com.winwin.picreport.Cservice;
import com.winwin.picreport.Ddao.reportxmlmapper.*;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.Msg;
import com.winwin.picreport.Futils.TimeStampToDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@Service("a1")
public class A1ReportRestService {
    @Autowired
    BeforeSamePrdnoMergeMapper beforeSamePrdnoMergeMapper;
    @Autowired
    private TfPosMapper tfPosMapper;
    @Autowired
    private MfPosMapper mfPosMapper;
     @Autowired
     private TfPosZMapper tfPosZMapper;
    @Autowired
    private PrdtMapper prdtMapper;
////////////////////////受订单号成功后是SO/////////////////////////////////////////////
///////////////////////注意事务要加在所有调用的方法上面,如果方法套方法,就必须都加事务///////////////////////////////////////////////////
    @Transactional
    public void saveYiPiDingDanHaoXiangTongDe(Map<String, List> listMap, List<Msg>listmsg){
//        System.out.println(list3);
        //循环插入所有
        //用list3来装入合并同一货号的几个东西后的ShouDingDanFromExcel
        List<ShouDingDanFromExcel> list3 =listMap.get("samePrdNoMeraged");
        //收集同一货号的list       samePrdNoList
        List<List<ShouDingDanFromExcel>>samePrdNoList = listMap.get("samePrdNoList");
        //插入sunlike主表
        for(ShouDingDanFromExcel shouDingDanFromExcel:list3){
                    saveOneShouDingDanFromExcelToTable(shouDingDanFromExcel,listmsg);
        }
        //插入自建表before_same_prdNo_merge//这个表是为了记录合并prdNo之前的saphh(sap行号)用的
        for(List<ShouDingDanFromExcel> listx:samePrdNoList){
            String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS").format(new Date());
            String uuid = UUID.randomUUID().toString();
            for(ShouDingDanFromExcel shouDingDanFromExcel:listx){
                BeforeSamePrdnoMerge b=new BeforeSamePrdnoMerge();
                b.setOsno(shouDingDanFromExcel.getOsNo());
                b.setPrdno(shouDingDanFromExcel.getPrdNo());
                b.setQty(new BigDecimal(shouDingDanFromExcel.getQty()));
                b.setSaphh(shouDingDanFromExcel.getSaphh());
                b.setTimesamebatch(dateStr);
                b.setUuid(uuid);
                beforeSamePrdnoMergeMapper.insert(b);
            }
        }
    }

    @Transactional
    public void saveOneShouDingDanFromExcelToTable(ShouDingDanFromExcel s,List<Msg>listmsg){
        MfPosWithBLOBs m=new MfPosWithBLOBs();
        TfPosWithBLOBs t=new TfPosWithBLOBs();
        TfPosZ tz=new TfPosZ();
        PrdtWithBLOBs pdt=new PrdtWithBLOBs();

        String osDd=s.getOsDd();
        String estDd=s.getEstDd();
       /* System.out.println("没有转换前");
        System.out.println("===osDd===="+osDd+"=======estDd===="+estDd+"=============");
        System.out.println("没有转换前");*/
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
        t.setWh("0000");
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
       /* System.out.println("转换后");
        System.out.println("===osDd===="+t.getOsDd()+"=======estDd===="+t.getEstDd()+"=============");
        System.out.println("转换后");*/

        saveOneShouDingDanFromExcelToTableInsert(m, t, tz,pdt,listmsg);
///////////////////////////////////////////
    }
////////////////////////////////////////////////////////////////////////////////////////////////
@Transactional
    public void saveOneShouDingDanFromExcelToTableInsert(MfPosWithBLOBs m, TfPosWithBLOBs t, TfPosZ tz, PrdtWithBLOBs pdt,List<Msg>listmsg){
    try {
        //注册商品到商品库//不能再自动注册了,老郑说了,自动注册的不行,因为客户可能手动输入输错了,所以,我们就不再自动插入prdt表来注册商品
           /* PrdtExample prdtExample=new PrdtExample();
            prdtExample.createCriteria().andPrdNoEqualTo(pdt.getPrdNo());
            long l2 = prdtMapper.countByExample(prdtExample);
            if(l2==0){
                prdtMapper.insert(pdt);
            }*/

        PrdtExample prdtExample=new PrdtExample();
        prdtExample.createCriteria().andPrdNoEqualTo(pdt.getPrdNo());
        long l2 = prdtMapper.countByExample(prdtExample);
        //此时数据库prdt表没有该条记录,我们下面不再插入其他记录,而是告诉客户,该记录在数据库prdt表不存在,请自行注册该商品到数据库,
        //这也是老郑的要求
        Msg msg=new Msg();
        if(l2==0){
            msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(t.getOsNo());
            msg.setNotExsitThisPrdtNoInPrdtTab(pdt.getPrdNo());
            msg.setMsg("--------------该订单号osNo="+t.getOsNo()+"这批一个也没有插入,插入数据的时候遇到--商品(prdtNo="+pdt.getPrdNo()+")--没有在商品表Prdt表里面,导致无法插入数据,--------");
            listmsg.add(msg);
           //不再进行下面步骤
            throw new RuntimeException(msg.getMsg());
        }else{
            //单独分出来是为了只在下面的几个插入使用事务
            saveChuLePrdtDe(m,t,tz,listmsg);
        }
    } catch (RuntimeException e) {
        e.printStackTrace();
        throw new RuntimeException();
    }
}
//////////////////////////////////////////////////////////////////////////////////
@Transactional
    public void saveChuLePrdtDe(MfPosWithBLOBs m,TfPosWithBLOBs t,TfPosZ tz,List<Msg>listmsg){
    try {
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
        t.setEstItm(t.getItm());
        tfPosMapper.insert(t);


        TfPosZExample tfze=new TfPosZExample();
        tfze.createCriteria().andOsNoEqualTo(m.getOsNo());
        long ll = tfPosZMapper.countByExample(tfze);
        tz.setItm(new Long(ll).intValue()+1);
        tfPosZMapper.insert(tz);
    } catch (Exception e) {
        Msg msg=new Msg();
        msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(m.getOsNo());
        msg.setMsg("-----订单号osNo为--osNo=“"+m.getOsNo()+"”--的这批数据一个也没有插入--因为在插入时发生了不可预料的异常----");
        listmsg.add(msg);
        e.printStackTrace();
        throw new RuntimeException(e);
    }


}
//////////////////////////////////////////////////////////////////////////////////
}
