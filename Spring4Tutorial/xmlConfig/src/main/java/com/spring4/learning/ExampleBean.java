package com.spring4.learning;

public class ExampleBean {

	private int years;
	
	private int ultimateAnswer;

	public ExampleBean(int years, int ultimateAnswer) {	
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;
	}
	
	
	public String getValue(){
		return years + " " + ultimateAnswer;
	}
	
	
}
