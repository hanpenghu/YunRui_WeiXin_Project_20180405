package com.winwin.picreport.Bcontroller.loginRegistModul;
import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Edto.LoginInfo;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.RegistUtils;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *0代表初始状态//1代表登录成功,2代表登录失败,3代表没有权限,4代表您没有登录
 * //5代表注册等待审核//6代表审核成功,注册通过

 * */
@CrossOrigin//java的跨域
@RestController
public class A0000Regist {

    @Autowired
     private A001TongYongMapper a001TongYongMapper;
    @Autowired
    private RegistUtils registUtils;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value="regist",method= RequestMethod.POST)
    public @ResponseBody
    List<Msg> g(@RequestBody LoginInfo info){
       List<Msg>msgList=new ArrayList<>();
        if(!RegistUtils.f1(info, msgList)){//f1里面主要是判断前端传过来的数据本身的正确性
            return msgList;
        }
        Integer conutTenantIdOfTenant = a001TongYongMapper.conutTenantId(info.getTenantId());
        if(conutTenantIdOfTenant ==0){//此时 tenant数据库是插入的
            p.p("------------"+conutTenantIdOfTenant+"-------------------------------------------");
            p.p("此时公司表  没有  该公司id："+info.getTenantId()+"");
            p.p("-------------------------------------------------------");
            //此时判断用户id在联合查询的时候是否存在,用联合查询是因为一个users表中允许有重复的用户id(email,phoneNo,会员名)
            //注意,上面经过第一次判断之后,email和会员名和电话号码肯定有一个非非空的
            registUtils.f2(info,msgList);//这个方法里面进行了插入数据的操作
        }else{//conutTenantId不是0,tenant数据库不需要再插入,直接检测users表去
            p.p("--------------------"+conutTenantIdOfTenant+"-----------------------------------");
            p.p("此时公司表  有  该公司id："+info.getTenantId()+"");
            p.p("-------------------------------------------------------");
            registUtils.f3(info,msgList);
        }

        return msgList;
    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    @RequestMapping(value="regist001",method= RequestMethod.POST)
//    public @ResponseBody List<Msg> f(HttpServletResponse response, HttpServletRequest request, @RequestBody LoginInfo info){
////        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验info.getUserPswd()~~~"+info.getUserPswd()+"~~~~~~~~~~~~~~~~~~~~~");
////        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验info.getConfirmPswd()~~~"+info.getConfirmPswd()+"~~~~~~~~~~~~~~~~~~~~~");
//
//        if(!info.getUserPswd().equals(info.getConfirmPswd())){
////           return new MessageGenerate().generateMessage("fail","密码和确认密码不一致","","13");
//            return new MessageGenerate().generateMessage("fail","两次输入密码不一致","","13");
//        }
//        if(!NotEmpty.notEmpty(info)){
////           return new MessageGenerate().generateMessage("fail","前端传过来的数据是null","","11");
//            return new MessageGenerate().generateMessage("fail","数据传输不正确","","11");
//        }
//        if(!NotEmpty.notEmpty(info.getUserPswd())){
////           return new MessageGenerate().generateMessage("fail","注册的时候没有设置密码","","12");
//            return new MessageGenerate().generateMessage("fail","请填写密码","","12");
//        }
//        Integer count= a001TongYongMapper.conutTenantId(info.getTenantId());
//        int count2= a001TongYongMapper.countuserEmail(info.getUserEmail());
//        int count3= a001TongYongMapper.countPhoneNo(info.getPhoneNo());
//        int count4= a001TongYongMapper.countUserName(info.getUserName());
//       if(count<1){//此时公司id不存在,需要储存公司id
//
//
//           if(count2>=1){
////               return new MessageGenerate().generateMessage("fail","该公司ID不存在但是该用户id都存在,请更换其他用户id(一个系统不允许2个相同的用户id)","","9");
//               return new MessageGenerate().generateMessage("fail","请更换用户id","","9");
//           }else{
//               try {
//                   registerService.insertTenantAndUsers(info);
//               } catch (Exception e) {
////                   return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
//                   return new MessageGenerate().generateMessage("fail","未能注册","","10");
//               }
////               return new MessageGenerate().generateMessage("success",
////                       "注册并审核通过(您注册了一个新的公司和一个新的用户,公司名字为"+info.getTenantName()+",用户名为"+info.getUserEmail()+")"
////                       ,"","6");
//               return new MessageGenerate().generateMessage("success", "注册并通过","","6");
//           }
//
//
//           //此时已经存在该租户(公司),不能注册
////           return new MessageGenerate().generateMessage("fail","该公司id存在,请更换其他id","","8");
//       }else{//公司id存在
//
//           if(count2>=1){//该用户存在
////               return new MessageGenerate().generateMessage("fail","该公司ID存在,该用户id也存在,请更换其他用户id(一个系统不允许2个相同的用户id)","","8");
//               return new MessageGenerate().generateMessage("fail","请更换公司id和用户id","","8");
//           }else{
//               try {
//                   registerService.insertUsers(info);
//               } catch (Exception e) {
////                   System.out.println("~~~~
////                   return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
//                   return new MessageGenerate().generateMessage("fail","未能注册","","10");
//               }
////               return new MessageGenerate().generateMessage("success",
////                       "注册并审核通过(您在一个已经存在的公司--公司id>"+info.getTenantId()+"--公司名>"
////                               +a001TongYongMapper.selectTenantName(info.getTenantId())+"-->注册了一个新的用户"+info.getUserEmail()+")"
////                       ,"","19");
//               return new MessageGenerate().generateMessage("success", "注册并通过","","19");
//           }
//       }
////       int count2= a001TongYongMapper.countuserEmail(info.getUserEmail());
////       if(count2>=1){
////           return new MessageGenerate().generateMessage("fail","该用户id存在,请更换其他id","","9");
////       }
//
//
////        try {
////            registerService.insertTenantAndUsers(info);
////        } catch (Exception e) {
////            return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
////        }
////        return new MessageGenerate().generateMessage("success","注册并审核通过","","6");
//    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
