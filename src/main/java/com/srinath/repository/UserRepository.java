package com.srinath.repository;

import org.springframework.data.repository.CrudRepository;

import com.srinath.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {	
	
	public User findByUsernameAndPassword(String username, String password);
	public User findByUserid(String userid);


}


