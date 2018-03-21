package com.winwin.picreport.Bcontroller.daYang;


import com.alibaba.fastjson.JSON;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Bcontroller.daYang.dto.AlterPrice;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.arraylist;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.stra;
import org.apache.juli.logging.LogFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class DingJiaXiuGai {
    private  Logger logger = LogManager.getLogger(this.getClass().getName());
    @Autowired
    private  Cnst cnst;
    //定价主要是修改up_def定价表
    // bil_type区分运费类型////bilType是01的是不含运费,是空("")的就是含运费
    //curId是区分币别的  USD代表美元,RMB代表人民币
    //priceId   //1代表销售的//2代表采购的
    //localhost:8070/dingJiaXiuGai
    //curIdBefore是原来的币别  dingJiaGuanLian+bilType+curIdBefore  确定唯一的一条数据
    //[{"dingJiaGuanLian":"","qty":"100","up":"44","unit":"","remFront":"阿里巴巴","bilType":"","curIdBefore":"RMB","curIdAfter":"USD"}]
    //改动后 alterTime不用传过来,我自己加上去"saleOrBuy"  要么为sale,要么为buy
//[{"dingJiaGuanLian":"","saleOrBuy":"sale","userName":"","tenantId":"","prdtCode":"","prdtSampUuid":"","qtyBefore":"100","qtyAfter":"100","upBefore":"44","upAfter":"44","unitBefore":"","unitAfter":"","remFrontBefore":"阿里巴巴","remFrontAfter":"阿里巴巴","bilType":"","curIdBefore":"RMB","curIdAfter":"USD"}]



    //定价修改传入值
  /* [
    {//dingJiaGuanLian+bilType+curIdBefore可以找到up_def的唯一一条数据
        //用来在up_def定价表定义唯一数据
        "dingJiaGuanLian": "SamplesSysd105df95-4ab5-4d55-869c-e54aa3e1b59c",
            //sale代表当前传入的是销售的定价修改
            "saleOrBuy": "sale",
            //修改人的用户名
            "userName": "hanpenghu",
            //修改人所在的公司
            "tenantId": "ipace",
            //产品编码//对应prdt表的name
            "prdtCode": "WW-NEPEP-0013",
            //打样主表prdt_samp里面的唯一对应值id
            "prdtSampUuid": "10478a3d-e981-40d6-92ee-4a07d6bb54b8",
            //数量区间修改前
            "qtyBefore": "900",
            //数量区间修改后
            "qtyAfter": "9100",
            //单价修改前
            "upBefore": "900",
            //修改后要入数据库的的单价
            "upAfter": "9100",
            //单位修改前,注意,主字在修改的时候是徐勇加上去,（但是在第一次存的时候我的字段分zhuUint和fuUnit,是我加的主）
            "unitBefore": "主:k",
            //单位修改后
            "unitAfter": "主:kg",
            //备注修改前
            "remFrontBefore": "阿里巴巴",
            //备注修改后
            "remFrontAfter": "阿里巴巴001",
            //用来在up_def定价表定义唯一数据
            "bilType": "01",
            //用来在up_def定价表定义唯一数据
            //币别修改前
            "curIdBefore": "USD",
            //币别修改后,人民币是RMB 美元是USD
            "curIdAfter": "USD"
    }
]*/
   //定价修改返回值


    /*{
        "data": null,
        //定价修改成功状态码
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
            "weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao": "",
            "auth": {
        "logistics": {
            "salesorder": {
                "page": "F"
            },
            "salesorderForSAP": {
                "page": "F"
            },
            "salesDetail": {
                "page": "F"
            },
            "productCode": {
                "page": "F"
            },
            "purchasePricing": {
                "page": "F"
            },
            "salesPricing": {
                "page": "F",
                        "part": {
                    "purchasePrice": "F",
                            "salesPrice": "F"
                }
            },
            "sampleConfirm": {
                "page": "F"
            }
        }
    }
    }*/

    @RequestMapping(value=Cnst.dingJiaXiuGai,method = RequestMethod.POST,
            produces = {InterFaceCnst.ContentTypeJsonAndCharsetUtf8})
    public @ResponseBody Msg dingJiaXiuGai(@RequestBody List<AlterPrice> alterPrices){

        p.p("--------定价修改,前端传过来的东西-----------------------------------------------");
        p.p(JSON.toJSONString(alterPrices));
        p.p("-------------------------------------------------------");
        //错误信息注册列表
        List<Object> msgs= arraylist.b().a("定价修改失败").a("定价修改成功").g();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(p.empty(alterPrices)){
            return Msg.gmg().setMsg("定价修改失败,前端传过来的是空数组或者null").setStatus("0");
        }

        try {
            return cnst.dingJiaXiuGaiService.dingJiaXiuGai(alterPrices);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(),e);
            //看msg是否在注册列表里面
            if(msgs.contains(e.getMessage())){
                return Msg.gmg().setMsg("定价修改失败").setChMsg(e.getMessage()).setStatus("0");
            }else{
                return Msg.gmg().setMsg("未知异常导致定价修改失败").setChMsg("未知异常").setStatus("0");
            }

        }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

//    public static void main(String[]args) throws ParseException {
//
//        Date parse = new SimpleDateFormat(p.d16).parse("2017-12-29 19:10:52.717");
//
//        p.p(p.gp().sad(p.dexhx)
//                 .sad(p.strValeOfNullSpace(parse.getTime())).sad(p.dexhx).gad());//1514545852717
//
//        p.p(p.gp().sad(p.dexhx).sad(p.dtoStr(p.sjc2Date("1514545852717"),p.d16)).sad(p.dexhx).gad());
//        //_________________2017-12-29 19:10:52.717_________________
//             p.p(p.gp().sad(p.dexhx).sad(p.dtoStr(p.sjc2Date(1514545852717L),p.d1)).sad(p.dexhx).gad());
//             //_________________2017-12-29 19:10:52,717_________________
//        p.p(p.gp().sad(p.dexhx).sad(p.dtoStr(p.sjc2Date(1514545852717L),p.d17)).sad(p.dexhx).gad());
//
//        p.p(p.gp().sad(p.dexhx).sad(p.dtoStr(p.sjc2Date(1518141121777L),p.d16)).sad(p.dexhx).gad());
//    }


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
