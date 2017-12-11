package com.winwin.picreport.Futils;


import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Edto.LoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RegistUtils {
    @Autowired
    private A001TongYongMapper a001TongYongMapper;
    /**
     *普通注册输入有问题的反馈方法
     * */
    public static boolean f1(LoginInfo info, List<Msg> msgList){
        List<Msg> msgList1=new ArrayList<>();
        if(!NotEmpty.notEmpty(info)){
//           return new MessageGenerate().generateMessage("fail","前端传过来的数据是null","","11");
            msgList1.addAll( new MessageGenerate().generateMessage("fail","数据传输不正确","","11"));
            msgList.addAll(msgList1);
            return false;//此时就不用再继续以后的程序
        }
        if(!NotEmpty.notEmpty(info.getTenantId())){
//           return new MessageGenerate().generateMessage("fail","注册的时候没有设置密码","","12");
            msgList1.addAll( new MessageGenerate().generateMessage("fail","请填写公司id","","21"));
            msgList.addAll(msgList1);
            return false;//此时就不用再继续以后的程序
        }
        if(!NotEmpty.notEmpty(info.getUserName())){//会员名必须填写,以为这个UserName将来用于usr(制单人)填写到excha,登录后也必须返回这个
            msgList1.addAll( new MessageGenerate().generateMessage("fail","会员名必须填写","","30"));
            msgList.addAll(msgList1);
            return false;//此时就不用再继续以后的程序
        }

        if(!NotEmpty.notEmpty(info.getUserEmail())&&!NotEmpty.notEmpty(info.getUserName())&&!NotEmpty.notEmpty(info.getPhoneNo())){
            msgList1.addAll( new MessageGenerate().generateMessage("fail","email,用户名,手机号至少填写一个","","22"));
            msgList.addAll(msgList1);
            return false;//此时就不用再继续以后的程序
        }

        if(NotEmpty.notEmpty(info.getUserEmail())){
            if(!IsEmail.isEmail1(info.getUserEmail())){
                msgList1.addAll( new MessageGenerate().generateMessage("fail","email格式不对","","27"));
                msgList.addAll(msgList1);
                return false;//此时就不用再继续以后的程序
            }
        }
        if(NotEmpty.notEmpty(info.getPhoneNo())){
            if(!IsPhoneNo.isPhoneNo(info.getPhoneNo())){
                msgList1.addAll( new MessageGenerate().generateMessage("fail","手机号码格式不对","","28"));
                msgList.addAll(msgList1);
                return false;//此时就不用再继续以后的程序
            }
        }
        if(!NotEmpty.notEmpty(info.getUserPswd())){
//           return new MessageGenerate().generateMessage("fail","注册的时候没有设置密码","","12");
            msgList1.addAll( new MessageGenerate().generateMessage("fail","请填写密码","","12"));
            msgList.addAll(msgList1);
            return false;//此时就不用再继续以后的程序
        }
        if(!info.getUserPswd().equals(info.getConfirmPswd())){
//           return new MessageGenerate().generateMessage("fail","密码和确认密码不一致","","13");
            msgList1.addAll(new MessageGenerate().generateMessage("fail","两次输入密码不一致","","13")) ;
            msgList.addAll(msgList1);
            return false;//此时就不用再继续以后的程序
        }



        if(msgList1.size()==0){
            return true;//继续以后程序,因为没有不合理的输入出现
        }
       return false;//此时就不用再继续以后的程序
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void f2(LoginInfo info, List<Msg> msgList){//tenant里面没有插入用
        List<Msg> msgList1=new ArrayList<>();
        int tenantNameCount=a001TongYongMapper.countTenantName(info);
        //在f2里面,就证明tenant是需要插入的,tenantid不存在于tenant里面,我们要检测公司名字是否重复,按道理公司名字是不能重复的
        if(NotEmpty.notEmpty(info.getTenantName())){//非空的时候再判断公司名字是否存在
            if(tenantNameCount>0){
                msgList.addAll(new MessageGenerate().generateMessage("fail", "该用户名已经被占用","","29"));
                return;
            }
        }

        boolean emailNotEmpty = NotEmpty.notEmpty(info.getUserEmail());
        boolean userNameNotEmpty = NotEmpty.notEmpty(info.getUserName());
        boolean phoneNoNotEmpty = NotEmpty.notEmpty(info.getPhoneNo());
        boolean b = a001TongYongMapper.seletTenantIdAndUserEmail(info) == 0;//等于0的时候代表数据库中没有,能再插入了
        boolean b1 = a001TongYongMapper.seletTenantIdAndUserName(info) == 0;
        boolean b2 = a001TongYongMapper.seletTenantIdAndPhoneNo(info) == 0;


        if(emailNotEmpty&&!userNameNotEmpty&&!phoneNoNotEmpty){
            if(b){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了
                Integer count =a001TongYongMapper.insertTenantAndUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);

                if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                    msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
                }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                    msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
                }


            }else{
                System.out.println("请更换Email 001");
                msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换email","","24"));
                msgList.addAll(msgList1);
            }

        } else if(userNameNotEmpty&&!emailNotEmpty&&!phoneNoNotEmpty){
            if(b1){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了

                Integer count =a001TongYongMapper.insertTenantAndUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);
                if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                    msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
                }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                    msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
                }

            }else{
                msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换会员名","","25"));
                msgList.addAll(msgList1);
            }
        } else if(phoneNoNotEmpty&&!emailNotEmpty&&!userNameNotEmpty){
            if(b2){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了

                Integer count =a001TongYongMapper.insertTenantAndUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);
                if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                    msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
                }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                    msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
                }
            }else{
                msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换电话号码","","26"));
                msgList.addAll(msgList1);
            }
        } else if(emailNotEmpty&&userNameNotEmpty&&phoneNoNotEmpty){
            if(b&& b1&& b2){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了

                Integer count =a001TongYongMapper.insertTenantAndUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);
                if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                    msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
                }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                    msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
                }

            }else{
                if(!b){
                    System.out.println("请更换Email 002");
                    msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换email","","24"));
                    msgList.addAll(msgList1);
                } else  if(!b1){
                    msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换会员名","","25"));
                    msgList.addAll(msgList1);
                } else if(!b2){
                    msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换手机号","","26"));
                    msgList.addAll(msgList1);
                }

            }
        } else if(emailNotEmpty&&userNameNotEmpty&&!phoneNoNotEmpty){
            if(b&&b1){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了
                Integer count =a001TongYongMapper.insertTenantAndUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);
                if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                    msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
                }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                    msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
                }

            }else{
                if(!b){
                    System.out.println("请更换Email 003");
                    msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换email","","24"));
                    msgList.addAll(msgList1);
                } else if(!b1){
                    msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换会员名","","25"));
                    msgList.addAll(msgList1);
                }
            }
        } else if(userNameNotEmpty&&phoneNoNotEmpty&&!emailNotEmpty){
            if(b1&&b2){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了
                Integer count =a001TongYongMapper.insertTenantAndUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);
                if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                    msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
                }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                    msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
                }

            }else{
                if(!b1){
                    msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换会员名","","25"));
                    msgList.addAll(msgList1);
                } else if(!b2){
                    msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换手机号","","26"));
                    msgList.addAll(msgList1);
                }
            }
        } else if(emailNotEmpty&&phoneNoNotEmpty&&!userNameNotEmpty){
            if(b&&b2){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了
                Integer count =a001TongYongMapper.insertTenantAndUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);
                if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                    msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
                }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                    msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
                }

            }else{
                if(!b){
                    System.out.println("请更换Email 004");
                    msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换email","","24"));
                    msgList.addAll(msgList1);
                } else if(!b2){
                    msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换手机号","","26"));
                    msgList.addAll(msgList1);
                }
            }
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void f3(LoginInfo info, List<Msg> msgList){//tenant里面有了的时候只插入users用
    List<Msg> msgList1=new ArrayList<>();
    boolean emailNotEmpty = NotEmpty.notEmpty(info.getUserEmail());
    boolean userNameNotEmpty = NotEmpty.notEmpty(info.getUserName());
    boolean phoneNoNotEmpty = NotEmpty.notEmpty(info.getPhoneNo());
    boolean b = a001TongYongMapper.seletTenantIdAndUserEmail(info) == 0;//等于0的时候代表数据库中没有,能再插入了
    boolean b1 = a001TongYongMapper.seletTenantIdAndUserName(info) == 0;
    boolean b2 = a001TongYongMapper.seletTenantIdAndPhoneNo(info) == 0;


    if(emailNotEmpty&&!userNameNotEmpty&&!phoneNoNotEmpty){
        if(b){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了
            Integer count =a001TongYongMapper.insertUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);

            if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
            }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
            }


        }else{
            System.out.println("请更换Email 005");
            msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换email","","24"));
            msgList.addAll(msgList1);
        }

    } else if(userNameNotEmpty&&!emailNotEmpty&&!phoneNoNotEmpty){
        if(b1){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了

            Integer count =a001TongYongMapper.insertUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);
            if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
            }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
            }

        }else{
            msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换会员名","","25"));
            msgList.addAll(msgList1);
        }
    } else if(phoneNoNotEmpty&&!emailNotEmpty&&!userNameNotEmpty){
        if(b2){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了

            Integer count =a001TongYongMapper.insertUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);
            if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
            }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
            }
        }else{
            msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换电话号码","","26"));
            msgList.addAll(msgList1);
        }
    } else if(emailNotEmpty&&userNameNotEmpty&&phoneNoNotEmpty){
        if(b&& b1&& b2){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了

            Integer count =a001TongYongMapper.insertUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);
            if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
            }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
            }

        }else{
            if(!b){
                System.out.println("请更换Email 006");
                msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换email","","24"));
                msgList.addAll(msgList1);
            }
            else if(!b1){
                msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换会员名","","25"));
                msgList.addAll(msgList1);
            }
            else if(!b2){
                msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换手机号","","26"));
                msgList.addAll(msgList1);
            }

        }
    } else if(emailNotEmpty&&userNameNotEmpty&&!phoneNoNotEmpty){
        if(b&&b1){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了
            Integer count =a001TongYongMapper.insertUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);
            if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
            }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
            }

        }else{
            if(!b){
                System.out.println("请更换Email 007");
                msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换email","","24"));
                msgList.addAll(msgList1);
            }
            else if(!b1){
                msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换会员名","","25"));
                msgList.addAll(msgList1);
            }
        }
    } else if(userNameNotEmpty&&phoneNoNotEmpty&&!emailNotEmpty){
        if(b1&&b2){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了
            Integer count =a001TongYongMapper.insertUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);
            if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
            }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
            }

        }else{
            if(!b1){
                msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换会员名","","25"));
                msgList.addAll(msgList1);
            }
           else if(!b2){
                msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换手机号","","26"));
                msgList.addAll(msgList1);
            }
        }
    } else if(emailNotEmpty&&phoneNoNotEmpty&&!userNameNotEmpty){
        if(b&&b2){//注意公司id是否唯一已经在前面判断过了//只需要联合查询tenantid和userEmail不存在就行了
            Integer count =a001TongYongMapper.insertUsersOfTenantIdAndUserEmailOrPhoneNoOrUserName(info);
            if(count==1){//该方法正常情况下会插入2条数据,tenant和users里面各插入一条
                msgList.addAll(new MessageGenerate().generateMessage("success", "注册并通过","","6"));
//                msgList.addAll(msgList1);
            }else{
//                return new MessageGenerate().generateMessage("fail","数据库出现事务问题未能注册","","10");
                msgList.addAll(new MessageGenerate().generateMessage("fail","未能注册","","10"));
//                msgList.addAll(msgList1);
            }

        }else{
            if(!b){
                System.out.println("请更换Email 008");
                msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换email","","24"));
                msgList.addAll(msgList1);
            } else if(!b2){
                msgList1.addAll(new MessageGenerate().generateMessage("fail", "请更换手机号","","26"));
                msgList.addAll(msgList1);
            }
        }
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
