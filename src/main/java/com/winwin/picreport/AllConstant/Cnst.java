package com.winwin.picreport.AllConstant;

import com.winwin.picreport.Cservice.*;
import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import com.winwin.picreport.Ddao.reportxmlmapper.PrdtSampMapper;
import com.winwin.picreport.Futils.SpringbootJarPath;
import com.winwin.picreport.Futils.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

@Order(2)
@Component("cnst")
public class Cnst {
    public static final String  xlsHouZhuiWuDian="xls";
    public static final String  xieGang="/";
    public static final String  xlsxHouZhuiWuDian="xlsx";
    public static final String  pngWuDian="png";
    public static final String  xlsxHouZhui=".xlsx";
    //保存excel中的数据为打样数据的时候一般是第0个sheet
    public static final String  sheetNo="0";
    //保存excel中的数据为打样数据的时候图片固定在第5列(从0)
    public static final String  picColumn="5";
    //保存excel中的数据为打样数据的时候图片位置三维分隔符,网上复制的代码用的这个分隔符
    public static final String  picFgf="_";

    public static final String  dian=".";
    public static final String  space="";
    public static final String  ganTanHao="!";
    public static final String  fenHao=";";

    public static String getProjectPath(){
        return  SpringbootJarPath.JarLuJingGet();
    }

    //这个路径是springbootjar运行后深入到缩略图文件夹中的路径最后带个/
    public  String getSpringbootJarSuoLueTuFilePath(){
       return  p.gp().sad(Cnst.getProjectPath())
                .sad(daYangSuoLueTuAndFuJianZongPath.replace(Cnst.dian, Cnst.space))
                .sad(suoLueTuWenJianJia).gad();
    }


    @Autowired
    public A001TongYongMapper a001TongYongMapper;


    public Date getDbDate(){
        return a001TongYongMapper.selectDbDate();
    }

    @Autowired
    public Z100TestPageBeanService zt;
    @Autowired
    public  D1DaYangServiceDataSaveByExcel d1DaYangServiceDataSaveByExcel;
    @Autowired
    public PrdtSampMapper prdtSampMapper;
    @Autowired
    public D1DaYangService_ImageUpLoadAndDataSave001_InfoEdit infoEdit;

    @Autowired
    public D1DaYangService_ConfirmOrder dco;

    @Autowired
    public D1DaYangService_ImageUpLoadAndDataSave001_InfoEdit_ManyAttach infoEditOfManyAttach;

    @Value("${tokenShiXiaoShiJian_haoMiao}")
    public String tokenShiXiaoShiJian_haoMiao;

    @Value("${excelDaoRuDaYangPicLinShiMulu}")
    public String excelDaoRuDaYangPicLinShiMulu;

    @Autowired
    public D1DaYangService d1DaYangService;

    @Value("${dirUrl}")
    public String dirUrl;

    @Value("${suoLueTuWenJianJia}")
    public String suoLueTuWenJianJia;

    @Value("${fuJianWenJianJia}")
    public String fuJianWenJianJia;



    //daYangSuoLueTuAndFuJianZongPath=./daYangSuoLueTuAndFuJianZongPath/
    @Value("${daYangSuoLueTuAndFuJianZongPath}")//./1234567/
    public String daYangSuoLueTuAndFuJianZongPath;



    @Autowired
    public D1DaYangServiceFenLei fenLei;
    @Autowired
    public ManyTabSerch manyTabSerch;


    //    @Autowired
//    public PrdtSampMapper prdtSampMapper;
    @Autowired
    public D1DaYangServiceOfDeleteSome deleteSome;




    @Autowired
    public D1DaYangServiceOfDeleteOneImg deleteOneImg;


    /**
     *下面是mybatis分页插件要用的东西
     * */

    public static final String offsetAsPageNum= "offsetAsPageNum";
    public static final String trueStr= "true";
    public static final String falseStr= "false";
    public static final String rowBoundsWithCount= "rowBoundsWithCount";
    public static final String reasonable= "reasonable";
    public static final String dialect= "dialect";
    public static final String mysql= "mysql";
    public static final String sqlServer= "sqlServer";
    
}
