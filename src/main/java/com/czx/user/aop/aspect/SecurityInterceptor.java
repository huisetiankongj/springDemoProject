package com.czx.user.aop.aspect;

public class SecurityInterceptor {

	public void checkAuthority(){
		System.out.println("方法调用前，先检查权限!");
	}
}
