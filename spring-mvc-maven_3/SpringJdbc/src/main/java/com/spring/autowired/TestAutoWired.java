package com.spring.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.springjdbc.EmployeeDAO;

public class TestAutoWired {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				JavaAutoWiredConfid.class);
		
		EmployeeDAO employeeDAO = context.getBean(EmployeeDAOAutoWiredImpl.class);
		
		System.out.println(employeeDAO.getAll()); 
		
	}

}
