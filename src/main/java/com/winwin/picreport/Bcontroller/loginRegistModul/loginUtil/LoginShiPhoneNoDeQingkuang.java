package com.winwin.picreport.Bcontroller.loginRegistModul.loginUtil;

import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Edto.LoginInfo;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.TokenGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginShiPhoneNoDeQingkuang {
    @Autowired
    private A001TongYongMapper a001TongYongMapper;

    public List<Msg> f(LoginInfo info) {//注意登录成功后应该给用户返回一个token
        if(a001TongYongMapper.conutTenantId(info.getTenantId())!=1){
            return new MessageGenerate().generateMessage("fail","公司ID不存在","","16");
        }
        Integer ii=a001TongYongMapper.selectCount_tenantIdAndPhoneNoAndUserPswd(info);//这个sql写的是在一个手机号可以在不同公司登录用
        String token = TokenGenerator.generatorToken(info);
        //把token更新到数据库
        Integer cont222=a001TongYongMapper.updateTimeTokenOfUsers_Phone(token,info.getTenantId(),info.getUserEmail(),info.getUserPswd());
        List<LoginInfo>loginfoList001=a001TongYongMapper.selectUsers(info.getTenantId(),info.getUserEmail());
        if(!NotEmpty.notEmpty(loginfoList001)&&!NotEmpty.notEmpty(loginfoList001.get(0).getUserName())){
            return new MessageGenerate().generateMessage("fail","登录失败,没有会员名","","31");
        }
        List<String> tenantNames = a001TongYongMapper.selectTenantName(info.getTenantId());
        String gongsiMingzi="公司名字未填写";
        if(tenantNames.size()>0){
            gongsiMingzi=tenantNames.get(0);
        }
//        System.out.println(loginfoList001.get(0).getUserName()+"login用的phoneNo");
        if(NotEmpty.notEmpty(ii)&&NotEmpty.notEmpty(cont222)&&ii==1&&cont222==1){//登录成功
            return new MessageGenerate().generateMessage("success","登录成功", token,"1",info.getTenantId(),gongsiMingzi,loginfoList001.get(0).getUserName());
        }else{
            return new MessageGenerate().generateMessage("fail","登录失败","","20");

        }

    }
}
