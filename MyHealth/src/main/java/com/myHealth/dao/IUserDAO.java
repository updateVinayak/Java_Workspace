package com.myHealth.dao;

import java.util.List;

import com.myHealth.model.User;
import com.myHealth.model.data.UserDetails;

public interface IUserDAO {
	
	public List<UserDetails> getAllUsers();
	
	public Integer saveUser(UserDetails user);

	public User getUser(Integer id);
	
}
