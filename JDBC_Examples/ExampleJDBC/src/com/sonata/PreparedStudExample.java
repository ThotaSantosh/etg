package com.sonata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class PreparedStudExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBS","root","admin@123");
			PreparedStatement ps= conn.prepareStatement("select * from Student where stdId=?");
			ps.setInt(1, 48);
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
