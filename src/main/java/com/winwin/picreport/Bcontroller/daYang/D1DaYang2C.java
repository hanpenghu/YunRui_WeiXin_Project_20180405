package com.winwin.picreport.Bcontroller.daYang;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Edto.PrdtSamp0;
import com.winwin.picreport.Edto.PrdtSamp1;
import com.winwin.picreport.Edto.UpDefMy01;
import com.winwin.picreport.Futils.FenYe;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.stra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@CrossOrigin
@RestController
public class D1DaYang2C {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Autowired
    private Cnst cnst;
    /**
     *根据条件查询产品编码建档
     * sql
     * chanPinBianMaJianDangTiaoJianChaXun
     * 此接口时间默认传时间戳(str格式)
     * //此接口已经用了动态sql,当不传入isConfirm 参数的时候,相当于查询所有符合条件的信息
     * 当传入isConfirm参数是0的时候,会查询所有未打样的符合条件的信息
     * */
    @RequestMapping(value= InterFaceCnst
            .chanPinBianMaJianDangTiaoJianChaXun,
            method = RequestMethod.POST)
    public @ResponseBody
    FenYe f(@RequestBody FenYe fenYe){
        if(fenYe==null){
            FenYe f=new FenYe();
            ArrayList<PrdtSamp0> prdtSamps = new ArrayList<>();
            f.setPrdtSampList(prdtSamps);
            return f;
        }else{
            try {
                return  this.manyConditionSearchOfPrdtFiltList(fenYe);
            } catch (IllegalAccessException e) {
                FenYe f1=new FenYe();
                ArrayList<PrdtSamp0> prdtSamps1 = new ArrayList<>();
                f1.setPrdtSampList(prdtSamps1);
                return f1;
            }
        }
    }



    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *多条件产品打样列表
     * */
    private FenYe manyConditionSearchOfPrdtFiltList(FenYe f) throws IllegalAccessException {
        PrdtSamp1 p1 = f.getPrdtSamp1();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~转换前多条件的条件实验~~~~~~~~~~~~~~~~~~~~~~~~");
        p.p(p1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        //注意,Select,不用写在service里面也可以
        //得到创建开始时间时间戳
        String insertdateStr = p1.getInsertdateStr();
        //将创建开始时间戳转换为Date格式
        Date date = p.sjc2Date(insertdateStr);
        //得到创建结束时间时间戳
        String insertdateStrEnd = p1.getInsertdateStrEnd();
        //将创建结束时间戳转换成Date
        Date date1 = p.sjc2Date(insertdateStrEnd);
        //得到确认开始时间str
        String confirmtimestr = p1.getConfirmtimestr();
        //将确认开始时间戳转换成Date
        Date date2 = p.sjc2Date(confirmtimestr);
        //得到确认结束时间戳str
        String confirmtimestrEnd = p1.getConfirmtimestrEnd();
        //得到确认结束时间date
        Date date3 = p.sjc2Date(confirmtimestrEnd);

        p1.setInsertdate(date);
        p1.setInsertdateEnd(date1);
        p1.setConfirmtime(date2);
        p1.setConfirmtimeEnd(date3);
        //从新定义p1的时间戳str为一定格式的时间  带-时间,将来在sql里要用这个str时间
        p1.setInsertdateStr(p.dtoStr(date,p.d2));
        p1.setInsertdateStrEnd(p.dtoStr(date1,p.d2));
        p1.setConfirmtimestr(p.dtoStr(date2,p.d2));
        p1.setConfirmtimestrEnd(p.dtoStr(date3,p.d2));
        p1 = (PrdtSamp1) p.StringTypeNull2Space(p1);

        //把每页显示数和当前页设置进去
        if(f.getMeiYeXianShiShu()==null){
            p1.setMeiYeXianShiShu(10);
        }else{
            p1.setMeiYeXianShiShu(f.getMeiYeXianShiShu());
        }
        if(f.getDangQianYe()==null){
            p1.setDangQianYe(1);
        }else{
            p1.setDangQianYe(f.getDangQianYe());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~转换后多条件的条件实验~~~~~~~~~~~~~~~~~~~~~~~~");
        p.p(p1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        List<PrdtSamp0> prdtSampList = cnst.a001TongYongMapper
                .chanPinBianMaJianDangTiaoJianChaXun(p1);



        p.p(p.zhifgf);
        p.p(prdtSampList);
        p.p(p.zhifgf);



        p.p(prdtSampList);
        f.setPrdtSampList(prdtSampList);
        //我在这个方法中顺便调了setZongYeShu()方法
        f.setZongJiLuShu(cnst.a001TongYongMapper.getCountOfDuoTiaoJianChaXunZongJiLuShu(p1));
        return f;


    }














//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////