package com.sonata.OtherJDBC;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
public class ImageStorage {
	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBS","root","admin@123");
	PreparedStatement ps=con.prepareStatement("insert into image values(?)");
	File file=new File("C:/Users/Santosh Thota/Downloads/santoshimage.jpg");
	FileInputStream fin=new FileInputStream(file);
	ps.setBinaryStream(1, fin,(int)file.length());
	int row=ps.executeUpdate();
	System.out.println(row);
	}
	catch(ClassNotFoundException e) {System.out.println(e);}
	catch(SQLException e1) {e1.printStackTrace();}
catch(IOException e2) {System.out.println(e2);}
}
}

