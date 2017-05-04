package com.study.web.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan({ "com.study" })
@EnableScheduling
@SpringBootApplication
public class DaoConfiguration {
	public static void main(String[] args) {
		SpringApplication.run(DaoConfiguration.class, args);
	}
}
