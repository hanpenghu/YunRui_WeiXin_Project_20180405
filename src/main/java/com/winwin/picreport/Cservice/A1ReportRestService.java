package com.winwin.picreport.Cservice;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.OrderPreCnst;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.*;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *sap销售订单导入
 * */
@Service("a1")
public class A1ReportRestService {
    @Autowired
    private Cnst cnst;

    ////////////////////////受订单号成功后是SO/////////////////////////////////////////////
///////////////////////注意事务要加在所有调用的方法上面,如果方法套方法,就必须都加事务///////////////////////////////////////////////////
    @Transactional
    public void saveYiPiDingDanHaoXiangTongDe(Map<String, List> listMap, List<Msg> listmsg) {
//        System.out.println(list3);
        //循环插入所有
        //用list3来装入合并同一货号的几个东西后的ShouDingDanFromExcel
        List<ShouDingDanFromExcel> list3 = listMap.get("samePrdNoMeraged");

        //收集同一货号的list       samePrdNoList
        List<List<ShouDingDanFromExcel>> samePrdNoList = listMap.get("samePrdNoList");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //增加一个判断是否有已经存在的数据的模块,判断了对于sapso中除了qty这个字段,其他字段都一样的情况
        //这个模块实际上只是判断了sapso
        //后来我为了让用户删除主表后还能插入数据,注释掉这个判断,然后在插入时判断是否重复,重复就不在 插入


//        if(cnst.sapsoChongfu.ishave(samePrdNoList)){
//            p.p("--------是否有重复数据-------------------");
//                //此时存在重复数据,不能再插入
//            listmsg.addAll(new MessageGenerate().generateMessage("有重复数据,未能成功插入002"));
//            p.p("--------是有重复数据002-------------------");
//            throw new RuntimeException(p.gp().sad(p.dexhx)
//                    .sad("cha ru chong fu shu ju").sad(p.dexhx).gad());
//
//        }else{
//            //此时不存在重复数据可以继续插入
//            p.p("//此时不存在重复数据可以继续插入");
//        }


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //插入sunlike主表

        for(int iii=0;iii<list3.size();iii++){
            ShouDingDanFromExcel shouDingDanFromExcel=list3.get(iii);
            AmtAndAmtnAndTaxChongXinSuan.g(shouDingDanFromExcel, listmsg);//在类内部进行判断计算各种金额
            //同一个iii下面必须一次性插入tf_pos 和tf_pos_z和sapso
            synchronized (this) {
                this.saveOneShouDingDanFromExcelToTable(shouDingDanFromExcel, listmsg,iii);
            }
        }


//        int i=0;
//        i=5/i;
        //注意: sapso里面的数据是没有合并的,而mf_pos和tf_pos里面是合并的
        //插入自建表before_same_prdNo_merge(后来表名字改成sapso)//这个表是为了记录合并prdNo之前的saphh(sap行号)用的
        for (List<ShouDingDanFromExcel> listx : samePrdNoList) {

            String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS").format(new Date());
            String uuid = UUID.randomUUID().toString();//uuid相同代表  单号+货号+成分代码  相同
            for (ShouDingDanFromExcel shouDingDanFromExcel : listx) {
                if (p.empty(shouDingDanFromExcel.getEbNo())) {
                    Msg msg = new Msg();
                    msg.setMsg("单号为" + shouDingDanFromExcel.getOsNo() +
                            ",货号为" + shouDingDanFromExcel.getPrdNo() +
                            ",成分代码为【" + shouDingDanFromExcel.getCfdm() +
                            "】,的EB单号为空,该批数据没有插入一条");
                    listmsg.add(msg);
                    throw new RuntimeException(msg.getMsg());
                }
                try {
                    Sapso b = new Sapso();
                    b.setOsno(shouDingDanFromExcel.getOsNo());
                    b.setPrdno(shouDingDanFromExcel.getPrdNo());
                    b.setQty(new BigDecimal(shouDingDanFromExcel.getQty()));
                    b.setCaigouno(shouDingDanFromExcel.getCaiGouNo());
                    b.setEbno(shouDingDanFromExcel.getEbNo());
                    b.setMaitouno(shouDingDanFromExcel.getMaiTouNo());
                    b.setSaphh(shouDingDanFromExcel.getSaphh());
                    b.setSapph(shouDingDanFromExcel.getSapph());
                    b.setSapwlm(shouDingDanFromExcel.getSapwlm());
                    b.setLuohao(shouDingDanFromExcel.getLuoHao());
                    b.setGanghao(shouDingDanFromExcel.getGangHao());
                    b.setReallength(shouDingDanFromExcel.getRealLength());
                    b.setRealwidth(shouDingDanFromExcel.getRealWidth());
                    //20171108加了成分代码
                    b.setChengFenDaiMa(shouDingDanFromExcel.getCfdm());
                    b.setTimesamebatch(dateStr);
                    b.setUuid(uuid);//uuid相同代表  单号+货号+成分代码  相同
                    /**
                     *在插入之前判断是否有重复的,有重复的就不插入,因为之前林展的出现过这种导入重复的情况
                     * */


                    Integer kk;
                    try {
                        kk = cnst.a001TongYongMapper.countIfSapsoExist(b);
                    } catch (Exception e) {
                        p.p(p.gp().sad(p.dexhx)
                                .sad("Integer kk= cnst.a001TongYongMapper.countIfSapsoExist(b) error")
                                .sad(p.dexhx).gad());
                        throw new RuntimeException(e.toString());
                    }

                    p.p(p.gp().sad(p.dexhx).sad("sapso是否有重复数据kk=").sad(p.strValeOf(kk)).sad(p.dexhx).gad());

                    if (NotEmpty.notEmpty(kk) && kk == 0) {
                        //此时除了qty都不相等了
                        Integer pp = cnst.sapsoMapper.insert(b);//这个后期已经加上成分代码
                        p.p(p.gp().sad(p.dexhx)
                                .sad("sapso cha ru yi tiao shu ju SUCCESS: ge shu:")
                                .sad(p.dexhx).sad(p.strValeOf(pp)).sad(p.dexhx).gad());


                    }

                } catch (Exception e) {
                    Msg msg = new Msg();
                    msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(shouDingDanFromExcel.getOsNo());

                    String s="在插入数据库表sapso(原始数据表)的时候,单号为:" +
                            msg.getWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao() +
                            "的osNo(订单号)下面的某条数据有异常,导致该批(整个excel的)数据一个都没插入！";

//                    msg.setMsg("在插入数据库表sapso(原始数据表)的时候,单号为:"+msg.getWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao()+"的osNo(订单号)下面的某条数据有异常,导致该批(os_no下面)数据一个都没插入！");
                    msg.setMsg(s);

                    listmsg.add(msg);
//                    e.printStackTrace();
                    throw new RuntimeException(s);
                }
            }
        }
    }

    @Transactional
    public void saveOneShouDingDanFromExcelToTable(ShouDingDanFromExcel s, List<Msg> listmsg,int iii) {
        Msg msg = new Msg();
        MfPosWithBLOBs m = new MfPosWithBLOBs();
        TfPosWithBLOBs t = new TfPosWithBLOBs();
        TfPosZ tz = new TfPosZ();
        PrdtWithBLOBs pdt = new PrdtWithBLOBs();

        String osDd = s.getOsDd();
        String estDd = s.getEstDd();
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //在使用货号之前如果是空的,先流水一下货号
        if (s.getPrdNo() == null || "".equals(s.getPrdNo())) {
            String prdNo=cnst.a001TongYongMapper.getPrdNoUsePrdName(s.getPrdName());
            if(p.empty(prdNo)){
                msg.setMsg("订单号osNo为:~~~~" + s.getOsNo() +
                        "~~~~的这一批货品里面有货号为空,根据"+
                        s.getPrdName()+"在数据库也找不到货号,所以整个该批单号不能插入！");
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
        if (osDd == null || "".equals(osDd)) {
//            osDd="32503564800000";//2999-12-31
            osDd = null;
        }
        if (estDd == null || "".equals(estDd)) {
            estDd = null;//2999-12-31
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
        m.setOsId("SO");
        //下面2条是老郑在20170929让我加上的
        //是把界面选的存的代号sal_no，同时写进 mf_pos.usr , mf_pos.chk_man两个字段
        if ("".equals(s.getSalNo())) {
            m.setUsr("ADMIN");
            m.setChkMan("ADMIN");
        } else {
            m.setUsr(s.getSalNo());
            m.setChkMan(s.getSalNo());
        }
        //后来加的4个,为了避免是null
        m.setClsId("F");
        m.setPayMth("1");
        m.setPayDays((short) 1);
        m.setChkDays((short) 30);
        if (osDd == null) {
            m.setOsDd(null);
        } else {
            //"销售订单导入的时候《订单日期》不是有效的时间戳osDd:《"+osDd+"》"
            try {
                m.setOsDd(TimeStampToDate.timeStampToDate(Long.parseLong(osDd)));
            } catch (Exception e) {
                msg.setMsg("销售订单导入的时候《订单日期》不是有效的时间戳osDd:《"+osDd+"》");
                listmsg.add(msg);
                throw new RuntimeException(msg.getMsg());
            }

        }
        //下面2017-10-24老郑让我加的
        m.setZhangId("3");
        m.setPayRem("结帐期:2017-11-01;票据到期日:2017-12-02");
        try {
            m.setPayDd(new SimpleDateFormat("yyyy-MM-dd").parse("2017-11-01"));
        } catch (ParseException e) {
        }
        m.setChkDd(cnst.manyTabSerch.getDate());
        m.setIntDays((short) 30);
        //2017-11-13老郑让加上
        m.setUseDep("2000");
        m.setSendMth("1");
        m.setPoDep("2000");
///////////////////////
        t.setOsNo(s.getOsNo());
        //之所以cusosno也传入osno,是因为老郑20170929让这么做的
        t.setCusOsNo(s.getOsNo());
        t.setOsId(OrderPreCnst.SO);

        if (s.getPrdNo() == null || "".equals(s.getPrdNo())) {
            msg.setMsg("订单号osNo为:~~~~" + s.getOsNo() + "~~~~的这一批货品里面有货号为空,所以整个该批单号不能插入！");
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
        t.setAmtn(new BigDecimal(s.getAmtn()));
        t.setTax(new BigDecimal(s.getTax()));
        t.setAmt(new BigDecimal(s.getAmt()));
        t.setTaxRto(new BigDecimal(s.getTaxRto()));
        t.setRem(s.getRemBody());
        t.setPrdMark("");

        //如果单价有问题,就要抛出异常
        if ("".equals(s.getUp()) || "0".equals(s.getUp())) {
            msg.setMsg("订单号osNo=" + s.getOsNo() +
                    "的单号因为某条数据中的“单价”(Up)有问题(单价是0或者没有单价),导致该订单号的所有记录都未能成功录入！");
            msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(s.getOsNo());
            listmsg.add(msg);
            throw new RuntimeException(msg.getMsg());
        }
        t.setUp(new BigDecimal(s.getUp()));
//        t.setWh("0000");
        //20171113老郑让改
        t.setWh("1000");
        if (estDd == null) {
            t.setEstDd(null);
        } else {
            try {
                t.setEstDd(TimeStampToDate.timeStampToDate(Long.parseLong(estDd)));
            } catch (Exception e) {
                msg.setMsg("销售订单导入的时候预交日期不是有效的时间戳estDd:《"+estDd+"》");
                listmsg.add(msg);
                throw new RuntimeException(msg.getMsg());
            }
        }

        if (osDd == null) {
            t.setOsDd(null);
        } else {
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

        this.saveOneShouDingDanFromExcelToTableInsert(m, t, tz, pdt, s, listmsg, iii);
///////////////////////////////////////////
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    @Transactional
    public void saveOneShouDingDanFromExcelToTableInsert
    (MfPosWithBLOBs m, TfPosWithBLOBs t, TfPosZ tz, PrdtWithBLOBs pdt,
     ShouDingDanFromExcel s, List<Msg> listmsg,int iii) {
//    try {
        //注册商品到商品库//不能再自动注册了,老郑说了,自动注册的不行,因为客户可能手动输入输错了,所以,我们就不再自动插入prdt表来注册商品
           /* PrdtExample prdtExample=new PrdtExample();
            prdtExample.createCriteria().andPrdNoEqualTo(pdt.getPrdNo());
            long l2 = prdtMapper.countByExample(prdtExample);
            if(l2==0){
                prdtMapper.insert(pdt);
            }*/

        PrdtExample prdtExample = new PrdtExample();
        prdtExample.createCriteria().andPrdNoEqualTo(pdt.getPrdNo()).andNameEqualTo(pdt.getName());
        long l2 = cnst.prdtMapper.countByExample(prdtExample);
        //此时数据库prdt表没有该条记录,我们下面不再插入其他记录,而是告诉客户,该记录在数据库prdt表不存在,请自行注册该商品到数据库,
        //这也是老郑的要求
        Msg msg = new Msg();
        if (l2 == 0) {
            msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(t.getOsNo());
            msg.setNotExsitThisPrdtNoInPrdtTab(pdt.getPrdNo());
            msg.setMsg("--------------该订单号osNo=" + t.getOsNo() +
                    "这批(整个excel的数据)一个也没有插入,插入数据的时候遇到--商品(prdtNo=" + pdt.getPrdNo()
                    + ")--没有在商品表Prdt表里面或者 商品名=" + pdt.getName() + "不在商品表中,导致无法插入数据,--------");
            listmsg.add(msg);
            //不再进行下面步骤
            throw new RuntimeException(msg.getMsg());
        } else {
            //单独分出来是为了只在下面的几个插入使用事务
            this.saveChuLePrdtDe(m, t, tz, listmsg,iii);
        }
//    } catch (RuntimeException e) {
//        e.printStackTrace();
//        throw new RuntimeException();
//    }
    }

    //////////////////////////////////////////////////////////////////////////////////

    /**
     * 插入三个主表
     */
    @Transactional
    public void saveChuLePrdtDe(MfPosWithBLOBs m, TfPosWithBLOBs t, TfPosZ tz, List<Msg> listmsg,int iii) {
        try {
            MfPosExample mfe = new MfPosExample();
            mfe.createCriteria().andOsNoEqualTo(m.getOsNo());
            long l1 = cnst.mfPosMapper.countByExample(mfe);
            /**
             *插入mf
             * */
            //mf里面osno是主键,不能重复
            if (l1 == 0) {
                cnst.mfPosMapper.insert(m);

            }
            //测试事务
//            System.out.println(1/0);
            TfPosExample tfe = new TfPosExample();
            tfe.createCriteria().andOsNoEqualTo(m.getOsNo());
//            long l = cnst.tfPosMapper.countByExample(tfe);
            //注意:tf_pos和tf_pos_z必须共用itm才对//注意iii是从0开始索引的 itm是从1  所以要加1
            t.setItm(iii+1);
            t.setEstItm(t.getItm());

//            TfPosExample tfe1 = new TfPosExample();
//            tfe1.createCriteria().andOsNoEqualTo(t.getOsNo())
//                    .andQtyEqualTo(t.getQty())
//                    .andPrdNoEqualTo(t.getPrdNo())
//                    .andCusOsNoEqualTo(t.getOsNo())
//                    .andPrdNameEqualTo(t.getPrdName())
//                    .andAmtnEqualTo(t.getAmtn())
//                    .andTaxEqualTo(t.getTax())
//                    .andAmtEqualTo(t.getAmt())
//                    .andTaxRtoEqualTo(t.getTaxRto())
//                    .andRemEqualTo(t.getRem());
//            if (cnst.tfPosMapper.countByExample(tfe1) == 0) {
//                /**
//                 *插入tf
//                 * */
//                //此时该条记录不存在,可以插入一个
////                cnst.tfPosMapper.insert(t);
//            } else {
//                //此时有重复数据,不插入,啥也不做
//            }

            cnst.tfPosMapper.insert(t);
//            TfPosZExample tfze = new TfPosZExample();
//            tfze.createCriteria().andOsNoEqualTo(m.getOsNo());
            //注意:tf_pos和tf_pos_z必须共用itm才对//注意iii是从0开始索引的 itm是从1  所以要加1
            tz.setItm(t.getItm());
//            TfPosZExample tfze1 = new TfPosZExample();
//            tfze1.createCriteria()
//                    .andOsNoEqualTo(tz.getOsNo())
//                    .andSapwlmEqualTo(tz.getSapwlm())
//                    .andSapphEqualTo(tz.getSapph())
//                    .andCfdmEqualTo(tz.getCfdm())
//                    .andOsIdEqualTo(OrderPreCnst.SO);
//            if (cnst.tfPosZMapper.countByExample(tfze1) == 0) {
//                /**
//                 *插入tfz
//                 * */
//                //此时证明没有重复数据,可以插入
////                cnst.tfPosZMapper.insert(tz);
//            } else {
//                //此时有重复数据,不再插入
//
//            }
            cnst.tfPosZMapper.insert(tz);
            //接下来update一下老郑于2017年-10-09要把null变成固定值的地方
            cnst.manyTabSerch.updateMfPosNullToNothing001(m);
            cnst.manyTabSerch.updateTfPosNullToNothing001(m);


        } catch (Exception e) {
            Msg msg = new Msg();
            msg.setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(m.getOsNo());
            msg.setMsg("--订单号osNo为--osNo=“" + m.getOsNo() +
                    "”--的这批数据(整个EXcel的数据)一个也没有插入" +
                    "--因为在插入时发生了不可预料的异常,可能是插入数据的字段长度有问题," +
                    "检查表mf_Pos,tf_pos,tf_pos_z中字段的长度是否够用----");
            listmsg.add(msg);
//            e.printStackTrace();
            throw new RuntimeException(msg.getMsg());
        }


    }
//////////////////////////////////////////////////////////////////////////////////
}
