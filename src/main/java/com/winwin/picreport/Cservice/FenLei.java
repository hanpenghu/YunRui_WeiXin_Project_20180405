package com.winwin.picreport.Cservice;

import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import com.winwin.picreport.Ddao.reportxmlmapper.PrdtSampMapper;
import com.winwin.picreport.Edto.CategoryName;
import com.winwin.picreport.Edto.CategoryNameCode;
import com.winwin.picreport.Edto.FuZeRen;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Futils.FenYe;
import com.winwin.picreport.Futils.MessageGenerate;
import com.winwin.picreport.Futils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FenLei {
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

    public List<PrdtSamp> dangqianyeData(FenYe fenYe) {
        List<PrdtSamp> prdtSampList=new ArrayList<>();
        List<String> idList = manyTabSerch.selectDangQianYeSuoYouId(fenYe.getDangQianYe(), fenYe.getMeiYeXianShiShu());
        for(String id:idList){
            prdtSampList.add(prdtSampMapper.selectByPrimaryKey(id));
        }
        return prdtSampList;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////
    public FenYe daYangZongYeShuHeMeiYeXianShiShu() {
        FenYe fenYe=new FenYe();
        fenYe.setZongJiLuShu(manyTabSerch.dangYangZongJiLuShu());
        fenYe.setZongYeShu();
        return fenYe;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////