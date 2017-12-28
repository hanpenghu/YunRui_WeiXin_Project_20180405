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
    //bilType是01的是不含运费
    protected String bilType;
    //定价日期
    protected Date sDd;
    //从数据库拿到的价格
    protected BigDecimal up;
    //下面两个不从数据库取出来,而是根据根据bilType是否等于01来用up分配
    //不含运费单价//up_def中bil_type=01
    protected BigDecimal noTransUp;//
    //含运费单价//up_def中bil_type!=01
    protected BigDecimal haveTransUp;//
    //数量
    protected BigDecimal qty;
    //单位
    protected String unit;//
    //币别
    protected String curId;
    //币名
    protected String curName;
    //是否是打样系统录入的单价//如果是打样系统的,就会有四个字
    // "打样系统"
    protected String remOfPrdtSampOs;
}