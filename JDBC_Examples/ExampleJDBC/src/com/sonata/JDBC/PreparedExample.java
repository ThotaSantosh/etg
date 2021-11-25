package com.sonata.JDBC;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class PreparedExample {
public static void main(String[] args) {
	List<Employee> l1=new ArrayList<>();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBS","root","admin@123");
		PreparedStatement ps=con.prepareStatement("select * from Employee");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Employee e=new Employee();
			e.setEmpId(rs.getInt(1));
			e.setEmpName(rs.getString(2));
			e.setEmpSal(rs.getDouble(3));
		l1.add(e);
		}
	}
		catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e2) {e2.printStackTrace();}
		
	for(Employee es:l1) {
		System.out.println(es.getEmpId());
		System.out.println(es.getEmpName());
		System.out.println(es.getEmpSal());
	}
}
}
