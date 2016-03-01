package com.czx.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czx.user.dao.IUserDao;

@Service
public class UserService implements IUserService {

	@Autowired(required=true)
	private IUserDao userDao;
	
	@Override
	public List findList() {
		return this.userDao.findList();
	}

}
