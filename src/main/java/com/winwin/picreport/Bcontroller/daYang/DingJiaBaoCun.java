package com.winwin.picreport.Bcontroller.daYang;


import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Edto.UpDefMy01;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.stra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class DingJiaBaoCun {

    @Autowired
    private Cnst cnst;

    /**
     *采购价格和销售价格的保存放在一个接口
     * //不含运费单价的采购价格//up_def中bil_type=01
     BigDecimal noTransUpBuy;//
     //含运费单价采购价格//up_def中bil_type!=01
     BigDecimal haveTransUpBuy;//


     //不含运费单价的销售价格//up_def中bil_type=01
     BigDecimal noTransUpSale;//
     //含运费单价销售价格//up_def中bil_type!=01
     BigDecimal haveTransUpSale;//

     上面四个字段可以区分采购和销售,
     比如当noTransUpBuy和haveTransUpBuy都为null的时候肯定是  销售的要保存
     销售 传入方式//币别徐勇来拆,运费我来拆分


     {"uuid":"填入给前端的唯一标识","noTransUpSale":"没有运费的销售定价",
     "haveTransUpSale":"有运费的销售定价","curId":"RMB","curName":"人民币","remFront":"客户备注","qty":"数量","unitZhu":"","unitFu":""}


     采购传入方式//币别徐勇来拆,运费我来拆分


     {"uuid":"填入给前端的唯一标识","noTransUpBuy":"没有运费的采购定价",
     "haveTransUpBuy":"有运费的采购定价","curId":"RMB","curName":"人民币","remFront":"客户备注","qty":"数量","unitZhu":"","unitFu":""}


     unitZhu指的是主单位

     //地址   ip地址:8070/saveSaleOrBuyPrice
     http://127.0.0.1:8070/saveSaleOrBuyPrice?token=MTUyMDQ5MDMyNDk5NXt-fWlwYWNle359MTM2NDE5Mjg3NDE=
     * */

    //传入参数,注意保存的时候是按unitZhu和unitFu传入的,
    // （但是修改的时候穿的是unit,直接是  主:  或者  副:）
    //注意参数有2中形式,一种如下面的销售价格,还有一种是采购价格的保存的,上面说的有
/*[
    {
        "uuid": "10478a3d-e981-40d6-92ee-4a07d6bb54b8",//来自prdt_samp的唯一标识
            "noTransUpSale": "100",//无运费销售价格
            "haveTransUpSale": "120",
            "curId": "RMB",
            "curName": "人民币",
            "remFront": "客户备注",
            "qty": "100",
            "unitZhu": "包"
    }
]*/
//返回结果
   /* {
        "data": null,
            "status": "49",--成功状态码--50是失败
            "xiaoHaoShiJian": "",
            "msg": "保存销售价格的成功",
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
   //49成功,50失败
    //保存采购和销售价格
    //保存采购的时候要供应商不要客户,保存销售的时候供应商和客户都不要
    @RequestMapping(value= InterFaceCnst.saveSaleOrBuyPrice,method = RequestMethod.POST)
    public @ResponseBody
    Msg saveSaleOrBuyPrice(@RequestBody List<UpDefMy01> ups){//一般传过来2个,一个本币,一个外币

        //生成界面依次插入的四条记录的关联的uuid
        String uid = p.uuid();
        ups.forEach(v->v.setDingJiaGuanLian(stra.b().a(Cnst.SamplesSys).a(uid).g()));

//        synchronized (this){

        p.p("-------------------------------！！！！！！保存价格开始！！！！！--------------------------------------");
        return cnst.saveSaleOrBuyPrice.saveSaleOrBuyPrice0(ups);
//            p.p(up);
//            p.p("-------------------------------！！！！！！保存价格结束！！！！！--------------------------------------");
//        }


    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






































































}
