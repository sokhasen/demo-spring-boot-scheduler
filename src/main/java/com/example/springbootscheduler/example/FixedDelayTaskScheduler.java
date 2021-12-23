package com.example.springbootscheduler.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class FixedDelayTaskScheduler {

	/**
	 * Schedule a Task at Fixed Delay
	 *
	 * This option should be used when it’s mandatory that the previous execution is completed before running again.
	 */
	@Scheduled(fixedDelay = 1000)
	public void scheduleFixedDelayTask() throws InterruptedException {

		System.out.println("Fixed delay task - " + System.currentTimeMillis() / 1000);
		Thread.sleep(1000);
	}

}
