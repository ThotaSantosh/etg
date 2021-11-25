package com.sonata1;

public class StudExample {
	int studId;
	String name;
	int sClass;
	StudExample(){}
	StudExample(int i,String n,int c){
	 this.studId=i;
	 this.name=n;
	 this.sClass=c;
	}
	public void display() {
		System.out.println(studId);
		System.out.println(name);
		System.out.println(sClass);
		
	}

	public static void main(String[] args) {
		StudExample s1=new StudExample();
		s1.studId=1;
		s1.name="Thota santosh";
		s1.sClass=7;
		s1.display();
		StudExample s2=new StudExample(2,"Tulasi",7);
		s2.display();
		
		

	}

}
