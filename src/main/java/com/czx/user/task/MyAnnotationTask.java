package com.czx.user.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyAnnotationTask {

	@Scheduled(fixedRate=2000)
	public void show(){
		System.out.println("into MyAnnotationTask show method...");
	}
	
	@Scheduled(cron = "0 0 1 * * *")
	public void print(){
		System.out.println("into MyAnnotationTask print method...");
	}
}
