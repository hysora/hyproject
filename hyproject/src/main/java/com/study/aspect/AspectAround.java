package com.study.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectAround {
	
	@Around("@annotation(log)")
    public Object test(ProceedingJoinPoint joinPoint, AddLog log){
        System.out.println ("切面执行了。。。。");
        try {
        	Object[] args = joinPoint.getArgs();
        	System.out.println(log.name() + log.value());
        	joinPoint.proceed(args);
        	joinPoint.proceed(new String[] {"asdw"});
        } catch (Throwable e) {
            e.printStackTrace ();
        }
        return null;
    }
	
}
