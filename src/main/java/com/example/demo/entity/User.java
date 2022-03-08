
/*---------ENTITY CLASS----------*/
/*going to directly interact with database, used to make table and its columns, primary key etc*/


//after DTO this class is formed, not compulsory but this will interact with database 
// here USer is our Entity
package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   // this is written in the  class which we going to connect with database
@Table(name = "user")
public class User {

	@Id // to set primary key, 
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment primary key
	
	@Column(name = "user_id") // to change the column name
	                          //otherwise column names will same as that of variable names 
	private Integer userId;
	
	private String name;
	
	private String address;
	
	private String email;
	
	@Column(name = "contact_no") //column name change
	private String contactNo;
	
	private String password;
	
	public User() {
		super();
		
	}

	public User(String name, String address, String email, String contactNo, String password) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.contactNo = contactNo;
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
