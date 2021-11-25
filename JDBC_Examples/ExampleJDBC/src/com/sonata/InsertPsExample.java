package com.sonata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class InsertPsExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBS","root","admin@123");
			PreparedStatement ps=conn.prepareStatement("insert into Employee values(?,?,?)");
			ps.setInt(1,210);
			ps.setString(2,"Rajesh");
			ps.setDouble(3,30000);
			int a=ps.executeUpdate();
			System.out.println("the number of records is:"+a);
		}
			
		catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e2) {e2.printStackTrace();}

	}
}
