package com.sonata;

public class TheElseIfExample {

	public static void main(String[] args) {
	int	a=10,b=20,c=30;
		if(a>b&&a>c) {
			System.out.println("a");
		}
		else if(b>c&&b>a) {
			System.out.println("b");
		}
		else {
			System.out.println("C");
		}
	}

}
