package com.rvm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rvm.services.User;
import com.rvm.services.UserServiceImpl;


@RestController
@RequestMapping("/service/user/")
public class UserController {

	@Autowired
	UserServiceImpl userService;
	
	@RequestMapping(method = RequestMethod.GET,headers="Accept=application/json")
	 public List<User> getAllUsers() {
		List<User> users=userService.getAllUser();
		return users;
	 }

}
