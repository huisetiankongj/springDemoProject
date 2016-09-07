package com.czx.user.aop.service;

public class SleepServiceImpl implements ISleepService{

	@Override
	public void sleep() {
		System.out.println("正在睡觉。。。。");
	}

}
