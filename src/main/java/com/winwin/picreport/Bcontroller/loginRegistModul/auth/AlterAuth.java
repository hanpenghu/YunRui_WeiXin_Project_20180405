package com.winwin.picreport.Bcontroller.loginRegistModul.auth;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

@CrossOrigin
@Controller
public class AlterAuth {

    @RequestMapping(value ="/authUpdate",method= RequestMethod.POST)
    public @ResponseBody Msg alterUserAuth(@RequestBody Map<String,String> map){
        Msg mg = Msg.gmg();
        String tenantId = map.get("tenantId");
        String userEmail = map.get("userEmail");
        String user_name = map.get("user_name");
        String phone_no = map.get("phone_no");



        return mg;


    }



    public static void main(String[]args) throws ClassNotFoundException, SQLException {
        String DB_URL="jdbc:sqlserver://127.0.0.1:7201;DatabaseName=DB_BARC";
        String USER="";
        String PASS="";
        // 注册 JDBC 驱动
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // 打开链接
        System.out.println("连接数据库...");
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

    }

}
