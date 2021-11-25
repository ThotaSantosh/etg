package com.sonata1;

public class LargeNumbers {

	public static void main(String[] args) {
		int []q= {4,5,6,7,8,9,10,15,16};
		int lar1,lar2,temp;
		
		lar1=q[0];
		lar2=q[1];
		
		if(lar1<lar2) {
			temp=lar1;
			lar1=lar2;
			lar2=temp;
		}
		for(int i=2;i<q.length;i++) {
			if(q[i]>lar1) {
				lar2=lar1;
				lar1=q[i];
						
			}else if (q[i]>lar2 && q[i]!=lar1) {
				lar2=q[i];
			}
		}
		System.out.println("First largest is "+lar1);
		System.out.println("Second largest is "+lar2);
			}
	
}
