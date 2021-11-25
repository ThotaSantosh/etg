package com.sonata.OtherJDBC;
import java.sql.*;
public class CallableExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBS","root","admin@123");
		CallableStatement cs=con.prepareCall("{call SAVE(?,?,?)}");
		cs.setInt(1, 322);
		cs.setString(2, "execution");
		cs.setDouble(3, 3456.0);
		int rs=cs.executeUpdate();
		System.out.println("the number of record inserted is" +rs);
		
		}catch(ClassNotFoundException e) {System.out.println(e);}
		catch(SQLException e1) {e1.printStackTrace();}
	}
}
