package com.myHealth.config;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration 
@ComponentScan("com.myHealth") 
@EnableWebMvc
public class AppConfig {

	
	@Bean
	public BasicDataSource dataSource(){
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
		ds.setUsername("system");
		ds.setPassword("India3380");
		ds.setInitialSize(5);
		ds.setMaxActive(10);
		return ds;
	}
	
	@Bean
	public AnnotationSessionFactoryBean sessionFactory(){
		AnnotationSessionFactoryBean sessionFactory = new AnnotationSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[]{"com.myHealth.model.data"});
		
		Properties pro = new Properties();		
		pro.setProperty("dialect", "org.hibernate.dialect.Oracle10gDialect");
		pro.setProperty("show_sql", "true");
		
		sessionFactory.setHibernateProperties(pro);
		
		return sessionFactory;
	}
	
}
