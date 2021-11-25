package com.sonata1;

public class DuplicatesCount {

	public static void main(String[] args) {


		int c[]= {1,2,3,1,2,3,1,1};
		int counterInc=0;
		int counter = 0;
		int element = 0;
		for(int i=0;i<c.length;i++) {
			counter=1;
           for(int j=i+1;j<c.length;j++) {
	 if(c[i]==c[j]) {
		 counter++;

	 }
}
	if(counterInc<counter) {
		counterInc=counter;
		element=c[i];
		
	}

		}
		System.out.println("Maximum repeating integer is "+element+" and count is "+counterInc);

	}

}
