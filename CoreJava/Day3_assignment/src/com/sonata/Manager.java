package com.sonata;

public class Manager extends Employee{
	Manager(int empId,String name,double salary){
		super(empId,name,salary);
	}
	Manager(){}
	public double cal(double hra,double da,double ta){
		super.cal(hra, da, ta);
		System.out.println("child class");
		return this.salary+hra+da+ta;
	}
	
	public static void main(String[] args) {
		Manager m1=new Manager();
			m1.empId=103;
			m1.name="JayaShree";
			m1.salary=50000.545;
			m1.display();
	Manager m2=new Manager(104,"naresh",45000);
	m2.display();
	System.out.println(m2.cal(1000, 300, 2000));
		}


}
