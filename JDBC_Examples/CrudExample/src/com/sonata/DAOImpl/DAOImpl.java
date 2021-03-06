package com.sonata.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.DBConnection.DbConnection;
import com.sonata.model.User;

public class DAOImpl implements UserDAO {
	int row=0;
	DbConnection db=new DbConnection();
	User user=null;
public int save(Object obj) {
	try {
		user=User(obj);
		PreparedStatement cs=db.getConnection().prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?,?)");
		cs.setString(1,user.getuserName());
		cs.setString(2,user.getEmail());
		cs.setString(3,user.getfirstName());
		cs.setString(4,user.getlastName());
		cs.setInt(5,user.getcontact_no());
		cs.setString(6,user.getRole());
		cs.setBoolean(7, user.getisActive());
		cs.setString(8,user.getDob());
		cs.setString(9,user.getcreatedOn());
		cs.setInt(10, user.getuserId());
		row=cs.executeUpdate();
		db.closeConnection();
	}catch(ClassNotFoundException e) {System.out.println(e);}
	catch(SQLException e1) {e1.printStackTrace();}
	return row;
	}

public int update(Object object) {
	try {
		user=(User)object;
		PreparedStatement cs=db.getConnection().prepareStatement("update User set userName=? where userId=? ");
		cs.setDouble(1,User.getuserName());
		cs.setInt(2, User.geuserId());
		row=cs.executeUpdate();
		db.closeConnection();
	}catch(SQLException e) {System.out.println(e);}
	return row;
}
public int delete(Object object) {
	try {
		user=(User)object;
		PreparedStatement cs=db.getConnection().prepareStatement("delete from User where userId=? ");
		
		cs.setInt(1, user.getuserId());
		row=cs.executeUpdate();
		db.closeConnection();
	}catch(SQLException e) {System.out.println(e);}
	return row;
}
}

