package com.study.web.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.study.activemq.queues" })
@SpringBootApplication
public class DaoConfiguration {

}
