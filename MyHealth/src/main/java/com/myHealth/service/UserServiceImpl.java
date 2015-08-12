package com.myHealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myHealth.dao.IUserDAO;
import com.myHealth.model.data.UserDetails;

@Component
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDAO userDAO;

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public List<UserDetails> getAllUser() {
		
		
		List<UserDetails> detailsDOs = userDAO.getAllUsers();
		
		System.out.println(detailsDOs.get(0)); 
			
		return detailsDOs;		
	}

	public UserDetails getUserById(int id) {
		
		return userDAO.getUser(id);
	}

	public Integer saveUser(UserDetails user) {
		
		return userDAO.saveUser(user);
		
		
	}

}