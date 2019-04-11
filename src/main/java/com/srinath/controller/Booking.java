package com.srinath.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.srinath.services.MovieService;

@Controller
public class Booking {
	@Autowired
	MovieService movieService;
	@RequestMapping("/Book-tkts")
	public String bookUser(@RequestParam int movieid,HttpServletRequest request) {
		
		request.setAttribute("movies", movieService.showMovies(movieid));
//		request.setAttribute("mode", "MODE_UPDATE");
		return "booking";
	}
	
}
