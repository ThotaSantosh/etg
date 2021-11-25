package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.impl.DefaultUserValidation;


@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Demo1Application.class, args);
		UserValidationInterface  df= new DefaultUserValidation();
		boolean val= df.validate("santosh", "9642217");
	     if(val) {
	    	 System.out.println("Username and Password matches");
	     }else {
	    	 System.out.println("Does not match");
	     }
	}

}
