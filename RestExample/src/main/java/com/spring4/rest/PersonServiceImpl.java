package com.spring4.rest;

import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements IPersonService {

	
	public Person getPersonDetail(Integer id){
		Person p = new Person();
		p.setId(id);
		p.setLocation("Mumbai");
		p.setName("Vinay");
		return p;
	}

}
