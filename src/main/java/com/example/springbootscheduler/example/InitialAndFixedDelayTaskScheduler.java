package com.example.springbootscheduler.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class InitialAndFixedDelayTaskScheduler {

	/**
	 * Schedule a Task With Initial Delay
	 *
	 * This option is convenient when the task has a setup that needs to be completed.
	 */
	@Scheduled(fixedDelay = 1000, initialDelay = 3000)
	public void handle() {

    	System.out.println("Fixed delay task with initial - " + System.currentTimeMillis() / 1000);
	}
}
