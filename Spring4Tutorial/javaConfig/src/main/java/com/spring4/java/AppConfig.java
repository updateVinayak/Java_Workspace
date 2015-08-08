package com.spring4.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class AppConfig {

	@Bean(name="userC")
	public UserController userController(){
		return new UserController(); 
	}
	
	@Bean
	public UserService userService() {
		return new UserService();
	}
}
