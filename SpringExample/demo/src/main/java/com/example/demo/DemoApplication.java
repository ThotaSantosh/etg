package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.impl.DefaultGreeting;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		//GreetingInterface  greeting = new DefaultGreeting();
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		CallGreetingInterface greeting = (CallGreetingInterface) factory.getBean("callgreeting");
		System.out.println(greeting.callGreeting("santosh"));


	}

}
