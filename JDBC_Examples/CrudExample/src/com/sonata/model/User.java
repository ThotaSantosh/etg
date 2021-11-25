package com.sonata.model;

public class User {
private int userId;
private String userName;
private String email;
private String firstName;
private String lastName;
private int contact_no;
private String role;
private boolean isActive;
private String dob;
private String createdOn;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getContact_no() {
	return contact_no;
}
public void setContact_no(int contact_no) {
	this.contact_no = contact_no;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getCreatedOn() {
	return createdOn;
}
public void setCreatedOn(String createdOn) {
	this.createdOn = createdOn;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", firstName=" + firstName
			+ ", lastName=" + lastName + ", contact_no=" + contact_no + ", role=" + role + ", isActive=" + isActive
			+ ", dob=" + dob + ", createdOn=" + createdOn + "]";
}


}
