package com.sonata.OtherJDBC;
import java.sql.*;
public class TransactionControlExample {
public static void main(String[] args) throws SQLException {
	Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBS","root","admin@123");
		con.setAutoCommit(false);
		PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?)");
		ps.setInt(1, 1860);
		ps.setString(2, "Welcome");
		ps.setDouble(3,2346.98);
		int a=ps.executeUpdate();
		con.commit();
		System.out.println("the number of records updated are" +a);
		
	}catch(ClassNotFoundException e) {System.out.println(e);}
	catch(SQLException e1){e1.printStackTrace();
	con.rollback();
	}
	finally {
		con.close();
	}
}
}
