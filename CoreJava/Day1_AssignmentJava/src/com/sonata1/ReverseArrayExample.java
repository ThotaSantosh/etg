package com.sonata1;

public class ReverseArrayExample {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.println("The original array is:"+arr[i]);
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("the reverse of the array is:"+arr[i]);
		}
	}

}
