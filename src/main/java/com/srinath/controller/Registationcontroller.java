package com.srinath.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srinath.model.User;
import com.srinath.services.UserService;


@Controller
public class Registationcontroller {
	@Autowired
	UserService userService;

	@RequestMapping("/registration")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "registration";
	}

    @RequestMapping("/save-user")
    public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
    	if(userService.findByUserid(user.getUserid())!=null) {
    		request.setAttribute("error", "Your User Id is already registered with Us...Please Login and Continue...");
			request.setAttribute("mode", "MODE_REGISTER");
			return "registration";
    		
		}
		else {
			
			userService.saveMyUser(user);
			request.setAttribute("error", "You are successfully registered with Us...Please Login and Continue...");
			request.setAttribute("mode", "MODE_REGISTER");
			return "registration";
		}

    }
}