package com.myHealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myHealth.model.data.UserDetails;
import com.myHealth.model.exception.MyHealthException;
import com.myHealth.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/all")
	public List<UserDetails> getAllUser() {
		return getUserService().getAllUser();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getUserById(@PathVariable int id) {
		
		UserDetails user =  userService.getUserById(id);
		return new ResponseEntity<UserDetails>(user, HttpStatus.OK);
		/*if (1 == id) {

			UserDetails userDetails = getUserService().getUserById(id);
			return new ResponseEntity<UserDetails>(userDetails, HttpStatus.OK);
		} else {
			MyHealthException error = new MyHealthException("No Data Found");
			return new ResponseEntity<MyHealthException>(error,
					HttpStatus.NOT_FOUND);
		}*/
	}

	@ExceptionHandler(MyHealthException.class)
	public ResponseEntity<com.myHealth.model.exception.Error> spittleNotFound(MyHealthException e) {
		String errorMessage = e.getMessage();
		com.myHealth.model.exception.Error error = new com.myHealth.model.exception.Error(1, errorMessage);
		
		return new ResponseEntity<com.myHealth.model.exception.Error>(error, HttpStatus.NOT_ACCEPTABLE);
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Integer> addUserDetails(@RequestBody UserDetails user) throws MyHealthException {
		/*if(user.getUserId() == 1){
			return new ResponseEntity<UserDetails>(user, HttpStatus.CREATED);
		}
		else{
			throw new MyHealthException("Can not Created");
		}*/
		
		Integer userId = userService.saveUser(user);
		
		return new ResponseEntity<Integer>(userId, HttpStatus.CREATED);
	}

}
