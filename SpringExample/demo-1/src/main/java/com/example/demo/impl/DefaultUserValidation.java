package com.example.demo.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.demo.DbConnection;
import com.example.demo.UserValidationInterface;
public class DefaultUserValidation implements UserValidationInterface {
	public boolean validate(String Uname,String pwd)
	{
		DbConnection db=new DbConnection();
		String pawd = "";
		try {
			String sql = "select password from task"+" where name="+"\""+Uname+"\"";
Statement stmt = db.getConnection().createStatement();
ResultSet rs = stmt.executeQuery(sql);
while(rs.next()) {
	pawd=rs.getString("password");
}
if(pwd.equals(pawd)) {
	return true;
}
			db.closeConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
}
