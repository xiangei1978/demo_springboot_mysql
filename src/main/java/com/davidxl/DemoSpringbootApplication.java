package com.davidxl;

import com.davidxl.web.ResponseBodyWrapFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.davidxl"})
@MapperScan("com.davidxl.dao")
public class DemoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootApplication.class, args);
	}


	@Bean
	public ResponseBodyWrapFactoryBean getResponseBodyWrap() {
		return new ResponseBodyWrapFactoryBean();
	}
}
