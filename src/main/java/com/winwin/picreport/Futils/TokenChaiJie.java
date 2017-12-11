package com.winwin.picreport.Futils;


import com.winwin.picreport.Edto.TokenYuanMa;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletResponse;
import java.util.Base64;

public class TokenChaiJie {
    public static boolean tokenChaiJie(TokenYuanMa tokenYuanMa, String token1 , HttpServletResponse response){
//        tokenYuanMa=new TokenYuanMa();
        if(!NotEmpty.notEmpty(token1)){//空的时候
            TipMsg.falseOfNoLogin(response);
            return false;
        }
        //解密token
        //解密后的token
        String token= null;
        try {
            token = new String(Base64.getUrlDecoder().decode(token1));

        } catch (Exception e) {
            TipMsg.falseOfNoLogin(response);
            return false;
        }
        if(!NotEmpty.notEmpty(token)){
            TipMsg.falseOfNoLogin(response);
            return false;
        }
//        System.out.println(token);
        if(!token.contains("{~}")){
            TipMsg.falseOfNoLogin(response);
            return false;
        }
        //分隔
        String[] split = StringUtils.split(token, "{~}");
        if(!(split.length==3)){
            TipMsg.falseOfNoLogin(response);
            return false;
        }
        //token拆解后才有用
        String timestr = split[0];
        String tenantId = split[1];
        String userEmail = split[2];
        tokenYuanMa.setTimestr(timestr).setTenantId(tenantId).setUserEmail(userEmail);
        return true;
    }
}
