package com.sonata.loginform;


	public class LoginForm {
	    
	    private String userName;

	    private String password;

	    public String getuserName() {
	        return this.userName;
	    }

	    public void setuserName(String userName) {
	        this.userName = userName;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String toString() {
	        return "LoginForm(UserName: " + this.userName + ", Password: " + this.password + ")";
	    }
	}


