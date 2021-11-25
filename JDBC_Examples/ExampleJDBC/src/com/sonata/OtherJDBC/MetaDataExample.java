package com.sonata.OtherJDBC;
import java.sql.*;
public class MetaDataExample {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBS","root","admin@123");
		DatabaseMetaData dm=con.getMetaData();
		System.out.println(dm.getDatabaseMajorVersion());
		System.out.println(dm.getDriverName());
		System.out.println(dm.getDriverVersion());
		
		PreparedStatement ps=con.prepareStatement("select * from Employee");
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rms=rs.getMetaData();
		System.out.println(rms.getColumnCount());
		System.out.println(rms.getColumnName(2));
	}catch(ClassNotFoundException e) {System.out.println(e);}
	catch(SQLException e1) {e1.printStackTrace();}
}
}
