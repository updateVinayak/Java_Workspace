package com.spring4.learning;

public class ConstructorSimpleExample {

	private String name;

	public ConstructorSimpleExample(String name) {
		this.name = name;
	}
	
	
	public String getNameValue(){
		
		return this.name + " is the Name....";
		
	}
	
}
