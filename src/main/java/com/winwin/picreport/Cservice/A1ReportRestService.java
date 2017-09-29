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
    SapsoMapper sapsoMapper;
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
        //插入自建表before_same_prdNo_merge(后来表名字改成sapsa)//这个表是为了记录合并prdNo之前的saphh(sap行号)用的
        for(List<ShouDingDanFromExcel> listx:samePrdNoList){
            String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS").format(new Date());
            String uuid = UUID.randomUUID().toString();
            for(ShouDingDanFromExcel shouDingDanFromExcel:listx){
                Sapso b=new Sapso();
                b.setOsno(shouDingDanFromExcel.getOsNo());
                b.setPrdno(shouDingDanFromExcel.getPrdNo());
                b.setQty(new BigDecimal(shouDingDanFromExcel.getQty()));
                b.setCaigouno(shouDingDanFromExcel.getCaiGouNo());
                b.setEbno(shouDingDanFromExcel.getEbNo());
                b.setMaitouno(shouDingDanFromExcel.getMaiTouNo());
                b.setSaphh(shouDingDanFromExcel.getSaphh());
                b.setSapph(shouDingDanFromExcel.getSapph());
                b.setSapwlm(shouDingDanFromExcel.getSapwlm());

                b.setTimesamebatch(dateStr);
                b.setUuid(uuid);
                sapsoMapper.insert(b);
            }
        }
    }

    @Transactional
    public void saveOneShouDingDanFromExcelToTable(ShouDingDanFromExcel s,List<Msg>listmsg){
        Msg msg=new Msg();
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
        //老郑说了,这个客户单号也用osNo填充
        m.setCusNo(s.getOsNo());
        m.setTaxId(s.getTaxId());
        m.setCusOsNo(s.getCusOsNo());
        m.setOsId("SO");
        //下面2条是老郑在20170929让我加上的
        m.setUsr("ADMIN");
        m.setChkMan("ADMIN");
        if(osDd==null) {
            m.setOsDd(null);
        }else{
            m.setOsDd(TimeStampToDate.timeStampToDate(Long.parseLong(osDd)));
        }


///////////////////////
        t.setOsNo(s.getOsNo());
        //之所以cusosno也传入osno,是因为老郑20170929让这么做的
        t.setCusOsNo(s.getOsNo());
        t.setOsId("SO");
        if(s.getPrdNo()==null||"".equals(s.getPrdNo())){
            msg.setMsg("订单号osNo为:~~~~"+s.getOsNo()+"~~~~的这一批货品里面有货号为空,所以整个该批单号不能插入！");
            msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(s.getOsNo());
            listmsg.add(msg);
            //这个功能是迎合老郑说的:货品代号（品号） PRDT.PRD_NO里不存在提示整单不能导入
            throw new RuntimeException("订单号为:~~~~"+s.getOsNo()+"~~~~的这一批货品里面有货号为空,所以整个该单号不能插入！");
        }
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
        //如果单价有问题,就要抛出异常
        if("".equals(s.getUp())||"0".equals(s.getUp())){
            msg.setMsg("订单号osNo="+s.getOsNo()+"的单号因为某条数据中的“单价”(Up)有问题,导致该订单号的所有记录都未能成功录入！");
            msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(s.getOsNo());
            listmsg.add(msg);
            throw new RuntimeException("订单号osNo="+s.getOsNo()+"的单号因为某条数据中的“单价”(Up)有问题,导致该订单号的所有记录都未能成功录入！");
        }
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
//        tz.setSaphh(s.getSaphh());//20170929老郑说这个不用写入值了
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
        prdtExample.createCriteria().andPrdNoEqualTo(pdt.getPrdNo()).andNameEqualTo(pdt.getName());
        long l2 = prdtMapper.countByExample(prdtExample);
        //此时数据库prdt表没有该条记录,我们下面不再插入其他记录,而是告诉客户,该记录在数据库prdt表不存在,请自行注册该商品到数据库,
        //这也是老郑的要求
        Msg msg=new Msg();
        if(l2==0){
            msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(t.getOsNo());
            msg.setNotExsitThisPrdtNoInPrdtTab(pdt.getPrdNo());
            msg.setMsg("--------------该订单号osNo="+t.getOsNo()+"这批一个也没有插入,插入数据的时候遇到--商品(prdtNo="+pdt.getPrdNo()+")--没有在商品表Prdt表里面或者 商品名="+pdt.getName()+"不在商品表中,导致无法插入数据,--------");
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
