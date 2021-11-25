package com.example.demo.impl;

import org.springframework.stereotype.Component;

import com.example.demo.GreetingInterface;


public class DefaultGreeting implements GreetingInterface {

	public String sayGreeting(String name) {
		
		return ("Good morning " +name);
	}
	
}
