package com.winwin.picreport.Cservice;

import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import com.winwin.picreport.Ddao.reportxmlmapper.PrdtSampMapper;
import com.winwin.picreport.Edto.CategoryName;
import com.winwin.picreport.Edto.CategoryNameCode;
import com.winwin.picreport.Edto.FuZeRen;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Futils.FenYe;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("fenLei")
public class D1DaYangServiceFenLei {
    @Autowired
    private PrdtSampMapper prdtSampMapper;
    @Autowired
    private ManyTabSerch manyTabSerch;
//////////////////////////////////////////////////////////////////////////////////////////
    public List<CategoryNameCode> fenlei() {
        List<CategoryNameCode>categoryNameCodeList=new ArrayList<>();
        List<CategoryName>categoryNameList = manyTabSerch.fenlei();
        for(CategoryName categoryName:categoryNameList){
            CategoryNameCode categoryNameCode=new CategoryNameCode();
            categoryNameCode.setIdxName(categoryName.getIdxName()).setIdxNo(categoryName.getIdxNo());
            List<String> codeList=manyTabSerch.getCodeList(categoryName.getIdxNo());
            categoryNameCode.setPrdCodeList(codeList);
            categoryNameCodeList.add(categoryNameCode);
        }
        return  categoryNameCodeList;

    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<FuZeRen> fuZeRen() {
        List<FuZeRen> fuZeRenList= manyTabSerch.fuZeRen();
        return fuZeRenList;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<Msg> insertDaYang(PrdtSamp prdtSamp) {
        Integer ii= null;
        List<Msg> list;
        try {
            ii = prdtSampMapper.insert(prdtSamp);
        } catch (Exception e) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~打样插入一条数据失败~~~~~~~~~~~~~~~~~~~~~~~~");
            return MessageGenerate.generateMessage("保存失败","保存失败","数据库系统级别错误","","38");
        }
        list = new MessageGenerate().generateMessage(""+ii+"","产品打样新增"+ii+"条数据","产品打样新增"+ii+"条数据","","37");
        return list;
    }

    public FenYe dangqianyeData(FenYe fenYe) {
        fenYe.setZongJiLuShu(manyTabSerch.dangYangZongJiLuShu());
        fenYe.setZongYeShu();
        List<PrdtSamp> prdtSampList=new ArrayList<>();
        List<String> idList = manyTabSerch.selectDangQianYeSuoYouId(fenYe.getDangQianYe(), fenYe.getMeiYeXianShiShu());
        for(String id:idList){
            PrdtSamp prdtSampX = prdtSampMapper.selectByPrimaryKey(id);
            Date insertdate = prdtSampX.getInsertdate();
            try {
                String insertdateStr= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(insertdate);
                prdtSampX.setInsertdateStr(insertdateStr);
            } catch (Exception e) {
                System.out.println("有一个insertdate无法format成insertdateStr,对应的id是："+id);
            }
            prdtSampList.add(prdtSampX);
        }
        fenYe.setPrdtSampList(prdtSampList);
        fenYe.setZongJiLuShu(manyTabSerch.getCountOfAll());
        fenYe.setZongYeShu();
        return fenYe;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////
    public FenYe daYangZongYeShuHeMeiYeXianShiShu() {
        FenYe fenYe=new FenYe();

        fenYe.setZongJiLuShu(manyTabSerch.dangYangZongJiLuShu());
        fenYe.setZongYeShu();
        return fenYe;
    }

    /**
     ****************************************************************************************
     * 下面是按层级得到的分类
     * */

    /**
     *先得到最上级
     * */

    public CategoryNameCode getCommonder(){
     //其实只有一个元素
        List<CategoryNameCode> commonders = manyTabSerch.getCommonder();
        if(NotEmpty.notEmpty(commonders)){
            CategoryNameCode categoryNameCode = commonders.get(0);
            List<String> codeList=manyTabSerch.getCodeList(categoryNameCode.getIdxNo());
            categoryNameCode.setPrdCodeList(codeList);
            return categoryNameCode;
        }
        return null;
    }


    /**
     *找到某个CategoryNameCode的下级的下级,并封装进来
     * */

    public CategoryNameCode getChildAndSet(CategoryNameCode cnc){
        //找到所有的下级
        List<CategoryNameCode> ccnc = manyTabSerch.getChildCategoryNameCode(cnc.getIdxNo());
        //用一个新的list替换所有下级集合 来 搜集   装好 code的  所有下级
        List<CategoryNameCode> ccncListChild=new ArrayList<>();
        if(NotEmpty.notEmpty(ccnc)){
            //给所有的下级添加货品名字
            for(CategoryNameCode c :ccnc){
                List<String> codeList=manyTabSerch.getCodeList(c.getIdxNo());
                c.setPrdCodeList(codeList);
                ccncListChild.add(c);
            }
        }else{
            //如果size()==0,就设置为null,要不然就会产生一堆json垃圾
            ccncListChild=null;
        }
        return cnc.setChilds(ccncListChild);
    }

    /**
     *得到所有层级
     * */

    public CategoryNameCode getAllLayerUtil(CategoryNameCode top){
        //设置该top的child
        top = this.getChildAndSet(top);
        List<CategoryNameCode> childs = top.getChilds();
        if(NotEmpty.notEmpty(childs)){
            //寻找该childs里面的所有child的childs
            for(CategoryNameCode c:childs){
                this.getAllLayerUtil(c);
            }
        }
        return top;
    }

    /**
     *实现所有层级
     * */

    public CategoryNameCode getAllLayer(){
        return this.getAllLayerUtil(this.getCommonder());
    }




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////