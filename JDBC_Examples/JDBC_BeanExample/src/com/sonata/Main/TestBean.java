package com.sonata.Main;
import java.sql.*;
import java.util.List;

import com.sonata.DaoImpl.EmpDAOImpl;
import com.sonata.Model.Employee;
public class TestBean {
public static void main(String[] args)throws SQLException{
	Employee e1=new Employee();
	e1.setEmpId(12);
	e1.setEmpName("datta");
	e1.setEmpSal(123456);
	System.out.println(e1);
	EmpDAOImpl dao=new EmpDAOImpl();
	int row=dao.save(e1);
	System.out.println(row);
	
	List<Employee> list=dao.getData();
	for(Employee e:list) {
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpSal());
	}
	Employee e2=new Employee();
	e2.setEmpId(12);
	e2.setEmpSal(300);
	EmpDAOImpl dao1=new EmpDAOImpl();
	int row1=dao1.update(e2);
	System.out.println(row1);
	
	Employee e3=new Employee();
	e2.setEmpId(12);
	EmpDAOImpl dao2=new EmpDAOImpl();
	int row2=dao2.delete(e2);
	System.out.println(row2);
	}
}

