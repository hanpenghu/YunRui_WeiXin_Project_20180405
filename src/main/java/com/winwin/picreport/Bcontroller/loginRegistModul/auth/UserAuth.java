package com.winwin.picreport.Bcontroller.loginRegistModul.auth;

import com.alibaba.fastjson.JSON;
import com.winwin.picreport.Bcontroller.loginRegistModul.auth.dto.AuthJsonObj.Auth;
import com.winwin.picreport.Bcontroller.loginRegistModul.auth.dto.Model;
import com.winwin.picreport.Bcontroller.loginRegistModul.auth.dto.ModelUsers;
import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class UserAuth {
    @Autowired
    private A001TongYongMapper a001TongYongMapper;

    //暗添加权限模块
    public void addAuth(Msg msg) {
        String authJsonStr = "{\"logistics\":{\"salesorder\":{\"page\":\"F\"},\"salesorderForSAP\":{\"page\":\"F\"},\"salesDetail\":{\"page\":\"F\"},\"productCode\":{\"page\":\"F\"},\"purchasePricing\":{\"page\":\"F\"},\"salesPricing\":{\"page\":\"F\",\"part\":{\"purchasePrice\":\"F\",\"salesPrice\":\"F\"}},\"sampleConfirm\":{\"page\":\"F\"}}}";
        String tenantId = msg.getTenantId();
        String user_Name = msg.getUserEmail();//前端限制必须填写,
//        auth=a001TongYongMapper.getAuth(tenantId,user_Name);
        try {
            String users_uuid = a001TongYongMapper.getUsersUuid(tenantId, user_Name);
            if (p.notEmpty(users_uuid)) {
                //通过uuid得到模型用户关联信息
                List<ModelUsers> modelUserses = a001TongYongMapper.getModelUsers(users_uuid);
                if (p.notEmpty(modelUserses)) {

                    int size = modelUserses.size();
                    //给每条关联信息加上对应的界面模块信息
                    for (int i = 0; i < size; i++) {
                        //得到当前的模块用户关联对象
                        ModelUsers modelUsers = modelUserses.get(i);
                        Model model = a001TongYongMapper.getModels(modelUsers.getModelUuid());
    //                    p.p("-------------------------------------------------------");
    //                    p.p(JSON.toJSONString(model));
    //                    p.p("-------------------------------------------------------");
                        //添加模块到模块用户关联对象
                        modelUsers.setModel(model);
                    }
                    //得到将要返回给前端的json字符串
                    for (ModelUsers modelUsers : modelUserses) {
                        //得到当前的模块英文名,对应auth字符串
                        String modelName = modelUsers.getModel().getModelName();
                        if (p.dy(modelName, "salesorder")) {
                            //此时是  销售订单模块
                            authJsonStr = authJsonStr.replace("\"salesorder\":{\"page\":\"F\"}", 
                                    "\"salesorder\":{\"page\":\"" + modelUsers.getCanUse() + "\"}");


                        } else if (p.dy(modelName, "salesorderForSAP")) {
    //                销售订单（SAP集成）模块
                            authJsonStr = authJsonStr.replace("\"salesorderForSAP\":{\"page\":\"F\"}", 
                                    "\"salesorderForSAP\":{\"page\":\"" + modelUsers.getCanUse() + "\"}");


                        } else if (p.dy(modelName, "salesDetail")) {
    //                销货明细表
                            authJsonStr = authJsonStr.replace("\"salesDetail\":{\"page\":\"F\"}", 
                                    "\"salesDetail\":{\"page\":\"" + modelUsers.getCanUse() + "\"}");


                        } else if (p.dy(modelName, "productCode")) {
    //                产品编码建档
                            authJsonStr = authJsonStr.replace("\"productCode\":{\"page\":\"F\"}", 
                                    "\"productCode\":{\"page\":\"" + modelUsers.getCanUse() + "\"}");


                        } else if (p.dy(modelName, "purchasePricing")) {
    //                采购定价
                            authJsonStr = authJsonStr.replace("\"purchasePricing\":{\"page\":\"F\"}", 
                                    "\"purchasePricing\":{\"page\":\"" + modelUsers.getCanUse() + "\"}");


                        } else if (p.dy(modelName, "salesPricing")) {
    //                销售定价
                            authJsonStr = authJsonStr.replace("\"salesPricing\":{\"page\":\"F\"", 
                                    "\"salesPricing\":{\"page\":\"" + modelUsers.getCanUse() + "\"");


                        } else if (p.dy(modelName, "purchasePrice")) {
    //                采购价格
                            authJsonStr = authJsonStr.replace("\"purchasePrice\":\"F\"", 
                                    "\"purchasePrice\":\"" + modelUsers.getCanUse() + "\"");


                        } else if (p.dy(modelName, "salesPrice")) {
    //                销售价格
                            authJsonStr = authJsonStr.replace("\"salesPrice\":\"F\"", 
                                    "\"salesPrice\":\"" + modelUsers.getCanUse() + "\"");


                        } else if (p.dy(modelName, "sampleConfirm")) {
    //                样品确认
                            authJsonStr = authJsonStr.replace("\"sampleConfirm\":{\"page\":\"F\"}", 
                                    "\"sampleConfirm\":{\"page\":\"" + modelUsers.getCanUse() + "\"}");
                        }



                        //上下级控制,只要设置当有一个下级是true的时候,上级必须为true就行了

                        //如下,当purchasePrice和salesPrice有一个为true的时候都好大他的上级salesPricing必须为true
//                        "salesPricing": {
//                            "page": "F",
//                                    "part": {
//                                "purchasePrice": "F",
//                                        "salesPrice": "F"
//                            }
//                        },

                        //这里注释掉是因为上级 是F的时候有可能是真的不想要他看到这个模块
//                        if(authJsonStr.contains("\"purchasePrice\":\"T\"")||authJsonStr.contains("\"salesPrice\":\"T\"")){
//                            //当salesPricing下级有一个是T的时候,自己是F的时候,将自己的F修改成T
//                            authJsonStr=authJsonStr.replace("\"salesPricing\":{\"page\":\"F\"","\"salesPricing\":{\"page\":\"T\"");
//                        }
                        //当上级是F的时候,由于下级在界面不能再点击进去,所以下级都应该是F,这里不必再判断,为了保险,还是判断
                        if(authJsonStr.contains("\"salesPricing\":{\"page\":\"F\"")){
                            //如果上级salesPricing销售定价是F,那下级应该都是F
                            authJsonStr=authJsonStr.replace("\"purchasePrice\":\"T\"","\"purchasePrice\":\"F\"");
                            authJsonStr=authJsonStr.replace("\"salesPrice\":\"T\"","\"salesPrice\":\"F\"");
                        }



                    }
                }
            }
        } catch (Exception e) {
            msg.setOtherMsg("该用户添加权限模块的时候发生异常导致权限默认为全部F");
            e.printStackTrace();
            l.error(e.getMessage(),e);
        }
//        p.p("-------------------------------------------------------");
//        p.p(authJsonStr);
//        p.p("-------------------------------------------------------");
        Auth auth = JSON.parseObject(authJsonStr, Auth.class);
        msg.setAuth(auth);

    }
    private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());

}
