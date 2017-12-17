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
public class LoginShiHuiYuanMingDeQingKuang {
    @Autowired
    private A001TongYongMapper a001TongYongMapper;

    public List<Msg> f(LoginInfo info) {//注意登录成功后应该给用户返回一个token
        if(a001TongYongMapper.conutTenantId(info.getTenantId())!=1){//首先确定tenantid是不是唯一(在tenant表里面)
            return new MessageGenerate().generateMessage("fail","公司ID不存在","","16");
        }
        Integer ii=a001TongYongMapper.selectCount_tenantIdAndUserNameAndUserPswd(info);
        String token = TokenGenerator.generatorToken(info);
        //把token更新到数据库
        Integer cont222=a001TongYongMapper.updateTimeTokenOfUsers_HuiYuanMing(token,info.getUserEmail(),info.getUserPswd(),info.getTenantId());
        List<String> tenantNames = a001TongYongMapper.selectTenantName(info.getTenantId());
        String gongsiMingzi="公司名字未填写";
        if(tenantNames.size()>0){
            gongsiMingzi=tenantNames.get(0);
        }
        if(NotEmpty.notEmpty(ii)&&NotEmpty.notEmpty(cont222)&&ii==1&&cont222==1){//登录成功
            return MessageGenerate.generateMessage("success","登录成功", token,"1",info.getTenantId(),gongsiMingzi,info.getUserEmail());
        }else{
            return MessageGenerate.generateMessage("fail","登录失败","","20");

        }

    }
}
//20 登录失败, 当用户传入的不是手机和email的时候,证明传入的是会员名,此时,如果登录失败,我只用了一个联合查询的sql,登录
//        失败意味着  公司id 用户名,和密码之一都有可能错误,所以单列一个状态码