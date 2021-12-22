package com.sonata.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.jdbc.PreparedStatement;
import com.sonata.dao.User;
import com.sonata.dao.UserInterface;

@Component
public class UserDaoImpl implements UserInterface{
	@Autowired
	DbConnection db;
	int row = 0;
	@Autowired
	User user = null;
	boolean c;
	
	@Override
	public int createUser(User user) {
		try {
			PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement("Insert into User values (?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, user.getUser_Id());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getFirst_Name());
			ps.setString(5, user.getLast_Name());
			ps.setLong(6, user.getContact_Number());
			ps.setString(7, user.getRole());
			ps.setBoolean(8, user.getIsactive());
			ps.setString(9, user.getDob());
			ps.setString(10, user.getCreated_on());
			ps.setString(11, user.getPassword());
			row = ps.executeUpdate();
			db.closeConnection();
		}catch(SQLException sqe) {sqe.printStackTrace();}
		
		return row;
	}
	
	public boolean validateUser(String Username, String Password){
		try {
		PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement("select Username, Password from User where Username =?");
		ps.setString(1, Username);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			if(Username.equals(rs.getString(1)) && Password.equals(rs.getString(2))) {
				c = true;
			}
			else {
				c = false;
			}
		}
		}catch(SQLException sqe) {sqe.printStackTrace();}
		
		return c;
	}
	
	

}
