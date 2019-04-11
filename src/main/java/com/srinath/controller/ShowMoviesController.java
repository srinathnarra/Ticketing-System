package com.srinath.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.srinath.services.ShowMovieListService;


@Controller
public class ShowMoviesController {
	
	@Autowired
	ShowMovieListService showMovieListService; 

/*	
	@RequestMapping("/show-movies") 
	public String showAllMovies(HttpServletRequest request) {
		request.setAttribute("movies", showMovieListService.showAllMovies());
//		request.setAttribute("mode", "ALL_USERS");
		return "movielist";
	}*/
	
    @RequestMapping("/show-movies") 
	public String showAllMovies(@RequestParam String moviearea ,@RequestParam String moviedate,HttpServletRequest request) throws Exception {
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
        Date strDate = formatter.parse(moviedate);  
 
		request.setAttribute("movies", showMovieListService.getMovies(moviearea,strDate));

//		request.setAttribute("mode", "ALL_USERS");
		return "movielist";
		
		
		
		
	}

	/*public String showMovies(@RequestParam String moviearea, @RequestParam Date moviedate,HttpServletRequest request) {
		request.setAttribute("moviesinnfo", showMovieListService.findByMoviearea(moviearea));
		return "homepage";

	}*/

}
