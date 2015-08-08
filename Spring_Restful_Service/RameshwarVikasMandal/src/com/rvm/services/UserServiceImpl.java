package com.rvm.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rvm.dao.UserDAO;
import com.rvm.dao.UserDO;

@Component
public class UserServiceImpl implements IUserService {
	
	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}



	@Override
	public List<User> getAllUser() {
		
		List<UserDO> userDOs =  userDAO.getAllUser();
		
		User user1 = new User();
		user1.setUserId(1);
		user1.setFirstName("Vinayak");
		user1.setLastName("Sawant");
		user1.setEmail("optimistvinay@gmail.com");
		
		List<User> users = new ArrayList<>();
		users.add(user1);
		
		return users;
	}

}