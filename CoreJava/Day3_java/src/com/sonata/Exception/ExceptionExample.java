package com.sonata.Exception;

public class ExceptionExample {
public void div() {
	try {
		int a1=10/1;
		System.out.println(a1);
		int b[]= {1,2,3};
		System.out.println(b[4]);
	}
	catch(ArithmeticException a) {System.out.println(a);}
	catch(ArrayIndexOutOfBoundsException e) {char[] b;}
	finally {
		System.out.println("this is final block");
	}
}
	public void display() {
		System.out.println("My Method");
	}
	public static void main(String[] args) {
		System.out.println("show");
		ExceptionExample e1=new ExceptionExample();
		e1.display();
		e1.div();
		
	}
}
