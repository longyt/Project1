package com.shadow.servlet.dao.impl;

import org.springframework.stereotype.Component;

import com.shadow.servlet.dao.UserDao;
@Component
public class UserDaoImpl implements UserDao{

	@Override
	public void query() {
		// TODO Auto-generated method stub
		System.out.println("sql-----dao");
	}
}
