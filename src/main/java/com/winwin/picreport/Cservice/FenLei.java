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
            prdtSamp.setId(UUID.randomUUID().toString());
            ii = prdtSampMapper.insert(prdtSamp);
        } catch (Exception e) {
            ii=0;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~打样插入插入一条数据失败~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        list = new MessageGenerate().generateMessage(""+ii+"");
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