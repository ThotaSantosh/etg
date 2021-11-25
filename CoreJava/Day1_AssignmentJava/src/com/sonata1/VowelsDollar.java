package com.sonata1;

public class VowelsDollar {

	public static void main(String[] args) {
		String s="santosh";
		String res="";
		char []c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a')
				c[i]='$';
			if(c[i]=='e')
				c[i]='$';
			if(c[i]=='i')
				c[i]='$';
			if(c[i]=='o')
				c[i]='$';
			if(c[i]=='u')
				c[i]='$';
		}
		for(int i=0;i<c.length;i++) {
			res=res+c[i];
		}
		System.out.println(res);
	}

}
