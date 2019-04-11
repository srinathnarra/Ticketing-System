package com.srinath.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinath.model.Admin;
import com.srinath.model.User;
import com.srinath.repository.AdminRepository;

@Service
@Transactional
public class AdminService {
	@Autowired
	private AdminRepository adminRepository;
	public AdminService() 
	{
		
	}
	public AdminService(AdminRepository adminRepository) {
		this.adminRepository=adminRepository;
	}
	public Admin findByAdminnameAndPassword(String adminname, String password) {
		
		Admin admin=new Admin();
		
		admin=adminRepository.findByAdminnameAndPassword(adminname, password);
		
		return admin;
	}
	


}
