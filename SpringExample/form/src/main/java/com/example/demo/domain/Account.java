package com.example.demo.domain;


import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class Account {
	
	private Long id;
	
	//@NotNull
	//@Size(min=1, max=25)
	private String name = new String("santsh555");
	
	//@NotNull
	//@NumberFormat(style=Style.CURRENCY)
	private String email = new String("Thota.santosh@gmail.com");
	
	//@NotNull
	//@NumberFormat(style=Style.PERCENT)
	private String firstName= new String("Thota");
	
	private String lastName= new String("Santosh");
	
	private String contactNo= new String("9642217034");
	
	private String role= new String("System Analyst");

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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		contactNo = contactNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public static AtomicLong getIdsequence() {
		return idSequence;
	}

	public Long getId() {
		return id;
	}

	void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Long assignId() {
		this.id = idSequence.incrementAndGet();
		return id;
	}
	
	private static final AtomicLong idSequence = new AtomicLong();
	
}