package com.winwin.picreport.Cservice;

import com.alibaba.fastjson.JSON;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Bcontroller.daYang.dto.AlterPrice;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.stra;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class DingJiaXiuGaiService {

    private Logger logger = LogManager.getLogger(this.getClass().getName());
    @Autowired
    private Cnst cnst;
    @Transactional
    public Msg dingJiaXiuGai(List<AlterPrice> alterPrices){
        try {
            //不含运费单价本币 修改前
            String noTransUpMyBefore="";//--------
//不含运费单价本币修改后
            String noTransUpMyAfter="";
//不含含运费单价外币修改 前
            String noTransUpOtherBefore="";
//不含运费单价外币修改后
            String noTransUpOtherAfter="";
//含运费单价本币修改前
            String haveTransUpMyBefore="";
//含运费单价本币修改后
            String haveTransUpMyAfter="";
//含运费单价外币修改前
            String haveTransUpOtherBefore="";
//含运费单价外币修改后
            String haveTransUpOtherAfter="";
            //币别其实前端指的是外币的币别
            String curIdBefore="";
            String curIdAfter="";


            for(AlterPrice alterPrice:alterPrices){

                if(p.bdy(alterPrice.getCurIdBefore(),"RMB")) {
                    //此时是外币的时候,得到修改前后的币别
                    curIdBefore=alterPrice.getCurIdBefore();
                    curIdAfter=alterPrice.getCurIdAfter();
                }

                /**
                 *得到8种组合单价
                 * */
                //得到无运费本币修改之前价格
                if(p.dy(alterPrice.getBilType(),"01")&&p.dy(alterPrice.getCurIdBefore(),"RMB")){
                    noTransUpMyBefore=alterPrice.getUpBefore();
                }
                //得到无运费本币修改之后价格
                if(p.dy(alterPrice.getBilType(),"01")&&p.dy(alterPrice.getCurIdAfter(),"RMB")){
                    noTransUpMyAfter=alterPrice.getUpAfter();
                }

                //得到无运费外币币修改之前价格
                if(p.dy(alterPrice.getBilType(),"01")&&p.bdy(alterPrice.getCurIdBefore(),"RMB")){
                    noTransUpOtherBefore=alterPrice.getUpBefore();
                }

                //得到无运费外币币修改之后价格
                if(p.dy(alterPrice.getBilType(),"01")&&p.bdy(alterPrice.getCurIdBefore(),"RMB")){
                    noTransUpOtherAfter=alterPrice.getUpAfter();
                }



                //以下是有运费,以上是无运费



                //得到有运费本币修改之前价格
                if(p.bdy(alterPrice.getBilType(),"01")&&p.dy(alterPrice.getCurIdBefore(),"RMB")){
                    haveTransUpMyBefore=alterPrice.getUpBefore();
                }
                //得到有运费本币修改之后价格
                if(p.bdy(alterPrice.getBilType(),"01")&&p.dy(alterPrice.getCurIdAfter(),"RMB")){
                    haveTransUpMyAfter=alterPrice.getUpAfter();
                }

                //得到有运费外币币修改之前价格
                if(p.bdy(alterPrice.getBilType(),"01")&&p.bdy(alterPrice.getCurIdBefore(),"RMB")){
                    haveTransUpOtherBefore=alterPrice.getUpBefore();
                }

                //得到有运费外币币修改之后价格
                if(p.bdy(alterPrice.getBilType(),"01")&&p.bdy(alterPrice.getCurIdBefore(),"RMB")){
                    haveTransUpOtherAfter=alterPrice.getUpAfter();
                }




//                //把时间戳转换成一定格式的String
//                String sDdStr = p.sjc2StrDate(map.get(Cnst.sDd), p.d16);
//                sDdStr=p.empty(sDdStr)?p.space:sDdStr;
                //其中dingJiaGuanLian(oleField)+bilType+curIdBefore可以形成联合主键进行某条记录的修改
                String dingJiaZhuJian= stra.b()
                        .a(p.strNullToSpace(alterPrice.getDingJiaGuanLian()))
                        .a(p.strNullToSpace(alterPrice.getBilType()))
                        .a(p.strNullToSpace(alterPrice.getCurIdBefore()))
                        .g();
                //设置定价主键,将来更新updef表 用
                alterPrice.setDingJiaZhuJian(dingJiaZhuJian);

                //设置修改时间,将来插入修改记录表
                alterPrice.setAlterTime(p.dtoStr(new Date(),p.d16));
                p.p("-------------------"+dingJiaZhuJian+"----------------------");


                //修改价格主表up_def
                Integer i=cnst.a001TongYongMapper.updateUpdef(alterPrice);
                //插入修改记录表alter_price_rec修改记录
//                Integer j=cnst.a001TongYongMapper.insertAlterPriceRec(alterPrice);

                if(i>=0){
                    //修改成功继续修改下一个
                }else{
                    throw new RuntimeException("定价修改失败");
                }
            }
            /**
             *插入修改记录表之前要先把价格跟有没有运费,是本币还是外币组合成一条数据
             * */
            //准备一个存储合并后数据的对象
            AlterPrice alterPriceMeraged=new AlterPrice();
            BeanUtils.copyProperties(alterPrices.get(0),alterPriceMeraged);
            //下面开始合并,首先是得到  noTransUpMyBefore
            //无运费筛选标准  根据 bilType='01' curIdBefore="RMB" 找到  upBefore
            alterPriceMeraged.setNoTransUpMyBefore(noTransUpMyBefore);
            alterPriceMeraged.setNoTransUpMyAfter(noTransUpMyAfter);
            alterPriceMeraged.setNoTransUpOtherBefore(noTransUpOtherBefore);
            alterPriceMeraged.setNoTransUpOtherAfter(noTransUpOtherAfter);
            alterPriceMeraged.setHaveTransUpMyBefore(haveTransUpMyBefore);
            alterPriceMeraged.setHaveTransUpMyAfter(haveTransUpMyAfter);
            alterPriceMeraged.setHaveTransUpOtherBefore(haveTransUpOtherBefore);
            alterPriceMeraged.setHaveTransUpOtherAfter(haveTransUpOtherAfter);
            //设置币别(这个存进数据库的币别其实指的是外币的币别,但是前端每次穿过来的时候的curid指的是当时的币别)
            alterPriceMeraged.setCurIdBefore(curIdBefore);
            alterPriceMeraged.setCurIdAfter(curIdAfter);
            Integer j=cnst.alterPriceRecMapper.insertSelective(alterPriceMeraged);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(JSON.toJSONString(alterPrices));
            logger.error(e.getMessage(),e);
            p.throwE(e.getMessage());
        }
        return Msg.gmg().setMsg("定价修改成功").setStatus("1");
    }
}
