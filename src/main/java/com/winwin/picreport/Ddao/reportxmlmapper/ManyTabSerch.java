package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.*;
import org.apache.ibatis.annotations.*;

import java.util.*;

public interface ManyTabSerch {


    //得到数据库当前时间
    @Select("SELECT GETDATE()")
    Date getDate();


    List<SalePrdDetailTab1> salePrdDetailTab1
            (@Param("chaXunTiaoJian") ChaXunTiaoJian chaXunTiaoJian,
             @Param("cus_no") String cus_no);//销货明细表

    @Select("SELECT CUS_NO,NAME FROM CUST WHERE OBJ_ID=1")
//1是客户//2是厂商
    List<KeHu> getAllCustOf_obj_id_1_that_KeHuNotChangShang();

    @Select("SELECT CUS_NO,NAME FROM CUST WHERE OBJ_ID=2")
//1是客户//2是厂商
    List<KeHu> getAll_obj_id_2_that_ChangShang();

    Integer updateMfPosNullToNothing001
            (@Param("mfPosWithBLOBs") MfPosWithBLOBs mfPosWithBLOBs);

    Integer updateTfPosNullToNothing001
            (@Param("mfPosWithBLOBs") MfPosWithBLOBs mfPosWithBLOBs);


    @Select("select osno,prdno,saphh,qty,sapph,caigouno,luohao,ganghao,realwidth,reallength,chengFenDaiMa " +
            "from sapso where RTRIM(LTRIM(isnull(chengFenDaiMa,'')))=#{chengFenDaiMa} and RTRIM(LTRIM(isnull(osno,'')))=#{cusOsNo} and  RTRIM(LTRIM(isnull(prdno,'')))=#{prdNo}")
    List<Sapso> select001(@Param("cusOsNo") String cusOsNo, @Param("prdNo") String prdNo,
                          @Param("chengFenDaiMa") String chengFenDaiMa);


    @Select("Select sal_no AS salNo,name AS name from salm")
    List<YeWuYuan> getAllYeWuYuan();





    ///////以下是onlinebug///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Delete("delete  from tf_pos_z where os_no not in (select os_no from mf_pos)")
    Integer update010_1OfOnlineBug();

    @Delete("delete  from mf_pos_z where os_no not in (select os_no from mf_pos)")
    Integer update010_2OfOnlineBug();


    Integer update001OfOnlineBug();

    Integer update002OfOnlineBug();

    Integer update003OfOnlineBug();

    Integer update004OfOnlineBug();

    Integer update005OfOnlineBug();

    Integer update006OfOnlineBug();

    Integer update007_1_OfOnlineBug();

    Integer update007_2_OfOnlineBug();

    Integer update007_3_OfOnlineBug();

    Integer update007_4_OfOnlineBug();


    @Update({"update mf_pos set cus_os_no=os_no where os_id='SO' and (cus_os_no IS NULL or cus_os_no='') and os_dd>='2017-10-1'",
            "update tf_pos set cus_os_no=os_no where os_id='SO' and (cus_os_no IS NULL or cus_os_no='') and os_dd>='2017-10-1'"})
    Integer update008_1_OfOnlineBug();


    @Update("UPDATE  A SET A.REM=B.SO_NO FROM MF_SQ A,TF_SQ B \n" +
            "WHERE A.CLS_ID='F' AND A.SQ_NO=B.SQ_NO AND B.ITM=1 AND (A.REM IS NULL or A.REM like '')")
    Integer update009_1OfOnlineBug();


    @Update("UPDATE  B SET B.SO_NO=A.REM FROM MF_SQ A,TF_SQ B \n" +
            "WHERE A.CLS_ID='F' AND A.SQ_NO=B.SQ_NO AND (B.SO_NO is NULL or B.SO_NO='')")
    Integer update009_2OfOnlineBug();

    @Update("UPDATE  B SET B.est_dd=A.est_dd FROM MF_SQ A,TF_SQ B \n" +
            "WHERE A.SQ_NO=B.SQ_NO AND (B.EST_DD IS NULL)")
    Integer update009_3OfOnlineBug();


    @Update("update  a set a.sup_prd_no=b.sup_prd_no from  tf_sq a,tf_pos b,mf_bom c,tf_bom d\n" +
            " where \n" +
            "a.so_no=b.os_no and b.prd_no=c.prd_no and c.bom_no=d.bom_no and a.prd_no=d.prd_no \n" +
            " and (a.sup_prd_no IS NULL) and b.os_dd>='2017-10-1' and (b.sup_prd_no IS NOT NULL)")
    Integer update009_4OfOnlineBug();


    @Update("UPDATE A SET A.KHNBDH=C.KHNBDH FROM TF_POS_Z A,TF_POS B,TF_POS_Z C WHERE A.OS_ID='PO' AND A.OS_NO=B.OS_NO AND B.OTH_NO=C.OS_NO AND (A.KHNBDH IS NULL OR A.KHNBDH='') AND (C.KHNBDH IS NOT NULL OR C.KHNBDH != '')")
    Integer gengXin_CaiGouDan_BiaoShen_KeHu_NeiBu_DanHao_OfOnlineBug();



    @Update({"update prdt set formula='1;-1;-1;0;0;主单位数量/0.9144;副单位数量*0.9144' where ut='meters' and ut1='yards' and (formula IS NULL or formula='')",
            "update prdt set formula='1;-1;-1;4;4;主单位数量*0.9144;副单位数量/0.9144' where ut='yards' and ut1='meters' and (formula IS NULL or formula='')",
            "update prdt set formula='1;-1;-1;0;0;主单位数量/12;副单位数量*12' where ut='pcs' and ut1='Dozens' and (formula IS NULL or formula='')"})
    Integer update011_1_OfOnlineBug();

    ////////////以上是onlinebug//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////







    @Select({"SELECT ebNo FROM SAPSO WHERE RTRIM(LTRIM(ISNULL(osno,'')))+RTRIM(LTRIM(ISNULL(prdno,'')))+RTRIM(LTRIM(ISNULL(chengFenDaiMa,'')))+RTRIM(LTRIM(ISNULL(saphh,'')))=#{s}"})
    List<String> selectEbNoFromSapso(@Param("s") String s);

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Select("select isnull(idx_no,'') as 'idxNo',name as 'idxName' from indx")
    List<CategoryName> fenlei();


    /**
     * 得到最高层级的分类,其实只有一个
     */
    @Select("select isnull(idx_no,'') as 'idxNo',name as 'idxName' from indx where idx_up is null")
    List<CategoryNameCode> getCommonder();

    /**
     * 得到下一级的分类,有多个
     */
    @Select("select isnull(idx_no,'') as 'idxNo',name as 'idxName' from indx where idx_up=#{indxNo}")
    List<CategoryNameCode> getChildCategoryNameCode(@Param("indxNo") String indxNo);

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Select("select isnull(name,'') from prdt where idx1 in(select idx_no from indx where idx_no=#{idxNo})")
    List<String> getCodeList(@Param("idxNo") String idxNo);

    @Select("select isnull(sal_no,'') as 'salNo',isnull(name,'') as 'salName' from salm")
    List<FuZeRen> fuZeRen();

    @Select("select isnull(mark_no,'')as 'markNo',isnull(name,'')as 'name' from mark")
    List<PinPai> pinPai();


    List<String> selectDangQianYeSuoYouId
            (@Param("dangQianYe") Integer dangQianYe
                    , @Param("meiYeXianShiShu") Integer meiYeXianShiShu);

    /**
     * 得到某页分页id,打样未确认的
     */
    List<String> selectDangQianYeSuoYouIdNotConfirm
    (@Param("dangQianYe") Integer dangQianYe,
     @Param("meiYeXianShiShu") Integer meiYeXianShiShu);

    /**
     * 得到某页分页id,打样已经确认的
     */
    List<String> selectDangQianYeSuoYouIdAlReadyConfirm
    (@Param("dangQianYe") Integer dangQianYe,
     @Param("meiYeXianShiShu") Integer meiYeXianShiShu);


    @Select("select count(id) from PRDT_SAMP")
    Integer dangYangZongJiLuShu();




    @Select("Select count(id) from prdt_samp where isconfirm=1")
    Integer getCountOfAllReadyConfirm();

    @Select("Select count(id) from prdt_samp")
    Integer getCountOfAll();

    @Select("Select count(id) from prdt_samp where isconfirm=0")
    Integer getCountOfAllNotConfirm();


    @Update("update prdt_samp set thum=#{newthums} where thum like #{thumInDataBase}")
    int updateThumColumn(@Param("thumInDataBase") String thumInDataBase,
                         @Param("newthums") String newthums);

    @Update("update prdt_samp set attach=#{newattachs} where attach like #{attachInDataBase}")
    int updateAttachColumn(@Param("attachInDataBase") String attachInDataBase,
                           @Param("newattachs") String newattachs);

    //test PageBean
    @Select("Select count(id) from prdt_Samp")
    int countItem();

    //testPageBean
    @Select("Select * from prdt_Samp order by id DESC")
    List<PrdtSamp> findAll();

    @Select("select cur_id as curId,name as name from cur_id")
    List<CurrentType> CurrentType();

    ////////////////单位模块//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Select("SELECT DISTINCT UT FROM PRDT WHERE ISNULL(UT,'')!=''")
    List<String> allUnit();//所有主单位

    @Select("SELECT DISTINCT UT1 FROM PRDT WHERE ISNULL(UT1,'')!=''")
    List<String> allUnit1();//所有副单位

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Select("select prd_no from prdt_samp where id=#{uuid}")
    String selectPrdNoFromPrdtSamp(@Param("uuid") String uuid);


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 产品打样的时候,采购定价的时候,  prdno对应的在prdt中的主副单位判断和插入语句(一下4个语句)
     */
    @Select({"SELECT TOP 1 UT FROM PRDT WHERE PRD_NO=#{prdNo}"})
    String selectUtFromPrdt(@Param("prdNo") String prdNo);

    @Select({"SELECT TOP 1 UT1 FROM PRDT WHERE PRD_NO=#{prdNo}"})
    String selectUt1FromPrdt(@Param("prdNo") String prdNo);

    @Update({"UPDATE PRDT SET UT = #{unit} WHERE prd_no = #{prdNo}"})
    Integer insertUnitToUtOfPrdt(@Param("unit") String unit, @Param("prdNo") String prdNo);

    @Update({"UPDATE PRDT SET UT1=#{unit} WHERE prd_no=#{prdNo}"})
    Integer insertUnitToUt1OfPrdt(@Param("unit") String unit, @Param("prdNo") String prdNo);


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Select({"select prd_no from prdt_samp where id=#{id}"})
    String getPrdNoFromPrdtSamp(@Param("id") String id);


    @Select({"select count(id) from prdt_samp where id=#{uuid}"})
    Integer countByIdOfprdtSamp(@Param("uuid") String uuid);


    @Select({"select convert(varchar(100),qty) from sapso\n" +
            "where\n" +
            "isnull(timeSameBatch,'')!=#{timesamebatch}\n" +
            "and\n" +
            "isnull(uuid,'') !=#{uuid}\n" +
            "and \n" +
            "isnull(osno,'')=#{osno}\n" +
            "and\n" +
            "isnull(ebno,'')=#{ebno}\n" +
            "and\n" +
            "isnull(caigouno,'')=#{caigouno}\n" +
            "and \n" +
            "isnull(prdno,'')=#{prdno}\n" +
            "and\n" +
            "isnull(saphh,'')=#{saphh}\n" +
            "and\n" +
            "isnull(sapph,'')=#{sapph}\n" +
            "and \n" +
            "isnull(sapwlm,'')=#{sapwlm}\n" +
            "and\n" +
            "isnull(maitouno,'')=#{maitouno}\n" +
            "and\n" +
            "isnull(luohao,'')=#{luohao}\n" +
            "and\n" +
            "isnull(ganghao,'')=#{ganghao}\n" +
            "and\n" +
            "isnull(realWidth,'')=#{realwidth}\n" +
            "and\n" +
            "isnull(realLength,'')=#{reallength}\n" +
            "and\n" +
            "isnull(chengfendaima,'')=#{chengFenDaiMa}"})
    String selectStrQtyFromSapao(Sapso b);



    //onlinebug定时任务
    @Update({"update a set a.AMTN_CLS=b.amt,a.AMTN_CLS_RCV=b.amt from tc_mon a,mf_arp b where  a.arp_no=b.arp_no and b.amt=b.amt_rcv and (b.amtn<>b.amtn_rcv)","update mf_arp set amtn_rcv=amtn where  amt=amt_rcv and (amtn<>amtn_rcv)"})
    Integer chuLiWaiBiQuanChongDiao();


    @Select({"select ps_no from MF_PSS where cus_no=#{cusNo} and (ps_dd BETWEEN #{startTime} and #{endTime})"})
    List<String> selectMfpssOsNo(@Param("cusNo") String cusNo,@Param("startTime")String startTime,@Param("endTime") String endTime);



    @Select({"select top 1 ISNULL(rem,'') as remHead,ISNULL(ps_no,'') AS psNo,RTRIM(LTRIM(ISNULL(cus_os_no,''))) AS cusOsNo from mf_pss where ps_no=#{psNo}"})
    Map<String,String> selectMfInfo(@Param("psNo")String psNo);
}
