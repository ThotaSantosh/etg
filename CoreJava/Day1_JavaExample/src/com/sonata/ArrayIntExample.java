package com.sonata;

public class ArrayIntExample {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};//declaring an array
		int size=arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.println("the elements in the array:"+arr[i]);//printing all the elements in the array
		}
		System.out.println("First element in the array:"+arr[0]);//printing only first element in array
		System.out.println("last element in the array :"+arr[size-1]);//printing only last element in array
	}

}
