package com.czx.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHello {

	
	/**
	 * test get Bean from hello.xml
	 */
	@Test
	public void getContainerBean(){
		//1、读取配置文件实例化一个IoC容器  
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/czx/bean/hello.xml");  
		//2、从容器中获取Bean，注意此处完全"面向接口编程，而不是面向实现" 
		HelloAPI helloApi = context.getBean("hello", HelloService.class);  
		//3、执行业务逻辑  
		helloApi.sayHello();  

	}
	
	/**
	 * test get Bean from hello.xml by FileSystemXmlApplicationContext
	 */
	@Test
	public void getBeanByFileSystemXmlApplicationContext(){
		//1、读取配置文件实例化一个IoC容器  
//		ApplicationContext context = new FileSystemXmlApplicationContext("D:\\mavenWorkspace\\git\\springDemoProject\\src\\test\\resources\\com\\czx\\bean\\hello.xml");
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:com/czx/bean/hello.xml");
		//2、从容器中获取Bean，注意此处完全"面向接口编程，而不是面向实现" 
		HelloAPI helloApi = context.getBean("hello", HelloService.class);  
		//3、执行业务逻辑  
		helloApi.sayHello();  

	}
	
	
	/**
	 * alias bean
	 * multiple name
	 * 指定多个name，多个name用“，”、“；”、“ ”分割，
	 * 第一个被用作标识符，其他的（alias1、alias2、alias3）是别名，所有标识符也必须在Ioc容器中唯一；
	 */
	@Test
	public void aliasBean(){
		//1、读取配置文件实例化一个IoC容器  
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/czx/bean/hello.xml");  
		//2、从容器中获取Bean，注意此处完全"面向接口编程，而不是面向实现" 
		HelloAPI helloApi = context.getBean("aliasHello", HelloService.class);
		HelloAPI helloApi1 = context.getBean("hello2", HelloService.class);
		//3、执行业务逻辑  
		helloApi.sayHello();  
		helloApi1.sayHello();  
	}
}
