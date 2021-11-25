package com.sonata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;

public class PreparedEmpExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBS","root","admin@123");
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement("select * from Employee where empId=?");
			ps.setInt(1, 21018);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
		}
			
	}
		catch(ClassNotFoundException e) {System.out.println(e);}
		catch(SQLException e1) {System.out.println(e1);}

	}
}
