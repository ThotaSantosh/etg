package com.sonata.Exception;

public class CallCustomException {
public static void main(String[] args)throws MyOwnException {
	int age=21;
	if(age<18) 
		throw new MyOwnException("age less than 18");
	else
		System.out.println("welcome to vote");
	}
}

