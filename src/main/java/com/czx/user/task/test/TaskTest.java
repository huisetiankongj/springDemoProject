package com.czx.user.task.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring-asm会和其他的包冲突，尽量不要用这个包
 * @author Administrator
 *
 */
public class TaskTest {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/context/applicationContext-task.xml");
	}
}
