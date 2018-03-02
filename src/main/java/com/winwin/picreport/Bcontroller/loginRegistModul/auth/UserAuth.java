package com.winwin.picreport.Bcontroller.loginRegistModul.auth;

import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserAuth {
    @Autowired
    private A001TongYongMapper a001TongYongMapper;
    //暗添加权限模块
    public  void addAuth(Msg msg){
        String tenantId = msg.getTenantId();
        String user_Name = msg.getUserEmail();
        String auth=a001TongYongMapper.getAuth(tenantId,user_Name);
        msg.setAuth(auth);
    }

}
