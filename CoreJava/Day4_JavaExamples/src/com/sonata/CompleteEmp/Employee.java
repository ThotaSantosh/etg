package com.sonata.CompleteEmp;

public class Employee {
int empId;
double empSal;
String empName;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public double getEmpSal() {
	return empSal;
}
public void setEmpSal(double empSal) {
	this.empSal = empSal;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empSal=" + empSal + ", empName=" + empName + "]";
}

}