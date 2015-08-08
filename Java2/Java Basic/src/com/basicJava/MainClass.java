package com.basicJava;

public class MainClass {

	public static void main(String[] args) {
		

		IService service = null;
		service = getImple("2");
		service = getImple("1");
		
		
		Employee e = new Employee();
		e.getId();
		e.setId("1");
	}

	private static IService getImple(String type) {
		if("1".equalsIgnoreCase(type)){
			
			return new ServiceImpl();
		}
		else if("2".equalsIgnoreCase(type)){
			return new ServiceImpl2();
		}
		return null;
	}
}
