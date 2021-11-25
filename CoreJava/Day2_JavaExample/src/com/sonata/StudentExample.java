package com.sonata;

public class StudentExample {
	int stdId;
	String name;
	int marks;
	StudentExample(int i,String n,int m){
		this.stdId=i;
		this.name=n;
		this.marks=m;
	}
	public int totalMarks(int p,int c,int m,int s) {
		return p+c+m+s;
	}
	public void display() {
		System.out.println(stdId);
		System.out.println(name);
		System.out.println(marks);
		
	}
	public static void main(String[] args) {
		StudentExample s=new StudentExample(1,"mahesh",332);
		
		s.display();
		System.out.println(s.totalMarks(92,90,80,70));

	}

}
