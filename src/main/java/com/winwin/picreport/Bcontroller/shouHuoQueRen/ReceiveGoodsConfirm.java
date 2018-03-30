package com.winwin.picreport.Bcontroller.shouHuoQueRen;
import com.winwin.picreport.Bcontroller.I;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@CrossOrigin
@RestController
public class ReceiveGoodsConfirm {


    /**
     逻辑:
     1）	扫描单号二维码
     select ic_no,* from mf_ic where ic_no='IO011801010001'
     2）带出收货客户/人名称，cus_no2要从cust.cus_no里转化为客户名称cust.name
     select ic_no,cus_no2,* from mf_ic where ic_no='IO011801010001'
     3）带出发货明细
     select prd_name,qty  from tf_ic where ic_no='IO011801010001'
     4）图片回传到服务器指定文件夹,图片尽量按照这样命名: 单号.jpeg
     网址存进 select ic_no,shqrpz,* from mf_ic_z where ic_no='IO011801010001'

     参数

     ["单号"]


     这个接口是在对方扫描完二维码后得到单号后就调取的
     调取的结果是我返回给前端详细信息


     得到详细信息之后

     前端将再调取一次接口  receiveConfirm 将图片和单号穿过来,我将图片保存在本地文件夹,将图片路径保存在
     数据库对应字段


     * */

    @RequestMapping(value= I.returnMsg,method= RequestMethod.POST)
    public @ResponseBody Msg f(@RequestBody List<String> nos){
        try {

            if(p.empty(nos)){
                p.throwE("前端传过来的《单号》数组是空的"+p.knownExceptionSign);
            }

            List list=new LinkedList();

            for(int i=0;i<nos.size();i++){
                //得到当前单号
                String s = nos.get(i);


            }










            return Msg.gmg().setMsg("成功"+p.noExceptionSign).setStatus(p.s1);
        } catch (Exception e) {
            String sss=e.getMessage();
            if(sss.contains(p.knownExceptionSign)){
                return Msg.gmg().setMsg(sss.replace(p.knownExceptionSign,p.space)).setStatus(p.s0).setData(null);
            }else{
                return Msg.gmg().setMsg(p.unKnownExceptionSign).setStatus(p.s0).setData(null);
            }
        }finally{}
    }



}
