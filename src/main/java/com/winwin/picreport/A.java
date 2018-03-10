package com.winwin.picreport;

import com.winwin.picreport.AllConstant.InterFaceCnst;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@EnableScheduling
@MapperScan(InterFaceCnst.daoCnst)
public class A {
	protected static final Logger logger = LoggerFactory.getLogger(A.class);
	//过期时间通过application配置到拦截器
	public static void main(String[] args) {
		logger.info("--------SpringBoot开始加载---------");
		SpringApplication.run(A.class, args);
		logger.info("-------SpringBoot加载完毕---------");
	}


}
