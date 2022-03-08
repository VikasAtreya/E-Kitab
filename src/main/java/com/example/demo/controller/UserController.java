//used to take request from user and send the response 

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController  // used to connect with front end(react here)
@RequestMapping(value = "/user")
public class UserController {

	@Autowired // make an object of User service class
	private UserService userService;
	
	@PostMapping("/addUser")
	//public User addUser(@RequestBody UserDTO userDTO) {
	public ResponseEntity<User> addUser(@RequestBody UserDTO userDTO) {	
		User user = userService.addUser(userDTO);
		ResponseEntity<User> responseEntity = new ResponseEntity<>(user,HttpStatus.OK);
		return responseEntity;
	}
	 //For login Page
	@PostMapping("/login")

	public ResponseEntity<?> login(@RequestBody UserDTO userDTO) 
	
	{
		User user =  userService.login(userDTO);
		if(user != null) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>("LogIn successfull "+user.getName(),HttpStatus.OK);
			return responseEntity;
			
		}else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>("User not found",HttpStatus.UNAUTHORIZED);
			return responseEntity;
			
		}
		
		
		
	}
}
