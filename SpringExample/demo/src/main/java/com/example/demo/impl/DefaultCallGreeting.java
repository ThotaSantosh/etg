package com.example.demo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.CallGreetingInterface;
import com.example.demo.GreetingInterface;

public class DefaultCallGreeting implements CallGreetingInterface {
	
	
	GreetingInterface defaultGreeting;
	
	public String callGreeting(String name) {
		
		
		return defaultGreeting.sayGreeting(name);
	}

	public GreetingInterface getDefaultGreeting() {
		return defaultGreeting;
	}

	public void setDefaultGreeting(GreetingInterface defaultGreeting) {
		this.defaultGreeting = defaultGreeting;
	}

}