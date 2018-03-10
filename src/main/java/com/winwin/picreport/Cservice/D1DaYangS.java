package com.winwin.picreport.Cservice;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Bcontroller.daYang.dto.AlterPriceRecToFront;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.DateUtils.MakeDate1970Null;
import com.winwin.picreport.Futils.FenYe;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("fenLei")
public class D1DaYangS {
    @Autowired
    private Cnst cnst;

    //////////////////////////////////////////////////////////////////////////////////////////
    public List<CategoryNameCode> fenlei() {
        List<CategoryNameCode> categoryNameCodeList = new ArrayList<>();
        List<CategoryName> categoryNameList = cnst.manyTabSerch.fenlei();
        for (CategoryName categoryName : categoryNameList) {
            CategoryNameCode categoryNameCode = new CategoryNameCode();
            categoryNameCode.setIdxName(categoryName.getIdxName()).setIdxNo(categoryName.getIdxNo());
            List<String> codeList = cnst.manyTabSerch.getCodeList(categoryName.getIdxNo());
            categoryNameCode.setPrdCodeList(codeList);
            categoryNameCodeList.add(categoryNameCode);
        }
        return categoryNameCodeList;

    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<FuZeRen> fuZeRen() {
        List<FuZeRen> fuZeRenList = cnst.manyTabSerch.fuZeRen();
        return fuZeRenList;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<Msg> insertDaYang(PrdtSamp prdtSamp) {
        Integer ii = null;
        List<Msg> list;
        try {
            ii = cnst.prdtSampMapper.insert(prdtSamp);
        } catch (Exception e) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~打样插入一条数据失败~~~~~~~~~~~~~~~~~~~~~~~~");
            return MessageGenerate.generateMessage
                    ("保存失败", "保存失败",
                    "数据库系统级别错误", "", "38");
        }
        list = new MessageGenerate().generateMessage
                ("" + ii + "", "产品打样新增" + ii + "条数据",
                        "产品打样新增" + ii + "条数据", "", "37");
        return list;
    }

    public FenYe dangqianyeData(FenYe fenYe) {
        fenYe.setZongJiLuShu(cnst.manyTabSerch.dangYangZongJiLuShu());
        fenYe.setZongYeShu();
        List<PrdtSamp0> prdtSampList = new ArrayList<>();
        List<String> idList = cnst.manyTabSerch.selectDangQianYeSuoYouId
                (fenYe.getDangQianYe(), fenYe.getMeiYeXianShiShu());
        for (String id : idList) {
            PrdtSamp prdtSampX1 = cnst.prdtSampMapper.selectByPrimaryKey(id);
            PrdtSamp0 prdtSampX = this.getP0(prdtSampX1);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
          //后期的分类存在了prdt_Samp表,所以下面代码不要了     2018_2_27   weekday(2)   16:24:10

           /* //找到页面显示的产品名称的上级作为产品分类
            //先拿到产品名称的代号
            String idxNo = prdtSampX.getIdxNo();
            //通过idxno找到上级fenLeiNo
            //0000000000的肯定没上级
            if(p.bdy(Cnst.ten0,idxNo)){
                Map<String,String> fenLeis=cnst.a001TongYongMapper.getFenLeiNoFromIndx(idxNo);
                //fenLeis非空
                if(p.notEmpty(fenLeis)){
                    try {
                        prdtSampX.setFenLeiName(fenLeis.get(Cnst.fenLeiName));
                        prdtSampX.setFenLeiNo(fenLeis.get(Cnst.fenLeiNo));
                    } catch (Exception e) {
                        p.p(p.gp().sad(p.dexhx).sad(p.zhifgf).sad(p.zhifgf).sad(p.dexhx).gad());
                        p.p(p.gp().sad(p.dexhx).sad(p.strValeOf("prdtSampX.setFenLeiName(fenLeis.get(Cnst.fenLeiName));失败")).sad(p.dexhx).gad());
                        p.p(p.gp().sad(p.dexhx).sad(p.zhifgf).sad(p.zhifgf).sad(p.dexhx).gad());
//                e.printStackTrace();
                    }
                }
            }else{
                 p.p(p.gp().sad(p.dexhx).sad("idxNo=").sad(idxNo).sad(p.dexhx).gad());
            }*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            prdtSampList.add(prdtSampX);
        }
        fenYe.setPrdtSampList(prdtSampList);
        fenYe.setZongJiLuShu(cnst.manyTabSerch.getCountOfAll());
        fenYe.setZongYeShu();
        return fenYe;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Transactional
    public PrdtSamp0 getP0(PrdtSamp prdtSampX1) {
        PrdtSamp0 prdtSampX = new PrdtSamp0();
        BeanUtils.copyProperties(prdtSampX1, prdtSampX);
        Date insertdate = prdtSampX.getInsertdate();
        try {
            prdtSampX.setInsertdateStr(p.dtoStr(insertdate, p.d2));
            //添加价格模块//经过下一个方法,就会自动赋予一个模块
        } catch (Exception e) {
//        System.out.println("有一个insertdate无法format成insertdateStr,对应的id是："+id);
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //插入价格模块,走一遍这个模块就插入了
        cnst.getPriceModelUpdef.GetPriceModel(prdtSampX);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String prdtSampUuid = prdtSampX.getId();


        //插入价格修改记录模块
        //首先得到该id下的价格修改模块

        //根据id得到销售价格修改的
//        AlterPriceRecExample aa=new AlterPriceRecExample();
//        aa.createCriteria()
//                .andPrdtSampUuidEqualTo(prdtSampX.getId())
//                .andSaleOrBuyEqualTo("sale");
//        List<AlterPriceRec> saleAlterRecList = cnst.alterPriceRecMapper.selectByExample(aa);

        List<AlterPriceRecToFront> saleAlterRecList= cnst.a001TongYongMapper.selectTop20AlterPriceRec(prdtSampUuid,"sale");
        
        
        prdtSampX.setSaleAlterRecList(saleAlterRecList);

//根据id得到采购价格修改的
//        AlterPriceRecExample aaa=new AlterPriceRecExample();
//        aaa.createCriteria()
//                .andPrdtSampUuidEqualTo(prdtSampX.getId())
//                .andSaleOrBuyEqualTo("buy");
//        List<AlterPriceRec> buyAlterRecList = cnst.alterPriceRecMapper.selectByExample(aaa);

        List<AlterPriceRecToFront> buyAlterRecList =cnst.a001TongYongMapper.selectTop20AlterPriceRec(prdtSampUuid,"buy");
        prdtSampX.setBuyAlterRecList(buyAlterRecList);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        p.p("~~~~~~~~~~请求当前页的时候~~~prdtSampX.getStopusedate() ~~~~~~~~~~~1970没改变" + prdtSampX.getStopusedate() + "~~~~~~~~~~~~~~~~~~~~~~~~");
        //处理时间为1970的为NULL
        MakeDate1970Null.make1970null(prdtSampX);
        p.p("~~~~~~~~~请求当前页的时候~~~prdtSampX.getStopusedate() ~~~~~~~~~~~~~~~1970改变" + prdtSampX.getStopusedate() + "~~~~~~~~~~~~~~~~~~~~~~~~");
        return prdtSampX;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //销售价格列表
//    List<UpDefMy>upDefMyListSale=new ArrayList<>();
//    //采购价格列表
//    List<UpDefMy>upDefMyListByer=new ArrayList<>();


    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    public FenYe daYangZongYeShuHeMeiYeXianShiShu() {
        FenYe fenYe = new FenYe();

        fenYe.setZongJiLuShu(cnst.manyTabSerch.dangYangZongJiLuShu());
        fenYe.setZongYeShu();
        return fenYe;
    }

    /**
     ****************************************************************************************
     * 下面是按层级得到的分类
     * */

    /**
     * 先得到最上级,prdt的
     */

    public CategoryNameCode getCommonderHavePrdt() {
        //其实只有一个元素
        List<CategoryNameCode> commonders = cnst.manyTabSerch.getCommonder();
        if (NotEmpty.notEmpty(commonders)) {
            CategoryNameCode categoryNameCode = commonders.get(0);
            List<String> codeList = cnst.manyTabSerch.getCodeList(categoryNameCode.getIdxNo());
            categoryNameCode.setPrdCodeList(codeList);
            return categoryNameCode;
        }
        return null;
    }


    /**
     * 先得到最上级,不带prdt的
     */

    public CategoryNameCode getCommonderNoPrdt() {
        //其实只有一个元素
        List<CategoryNameCode> commonders = cnst.manyTabSerch.getCommonder();
        if (NotEmpty.notEmpty(commonders)) {
            CategoryNameCode categoryNameCode = commonders.get(0);
            return categoryNameCode;
        }
        return null;
    }

    /**
     * 找到某个CategoryNameCode的下级的下级,并封装商品编码(名字)进来
     */

    public CategoryNameCode getChildAndSetCode(CategoryNameCode cnc) {
        //找到所有的下级
        List<CategoryNameCode> ccnc = cnst.manyTabSerch.getChildCategoryNameCode(cnc.getIdxNo());
        //用一个新的list替换所有下级集合 来 搜集   装好 code的  所有下级
        List<CategoryNameCode> ccncListChild = new ArrayList<>();
        if (NotEmpty.notEmpty(ccnc)) {
            //给所有的下级添加货品名字
            for (CategoryNameCode c : ccnc) {
                List<String> codeList = cnst.manyTabSerch.getCodeList(c.getIdxNo());
                c.setPrdCodeList(codeList);
                ccncListChild.add(c);
            }
        } else {
            //如果size()==0,就设置为null,要不然就会产生一堆json垃圾
            ccncListChild = null;
        }
        return cnc.setChilds(ccncListChild);
    }


    /**
     * 找到某个CategoryNameCode的下级的下级,并封装商品编码(名字)进来
     */

    public CategoryNameCode getChildAndNotSetCode(CategoryNameCode cnc) {
        //找到所有的下级
        List<CategoryNameCode> ccnc = cnst.manyTabSerch.getChildCategoryNameCode(cnc.getIdxNo());
        //放入所有下级,不再放入商品
        return cnc.setChilds(ccnc);
    }

    /**
     * 得到所有层级,使用递归,得到带商品的
     */

    public CategoryNameCode getAllLayerUtilUseRecursionGetPrdt(CategoryNameCode top) {
        //设置该top的child
        top = this.getChildAndSetCode(top);
        List<CategoryNameCode> childs = top.getChilds();
        if (NotEmpty.notEmpty(childs)) {
            //寻找该childs里面的所有child的childs
            for (CategoryNameCode c : childs) {
                this.getAllLayerUtilUseRecursionGetPrdt(c);
            }
        }
        return top;
    }

    /**
     * 得到所有层级,使用递归,得到不带商品的
     */

    public CategoryNameCode getAllLayerUtilUseRecursionNotGetPrdt(CategoryNameCode top) {
        //设置该top的child
        top = this.getChildAndNotSetCode(top);
        List<CategoryNameCode> childs = top.getChilds();
        if (NotEmpty.notEmpty(childs)) {
            //寻找该childs里面的所有child的childs
            for (CategoryNameCode c : childs) {
                this.getAllLayerUtilUseRecursionNotGetPrdt(c);
            }
        }
        return top;
    }

    /**
     * 实现所有层级
     */

    public CategoryNameCode getAllLayerAndAllPrdt() {
        return this.getAllLayerUtilUseRecursionGetPrdt(this.getCommonderHavePrdt());


    }


    public CategoryNameCode getAllLayerNotHavePrdt() {
        Date date = new Date();
        CategoryNameCode allLayerUtilUseRecursionNotGetPrdt = this.getAllLayerUtilUseRecursionNotGetPrdt(this.getCommonderNoPrdt());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        p.p("该次得到所有没有prdt的分级耗时秒数为: " + p.xjs(new Date(), date));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        return allLayerUtilUseRecursionNotGetPrdt;


    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////