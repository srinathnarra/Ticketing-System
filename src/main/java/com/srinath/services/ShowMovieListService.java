package com.srinath.services;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinath.model.Movies;
import com.srinath.repository.MovieRepository;

@Service
@Transactional
public class ShowMovieListService {
	@Autowired
	MovieRepository movieRepository;
	public ShowMovieListService()
	{
		
	}
	/*public List<Movies> showAllMovies(){
		List<Movies> movies = new ArrayList<Movies>();
		for(Movies movie : movieRepository.findAll()) {
			movies.add(movie);
		}
		
		return movies;
	}*/
	



public  List<Movies> getMovies(String moviearea,Date moviedate){
		
		List<Movies> movies = movieRepository.movieDetails(moviearea, moviedate);
	 
	
	return movies;
		
	
}






}
