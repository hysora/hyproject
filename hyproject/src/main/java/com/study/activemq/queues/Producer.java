package com.study.activemq.queues;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Producer{
	
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

	public void sendMessage(Destination destination, final String message) {
		jmsMessagingTemplate.convertAndSend(destination, message);
	}
	
	@Async
	@JmsListener(destination = "FirstQueue2")
	public void consumerMessage(String text) {
		System.out.println("从FirstQueue2队列收到的回复报文为:" + text);
	}
	
}
