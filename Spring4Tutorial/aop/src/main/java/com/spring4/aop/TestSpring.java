package com.spring4.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring4.aopExample.UserService;

public class TestSpring {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeManager employeeManager =  context.getBean(EmployeeManager.class);
        
        
        /*EmployeeDTO emp = new EmployeeDTO();
        emp.setFirstName("Vinayak");
        employeeManager.createEmployee(emp);*/
        
        
        UserService user = context.getBean(UserService.class);
        
        
        user.print();
        
		
	}
	
}
