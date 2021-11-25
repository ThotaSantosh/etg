package com.sonata.CompleteEmp;

public class TestEmployeeCollection {
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpId(21018);
		e1.setEmpName("santosh");
		e1.setEmpSal(27235);
		
		Employee e2=new Employee();
		e2.setEmpId(21018);
		e2.setEmpName("Lalith");
		e2.setEmpSal(27235);
		
		EmployeeImpl l1=new EmployeeImpl();
		l1.addEmployee(e1);
		l1.addEmployee(e2);
		System.out.println(l1.getEmployee());
		System.out.println(l1);
	}

}
