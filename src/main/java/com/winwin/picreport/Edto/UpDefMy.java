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
    //定价日期
    private Date sDd;
    //单价
    private BigDecimal up;//
    //数量
    private BigDecimal qty;
    //单位
    private String unit;//
    //币别
    private String curId;
    //币名
    private String curName;
}