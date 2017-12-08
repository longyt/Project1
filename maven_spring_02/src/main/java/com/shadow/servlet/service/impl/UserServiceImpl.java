package com.shadow.servlet.service.impl;

import org.springframework.stereotype.Component;

import com.shadow.servlet.dao.UserDao;
import com.shadow.servlet.service.UserService;

@Component(value="service")
public class UserServiceImpl implements UserService{

	UserDao dao;
	@Override
	public void query() {
		// TODO Auto-generated method stub
		dao.query();
		System.out.println("sql----service");
	}
	public UserDao getDao() {
		return dao;
	}
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	
	
}
