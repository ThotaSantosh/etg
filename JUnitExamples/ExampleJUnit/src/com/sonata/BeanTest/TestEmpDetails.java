package com.sonata.BeanTest;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestEmpDetails {
	empBussinessLogic elogic=new empBussinessLogic();
	empDetails emp=new empDetails();
	
	public void testappSalary() {
		emp.setName("santosh");
				emp.setAge(23);
				emp.setSalary(200);
				double appraisal=elogic.appSalary(emp);
				System.out.println(appraisal);
				assertEquals(1200,appraisal,1.0);			
	}
	@Test
	public void testyearSalary() {
		emp.setName("Lalith");
		emp.setAge(29);
		emp.setSalary(1000);
		double appraisal=elogic.yearSalary(emp);
		System.out.println(appraisal);
		assertEquals(200,appraisal,1.0);
	}
}
