package com.sonata.OtherJDBC;
import java.sql.*;
import java.io.*;
public class RetrieveImage {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBS","root","admin@123");
	PreparedStatement ps=con.prepareStatement("select * from Image");
	File file=new File("C:/Users/Santosh Thota/Downloads/santoshimage.jpg");
	FileOutputStream fos=new FileOutputStream(file);
	byte b[];
	Blob blob;
	
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		blob=rs.getBlob("im");
		b=blob.getBytes(1, (int)blob.length());
		fos.write(b);
		
	}
	ps.close();
	fos.close();
	con.close();
	
	
	}catch(ClassNotFoundException e) {System.out.println(e);}
	catch(SQLException e1) {e1.printStackTrace();}
catch(IOException e2) {System.out.println(e2);}
}
}
