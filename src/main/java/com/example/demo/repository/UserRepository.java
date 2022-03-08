/* -----connect with database--*/
// help in executing database queries
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
//jpa repository take two parameters 'entity'(here User) and 'data type' of primary key(here Integer)

public interface UserRepository extends JpaRepository<User, Integer>{ 

	public User findByEmailAndPassword(String email,String password); //will return a user with corresponding email and password
	//method name must be same as that of column names,here we used capital letter just to follow naming convention
	//we are not defining method, just overriding, can take as many inputs as we like just separate by 'AND'
	
	public List<User> findByEmail(String email);
	//list is used bcoz if there are two users with same email then it will give error
	
	public User findByPassword(String password);
}
