package com.dong.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskJob {
	@Scheduled(cron = "0/5 * * * * ?")  
    public void job1() {  
        System.out.println("任务进行中。。。");  
    }
}
