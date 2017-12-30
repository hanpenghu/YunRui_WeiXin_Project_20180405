package com.winwin.picreport.AllConstant;

public interface StatusCnst {



//    0代表初始状态
    String initStatu="0";
//1代表登录成功,
    String loginSucc="1";
//            2登录失败,数据库级别
    String loginFalse="2";
//3代表没有权限,
    String noPower="3";
//            4代表您没有登录
    String noLogin="4";
//5代表注册等待审核
    String alreadyRegistButWaitForPass="5";
//6注册并审核通过(您注册了一个新的公司和一个新的用户,公司名字为"+info.getTenantName()+",用户名为"+info.getUserEmail()+")
    String alReadyRegistAndPass="6";
//7代表登录成功并能够获取到数据
    String  alReadyLoginAndCanGetData="7";
//8该公司ID存在,该用户id也存在,请更换其他用户id(一个系统不允许2个相同的用户id)
    String theTenantIdAndUserIdSameAtSameTime="8";
//9该公司ID不存在但是该用户id都存在,请更换其他用户id(一个系统不允许2个相同的用户id)
    String tenantIdNotExistButUserIdExist="9";
//10数据库出现事务问题未能注册
    String dbHaveExceptionThenCantRegist="10";
//11前端传过来的数据是null
    String isNullFromFront="11";
//12注册的时候没有设置密码
    String noSecretWhenRegist="12";
//13注册密码和确认密码不一致
    String registSecretNotSameWithConfirmSecret="13";
//
//14成功安全退出
    String logoutSucc="14";
//15账号退出失败
    String logoutFalse="15";
//16您的公司ID不存在(登录的时候)
    String tenantIdNotExist="16";
//17您的用户ID不存在(登录的时候)
    String userIdNotExist="17";
//18您的用户密码不正确(登录的时候)
    String secretNotRight="18";
//19"注册并审核通过(您在一个已经存在的公司--公司id>"+info.getTenantId()+"--公司名>"+a001TongYongMapper.selectTenantName(info.getTenantId())+"-->注册了一个新的用户"+info.getUserEmail()+")"
    String alreadyRegistAndPass="19";
//        20 登录失败, 当用户传入的不是手机和email的时候,证明传入的是会员名,此时,如果登录失败,我只用了一个联合查询的sql,登录
    String loginFalseWhenUseUserName="20";
//    失败意味着  公司id 用户名,和密码之一都有可能错误,所以单列一个状态码
//
//21 注册的时候没有填写公司id
    String noTenantIdWhenURegist="21";
//22email,用户名,手机号至少填写一个
    String emailOrNameOrPhoneMustHaveOne="22";
//23 公司id已经存在
    String tenantIdAlreadyExist="23";
//
//24请更换email
    String changeUrEmail="24";
//25 请更换会员名
    String changeUrUserName="25";
//26 请更换电话号码
    String changeUrPhoneNo="26";
//27 email格式不对
    String notRightOfUrEmailFormat="27";
//28手机号码格式不对
    String notRightOfUrPhoneNoFormat="28";
//29 该用户名已经被占用
    String userNameAlreadyUse="29";
//30会员名必须有,因为将来用于制单人填写进excha的
    String userNameMustWrite="30";
//31没有会员名
    String haveNoUserName="31";
//
//
//32 到excha表保存成功
    String saveExchaSucc="32";
//33 到excha保存失败
    String saveExchaFalse="33";
//
//34  意味着您的某个字符串包含有系统级别的分隔符,不能用,例如!和;
    String uHaveIllegalCharInYorString="34";
//
//35  缩略图保存失败导致整个数据没保存(林展产品打样里面的)
    String thumSaveFalseThenAllDataSaveFalse="35";
//36附件没有保存成功导致所有数据没保存
    String attachSaveFalseThenAllDataSaveFalse="36";
//
//37产品打样保存一条数据成功
    String prdtSampSaveOneDataSucc="37";
//
//38产品打样失败,数据库系统级别错误
    String dbMistakeCausePrdtSampFalse="38" ;
//
//39  产品打样失败,前后端传输错误
    String fontTransferDataToBehindMistake="39";
//
//40产品打样前端没有传输过来唯一标志id
    String fontHaveGiveNoOnlyIdToBehind="40";
//
//41 上传的单个文件已经超过20M
    String uploadFileOverMaxSize="41";
//
//42删除记录失败
    String deleteRecordFalse="42";
//
//43要删除的图片是null
    String thePicIsNullWhatUWantDelete="43";
//
//44单张缩略图已经删除,单张附件已经删除也是这个
    String onePicOrOneAttachAlreadyDelete="44";
//
//45您可能只删除了附件或者数据库之中的一个
    String uMayBeDeleteAttachOrAttachPathInDBOne="45";
//
//46 prdt_samp表数据库没有这个id
    String prdt_sampTbHaveNoThisId="46";
//
//47 打样确认成功 isconfirm=1
    String prdtSampConfirmSucc1="47";
//
//48 打样确认 没成功 isconfirm=0
    String prdtSampConfirmFalse0="48";
//
//            49 excel保存成功
    String excelSaveSucc="49";
//
//50 excel保存失败//打样价格保存失败也可以用这个
    String excelSaveFalse="50";
}
