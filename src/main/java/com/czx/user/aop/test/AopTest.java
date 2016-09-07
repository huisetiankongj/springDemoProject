package com.czx.user.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.czx.user.aop.service.ISleepService;

public class AopTest {

	@Test
	public void sercuriryAopTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config/context/applicationContext-aop.xml");
		ISleepService sleepService = (ISleepService) ctx.getBean("sleepService");
		sleepService.sleep();
	}
	@Test
	public void logAopTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config/context/applicationContext-aop-annotation.xml");
		ISleepService sleepService = (ISleepService) ctx.getBean("sleepService");
		sleepService.sleep();
	}
}
