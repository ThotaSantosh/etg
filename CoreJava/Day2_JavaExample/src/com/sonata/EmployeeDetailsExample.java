package com.sonata;

public class EmployeeDetailsExample {
	int empId;
	String name;
	double salary;
	EmployeeDetailsExample(){}
	EmployeeDetailsExample(int i,String n,double s){
		this.empId=i;
		this.name=n;
		this.salary=s;
	}
	public double cal(double hra,double da,double ta){
		return this.salary+hra+da+ta;
	}
	
	public void display() {
		System.out.println(empId);
		System.out.println(name);
		System.out.println(salary);
		
	}

	public static void main(String[] args) {
		EmployeeDetailsExample e1=new EmployeeDetailsExample();
	e1.empId=21018;
	e1.name="Thota Santosh";
	e1.salary=25000;
	e1.display();
	System.out.println(e1.cal(1000, 2000,300));
	EmployeeDetailsExample e2=new EmployeeDetailsExample(21019,"akhil",25000);
	e2.display();
	System.out.println(e2.cal(1000,2000,300));
	}

}
