package com.study.aspect;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Worker {

	@AddLog(name = "hy", value = "houyang")
	public void testAround(String obj) {
		if (obj == null) {
			obj = "没有参数";
		}
		System.out.println(obj);
	}
	
}
