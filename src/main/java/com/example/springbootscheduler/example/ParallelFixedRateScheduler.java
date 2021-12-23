package com.example.springbootscheduler.example;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableAsync
//@Component
public class ParallelFixedRateScheduler {

	@Async
	@Scheduled(fixedRate = 1000)
	public void scheduleFixedRateTaskAsync() throws InterruptedException {

		System.out.println("Fixed rate task async - " + System.currentTimeMillis() / 1000);
		Thread.sleep(5000);
	}

}
