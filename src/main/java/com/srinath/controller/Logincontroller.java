package com.srinath.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srinath.model.User;
import com.srinath.services.UserService;
@Controller
public class Logincontroller {
	
	
	@Autowired
	UserService userService;
//	@Autowired
//	MovieService movieService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGIN");
		return "login";
	}
	


	@RequestMapping ("/login-user")
	public String loginUser(@ModelAttribute User user, HttpServletRequest request) {
		if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) {
//			request.setAttribute("movies", movieService.showAllMovies());
			request.getSession().setAttribute("user",user );
			request.setAttribute("mode", "MODE_REGION");
			return "homepage";
		}
		else 
		{
			request.setAttribute("error", "Invalid Username or Password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "login";
			
		}
	}
}
