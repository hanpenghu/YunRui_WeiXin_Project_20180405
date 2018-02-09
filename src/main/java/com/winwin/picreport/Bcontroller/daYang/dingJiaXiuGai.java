package com.winwin.picreport.Bcontroller.daYang;


import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.AllConstant.OrderPreCnst;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class dingJiaXiuGai {

    @Autowired
    private  Cnst cnst;
    //定价主要是修改up_def定价表
    // bil_type区分运费类型////bilType是01的是不含运费,是空("")的就是含运费
    //curId是区分币别的  USD代表美元,RMB代表人民币
    //priceId   //1代表销售的//2代表采购的
    //localhost:8070/dingJiaXiuGai
    //[{"dingJiaGuanLian":"","curId":"RMB","qty":"100","up":"44","unit":"","remFront":"阿里巴巴","bilType":"","sDd":"1514545852717"}]
    //
    @RequestMapping(value=Cnst.dingJiaXiuGai,method = RequestMethod.POST,
            produces = {InterFaceCnst.ContentTypeJsonAndCharsetUtf8})
    @Transactional
    public @ResponseBody Msg dingJiaXiuGai(@RequestBody List<Map<String,String>> maps){

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //对应up_def中的oleField//对应唯一码
//        map.get(Cnst.dingJiaGuanLian);
//        //对应up_def中的cur_id//币别
//        map.get(Cnst.curId);
//        //对应up_def中的bil_type//对应是否包含运费,01是不含运费
//        map.get(Cnst.bilType);
//        //qty对应数据库的qty,对应页面的数量区间
//        map.get(Cnst.qty);
//        //up,单价,对应数据库up,
//        map.get(Cnst.up);
//        //单位unit对应数据库hj_no
//        map.get(Cnst.unit);
//        //remFront对应数据库的rem字段备注
//        map.get(Cnst.remFront);
//        //sDd,前端传过来的时间戳,对应数据库的s_Dd
//        map.get(Cnst.sDd);
        try {
            for(Map<String,String>map:maps){

                //把时间戳转换成一定格式的String
                String sDdStr = p.sjc2StrDate(map.get(Cnst.sDd), p.d16);
                sDdStr=p.empty(sDdStr)?p.space:sDdStr;
                //其中dingJiaGuanLian(oleField)+bilType+sDd可以形成联合主键进行某条记录的修改
                map.put(Cnst.dingJiaZhuJian,
                        map.get(Cnst.dingJiaGuanLian)
                        +map.get(Cnst.bilType)+sDdStr
//                        +p.dtoStr(p.sjc2Date(map.get(Cnst.sDd)),p.d16)
                );

                 p.p(p.gp().sad(p.dexhx)
                         .sad(p.strValeOf(
                                 map.get(Cnst.dingJiaZhuJian)//需要打印的东西
                         ))
                         .sad(p.dexhx).gad());

                Integer i=cnst.a001TongYongMapper.updateUpdef(map);
                if(i==1){
                    //修改成功继续修改下一个
                }else{
                    throw new RuntimeException("定价修改失败");
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            return Msg.gmg().setMsg("定价修改失败").setStatus("0");
        }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        return Msg.gmg().setMsg("定价修改成功").setStatus("1");
    }

    public static void main(String[]args) throws ParseException {

        Date parse = new SimpleDateFormat(p.d16).parse("2017-12-29 19:10:52.717");

        p.p(p.gp().sad(p.dexhx)
                 .sad(p.strValeOf(parse.getTime())).sad(p.dexhx).gad());//1514545852717

        p.p(p.gp().sad(p.dexhx).sad(p.dtoStr(p.sjc2Date("1514545852717"),p.d16)).sad(p.dexhx).gad());
        //_________________2017-12-29 19:10:52.717_________________
             p.p(p.gp().sad(p.dexhx).sad(p.dtoStr(p.sjc2Date(1514545852717L),p.d1)).sad(p.dexhx).gad());
             //_________________2017-12-29 19:10:52,717_________________
        p.p(p.gp().sad(p.dexhx).sad(p.dtoStr(p.sjc2Date(1514545852717L),p.d17)).sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad(p.dtoStr(p.sjc2Date(1518141121777L),p.d16)).sad(p.dexhx).gad());
    }


}


//结果如下
/*
{
        "data": null,
        "status": "1",
        "xiaoHaoShiJian": "",
        "msg": "定价修改成功",
        "chMsg": "",
        "otherMsg": "",
        "token": "",
        "tenantId": "",
        "tenantName": "",
        "userEmail": "",
        "notExsitThisPrdtNoInPrdtTab": "",
        "weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao": ""
        }*/
