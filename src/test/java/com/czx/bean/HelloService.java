package com.czx.bean;

public class HelloService implements HelloAPI {

	@Override
	public void sayHello() {
		System.out.println("say hello world!");
	}

}
