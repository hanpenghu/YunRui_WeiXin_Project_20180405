package com.winwin.picreport.Edto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
/**
 *该类是数据库映射出来的原始类
 * */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrdtSamp0 {
    //33个字段
     protected String id;//一条录入记录的唯一标识符号

     protected String prdCode;//产品编码

     protected String idxName;//产品名称

     protected String idxNo;//产品分类

     protected String markName;//品牌

     protected String markNo;//品牌编号

     protected String colour;//颜色

     protected String size;//尺寸
    //产品负责人
     protected String salName;
    //产品负责人编码
     protected String salNo;

     protected String cusNo;//客户编号

     protected String cusName;//客户名称

     protected String isfenjie;//是否分解//是否分解, y代表分解, n代表不分解
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    protected Date sampMake;//打样时间

     protected Date sampSend;//----样品寄出时间
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //样品要求
     protected String sampRequ;
    //样品描述
     protected String sampDesc;
    //---缩略图名字包含的路径字符串,用;隔开,路径里面有!导致用户的缩略名字不能有!和;
     protected String thum;

    //附件路径字符串,多个用;隔开,名字中的！做分隔符号
     protected String attach;
  ///////////////////////////////////////////////////////////////////////////
    //该条记录插入时间,数据库自动会添加DEFAULT一个getdate()
     protected Date insertdate;

     protected String confirmman;//确认人

     protected String confirmtimestr;//确认时间   直接带-的字符串

     protected Integer isconfirm;//是否确认，1代表已经确认  0代表未确认

     protected String category;//未知

     protected String teamname;//未知

     protected String confirmrem;//确认备注

     protected String unit;//单位

     protected String businessdesc;//业务描述

     protected String financedesc;//财务描述

     protected BigDecimal startsellcount;//起订数量//json可以直接转换输出给外部

     protected BigDecimal modelcost;//财务模具费

     protected BigDecimal estimateprice;//预估价

     protected BigDecimal littleorderprice;//财务小单费


}