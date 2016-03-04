package com.czx.bean;

public class ParamHelloService implements HelloAPI {

	private String name;
	private String age;
	
	public ParamHelloService(){
		super();
	}
	public ParamHelloService(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public void sayHello() {
		System.out.println("name:"+this.name+"===age:"+this.age);
	}

}
