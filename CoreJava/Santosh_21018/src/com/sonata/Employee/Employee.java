package com.sonata.Employee;

/**
 * @author Santosh Thota
 * it is the pojo employee class and having 
 * the getters and setter methods
 */
public abstract class  Employee {
//declaring variable
	private String employeeID;
	private String employeeName;
	private Address address;
	private float basicPay;
	public String getEmployeeID() {
		return employeeID;
	}
	//getter and setter methods
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public Employee(String employeeID, String employeeName, Address address) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.address = address;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(float basicPay) {
		this.basicPay = basicPay;
	}
	
	public abstract float calculateSlary(float basicPay) throws SalaryException;
	@Override
	public String toString() {
		return "Employee ID : " + employeeID + "\n"+"Employee Name : " + employeeName;
	}
}
