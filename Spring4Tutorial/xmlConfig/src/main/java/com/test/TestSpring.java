package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring4.learning.ComplexObject;
import com.spring4.learning.ConstructorSimpleExample;
import com.spring4.learning.ExampleBean;
import com.spring4.learning.HelloWorldService;
import com.spring4.learning.RefereringBean;

public class TestSpring {
	
	
	public static void main(String[] args) {
		
		
		// loading the definitions from the given XML file
				ApplicationContext context = new ClassPathXmlApplicationContext(
						"applicationContext.xml");
		 
				/*HelloWorldService service = (HelloWorldService) context
						.getBean("helloWorldService");
				String message = service.sayHello();
				System.out.println(message);
		 
				//set a new name
				service.setName("Spring");
				message = service.sayHello();
				System.out.println(message);*/
				
				////////// Simple Constructor injection with basic value
				
				ConstructorSimpleExample simple = (ConstructorSimpleExample) context.getBean("constructorSimpleExample");
				
				System.out.println(simple.getNameValue());
				
				//////// Simple Constructor injection with basic value with name attribute
				
				ExampleBean e = (ExampleBean)context.getBean("exampleBean");
				System.out.println(e.getValue());
				
				//////// Referencing another bean
				
				RefereringBean bean = (RefereringBean)context.getBean("refereringBean");
				System.out.println("Ref");
				System.out.println(bean.getHello().sayHello());
				
				
				/////////// Collection
				
				ComplexObject complexObject = (ComplexObject) context.getBean("moreComplexObject");
				
				complexObject.getAdminEmails();
				
				//Merging Collection
				
				ComplexObject child = (ComplexObject) context.getBean("child");
								
				child.getAdminEmails();
				
				
	}

}
