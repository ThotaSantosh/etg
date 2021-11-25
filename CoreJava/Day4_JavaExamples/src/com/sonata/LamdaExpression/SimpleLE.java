package com.sonata.LamdaExpression;
interface simple{
	void sum(int a);
}
public class SimpleLE {

	public static void main(String[] args) {
		simple s1=(int a)->{System.out.println("Welcome to lamda"+a);};
		s1.sum(10);
	
		MyFunctionalInterface x1=()->{System.out.println("My functional Interface");};
		x1.m1();
		x1.m2();
	}
}
