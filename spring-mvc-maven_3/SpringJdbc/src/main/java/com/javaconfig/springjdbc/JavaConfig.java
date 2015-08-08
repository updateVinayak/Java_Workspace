package com.javaconfig.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.EmployeeDAO;

@Configuration
public class JavaConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/rameshwarvikasmadal");
		ds.setUsername("root");
		ds.setPassword("India");
		return ds;
	}
	
	@Bean
	public EmployeeDAO employeeDAO(){
		EmployeeDAOJavaConfigImpl employeeDAO =  new EmployeeDAOJavaConfigImpl();
		employeeDAO.setDataSource(dataSource());
		return employeeDAO;
	}
	
	

}
