package com.winwin.picreport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@EnableScheduling
@MapperScan("com.winwin.picreport.Ddao")
public class PicReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicReportApplication.class, args);
	}
}
