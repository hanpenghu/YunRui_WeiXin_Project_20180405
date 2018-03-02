package com.winwin.picreport.Bcontroller.PicSearchPic.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class CnstO {
    @Value("${tuPianShangChuanDaoMaLongDeURL}")
    public  String tuPianShangChuanDaoMaLongDeURL;

    //打样缩略图和附件所在的总路径
//    daYangSuoLueTuAndFuJianZongPath=./daYangSuoLueTuAndFuJianZongPath/
    @Value("${daYangSuoLueTuAndFuJianZongPath}")
    public  String daYangSuoLueTuAndFuJianZongPath;

    //得到缩略图文件夹字符串
//    suoLueTuWenJianJia=suoLueTuWenJianJia/

    @Value("${suoLueTuWenJianJia}")
    public  String suoLueTuWenJianJia;

}
