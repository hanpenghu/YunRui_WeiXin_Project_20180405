package com.winwin.picreport.Edto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

//我的定价表
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UpDefMy {

    //1代表销售的//2代表采购的
    protected String priceId;
    //bilType是01的是不含运费
    protected String bilType;
    //从数据库拿到的价格
    protected BigDecimal up;
    //是否是打样系统录入的单价//如果是打样系统的,就会有四个字
    // "打样系统"
    protected String remOfPrdtSampOs;


    //定价日期
    protected Date sDd;

    //数量
    protected BigDecimal qty;
    //单位
    protected String unit;//
    //币别
    protected String curId;
    //币名
    protected String curName;

}