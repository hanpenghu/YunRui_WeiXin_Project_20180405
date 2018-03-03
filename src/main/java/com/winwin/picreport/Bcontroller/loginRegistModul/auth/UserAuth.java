package com.winwin.picreport.Bcontroller.loginRegistModul.auth;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.winwin.picreport.Bcontroller.loginRegistModul.auth.dto.AuthJsonObj.Auth;
import com.winwin.picreport.Bcontroller.loginRegistModul.auth.dto.Model;
import com.winwin.picreport.Bcontroller.loginRegistModul.auth.dto.ModelUsers;
import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class UserAuth {
    @Autowired
    private A001TongYongMapper a001TongYongMapper;

    //暗添加权限模块
    public void addAuth(Msg msg) {
        String authJsonStr = "{\"salesorder\":{\"page\":\"false\"},\"salesorderForSAP\":{\"page\":\"false\"},\"salesDetail\":{\"page\":\"false\"},\"productCode\":{\"page\":\"false\"},\"purchasePricing\":{\"page\":\"false\"},\"salesPricing\":{\"page\":\"false\",\"part\":{\"purchasePrice\":\"false\",\"salesPrice\":\"false\"}},\"sampleConfirm\":{\"page\":\"false\"}}";
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
                            authJsonStr = authJsonStr.replace("\"salesorder\":{\"page\":\"false\"}", "\"salesorder\":{\"page\":\"" + modelUsers.getCanUse() + "\"}");


                        } else if (p.dy(modelName, "salesorderForSAP")) {
    //                销售订单（SAP集成）模块
                            authJsonStr = authJsonStr.replace("\"salesorderForSAP\":{\"page\":\"false\"}", "\"salesorderForSAP\":{\"page\":\"" + modelUsers.getCanUse() + "\"}");


                        } else if (p.dy(modelName, "salesDetail")) {
    //                销货明细表
                            authJsonStr = authJsonStr.replace("\"salesDetail\":{\"page\":\"false\"}", "\"salesDetail\":{\"page\":\"" + modelUsers.getCanUse() + "\"}");


                        } else if (p.dy(modelName, "productCode")) {
    //                产品编码建档
                            authJsonStr = authJsonStr.replace("\"productCode\":{\"page\":\"false\"}", "\"productCode\":{\"page\":\"" + modelUsers.getCanUse() + "\"}");


                        } else if (p.dy(modelName, "purchasePricing")) {
    //                采购定价
                            authJsonStr = authJsonStr.replace("\"purchasePricing\":{\"page\":\"false\"}", "\"purchasePricing\":{\"page\":\"" + modelUsers.getCanUse() + "\"}");


                        } else if (p.dy(modelName, "salesPricing")) {
    //                销售定价
                            authJsonStr = authJsonStr.replace("\"salesPricing\":{\"page\":\"false\"", "\"salesPricing\":{\"page\":\"" + modelUsers.getCanUse() + "\"");


                        } else if (p.dy(modelName, "purchasePrice")) {
    //                采购价格
                            authJsonStr = authJsonStr.replace("\"purchasePrice\":\"false\"", "\"purchasePrice\":\"" + modelUsers.getCanUse() + "\"");


                        } else if (p.dy(modelName, "salesPrice")) {
    //                销售价格
                            authJsonStr = authJsonStr.replace("\"salesPrice\":\"false\"", "\"salesPrice\":\"" + modelUsers.getCanUse() + "\"");


                        } else if (p.dy(modelName, "sampleConfirm")) {
    //                样品确认
                            authJsonStr = authJsonStr.replace("\"sampleConfirm\":{\"page\":\"false\"}", "\"sampleConfirm\":{\"page\":\"" + modelUsers.getCanUse() + "\"}");
                        }
                    }
                }
            }
        } catch (Exception e) {
            msg.setOtherMsg("该用户添加权限模块的时候发生异常导致权限默认为全部F");
            e.printStackTrace();
        }
//        p.p("-------------------------------------------------------");
//        p.p(authJsonStr);
//        p.p("-------------------------------------------------------");
        Auth auth = JSON.parseObject(authJsonStr, Auth.class);
        msg.setAuth(auth);

    }

}
