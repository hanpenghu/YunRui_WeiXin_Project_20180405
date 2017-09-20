package com.winwin.picreport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.winwin.picreport.Ddao")
@SpringBootApplication
public class PicReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicReportApplication.class, args);
	}
}
