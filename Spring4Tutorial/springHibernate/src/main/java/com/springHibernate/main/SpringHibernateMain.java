package com.springHibernate.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springHibernate.dao.PersonDAO;
import com.springHibernate.model.Person;

public class SpringHibernateMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
			
		
		Person person = new Person();
        person.setName("Vinayak"); person.setCountry("India");
        
        
        
        PersonDAO personDAO = context.getBean(PersonDAO.class);
        personDAO.save(person);
        List<Person> list = personDAO.list();
        for(Person person1 : list){
        	System.out.println(person1.getName());
        }
        System.out.println(list.size());
		
	}
	
}
