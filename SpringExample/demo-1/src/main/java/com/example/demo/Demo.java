package com.example.demo;

import com.example.demo.impl.DefaultUserValidation;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultUserValidation df = new DefaultUserValidation();
	     boolean val= df.validate("santosh", "9642217");
	     if(val) {
	    	 System.out.println("Username and Password matches");
	     }else {
	    	 System.out.println("Does not match");
	     }
	}

}
