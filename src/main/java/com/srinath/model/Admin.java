package com.srinath.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name ="adminid", nullable = false, unique = true)
	
	private int adminid;
    private String adminname;
	private String password;
	
	public Admin()
	{
		
	}
	
	public Admin(int adminid ,String adminname, String password) {
		super();
		this.adminid = adminid;
		this.adminname = adminname;
		this.password = password;
	}
	
	public Integer getAdminid() {
		return adminid;
	}

	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	 @Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminname=" + adminname + ", password=" + password + "]";
	}

	
}
