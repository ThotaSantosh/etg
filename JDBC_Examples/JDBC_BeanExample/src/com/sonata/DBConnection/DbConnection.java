package com.sonata.DBConnection;
import java.sql.*;
public class DbConnection {
Connection connection;
public Connection getConnection() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBS","root","admin@123");
	}catch(ClassNotFoundException e1) {System.out.println(e1);}
	catch(SQLException e2) {e2.printStackTrace();}
	return connection;
}
public void closeConnection() {
	try {
		if(connection !=null) {
			connection.close();
		}
	}
	catch(SQLException sqle) {sqle.printStackTrace();}
}
}
