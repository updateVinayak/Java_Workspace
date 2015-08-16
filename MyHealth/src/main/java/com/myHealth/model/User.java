package com.myHealth.model;

import java.util.List;

public class User {

	
	private Integer userId;
    
    private String fname;
     
    private String mname;
    
    private String lname;
    
    private String email;
    
    private Address address;
    
    private Doctor doctor;
    
    private User parent;
    
    private List<User> children;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public User getParent() {
		return parent;
	}

	public void setParent(User parent) {
		this.parent = parent;
	}

	public List<User> getChildren() {
		return children;
	}

	public void setChildren(List<User> children) {
		this.children = children;
	}

	public User(Integer userId, String fname, String mname, String lname,
			String email) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.email = email;
	}
    
    
	
    
    
	
}
