package com.winwin.picreport.Bcontroller.loginRegistModul;
import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Edto.LoginInfo;
import com.winwin.picreport.Futils.IsEmail;
import com.winwin.picreport.Futils.IsPhoneNo;
import com.winwin.picreport.Futils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class A000UserInfoEdit {
    @Autowired
    private A001TongYongMapper a001TongYongMapper;
    /**
     * 登录后,  才能调该接口
     *该接口需要传参
     * 1    公司id(tenantId)
     * 2    用户id  可以是：  会员名和手机号和email中的其中一个(userEmail or userName or phoneNo)
     * 3   登录后得到的token,但是不是在LoginInfo里传过来  而是在跟在URL后面,到时候在拦截器里判断
     *
     *
     * 结构返回参数
     * 1  公司id(tenantId) //不可修改,在页面也默认不能编辑
     * 1.1 公司名字,也不能修改,将来给管理员修改
     * 2  用户id  (userEmail or userName or phoneNo)中所有的都要返回 都可以修改
     * 3  用户密码  (userPswd)  可修改
     * 4  "lockBill": "CK;TK;EXT;",也可以显示给客户,但是管理员修改的,不能给普通客户修改
     * */
    @RequestMapping(value="userEditInfoGetInfo",method= RequestMethod.POST)
    public @ResponseBody
    LoginInfo f(@RequestBody LoginInfo info){//前端把存的登录用的 用户名三个之一通过userEmail字段传给我就行了
//注意:这个接口是建立在登录成功之后客户端已经有userEmail(这个可能是用户名,也可能是手机号,也可能是email)的前提下,再吧这个userEmail传过来来写的
        info=this.phoneOrEmailOrName(info);
        List<LoginInfo> loginInfoList= a001TongYongMapper.selectUserEditInfo(info);
        if(loginInfoList.size()==1){//有一个的时候才是对的
            LoginInfo loginInfo = loginInfoList.get(0);
            loginInfo.setStatu("1");//        注意这里不设置默认是0
            loginInfo.setMsg("输入信息正确");// 默认    输入信息有误
            return loginInfo;
        }
        return new LoginInfo();//此时statu是0, msg默认是输入信息有误
    }



    /**
     *注意,前端,必须把老的那个userEmail和userName phoneNo 一起传过来,老的就是登录后我返回的那个,
     * 要求前端还是放到userEmail传过来(登录只会有userEmail和userName和phoneNo中的一个
     * ,所以返回的只有一个,只是放到了userEmail里面传过来)
     *
     * 前端必须把tenantid传过来,才能定位修改哪条信息
     *
     *修改后的东西放到带new 的对应字段传过来
     * */
    @RequestMapping(value="userEditInfoOfEdit",method= RequestMethod.POST)
    public @ResponseBody
    List<Msg> g(@RequestBody LoginInfo info){

        List<Msg>listMsg=new ArrayList<>();
        info=this.phoneOrEmailOrName(info);
        int i=a001TongYongMapper.updateUserInfo(info);
        return listMsg;
    }































///////////////////////////////////////////////////////////////////////////////////////////////////
private LoginInfo phoneOrEmailOrName(LoginInfo info){
    if(IsEmail.isEmail1(info.getUserEmail())){//3个if是为了在sql里好判断
        info.setUserEmail(info.getUserEmail());
    }else if(IsPhoneNo.isPhoneNo(info.getUserEmail())){//因为登录后我是返回这个userEmail字段给前端的
        info.setPhoneNo(info.getUserEmail());
    }else{//此时前端userEmail传过来的其实是会员名
        info.setUserName(info.getUserEmail());
    }
    return info;
}
///////////////////////////////////////////////////////////////////////////////////////////////////
}
