package com.sonata.Employee;

/**
 * @author Santosh Thota
 * It contains the address details
 * of an employee
 */
public class Address {
//declaring variables
	private String doorNo;
	private String street;
	private String city;
	private long zipCode;
	//getter and setter methods
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
}
