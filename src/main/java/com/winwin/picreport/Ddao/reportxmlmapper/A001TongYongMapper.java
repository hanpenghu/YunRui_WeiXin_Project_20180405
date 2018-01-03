package com.winwin.picreport.Ddao.reportxmlmapper;


import com.winwin.picreport.Edto.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

public interface A001TongYongMapper {

/////////////////////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////

   @Select("SELECT GETDATE()")
   Date selectDbDate();


   @Select("SELECT COUNT(TENANTID) FROM TENANT WHERE TENANTID=#{tenantId}")
   Integer conutTenantId(@Param("tenantId") String tenantId);


   @Select("SELECT COUNT(U.TENANTID) FROM USERS AS U,TENANT AS T WHERE U.TENANTID=T.TENANTID AND U.TENANTID=#{tenantId} AND T.TENANTID=#{tenantId} AND U.USEREMAIL=#{userEmail} AND U.USERPSWD=#{userPswd}")
   Integer countuserEmailAndPswd(@Param("tenantId") String tenantId, @Param("userEmail") String userEmail, @Param("userPswd") String userPswd);

//   @Select("SELECT COUNT(TENANTID) FROM USERS WHERE USEREMAIL=#{userEmail}")
//   Integer countuserEmail(@Param("userEmail") String userEmail,@Param("userPswd")  String userPswd);

//   @Select("SELECT COUNT(TENANTID) FROM USERS WHERE USERPSWD=#{userPswd}")
//   Integer countuserPswd(@Param("userEmail") String userEmail,@Param("userPswd")  String userPswd);


   @Select("SELECT COUNT(U.TENANTID) FROM USERS AS U,TENANT AS T WHERE U.TENANTID=T.TENANTID AND U.TENANTID=#{tenantId} AND T.TENANTID=#{tenantId} AND USEREMAIL=#{userEmail}")
   Integer countuserEmail(@Param("tenantId") String tenantId, @Param("userEmail") String userEmail);


   @Select("SELECT COUNT(TENANTID) FROM USERS WHERE PHONE_NO=#{phoneNo}")
   Integer countPhoneNo(@Param("phoneNo") String phoneNo);
   @Select("SELECT COUNT(TENANTID) FROM USERS WHERE USER_NAME=#{userName}")
   Integer countUserName(@Param("userName") String userName);



   @Update("UPDATE USERS SET TIMETOKEN =#{timestamp} WHERE TENANTID=#{tenantId} AND USEREMAIL=#{userEmail} AND USERPSWD=#{userPswd}")
   Integer updateTimeTokenOfUsers(@Param("timestamp") String timestamp, @Param("tenantId") String tenantId, @Param("userEmail") String userEmail, @Param("userPswd") String userPswd);


   //PHONE_NO=#{userEmail}是因为登录的时候前端用的字段都是userEmail,然后后台判断是email(在users表唯一)还是phone(在users表唯一)还是会员名(在users表不唯一)
   @Update("UPDATE USERS SET TIMETOKEN =#{timestamp} WHERE  TENANTID=#{tenantId} AND PHONE_NO=#{userEmail} AND USERPSWD=#{userPswd}")
   Integer updateTimeTokenOfUsers_Phone(@Param("timestamp") String timestamp, @Param("tenantId") String tenantId, @Param("userEmail") String userEmail, @Param("userPswd") String userPswd);


   //PHONE_NO=#{userEmail}是因为登录的时候前端用的字段都是userEmail,然后后台判断是email(在users表唯一)还是phone(在users表唯一)还是会员名(在users表不唯一)
   @Update("UPDATE USERS SET TIMETOKEN =#{timestamp} WHERE USER_NAME=#{userEmail} AND USERPSWD=#{userPswd} AND TENANTID=#{tenantId}")
   Integer updateTimeTokenOfUsers_HuiYuanMing(@Param("timestamp") String timestamp, @Param("userEmail") String userEmail, @Param("userPswd") String userPswd, @Param("tenantId") String tenantId);



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   @Select("SELECT COUNT(TENANTID) FROM USERS WHERE USEREMAIL=#{userEmail} AND TIMETOKEN=#{timeStamp}")
   Integer countuserEmailAndTimeStamp(@Param("userEmail") String userEmail, @Param("timeStamp") String timeStamp);


   @Select("SELECT COUNT(TENANTID) FROM USERS WHERE PHONE_NO=#{userEmail} AND TIMETOKEN=#{timeStamp}")
   Integer countPhoneNoAndTimeStamp(@Param("userEmail") String userEmail, @Param("timeStamp") String timeStamp);


   @Select("SELECT COUNT(TENANTID) FROM USERS WHERE USER_NAME=#{userEmail} AND TIMETOKEN=#{timeStamp}")
   Integer countMemberNoAndTimeStamp(@Param("userEmail") String userEmail, @Param("timeStamp") String timeStamp);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   @Select("SELECT SUM(ISNULL(TF.QTY,0)-ISNULL(TF.QTY_RTN,0)) FROM TF_QL TF LEFT JOIN  TF_QL_Z TZ ON TZ.QL_NO=TF.QL_NO  WHERE (ISNULL(TF.PRD_NO,'')+ISNULL(TF.BAT_NO,'')+ISNULL(TF.PRD_MARK,''))+ISNULL(CONVERT(VARCHAR(10),TZ.SC_DD,111),'')= #{recode}")
   Double selectSumQtyOfShengChanLingLiao(@Param("recode") String huoHao_piHao_teZheng_shengChanRiQi_dingDanNum);

   @Insert({"insert into tenant(tenantid,tenantname)values(#{info.tenantId},#{info.tenantName})","insert into users(tenantid,useremail,userpswd,lockbill)values(#{info.tenantId},#{info.userEmail},#{info.userPswd},#{info.lockBill})"})//""
   Integer insertTenantAndUsers(@Param("info") LoginInfo info);

   @Select("SELECT TOP 1 TOKENTIME FROM TENANT WHERE TENANTID=#{tenantId}")
   Long getTenantShiXiaoShiJianCha(@Param("tenantId") String tenantId);

//////////////////////////////////////////////////////////////
   @Update("UPDATE  USERS  SET TIMETOKEN='logOut' WHERE TENANTID=#{tenantId} AND USEREMAIL=#{userEmail} AND EXISTS (SELECT 1 FROM  TENANT B WHERE TENANTID=B.TENANTID)")
   Long logOutTenantIdAndUserEmail(@Param("tenantId") String tenantId, @Param("userEmail") String userEmail);

   @Update("UPDATE  USERS  SET TIMETOKEN='logOut' WHERE TENANTID=#{tenantId} AND phone_no=#{userEmail} AND EXISTS (SELECT 1 FROM  TENANT B WHERE TENANTID=B.TENANTID)")
   Long logOutTenantIdAndPhoneNo(@Param("tenantId") String tenantId, @Param("userEmail") String userEmail);

   @Update("UPDATE  USERS  SET TIMETOKEN='logOut' WHERE TENANTID=#{tenantId} AND user_name=#{userEmail} AND EXISTS (SELECT 1 FROM  TENANT B WHERE TENANTID=B.TENANTID)")
   Long logOutTenantIdAndUserName(@Param("tenantId") String tenantId, @Param("userEmail") String userEmail);
/////////////////////////////////////////////////////////////////////////////////////////
   @Select("select tenantname from tenant where tenantid=#{tenantid}")
   List<String>selectTenantName(@Param("tenantid") String tenantid);

   @Insert("insert into users(tenantid,useremail,userpswd,lockbill)values(#{info.tenantId},#{info.userEmail},#{info.userPswd},#{info.lockBill})")
   Integer insertUsers(@Param("info") LoginInfo info);

   //u.user_name=#{info.userEmail}//这里之所以这样,是因为前端登录的时候不管是手机号还是用户名还是email都是靠userEmail这个字段来穿,这是历史遗留问题,但是也没关系,传过来后,再后台接口一开始就判断用户穿的是什么了
   @Select("Select count(u.tenantid) from users u,tenant t where u.tenantid=t.tenantid and t.tenantid=#{info.tenantId} and u.tenantid=#{info.tenantId} and u.user_name=#{info.userEmail} and u.userPswd=#{info.userPswd}")
    Integer selectCount_tenantIdAndUserNameAndUserPswd(@Param("info") LoginInfo info);

   @Select("Select count(u.tenantid) from users u,tenant t where u.tenantid=t.tenantid and t.tenantid=#{info.tenantId} and u.tenantid=#{info.tenantId} and u.phone_no=#{info.userEmail} and u.userPswd=#{info.userPswd}")
    Integer selectCount_tenantIdAndPhoneNoAndUserPswd(@Param("info") LoginInfo info);

   @Select("SELECT COUNT(U.TENANTID) FROM USERS U,TENANT T WHERE U.TENANTID=T.TENANTID and T.TENANTID=#{info.tenantId} and U.TENANTID=#{info.tenantId} AND U.USEREMAIL=#{info.userEmail}")
   Integer seletTenantIdAndUserEmail(@Param("info") LoginInfo info);

   @Select("SELECT COUNT(U.TENANTID) FROM USERS U,TENANT T WHERE U.TENANTID=T.TENANTID and T.TENANTID=#{info.tenantId} and U.TENANTID=#{info.tenantId} AND U.USER_NAME=#{info.userName}")
   Integer seletTenantIdAndUserName(@Param("info") LoginInfo info);

   @Select("SELECT COUNT(U.TENANTID) FROM USERS U,TENANT T WHERE U.TENANTID=T.TENANTID and T.TENANTID=#{info.tenantId} and U.TENANTID=#{info.tenantId} AND U.PHONE_NO=#{info.phoneNo}")
   Integer seletTenantIdAndPhoneNo(@Param("info") LoginInfo info);

   @Insert({"insert into tenant (tenantid,tenantname)values(#{info.tenantId},#{info.tenantName})"
           ,"insert into users(tenantid,userEmail,userPswd,lockbill,phone_no,user_name)values(#{info.tenantId},#{info.userEmail},#{info.userPswd},#{info.lockBill},#{info.phoneNo},#{info.userName})"})
   Integer insertTenantAndUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(@Param("info") LoginInfo info);

//   @Select("SELECT COUNT(U.TENANTID) FROM USERS U,TENANT T WHERE U.TENANTID=T.TENANTID and T.TENANTID=#{info.tenantId} and U.TENANTID=#{info.tenantId} AND U.USEREMAIL=#{info.userEmail} AND U.USER_NAME=#{info.userName} AND U.PHONE_NO=#{info.phoneNo}")
//   Integer seletTenantIdAndUserEmailAndUserNamePhoneNo(@Param("info")LoginInfo info);

   @Update("insert into users(tenantid,userEmail,userPswd,lockbill,phone_no,user_name)values(#{info.tenantId},#{info.userEmail},#{info.userPswd},#{info.lockBill},#{info.phoneNo},#{info.userName})")
   Integer insertUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(@Param("info") LoginInfo info);

   @Select("select count(tenantid) from tenant where tenantName=#{info.tenantName}")
   int countTenantName(@Param("info") LoginInfo info);


   List<LoginInfo> selectUserEditInfo(@Param("info") LoginInfo info);



   int updateUserInfo(LoginInfo info);//注意:没有@Param的话,直接就可以用info里面的字段

   @Select("SELECT tenantID AS tenantId,userEmail AS userEmail,phone_no AS phoneNo,user_Name AS userName from users where tenantId=#{tenantId} and (userEmail=#{userEmail} or phone_no=#{userEmail})")
    List<LoginInfo> selectUsers(@Param("tenantId") String tenantId, @Param("userEmail") String userEmail);



   List<PrdtSamp0> chanPinBianMaJianDangTiaoJianChaXun(PrdtSamp1 p1);
   Integer getCountOfDuoTiaoJianChaXunZongJiLuShu(PrdtSamp1 p1);

   @Select("Select top 1 prd_no from prdt where name=#{prdCode} order by prd_no desc")
   String selectTop1PrdtNo(@Param("prdCode") String prdCode);

   @Select("Select top 1 prd_no from prdt where IDX1=#{indx1} order by prd_no desc")
   String selectTop1MaxPrdtNo(@Param("indx1")String indx1);

   //prdCode对应name
   @Select({"insert into prdt(prd_no,idx1,name,rem,usr,chk_man)" +
           "values(#{prdNo},#{indx1},#{prdCode},#{SamplesSys},#{usr},#{chkMan})"})
   Integer insertPrdtOnePrdNo(@Param("prdNo") String prdNo,
                              @Param("indx1")String indx1,
                              @Param("prdCode") String prdCode,
                              @Param("usr")String usr,
                              @Param("chkMan")String chkMan);




    List<UpDefMy01> getUpDefMy(@Param("prdNo") String prdNo,@Param("priceId")String priceId);






}
