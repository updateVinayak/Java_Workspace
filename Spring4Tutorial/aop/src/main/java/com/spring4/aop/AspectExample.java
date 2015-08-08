package com.spring4.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AspectExample {

	@Pointcut("within(com.spring4.aopExample.*)")
	public void aopExample() {}
	
	@Before("com.spring4.aop.AspectExample.aopExample()")
	public void beforeTarget() {
		
		System.out.println("Before new aspect");
		
	}
	
}
