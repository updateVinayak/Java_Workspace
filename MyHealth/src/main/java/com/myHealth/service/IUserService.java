package com.myHealth.service;

import java.util.List;

import com.myHealth.model.data.UserDetails;

public interface IUserService {

	
	public List<UserDetails> getAllUser();

	public UserDetails getUserById(int id);
	
	public Integer saveUser(UserDetails user);
}