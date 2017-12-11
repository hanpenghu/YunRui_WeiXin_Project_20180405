package com.winwin.picreport.Bcontroller.loginRegistModul.interceptor;


import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Edto.TokenYuanMa;
import com.winwin.picreport.Futils.*;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Interceptor001 implements HandlerInterceptor {
    private A001TongYongMapper a001TongYongMapper;
    private String tokenShiXiaoShiJian_haoMiao;
    private Long tokenShiXiaoShiJian_haoMiaoL;

    public Interceptor001() {

    }
    public Interceptor001(A001TongYongMapper a001TongYongMapper,String tokenShiXiaoShiJian_haoMiao) {
       this.tokenShiXiaoShiJian_haoMiao=tokenShiXiaoShiJian_haoMiao;
        this.a001TongYongMapper=a001TongYongMapper;
        try {
            this.tokenShiXiaoShiJian_haoMiaoL= Long.parseLong(tokenShiXiaoShiJian_haoMiao);
            System.out.println("~~~~~~~~~~~~~~~~~~this.tokenShiXiaoShiJian_haoMiaoL="+this.tokenShiXiaoShiJian_haoMiaoL+"~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        } catch (NumberFormatException e) {
            this.tokenShiXiaoShiJian_haoMiaoL=8*60*60*1000L;
        }
    }
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        /**
         ****************************************************************************************
         * */
        if("2018-01-20".equals(new SimpleDateFormat("yyyy-MM-dd").format(new Date()))){
           Writer writer = response.getWriter();
            writer.append("软件许可已到期，请联系软件服务商！");
            if(writer!=null){writer.close();}
            System.out.println("软件许可已到期，请联系软件服务商！");
            throw new RuntimeException("软件许可已到期，请联系软件服务商！");
        }

        /**
         ****************************************************************************************
         * */
//        System.out.println(">>>MyInterceptor1>>>>>>>在请求处理之前进行调用（Controller方法调用之前）");
        ResponseKuaYu.kuaYuAndUtf8Response(response,"text/html;charset=UTF-8","UTF-8");

        String token1 = request.getParameter("token");
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验1111~~"+token1+"~~~~~~~~~~~~~~~~~~~~~~");
        TokenYuanMa tokenYuanMa=new TokenYuanMa();
        boolean b = TokenChaiJie.tokenChaiJie(tokenYuanMa, token1, response);//经过此步骤,tokenYuanMa已经被赋值
        if(b==false){
            return false;
        }

//        System.out.println(timestr+"  "+tenantId+"  "+userEmail);
//        System.out.println(split);
        //验证数据的公司id
        Integer ii = a001TongYongMapper.conutTenantId(tokenYuanMa.getTenantId());
        long time00=Long.valueOf(tokenYuanMa.getTimestr());
//        String ip2 = Ip.getIp2(request);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验000~~"+ip2+"~~~~~~~~~~~~~~~~~~~~~~");
        //验证数据库的 token+ip
//        Integer jj = a001TongYongMapper.countuserEmailAndTimeStamp(userEmail, token1+ip2);
        String userEmail = tokenYuanMa.getUserEmail();
        Integer jj=null;
        if(IsEmail.isEmail1(userEmail)){//userEmail这个字段,我在拆解Token源码的时候,放的可能是email也可能是phoneNo,还可能是memberNo
            jj = a001TongYongMapper.countuserEmailAndTimeStamp(userEmail, token1);
        }else if(IsPhoneNo.isPhoneNo(userEmail)){
            jj = a001TongYongMapper.countPhoneNoAndTimeStamp(userEmail, token1);
        }else{//此时是会员名
            jj = a001TongYongMapper.countMemberNoAndTimeStamp(userEmail, token1);
        }


        long time = new Date().getTime();
        long kk = time - time00;
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~打发大厦~~~~~~~~~~~~~~~~~~~~");
        System.out.println(kk);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~打法是否~~~~~~~~~~~~~~~~~");
        Long shiXiaoTime=tokenShiXiaoShiJian_haoMiaoL;//token 默认失效时间8小时
        //根据公司id得到给公司的令牌有效时间
        try {//失效时间先从数据库取,取不到,使用application配置文件的,配置文件的有异常,使用默认的代码写死8小时
            shiXiaoTime=a001TongYongMapper.getTenantShiXiaoShiJianCha(tokenYuanMa.getTenantId());
            System.out.println("~~~~~~~~~~~~~~~失效时间使用数据库"+shiXiaoTime+"~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
            //如果失效时间在数据库取不到,就用默认时间
            if(shiXiaoTime==null||shiXiaoTime==0){
                shiXiaoTime=tokenShiXiaoShiJian_haoMiaoL;
                System.out.println("~~~~~~~~~~~~~~~失效时间使用配置文件"+shiXiaoTime+"~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
            }

        } catch (Exception e) {
            shiXiaoTime=8*60*60*1000L;//默认八小时
            System.out.println("~~~~~~~~~~~~~~~失效时间使用异常包裹"+shiXiaoTime+"~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        }
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~token失效时间~~~~"+shiXiaoTime+"~~~~~~~~~~~~~~~~~~~~");
        //公司id和数据token+ip都存在,并且登陆时间和当前时间之差是规定时间的时候,拦截器才放行
        if(ii==1&&jj==1&&kk<=shiXiaoTime){//保证在30分钟以内   30分钟*60秒*1000毫秒=1800000毫秒秒 但是kk毫秒
            return true;//放行就可以了,不用返回信息
        }
        TipMsg.falseOfNoLogin(response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
//        System.out.println(">>>MyInterceptor1>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
//        System.out.println(">>>MyInterceptor1>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");


    }
}

