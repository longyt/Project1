package com.shadow.servlet;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import com.shadow.servlet.service.UserService;

public class UserAction {
	
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("Applicationcontent.xml");
		UserService service = (UserService) factory.getBean("service");
		service.query();
	}
	
}
