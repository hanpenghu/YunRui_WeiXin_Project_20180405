package com.winwin.picreport.Bcontroller.loginRegistModul;
import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Edto.LoginInfo;
import com.winwin.picreport.Futils.IsEmail;
import com.winwin.picreport.Futils.IsPhoneNo;
import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class A001LogOut {
    @Autowired
    private A001TongYongMapper a001TongYongMapper;

    @RequestMapping(value = "logOut", method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    public @ResponseBody
    List<Msg> logOut(@RequestBody LoginInfo info) {

        try {
            Long count =0L;
            //退出的时候只要输入email和手机号和会员名中的一个就可以了,都用字段userEmail来接受
            if(IsEmail.isEmail1(info.getUserEmail())){
                count = a001TongYongMapper.logOutTenantIdAndUserEmail(info.getTenantId(), info.getUserEmail());
            }else if(IsPhoneNo.isPhoneNo(info.getUserEmail())){
                count = a001TongYongMapper.logOutTenantIdAndPhoneNo(info.getTenantId(), info.getUserEmail());
            }else{//此时会员名登出
                count = a001TongYongMapper.logOutTenantIdAndUserName(info.getTenantId(), info.getUserEmail());
            }

            if(count==1){
                return new MessageGenerate()
                        .generateMessage("success", "成功安全退", "", "14");
            }
        } catch (Exception e) {
            return new MessageGenerate()
                    .generateMessage("fail", "账号退出失败", "", "15");
        }
        return new MessageGenerate()
                .generateMessage("fail", "账号退出失败", "", "15");

    }


}
