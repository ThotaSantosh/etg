package com.sonata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPsStudExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBS","root","admin@123");
			PreparedStatement ps=conn.prepareStatement("insert into Student values(?,?,?)");
			ps.setInt(1,32);
			ps.setString(2,"Rajesh");
			ps.setDouble(3,90);
			int a=ps.executeUpdate();
			System.out.println("the number of records is:"+a);
		}
			
		catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e2) {e2.printStackTrace();}

	}
}
