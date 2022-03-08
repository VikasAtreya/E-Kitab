package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service // to tell that this is service class,to use auto wiring must use this annotation(done in controller)
//@Component
public class UserServiceImpl implements UserService{

	@Autowired //annotation use to make object of repository class
	private UserRepository userRepo;
	
	@Override // make sure that method of parent class properly overridden 
	public User addUser(UserDTO userDTO) {
		User user =new User(userDTO.getName(),userDTO.getAddress(),userDTO.getEmail(),
				userDTO.getContactNo(),userDTO.getPassword());
		user = userRepo.save(user);  //insert data into DB (save method in crud repository interface save entity in db)
		return user;
	}

	@Override
	public User login(UserDTO userDTO) {
		
		User user = userRepo.findByEmailAndPassword(userDTO.getEmail(), userDTO.getPassword());
		return user; // return back to controller
	}
}