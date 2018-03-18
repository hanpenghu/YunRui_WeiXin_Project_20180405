package com.winwin.picreport.Bcontroller.loginRegistModul.loginUtil;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.TokenGenerator;
import com.winwin.picreport.Futils.NotEmpty;

import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Edto.LoginInfo;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginShiEmaiDeQingkuang {
    @Autowired
    private Cnst cnst;
    public List<Msg> f(LoginInfo info){
        String tenantId = info.getTenantId();//这个在数据库是不能重复的
        String userEmail = info.getUserEmail();//这个是不能重复的
        String userPswd = info.getUserPswd();
        Integer cont=cnst.a001TongYongMapper.conutTenantId(tenantId);
        if(cont==1){//唯一标识,只能有一个//首先验证这个公司存在么
            //这种验证是允许一个email出现在不同公司的,就是说一个users表中的email可以重复,但是关联了tenant表就不能重复
            Integer cont100=cnst.a001TongYongMapper.countuserEmail(tenantId,userEmail);
            if(cont100==1){
                Integer cont111=cnst.a001TongYongMapper.countuserEmailAndPswd(tenantId,userEmail,userPswd);
                if(cont111==1){//验证用户id ,公司id ,用户密码是否存在
                    String token=TokenGenerator.generatorToken(info);
//                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验0000~~"+token+"~~~~~~~~~~~~~~~~~~~~~~");
                    //数据库存加密后的token
//                    String ip2 = Ip.getIp2(request);
//                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验999~~"+ip2+"~~~~~~~~~~~~~~~~~~~~~~");
                    //将token更新到数据库
//                    Integer cont222=a001TongYongMapper.updateTimeTokenOfUsers(token+ip2,userEmail,userPswd);
                    Integer cont222=cnst.a001TongYongMapper.updateTimeTokenOfUsers(token,tenantId,userEmail,userPswd);
                    List<String> tenantNames = cnst.a001TongYongMapper.selectTenantName(tenantId);
                    String gongsiMingzi="公司名字未填写";
                    if(tenantNames.size()>0){
                        gongsiMingzi=tenantNames.get(0);
                    }
                    List<LoginInfo>loginfoList001=cnst.a001TongYongMapper.selectUsers(tenantId,userEmail);
//                    System.out.println(loginfoList001.get(0).getUserName()+"login用的userEmail");
                    if(!NotEmpty.notEmpty(loginfoList001.get(0).getUserName())){
                        return new MessageGenerate().generateMessage("fail","登录失败,没有会员名","","31");
                    }
                    if(cont222==1){//确定更新token成功
//                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~login成功~~~~~~~~~~~~~~~~~~~~~~~");
                        //其实下面的集合只有一个,多了的话代表程序有漏洞

                        return new MessageGenerate().generateMessage("success","登录成功",token,"1",tenantId,gongsiMingzi,loginfoList001.get(0).getUserName());
                    }else{
//                        return new MessageGenerate().generateMessage("fail","登录失败,数据库级别","","2");
                        return new MessageGenerate().generateMessage("fail","登录失败","","2");
                    }
                }else{
//                    return new MessageGenerate().generateMessage("fail","您的用户密码不正确","","18");
                    return new MessageGenerate().generateMessage("fail","密码不正确","","18");
                }
            }else{
//                return new MessageGenerate().generateMessage("fail","您的用户ID不存在","","17");
                return new MessageGenerate().generateMessage("fail","用户ID不存在","","17");
            }

        }else{
//            return new MessageGenerate().generateMessage("fail","您的公司ID不存在","","16");
            return new MessageGenerate().generateMessage("fail","公司ID不存在","","16");
        }
    }
}
