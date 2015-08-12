package com.spring4.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration 
@ComponentScan("com.spring4.rest") 
@EnableWebMvc
public class AppConfig {

}
