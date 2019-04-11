package com.srinath.repository;
import org.springframework.data.repository.CrudRepository;

import com.srinath.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
	
	public Admin findByAdminnameAndPassword(String adminname, String password);
	
}
