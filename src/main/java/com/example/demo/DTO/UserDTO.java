/* ----this will contain the things you want show on the front end---*/
/*even can take data of two tables in single class*/

package com.example.demo.DTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserDTO {

	private Integer userId;
	
	private String name;

	private String address;
	
	private String contactNo;
	
	private String email;
	
	private String password;
	
	public UserDTO() {
		super();
	}
	
	public UserDTO(Integer userId, String name, String address, String contactNo, String email) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
		this.email = email;
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
