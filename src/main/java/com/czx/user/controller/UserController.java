package com.czx.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.czx.user.service.IUserService;

@Controller
@RequestMapping("user/")
public class UserController {

	@Autowired(required=true)
	private IUserService userService;
	
	@RequestMapping("userList")
	public Object userList(){
		List list = this.userService.findList();
		for(int i=0;i<list.size();i++){
			System.out.println("======="+list.get(i));
		}
		
		return "user/userList";
	}
}
