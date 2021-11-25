package com.sonata.LambdaExample;
import java.util.*;
import com.sonata.StreamApi.*;
class MyComparator1 implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getEmpSal()-o2.getEmpSal());
	}
	
}
public class SortExampleEmployee {
	public static void main(String[] args) {
		List<Employee> employee=DataBaseEmp.getEmployee();
		Collections.sort(employee,new MyComparator1());
		System.out.println(employee);
		
		Collections.sort(employee,(o1,o2)->(int)(o1.getEmpSal()-o2.getEmpSal()));
		System.out.println(employee);
		employee
		.stream()
		.sorted((o1,o2)->(int)(o1.getEmpSal()-o2.getEmpSal()))
	    .forEach(System.out::println);
		employee
		.stream()
		.sorted(Comparator.comparing(emp->emp.getEmpSal())).forEach(System.out::println);
	
	}
}
