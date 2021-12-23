package com.example.springbootscheduler.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class FixedRateTaskScheduler {


	/**
	 * Schedule a Task at a Fixed Rate
	 *
	 * This option should be used when each execution of the task is independent.
	 */
	@Scheduled(fixedRate = 1000)
	public void scheduleFixedRateTask() {

		System.out.println("Fixed rate task - " + System.currentTimeMillis() / 1000);
	}
}
