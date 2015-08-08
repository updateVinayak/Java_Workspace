package com.spring4.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.spring4.aop,com.spring4.aopExample")
@EnableAspectJAutoProxy
public class AppConfig {

}
