package com.study.web.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学习springboot 2017年5月2日
 * 
 * @author hy version 1.0
 */
@RestController
@RequestMapping("/study/")
@EnableAutoConfiguration
public class SpringBootAction {
	
	@RequestMapping("home")
	public String home() {
		return "成功";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAction.class, args);
	}
	
}