package com.study.service.schedule.impl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.study.service.schedule.ScheduleService;

/**
 * 定时执行 2017年5月3日
 * @author hy 
 * version 1.0
 */
@Component
public class ScheduleServiceImpl implements ScheduleService {

	@Scheduled(fixedRate = 5000000)
	@Override
	public void test() {
		System.out.println("我还活着~");
	}
	
}
