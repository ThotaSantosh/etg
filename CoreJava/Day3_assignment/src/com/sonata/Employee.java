package com.sonata;

public class Employee {
 int empId;
 String name;
 double salary;
 Employee(int empid,String name,double salary){
	this.empId=empid;
	this.name=name;
	this.salary=salary;
}
 public Employee() {
}
 public double cal(double hra,double da,double ta){
		return this.salary+hra+da+ta;
	}
 public void display() {
	 System.out.println(empId);
	 System.out.println(name);
	 System.out.println(salary);
 }
 public static void main(String args[]) {
	 
	 Employee e=new Employee();
	 e.empId=21018;
	 e.name="santosh";
	 e.salary=27842;
	 e.display();
	 
 }
}
