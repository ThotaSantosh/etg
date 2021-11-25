package com.sonata1;

public class ArrSpecificValue {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int toFind=4;
		boolean found=false;
		for(int i=0;i<=arr.length;i++) {
			if(toFind==4) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println(toFind+"is found");
		}
		else {
			System.out.println(toFind+"is not found");
		}
	}

}
