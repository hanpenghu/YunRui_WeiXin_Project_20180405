package com.winwin.picreport;

import com.github.pagehelper.PageHelper;
import com.winwin.picreport.AllConstant.Cnst;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@EnableTransactionManagement
@SpringBootApplication
@EnableScheduling
@MapperScan("com.winwin.picreport.Ddao")
public class PicReportApplication {

	//配置mybatis的分页插件pageHelper
	@Bean//就是产生bean的一个方法,用法产生一个bean然后注入springIOC
	public PageHelper pageHelper(){
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum","true");
		properties.setProperty("rowBoundsWithCount","true");
		properties.setProperty("reasonable","true");
//		properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
		properties.setProperty("dialect","sqlServer");
		pageHelper.setProperties(properties);
		return pageHelper;
	}
	public static void main(String[] args) {
		SpringApplication.run(PicReportApplication.class, args);
	}
}
