package com.winwin.picreport.Bcontroller;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSamp1;
import com.winwin.picreport.Futils.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@CrossOrigin
@RestController
public class D1DaYang2Controller {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Autowired
    private Cnst cnst;
    /**
     *根据条件查询产品编码建档
     * sql
     * chanPinBianMaJianDangTiaoJianChaXun
     * 此接口时间默认传时间戳(str格式)
     * */
    @RequestMapping(value="chanPinBianMaJianDangTiaoJianChaXun",method = RequestMethod.POST)
    public @ResponseBody List<PrdtSamp> f(@RequestBody PrdtSamp1 p1){
        if(p1==null){

            return new ArrayList<>();
        }else{

            try {
                return  a多条件查询产品打样列表(p1);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return new ArrayList<>();
            }
        }
    }












    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<PrdtSamp> a多条件查询产品打样列表(PrdtSamp1 p1) throws IllegalAccessException {
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
        p1 = (PrdtSamp1) p.columnIsStringTypeNull2Space(p1);
        p.p(p1.getInsertdateStr());
        p.p(p1.getInsertdateStrEnd());
        p.p(p1.getConfirmtimestr());
        p.p(p1.getConfirmtimestrEnd());
        return cnst.a001TongYongMapper.chanPinBianMaJianDangTiaoJianChaXun(p1);


    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////