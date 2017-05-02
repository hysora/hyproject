package com.study.activemq.queues;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component  
public class Consumer2 {  
  
    @JmsListener(destination = "FirstQueue1")  
    @SendTo("FirstQueue2")  
    public String receiveQueue(String text) {  
        System.out.println(Thread.currentThread().getName()+":Consumer2收到的报文为:"+text);  
        return "return message"+text;  
    }  
}