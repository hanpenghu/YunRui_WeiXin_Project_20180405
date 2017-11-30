package com.winwin.picreport.Bcontroller;

import com.winwin.picreport.Cservice.FenLei;
import com.winwin.picreport.Ddao.reportxmlmapper.ManyTabSerch;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.FenYe;
import com.winwin.picreport.Futils.MessageGenerate;
import com.winwin.picreport.Futils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/d")
public class D1DaYangController {
      @Autowired
      private FenLei fenLei;
    @Autowired
    private ManyTabSerch manyTabSerch;
    @RequestMapping(value="fenlei",method = RequestMethod.POST,produces ={"application/json;charset=utf-8"})
    public @ResponseBody List<CategoryNameCode> fenlei(){
        List<CategoryNameCode> categoryNameCodeList=fenLei.fenlei();
        return categoryNameCodeList;
    }
    @RequestMapping(value="fenleitest",method = RequestMethod.GET,produces ={"application/json;charset=utf-8"})
    public @ResponseBody List<CategoryNameCode> fenleitest(){
        List<CategoryNameCode> categoryNameCodeList=fenLei.fenlei();
        return categoryNameCodeList;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping(value="fuZeRen",method = RequestMethod.POST,produces ={"application/json;charset=utf-8"})
    public @ResponseBody List<FuZeRen> fuZeRen(){
        List<FuZeRen> fuZeRenList=fenLei.fuZeRen();
        return fuZeRenList;
    }

    @RequestMapping(value="fuZeRentest",method = RequestMethod.GET,produces ={"application/json;charset=utf-8"})
    public @ResponseBody List<FuZeRen> fuZeRentest(){
        List<FuZeRen> fuZeRenList=fenLei.fuZeRen();
        return fuZeRenList;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value="pinPai",method = RequestMethod.POST,produces ={"application/json;charset=utf-8"})
    public @ResponseBody List<PinPai> pinPai(){
        List<PinPai> fuZeRenList=manyTabSerch.pinPai();
        return fuZeRenList;
    }


    @RequestMapping(value="pinPaitest",method = RequestMethod.GET,produces ={"application/json;charset=utf-8"})
    public @ResponseBody List<PinPai> pinPaitest(){
        List<PinPai> fuZeRenList=manyTabSerch.pinPai();
        return fuZeRenList;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//客户以前写过了,在A0BaseInfoController

    /*@RequestMapping(value="keHutest",method = RequestMethod.GET,produces ={"application/json;charset=utf-8"})
public @ResponseBody List<KeHu> keHutest(){
    List<PinPai> fuZeRenList=manyTabSerch.keHu();
    return fuZeRenList;
}*/


/////////////////////////////////////////////list///////////////////////////////////////////////////////
    @RequestMapping(value="insertDaYang",method = RequestMethod.POST,produces ={"application/json;charset=utf-8"})
    public @ResponseBody List<Msg> insertDaYang(@RequestBody PrdtSamp prdtSamp){
        List<Msg> list=fenLei.insertDaYang(prdtSamp);
        return list;
    }
///////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////徐勇页面展示第一次调的接口,注意顺带返回了第一页的信息////////////////////////////////////////////////////////////////////
@RequestMapping(value="daYangZongYeShuHeMeiYeXianShiShu",method= RequestMethod.POST,produces = {"application/json;charset=utf-8"})
public @ResponseBody FenYe daYangZongYeShuHeMeiYeXianShiShu(){
    FenYe fenYe =fenLei.daYangZongYeShuHeMeiYeXianShiShu();//主要传过来当前页和每页显示数量
    fenYe.setDangQianYe(1);
    List<PrdtSamp> prdtSampList =fenLei.dangqianyeData(fenYe);
    fenYe.setPrdtSampList(prdtSampList);
    return fenYe;
}

@RequestMapping(value="daYangZongYeShuHeMeiYeXianShiShutest",method= RequestMethod.GET,produces = {"application/json;charset=utf-8"})
public @ResponseBody FenYe daYangZongYeShuHeMeiYeXianShiShutest(){
    FenYe fenYe =this.daYangZongYeShuHeMeiYeXianShiShu();
    return fenYe;
}






//////////////////////////////徐勇页面,用户大于等于第二次点击某一页的时候调的接口/////////////////////////////////////////
@RequestMapping(value="dangqianyeData",method= RequestMethod.POST,produces = {"application/json;charset=utf-8"})
public @ResponseBody List<PrdtSamp> dangqianyeData(@RequestBody FenYe fenYe){
    List<PrdtSamp> prdtSampList =fenLei.dangqianyeData(fenYe);//主要传过来当前页和每页显示数量
    return prdtSampList;
}


    @RequestMapping(value="dangqianyeDatatest",method= RequestMethod.GET,produces = {"application/json;charset=utf-8"})
    public @ResponseBody List<PrdtSamp> dangqianyeDatatest(FenYe fenYe){
        List<PrdtSamp> prdtSampList =fenLei.dangqianyeData(fenYe);//主要传过来当前页和每页显示数量
        return prdtSampList;
    }
///////////////////////////////////////////////////////////////////////////////////////////////
}
