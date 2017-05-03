package com.study.service.schedule;

/**
 * 定时执行任务的接口,因为@Scheduled注释需要有接口
 * 2017年5月3日
 * @author hy
 * version 1.0
 */
public interface ScheduleService {
	
	/**
	 * 每月最后一天创建payment日志表
	 */
	void test();
	
}
