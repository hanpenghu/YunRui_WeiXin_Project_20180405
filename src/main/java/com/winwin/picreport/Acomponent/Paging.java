package com.winwin.picreport.Acomponent;

import com.github.pagehelper.PageHelper;
import com.winwin.picreport.AllConstant.Cnst;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Properties;
@Component
public class Paging {
    //配置mybatis的分页插件pageHelper
    @Bean//就是产生bean的一个方法,用法产生一个bean然后注入springIOC
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty(Cnst.offsetAsPageNum,Cnst.trueStr);
        properties.setProperty(Cnst.rowBoundsWithCount,Cnst.trueStr);
        properties.setProperty(Cnst.reasonable,Cnst.trueStr);
//		properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        properties.setProperty(Cnst.dialect,Cnst.sqlServer);
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
