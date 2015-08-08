package com.spring4.learning;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexObject {
	
	private Properties adminEmails;
	
	private List<String> someList;
	
	private Map someMap;
	
	private Set someSet;

	public Properties getAdminEmails() {
		return adminEmails;
	}

	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}

	public List<String> getSomeList() {
		return someList;
	}

	public void setSomeList(List<String> someList) {
		this.someList = someList;
	}

	public Map getSomeMap() {
		return someMap;
	}

	public void setSomeMap(Map someMap) {
		this.someMap = someMap;
	}

	public Set getSomeSet() {
		return someSet;
	}

	public void setSomeSet(Set someSet) {
		this.someSet = someSet;
	}
	
	
	
	

}
