package com.sonata;
import java.sql.*;
public class statementExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBS","root","admin@123");
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from Employee");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDouble(3));
		}
			
	}
		catch(ClassNotFoundException e) {System.out.println(e);}
		catch(SQLException e1) {System.out.println(e1);}

	}
}
