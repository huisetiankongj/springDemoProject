package com.czx.user.aop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogInterceptor {

	@Pointcut("execution(* com.czx.user.aop.service.*.*(..))")
	public void beforePointcut(){};
	
	@AfterReturning("execution(* com.czx.user.aop.service.*.*(..))")
	public void log(){
		System.out.println("方法调用后，记录操作日志!");
	}
	
	@Before("beforePointcut()")
	public void beforeLog(){
		System.out.println("使用@Pointcut注解，实现方法调用前记录操作日志!");
	}
}
