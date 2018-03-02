package com.winwin.picreport.Cservice;
import com.alibaba.fastjson.JSON;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.OrderPreCnst;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.AmtAndAmtnAndTaxChongXinSuan;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.TimeStampToDate;
import com.winwin.picreport.Futils.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;


/**
 *非sap销售订单导入
 * */
@Service
@Transactional
public class D3SaleOrderUpLoadFromExcelService {
    @Autowired
    private Cnst cnst;
    @Transactional
    public void saveYiPiDingDanHaoXiangTongDe(Map<String, List> listMap, List<Msg>listmsg){
//        System.out.println(list3);
        //循环插入所有
        //用list3来装入合并同一货号的几个东西后的ShouDingDanFromExcel
        List<ShouDingDanFromExcel> list3 =listMap.get("samePrdNoMeraged");
        //收集同一货号的list       samePrdNoList
//        List<List<ShouDingDanFromExcel>>samePrdNoList = listMap.get("samePrdNoList");
        //插入sunlike主表
//        for(ShouDingDanFromExcel shouDingDanFromExcel:list3){
//            AmtAndAmtnAndTaxChongXinSuan.g(shouDingDanFromExcel,listmsg);//在类内部进行判断计算各种金额
//            this.saveOneShouDingDanFromExcelToTable(shouDingDanFromExcel,listmsg);
//        }



        //插入sunlike主表

        for(int iii=0;iii<list3.size();iii++){
            ShouDingDanFromExcel shouDingDanFromExcel=list3.get(iii);
            AmtAndAmtnAndTaxChongXinSuan.g(shouDingDanFromExcel, listmsg);//在类内部进行判断计算各种金额
            //同一个iii下面必须一次性插入tf_pos 和tf_pos_z和sapso
            synchronized (this) {
                this.saveOneShouDingDanFromExcelToTable
                        (shouDingDanFromExcel, listmsg,iii);
            }
        }

    }

    @Transactional
    public void saveOneShouDingDanFromExcelToTable(ShouDingDanFromExcel s,List<Msg>listmsg,int iii){

        /**
         *判断字段长度开始,
         * */

        /**
         *判断字段长度结束,
         * */

        this.prdNoGet(s);
        Msg msg=new Msg();
        MfPosWithBLOBs m=new MfPosWithBLOBs();
        TfPosWithBLOBs t=new TfPosWithBLOBs();
        TfPosZ tz=new TfPosZ();
        PrdtWithBLOBs pdt=new PrdtWithBLOBs();

        String osDd=s.getOsDd();
        String estDd=s.getEstDd();

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //在使用货号之前如果是空的,先流水一下货号
        if (p.empty(s.getPrdNo())) {
            String prdNo=cnst.a001TongYongMapper.getPrdNoUsePrdName(s.getPrdName());
            if(p.empty(prdNo)){
                msg.setMsg("订单号osNo为:~~~~" + s.getOsNo() +
                        "~~~~的这一批货品里面有货号为空,根据"+s.getPrdName()
                        +"在数据库也找不到货号,所以整个该批单号不能插入！");
                listmsg.add(msg);
                throw new RuntimeException(msg.getMsg());
            }else{
                s.setPrdNo(prdNo);
            }
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



       /* System.out.println("没有转换前");
        System.out.println("===osDd===="+osDd+"=======estDd===="+estDd+"=============");
        System.out.println("没有转换前");*/
        if(p.empty(osDd)){
//            osDd="32503564800000";//2999-12-31
            osDd=null;
        }
        if(p.empty(estDd)){
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
        //老郑说了,这个客户单号也用osNo填充
        m.setCusOsNo(s.getOsNo());
        m.setOsId(OrderPreCnst.SO);
        //下面2条是老郑在20170929让我加上的
        //是把界面选的存的代号sal_no，同时写进 mf_pos.usr , mf_pos.chk_man两个字段
        if("".equals(s.getSalNo())){
            m.setUsr("ADMIN");
            m.setChkMan("ADMIN");
        }else{
            m.setUsr(s.getSalNo());
            m.setChkMan(s.getSalNo());
        }
        //后来加的4个,为了避免是null
        m.setClsId("F");
        m.setPayMth("1");
        m.setPayDays((short) 1);
        m.setChkDays((short) 30);

        if(p.empty(osDd)) {
            m.setOsDd(null);
        }else{
            try {
                m.setOsDd(TimeStampToDate.timeStampToDate(Long.parseLong(osDd)));
            } catch (Exception e) {
                msg.setMsg("销售订单非sap导入的时候《订单日期》不是有效的时间戳osDd:《"+osDd+"》");
                listmsg.add(msg);
                throw new RuntimeException(msg.getMsg());

            }
        }
        //下面2017-10-24老郑让我加的
        m.setZhangId("3");
        m.setPayRem("结帐期:2017-11-01;票据到期日:2017-12-02");
        try { m.setPayDd(new SimpleDateFormat("yyyy-MM-dd").parse("2017-11-01"));} catch (ParseException e){}
        m.setChkDd(cnst.manyTabSerch.getDate());
        m.setIntDays((short)30);
        //2017-11-13老郑让加上
        m.setUseDep("2000");
        m.setSendMth("1");
        m.setPoDep("2000");
///////////////////////
        t.setOsNo(s.getOsNo());
        //之所以cusosno也传入osno,是因为老郑20170929让这么做的
        t.setCusOsNo(s.getOsNo());
        t.setOsId("SO");
        if(p.empty(s.getPrdNo())){
            msg.setMsg("订单号osNo为:~~~~"+s.getOsNo()+"~~~~的这一批货品里面有货号为空,所以整个该批单号不能插入！");
            msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(s.getOsNo());
            listmsg.add(msg);
            //这个功能是迎合老郑说的:货品代号（品号） PRDT.PRD_NO里不存在提示整单不能导入
            throw new RuntimeException(msg.getMsg());
        }
        t.setPrdNo(s.getPrdNo());
        t.setPrdName(s.getPrdName());
        t.setQty(new BigDecimal(s.getQty()));
//        t.setUnit(s.getUnit());
        t.setUnit("1");
        try {
            t.setAmtn(new BigDecimal(s.getAmtn().trim()));
        } catch (Exception e) {
            String ss="amtn  未税金额 字段有非法数据  导致excel没有插入  根据品名《"+s.getPrdName()+"》去找";
            listmsg.add(Msg.gmg().setMsg(ss));
            throw new RuntimeException(ss);
        }
        try {
            t.setTax(new BigDecimal(s.getTax().trim()));
        } catch (Exception e) {
            String ss="tax  税额 字段有非法数据  导致excel没有插入  根据品名《"+s.getPrdName()+"》去找";
            listmsg.add(Msg.gmg().setMsg(ss));
            throw new RuntimeException(ss);
        }
        try {
            t.setAmt(new BigDecimal(s.getAmt().trim()));
        } catch (Exception e) {
            String ss="amt  金额 字段有非法数据  导致excel没有插入  根据品名《"+s.getPrdName()+"》去找";
            listmsg.add(Msg.gmg().setMsg(ss));
            p.throwE(ss);
        }
        try {
            t.setTaxRto(new BigDecimal(s.getTaxRto().trim()));
        } catch (Exception e) {
            String ss="taxRto  税率 字段有非法数据  导致excel没有插入 根据品名《"+s.getPrdName()+"》去找";
            listmsg.add(Msg.gmg().setMsg(ss));
            throw new RuntimeException(ss);
        }
        t.setRem(s.getRemBody());
        t.setPrdMark("");

        //如果单价有问题,就要抛出异常
        if("".equals(s.getUp())||"0".equals(s.getUp())){
            msg.setMsg("订单号osNo="+s.getOsNo()+"的单号因为某条数据中的“单价”(Up)有问题(单价是0或者没有单价),导致该订单号的所有记录都未能成功录入！");
            msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(s.getOsNo());
            listmsg.add(msg);
            throw new RuntimeException(msg.getMsg());
        }

        try {
            t.setUp(new BigDecimal(s.getUp().trim()));
        } catch (Exception e) {
            String sss="单号为"+s.getOsNo()+",货品名称为"+s.getPrdName()+
                    ",的价格《"+s.getUp()+"》在excel中不正确";
            listmsg.add(Msg.gmg().setMsg(sss));
            p.p(JSON.toJSONString(s));
            p.throwE(sss);
        }
//        t.setWh("0000");
        //20171113老郑让改
        t.setWh("1000");
        if(p.empty(estDd)){
            t.setEstDd(null);
        }else{
            try {
                t.setEstDd(TimeStampToDate.timeStampToDate(Long.parseLong(estDd)));
            } catch (Exception e) {
                msg.setMsg("销售订单非sap导入的时候《预交日期》不是有效的时间戳estDd:《"+estDd+"》");
                listmsg.add(msg);
                throw new RuntimeException(msg.getMsg());

            }
        }

        if(p.empty(osDd)){
            t.setOsDd(null);
        }else{
            try {
                t.setOsDd(TimeStampToDate.timeStampToDate(Long.parseLong(osDd)));
            } catch (Exception e) {
                msg.setMsg("销售订单导入的时候《订单日期》不是有效的时间戳osDd:《"+osDd+"》");
                listmsg.add(msg);
                throw new RuntimeException(msg.getMsg());
            }
        }

        //t.setItm();
        //后来为了避免null加的一项
//        t.setPreItm(t.getItm());
        ////////////////////////////////////////////////
        tz.setOsNo(s.getOsNo());
        tz.setSapwlm(s.getSapwlm());
//        tz.setSaphh(s.getSaphh());//20170929老郑说这个不用写入值了
        tz.setSapph(s.getSapph());
        tz.setCfdm(s.getCfdm());
        tz.setOsId(OrderPreCnst.SO);
        //tz.setItm();
////////////////////////////////////////////////
        pdt.setPrdNo(s.getPrdNo());
        pdt.setName(s.getPrdName());
////////////////////////////////////////////////
       /* System.out.println("转换后");
        System.out.println("===osDd===="+t.getOsDd()+"=======estDd===="+t.getEstDd()+"=============");
        System.out.println("转换后");*/

        this.saveOneShouDingDanFromExcelToTableInsert(m, t, tz,pdt,listmsg,iii);
///////////////////////////////////////////
    }

    private void prdNoGet(ShouDingDanFromExcel s) {
        if(p.empty(s.getPrdNo())){
            String prdName = s.getPrdName();
            String s1 = cnst.a001TongYongMapper.selectTop1PrdtNo(prdName);
            s.setPrdNo(s1);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~没有prdNo,自己找到一个如下~~~~~~~~~~~~~~~~~~~~~~");
            p.p(s1);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    @Transactional
    public void saveOneShouDingDanFromExcelToTableInsert(MfPosWithBLOBs m,
                                                         TfPosWithBLOBs t,
                                                         TfPosZ tz,
                                                         PrdtWithBLOBs pdt,
                                                         List<Msg>listmsg,int iii){


        PrdtExample prdtExample=new PrdtExample();
        prdtExample.createCriteria().andPrdNoEqualTo(pdt.getPrdNo()).andNameEqualTo(pdt.getName());
        long l2 = cnst.prdtMapper.countByExample(prdtExample);
        //此时数据库prdt表没有该条记录,我们下面不再插入其他记录,而是告诉客户,该记录在数据库prdt表不存在,请自行注册该商品到数据库,
        //这也是老郑的要求
        Msg msg=new Msg();
        if(l2==0){
            msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(t.getOsNo());
            msg.setNotExsitThisPrdtNoInPrdtTab(pdt.getPrdNo());
            msg.setMsg("--------------该订单号osNo="+t.getOsNo()+"这批(整个excel的数据)一个也没有插入," +
                    "插入数据的时候遇到--商品(prdtNo="+pdt.getPrdNo()+")--没有在商品表Prdt表里面或者 " +
                    "商品名="+pdt.getName()+"不在商品表中,导致无法插入数据,--------");
            listmsg.add(msg);
            //不再进行下面步骤
            throw new RuntimeException(msg.getMsg());
        }else{
            //单独分出来是为了只在下面的几个插入使用事务
            this.saveChuLePrdtDe(m,t,tz,listmsg,iii);
        }

    }
    //////////////////////////////////////////////////////////////////////////////////
    @Transactional
    public void saveChuLePrdtDe(MfPosWithBLOBs m,TfPosWithBLOBs t,
                                TfPosZ tz,List<Msg>listmsg,int iii){
        try {
            MfPosExample mfe=new MfPosExample();
            mfe.createCriteria().andOsNoEqualTo(m.getOsNo());
            long l1 = cnst.mfPosMapper.countByExample(mfe);
            if(l1==0){
                cnst.mfPosMapper.insert(m);

            }
            //测试事务
//            System.out.println(1/0);
//            TfPosExample tfe=new TfPosExample();
//            tfe.createCriteria().andOsNoEqualTo(m.getOsNo());
//            long l = cnst.tfPosMapper.countByExample(tfe);
//            t.setItm(new Long(l).intValue()+1);
            t.setItm(iii+1);
            t.setEstItm(t.getItm());
            cnst.tfPosMapper.insert(t);


//            TfPosZExample tfze=new TfPosZExample();
//            tfze.createCriteria().andOsNoEqualTo(m.getOsNo());
//            long ll = cnst.tfPosZMapper.countByExample(tfze);
//            tz.setItm(new Long(ll).intValue()+1);
            tz.setItm(t.getItm());

            //判断表tf_pos_z是否存在
            if(cnst.a001TongYongMapper.ifExistTfPosZ()==-1){
                //此时表不存在,什么也不做
            }else{
                //此时表存在
                cnst.tfPosZMapper.insert(tz);
            }
            //接下来update一下老郑于2017年-10-09要把null变成固定值的地方
            cnst.manyTabSerch.updateMfPosNullToNothing001(m);
            cnst.manyTabSerch.updateTfPosNullToNothing001(m);


        } catch (Exception e) {
            Msg msg=new Msg();
            msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(m.getOsNo());
            msg.setMsg("--订单号osNo为--osNo=“"+m.getOsNo()+
                    "”--的这批数据(整个EXcel的数据)一个也没有插入--因为在插入时发生了不可预料的异常," +
                    "可能是插入数据的字段长度有问题,检查表mf_Pos,tf_pos,tf_pos_z中字段的长度是否够用----");
            listmsg.add(msg);
            e.printStackTrace();
            throw new RuntimeException(JSON.toJSONString(msg));
        }


    }
}
