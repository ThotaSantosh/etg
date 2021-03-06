package com.sonata.Employee;

/**
 * @author Santosh Thota
 *	this is the subclass of the employee class and 
 *	it calculates the salary of Staff 
 */
public class Staff extends Employee {

	private String title;
	
	public Staff(String employeeID, String employeeName, Address address,String title) {
		super(employeeID, employeeName, address);
		this.setTitle(title);
	}
	//calculate the salary of the staff
	@Override
	public float calculateSlary(float basicPay) throws SalaryException {
		float salary;
		float hra=calculateHRA(basicPay); 
		salary = basicPay+hra;
		if(salary < 5000){ 
			 throw new SalaryException("Staff total salary is less than 5000");    
		    } 
		return salary;
	}
	//it calculates the HRA of the staff
	public float calculateHRA(float basicPay) {
		float hra;
		hra=(18*basicPay)/100;
		return hra;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
