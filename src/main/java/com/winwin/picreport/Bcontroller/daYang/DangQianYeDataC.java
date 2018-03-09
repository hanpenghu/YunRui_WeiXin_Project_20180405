package com.winwin.picreport.Bcontroller.daYang;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Futils.FenYe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/d")
public class DangQianYeDataC {

    @Autowired
    private Cnst cnst;
    //
//    /////////////////////////徐勇页面展示第一次调的接口,注意顺带返回了第一页的信息////////////////////////////////////////////////////////////////////
//    @RequestMapping(value = "daYangZongYeShuHeMeiYeXianShiShu", method = RequestMethod.POST, produces = {InterFaceCnst.ContentTypeJsonAndCharsetUtf8})
//    public @ResponseBody
//    FenYe daYangZongYeShuHeMeiYeXianShiShu() {
//        FenYe fenYe = cnst.fenLei.daYangZongYeShuHeMeiYeXianShiShu();//主要传过来当前页和每页显示数量
//        fenYe.setDangQianYe(1);
//        List<PrdtSamp> prdtSampList = cnst.fenLei.dangqianyeData(fenYe);
//        fenYe.setPrdtSampList(prdtSampList);
//        return fenYe;
//    }



    /**
     *返回给前端的dingJiaGuanLian对应数据库的oleField,是一个SimplesSys+uuid组成
     *
     * 前端徐勇根据  dingJiaGuanLian+
     *
     * http://61.177.44.218:8070/d/dangqianyeData?token=MTUyMDQ4NDk0Nzk0OXt-fWlwYWNle359MTM2NDE5Mjg3NDE=
     * 参数    {"dangQianYe":"1","meiYeXianShiShu":"1"}
     *
     *
     *
     *
     * */


    /*{
    "prdtSampList": [
        {
            "id": "10478a3d-e981-40d6-92ee-4a07d6bb54b8",
            //产品编码
            "prdCode": "WW-NEPEP-0013",
            //产品名称
            "idxName": "1001",
            //产品编号
            "idxNo": "塑料插片",
            //分类编号(和产品编号idxNo都来自indx表,但是fenLeiNo是idxNo的最上级,idxNo是点击选取的那个,奇葩吧)
            "fenLeiNo": "10",
            //分类名称
            "fenLeiName": "塑料产品",
            //品牌
            "markName": "品牌001",
            //品牌号
            "markNo": "001",
            //颜色
            "colour": "黑色",
            //尺寸
            "size": "尺寸",
            //产品负责人
            "salName": "赵惠国",
            //产品负责人编号
            "salNo": "002",
            //客户编号
            "cusNo": "C024",
            //客户名字
            "cusName": "Brand ID HK LTD",
            //是否分解//是否分解//是否分解, y代表分解, n代表不分解
            "isfenjie": null,
            //打样时间时间戳,
            "sampMake": 1518065937000,
            //寄出时间时间戳
            "sampSend": 1518134400000,
            //样品要求
            "sampRequ": "样品要求",
            //产品描述
            "sampDesc": "产品描述",
            // 不返回给前端//---缩略图名字包含的路径字符串,用;隔开,路径里面有!导致用户的缩略名字不能有!和;
            "thum": "",
            //不返回给前端////附件路径字符串,多个用;隔开,名字中的！做分隔符号
            "attach": "",
            //创建时间//该条记录插入时间,数据库自动会添加DEFAULT一个getdate()
            "insertdate": 1518066865400,
            //确认人
            "confirmman": "确认人",
            //确认时间//后端存的直接是2017-09-11这种字符串时间
            "confirmtimestr": null,
            //是否已经确认,//是否确认，1代表已经确认  0代表未确认
            "isconfirm": 0,
            //未知//老郑让弄得
            "category": "Category",
            //未知//老郑让弄得
            "teamname": "teamName",
            //确认备注
            "confirmrem": null,
            //单位
            "unit": null,
            //业务描述
            "businessdesc": null,
            //财务描述
            "financedesc": null,
            //起订数量//json可以直接转换输出给外部
            "startsellcount": null,
            //模具费
            "modelcost": null,
            //预估价
            "estimateprice": null,
            //小单费
            "littleorderprice": null,
            //模具费用发票号
            "modelcostinvoiceno": null,
            //财务起订量
            "financestartsellcount": null,
            //财务模具费
            "financemodelcost": null,
            //财务小单费
            "financelittleorderprice": null,
            //采购描述
            "buyerdesc": null,
            //货号
            "prdNo": "10800341",
            //销售描述
            "salemandesc": null,
            /停用时间
            "stopusedate": 1517961600000,
            //供应商编号
            "cusNoGive": null,
            //供应商名字
            "cusNameGive": null,
            //创建人的userName,实际上我传给徐勇的放在userEmail字段了
            "userName": null,
            //创建人所在的公司,
            "tenantId": null,
            //下面这个对返回给徐勇没用
            //其实就是userName,以后都改为userName,这个是原来让前端穿过来的,有的地方穿了usr,但是我判断了如果usr是空的,就使用userName
            "usr": null,
            //销售价格列表
            "upDefMyList": [
                {
                    "hjNo": null,//这个字段返回时候没有复制,直接用unit
                    "olefield": null,//这个字段返回时没有赋值,直接用dingJiaGuanLian
                    "priceId": "1",//1代表销售定价,2代表采购定价
                    //运费类型,  01代表没有运费,""代表有运费
                    "bilType": "01",
                    //这个返回的没用
                    "up": null,
                    //定价备注
                    "remOfPrdtSampOs": "阿里巴巴001",
                    //数量区间
                    "qty": 9100,
                    //单位
                    "unit": "主:kg",
                    //币别代号
                    "curId": "USD",
                    //币别名字
                    "curName": "美金",
                    "dingJiaGuanLian": "SamplesSysd105df95-4ab5-4d55-869c-e54aa3e1b59c",
                    "unitZhu": null,
                    "unitFu": null,
                    "usr": null,
                    "cusNo": null,
                    "rem": null,
                    "remFront": null,
                    "uuid": null,
                    "noTransUpBuy": null,
                    "haveTransUpBuy": null,
                    //没有运费的销售价格
                    "noTransUpSale": 9100,
                    //有运费的销售价格
                    "haveTransUpSale": 120,
                    //创建时间
                    "sdd": 1520492481910
                }
            ],
            //采购价格列表
            "upDefMyListBuy": [],
            //销售修改价格记录表
            "saleAlterRecList": [
                {
                    "dingJiaGuanLian": "SamplesSysd105df95-4ab5-4d55-869c-e54aa3e1b59c",
                    "userName": "hanpenghu",
                    "tenantId": "ipace",
                    "alterTime": "2018-03-08 15:33:06.237",
                    "prdtCode": "WW-NEPEP-0013",
                    "prdtSampUuid": "10478a3d-e981-40d6-92ee-4a07d6bb54b8",
                    "qtyBefore": "900",
                    "qtyAfter": "9100",
                    "upBefore": "900",
                    "upAfter": "9100",
                    "unitBefore": "主:k",
                    "unitAfter": "主:kg",
                    "remFrontBefore": "阿里巴巴",
                    "remFrontAfter": "阿里巴巴001",
                    "bilType": "01",
                    "curIdBefore": "USD",
                    "curIdAfter": "USD",
                    "saleOrBuy": "sale"
                }
            ],
            //采购修改价格记录表
            "buyAlterRecList": [],
            "sampMakeStamp": null,
            "sampSendStamp": null,
            //返回给前端用的打样时间
            "sampMakeStr": "2018-02-08 12:58:57",
            //返回给前端用的打样寄出时间
            "sampSendStr": "2018-02-09 08:00:00",
            //创建时间(格式化后给前端用的)
            "insertdateStr": "2018-02-08 13:14:25",
            //缩略图url列表
            "thumUrlList": [],
            //附件url列表
            "attachUrlList": [],
            "dirUrl": "http://127.0.0.1:8070/"
        }
    ],
    "dangQianYe": 1,//当前页
    "meiYeXianShiShu": 2,//每页显示数
    "zongYeShu": 1,//总页数
    "zongJiLuShu": 1,//总记录数
    "prdtSamp1": null,//
    "role": null//权限里面的角色,暂时不用
}*/
    //select top 100 olefield,hj_no,cur_id,prd_no,qty,bil_type,up,a.s_dd,rem,price_id,'------',* from up_def a order by a.s_dd desc
    //select *  from PRDT_SAMP where id='10478a3d-e981-40d6-92ee-4a07d6bb54b8'
    //select top 100* from PRDT where name='WW-NEPEP-0013'
    //select *from alter_price_rec//修改价格记录表,修改一次记录一次
    ////////////////////当前页//////////徐勇页面,(改成所有页都调用一个接口,)/////////////////////////////////////////
    @RequestMapping(value = InterFaceCnst.dangqianyeData,
            method = RequestMethod.POST,
            produces = {InterFaceCnst.ContentTypeJsonAndCharsetUtf8})
    public @ResponseBody
    FenYe dangqianyeData(@RequestBody FenYe fenYe) {
        return cnst.fenLei
                .dangqianyeData(fenYe);//主要传过来当前页和每页显示数量
    }





}
