package com.winwin.picreport;

import com.winwin.picreport.AllConstant.InterFaceCnst;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableTransactionManagement
@SpringBootApplication
@EnableScheduling
@MapperScan(InterFaceCnst.daoCnst)
public class A {
	//过期时间通过application配置到拦截器
	public static void main(String[] args) {
		SpringApplication.run(A.class, args);
	}
}
