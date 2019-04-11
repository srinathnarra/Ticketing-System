package com.srinath.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.srinath.services.AdminService;
import com.srinath.services.MovieService;

@Controller
public class AdminLoginController {
	@Autowired
	AdminService adminService;
	@Autowired
	MovieService movieService;
	
	@RequestMapping("/adminlogin")
	public String login(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGIN");
		return "adminlogin";
	}
	
	public MovieService getMovieService() {
		return movieService;
	}

	public void setMovieService(MovieService movieService) {
		this.movieService = movieService;
	}

	@RequestMapping ("/login-admin")
//	public String loginAdmin(@ModelAttribute Admin admin, HttpServletRequest request) {
	public String loginAdmin(@RequestParam String adminname, @RequestParam String password , HttpServletRequest request) {
//		if(adminService.findByAdminnameAndPassword(admin.getAdminname(), admin.getPassword())!=null) {
	    if(adminService.findByAdminnameAndPassword(adminname, password)!=null) {
			request.setAttribute("movies", movieService.showAllMovies());
//			request.getSession().setAttribute("admin",admin);
//			request.setAttribute("mode", "ALL_MOVIES");
			return "movielist";
		}
		else 
		{
			request.setAttribute("error", "Invalid Adminname or Password");
			request.setAttribute("mode", "MODE_LOGIN");
		return "adminlogin";
			
		}
	}
	

}
