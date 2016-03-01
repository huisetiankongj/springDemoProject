package com.czx.user.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements IUserDao {

	@Override
	public List findList() {
		List list = new ArrayList();
		for(int i=10;i>0;i--){
			list.add(i);
		}
		return list;
	}

	
}
