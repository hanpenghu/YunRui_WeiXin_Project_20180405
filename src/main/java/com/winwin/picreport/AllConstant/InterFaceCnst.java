package com.winwin.picreport.AllConstant;

//注意  接口中默认是常量   public static final
public interface InterFaceCnst {


    public static final String ContentTypeJsonAndCharsetUtf8="application/json;charset=utf-8";
    //dao层路径
     String daoCnst="com.winwin.picreport.Ddao";


    //分页测试接口//第一级路径不要加上 /d
     String itemsPage="itemsPage";

    String allYeWuYuan="allYeWuYuan";

     String base="/base";
     String allKeHu="allKeHu";
    //删除单个附件接口//路径加上 /d
     String deleteOneAttach="deleteOneAttach";
    //删除单个img//路径加上 /d
     String deleteOneImage="deleteOneImage";
    //delete 一条数据库信息并delete对应的图片和附件资源//路径加上 /d
     String deleteSomeRecode="deleteSomeRecode";
    //编辑信息 ,可以上传多张图片和附件//注意,徐勇用这个也做了确认信息时候上传附件的第二次调用接口// 路径加上 /d
     String imageUpLoadAndDataSave_InfoEdit_ManyAttach= "imageUpLoadAndDataSave_InfoEdit_ManyAttach";
    //信息保存用,不能用于编辑//路径加上 /d
     String imageUpLoadAndDataSaveOfManyAttach="imageUpLoadAndDataSaveOfManyAttach";
    /**
     * excel打样多条带图片的记录
     * 上传一个包含信息的excel到数据库
     * 这个一次只能穿一个附件
     * 用于同时上传缩略图(到springboot所在项目目录下某目录)和附件(到springboot所在项目目录下某目录)
     * 和打样信息(到数据库表prdt_samp)
     * 49保存成功,
     * 50保存失败
     * 路径加/d
     */
     String dataSaveByExcel="dataSaveByExcel";

    //带层级的分类路径加/d
     String allfenlei="allfenlei";
    //所有负责人路径加/d
     String fuZeRen="fuZeRen";
    //品牌     路径加/d
     String pinPai="pinPai";
    /**
     *确认单子  isconfirm变为1
     *
     * 47 打样确认成功 isconfirm=1

     48 打样确认 没成功 isconfirm=0
     确认订单的时候如果要穿  附件,请调用编辑信息的那个接口
     imageUpLoadAndDataSave_InfoEdit_ManyAttach
     注意调这个编辑接口的时候必须把原来的信息再传一遍,否则会更改信息
     路径加上 /d
     * */
     String confirmTheOrder="confirmTheOrder";
    //得到所有打样和未打样的混合数据  路径加上 /d
     String dangqianyeData="dangqianyeData";
    /**
     * 路径加上 /d
     *分页得到所有打样已确认的单子的数据,参数只要传过来当前页就行了
     * //默认每页显示数10
     * */
     String alReadyConfirmOrderPage="alReadyConfirmOrderPage";
    /**
     *得到所有打样未确认的单子第某页,这个不只是能得到第一页,还能得到很多页
     *路径加上 /d
     * */
     String notConfirmOrderFirstPage="notConfirmOrderFirstPage";

    /**
     * 路径加上 /d
     *根据条件查询产品编码建档   可以查询已打烊或者未打样,也可以查询所有,根据参数的不同
     * sql
     * chanPinBianMaJianDangTiaoJianChaXun
     * 此接口时间默认传时间戳(str格式)
     * //此接口已经用了动态sql,当不传入isConfirm 参数的时候,相当于查询所有符合条件的信息
     * 当传入isConfirm参数是0的时候,会查询所有未打样的符合条件的信息
     * */
    String chanPinBianMaJianDangTiaoJianChaXun="chanPinBianMaJianDangTiaoJianChaXun";





//    @西关大少 @等 今天：1、先把林展主要的功能操作弄好  2、把销售订单功能复制一份出来再上面弄
//    个菜单销售订单（只用到现在的导入订单主表mf_pos,tf_pos，不拆分不合并），原来那个命名为销售订单(SAP集成)
//
//2、弄了吗？
    
    String upLoadExcelDontMerageOfSaleOrder="upLoadExcelDontMerageOfSaleOrder";
    
    
    String allFactory="allFactory";//所有厂商接口,前面加    /base/allFactory


    String saveSaleOrBuyPrice="saveSaleOrBuyPrice";


    String CurrentType="CurrentType";

    String allUnit="allUnit";

    //通过当前的分类idxNo,查找所有的prdt里面的name
    String currentCategoryPrdtList="currentCategoryPrdtList";
    String getOneRecordFromAId="getOneRecordFromAId";
    String fenlei="fenlei";
}
