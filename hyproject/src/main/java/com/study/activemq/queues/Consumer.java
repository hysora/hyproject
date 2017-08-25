package com.study.activemq.queues;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	/**
	 * @Async 代表异步
	 * @param text
	 */
	@JmsListener(destination = "FirstQueue1")
	@Async
	public void receiveQueue(String text) {
		System.out.println(Thread.currentThread().getName() + ":Consumer收到的报文为:" + text);
	}
	
}