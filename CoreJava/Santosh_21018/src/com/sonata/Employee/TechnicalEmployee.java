package com.sonata.Employee;

/**
 * @author Santosh Thota
 *	this is the subclass of the employee class and 
 *	it calculates the salary of technical employee
 */
public class TechnicalEmployee extends Employee {
	//declaring the technical skill variables
	
	private String technicalSkill;

	public TechnicalEmployee(String employeeID, String employeeName, Address address, String technicalSkill) {
		super(employeeID, employeeName, address);
		this.setTechnicalSkill(technicalSkill);
	}

	@Override
	//throwing the custom exception
	//it calcualate the salary of Technical Employee
	public float calculateSlary(float basicPay) throws SalaryException {
		float salary;
		float hra=calculateHRA(basicPay);
		salary = basicPay+hra;	
		 if(salary < 5000){ 
			 throw new SalaryException("Technical employee total salary is less than 5000");    
		    }  
		return salary;
	}
	//it calculate the HRA of Technical Employee
	public float calculateHRA(float basicPay) {
		float hra;
		hra= (12*basicPay)/100;
		return hra;
		
	}
	//getter and setter methods

	public String getTechnicalSkill() {
		return technicalSkill;
	}

	public void setTechnicalSkill(String technicalSkill) {
		this.technicalSkill = technicalSkill;
	}
}
