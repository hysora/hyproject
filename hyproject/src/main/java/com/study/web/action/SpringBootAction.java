package com.study.web.action;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.activemq.queues.Producer;

/**
 * 学习springboot 2017年5月2日
 * 
 * @author hy version 1.0
 */
@RestController
@RequestMapping("/study/")
public class SpringBootAction {
	
	@Autowired
	private Producer producer;
	
	@RequestMapping("home")
	public String home() {
		Destination destination = new ActiveMQQueue("FirstQueue1");
		producer.sendMessage(destination, "activeMQ调试");
		return "成功";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAction.class, args);
	}
	
}