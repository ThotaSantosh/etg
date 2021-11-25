package com.sonata1;

public class Duplicates {

	public static void main(String[] args) {

		char c[]= {'a','b','a','c','d','e','c'};
		for(int i=0;i<c.length;i++) {
           for(int j=i+1;j<c.length;j++) {
	 if(c[i]==c[j]) {
		 System.out.println(c[i]);
	 }
}
	
		}
	}

}
