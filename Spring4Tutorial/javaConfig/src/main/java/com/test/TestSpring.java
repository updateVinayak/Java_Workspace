package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring4.java.AppConfig;
import com.spring4.java.UserController;



public class TestSpring {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		UserController user =  ctx.getBean(UserController.class);
		
		user.getUserService().print();;
		
		
	}
}
