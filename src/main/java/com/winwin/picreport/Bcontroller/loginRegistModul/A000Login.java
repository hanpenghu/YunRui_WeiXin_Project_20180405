package com.winwin.picreport.Bcontroller.loginRegistModul;


import com.winwin.picreport.Bcontroller.loginRegistModul.loginUtil.LoginShiEmaiDeQingkuang;
import com.winwin.picreport.Bcontroller.loginRegistModul.loginUtil.LoginShiHuiYuanMingDeQingKuang;
import com.winwin.picreport.Bcontroller.loginRegistModul.loginUtil.LoginShiPhoneNoDeQingkuang;
import com.winwin.picreport.Edto.LoginInfo;
import com.winwin.picreport.Futils.IsEmail;
import com.winwin.picreport.Futils.IsPhoneNo;
import com.winwin.picreport.Futils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.List;

@CrossOrigin//java的跨域
@RestController
public class A000Login {
    @Autowired
   private LoginShiEmaiDeQingkuang loginShiEmaiDeQingkuang;

    @Autowired
    private LoginShiHuiYuanMingDeQingKuang loginShiHuiYuanMingDeQingKuang;

    @Autowired
    private LoginShiPhoneNoDeQingkuang loginShiPhoneNoDeQingkuang;
    @RequestMapping(value="login",method= RequestMethod.POST)
    public
    @ResponseBody
    List<Msg> f(HttpServletRequest request, @RequestBody LoginInfo info){
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.println(info);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        if(IsEmail.isEmail1(info.getUserEmail())){//这里userEmail在登录的时候前端传用户名和手机号和email都用这个字段
            return  loginShiEmaiDeQingkuang.f(info);
        }else if(IsPhoneNo.isPhoneNo(info.getUserEmail())){//这里userEmail在登录的时候前端传用户名和手机号和email都用这个字段
            return  loginShiPhoneNoDeQingkuang.f(info);
        }else{//此时是会员名
            return loginShiHuiYuanMingDeQingKuang.f(info);
        }

    }
//    public static void main(String[]args){
//        System.out.println(Base64.getUrlEncoder().encodeToString(("1510371121000{~}ZYHX{~}1@qq.com").getBytes()));
//    }



    //已经在拦截器排除了
    @RequestMapping(value="test99",method = RequestMethod.GET)
    public String  test(){
        return "~~~~~~~~~~~~~测试成功!!!~~~~~~~~~~~";
    }

}

