package com.example.springbootscheduler.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronTaskScheduler {

  /**
   * Every month start 23:15PM on 30th
   *
   * <p>Expression Pattern: ┌───────────── second (0-59) │ ┌───────────── minute (0 - 59) │ │
   * ┌───────────── hour (0 - 23) │ │ │ ┌───────────── day of the month (1 - 31) │ │ │ │
   * ┌───────────── month (1 - 12) (or JAN-DEC) │ │ │ │ │ ┌───────────── day of the week (0 - 7) │ │
   * │ │ │ │ (or MON-SUN -- 0 or 7 is Sunday) │ │ │ │ │ │ * * * * * *
   *
   * <p>Read more: https://spring.io/blog/2020/11/10/new-in-spring-5-3-improved-cron-expressions
   */
  @Scheduled(cron = "0 15 23 30 * ?", zone = "Europe/Paris")
  public void handle() {
    System.out.println("Fixed delay task - " + System.currentTimeMillis() / 1000);
  }

  /**
   * Macros Expression [ @yearly (or @annually), @monthly, @weekly, @daily (or @midnight), @hourly ]
   *
   * <p>eg. @Scheduled(cron = "@hourly")
   */
  @Scheduled(cron = "@monthly", zone = "Europe/Paris")
  public void monthlySchedule() {
    System.out.println("Task every months - " + System.currentTimeMillis() / 1000);
  }
}
