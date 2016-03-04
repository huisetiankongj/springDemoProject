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
		//1����ȡ�����ļ�ʵ����һ��IoC����  
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/czx/bean/hello.xml");  
		//2���������л�ȡBean��ע��˴���ȫ"����ӿڱ�̣�����������ʵ��" 
		HelloAPI helloApi = context.getBean("hello", HelloService.class);  
		//3��ִ��ҵ���߼�  
		helloApi.sayHello();  

	}
	
	/**
	 * test get Bean from hello.xml by FileSystemXmlApplicationContext
	 */
	@Test
	public void getBeanByFileSystemXmlApplicationContext(){
		//1����ȡ�����ļ�ʵ����һ��IoC����  
//		ApplicationContext context = new FileSystemXmlApplicationContext("D:\\mavenWorkspace\\git\\springDemoProject\\src\\test\\resources\\com\\czx\\bean\\hello.xml");
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:com/czx/bean/hello.xml");
		//2���������л�ȡBean��ע��˴���ȫ"����ӿڱ�̣�����������ʵ��" 
		HelloAPI helloApi = context.getBean("hello", HelloService.class);  
		//3��ִ��ҵ���߼�  
		helloApi.sayHello();  

	}
	
	
	/**
	 * alias bean
	 * multiple name
	 * ָ�����name�����name�á����������������� ���ָ
	 * ��һ����������ʶ���������ģ�alias1��alias2��alias3���Ǳ��������б�ʶ��Ҳ������Ioc������Ψһ��
	 */
	@Test
	public void aliasBean(){
		//1����ȡ�����ļ�ʵ����һ��IoC����  
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/czx/bean/hello.xml");  
		//2���������л�ȡBean��ע��˴���ȫ"����ӿڱ�̣�����������ʵ��" 
		HelloAPI helloApi = context.getBean("aliasHello", HelloService.class);
		HelloAPI helloApi1 = context.getBean("hello2", HelloService.class);
		//3��ִ��ҵ���߼�  
		helloApi.sayHello();  
		helloApi1.sayHello();  
	}
}
