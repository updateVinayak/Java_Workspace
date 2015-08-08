package com.javaconfig.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.EmployeeDAO;

public class SpringTestJavaConfig {

	
	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(JavaConfig.class);
				   
				   EmployeeDAO helloWorld = ctx.getBean(EmployeeDAOJavaConfigImpl.class);

				   System.out.println(helloWorld.getAll()); ;
				   				   
		
	}
}