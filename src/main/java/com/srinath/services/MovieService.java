package com.srinath.services;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinath.model.Movies;
import com.srinath.repository.MovieRepository;



@Service
@Transactional
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	public MovieService()
	{
		
	}
			
	
	public MovieService(MovieRepository movieRepository) {
		this.movieRepository=movieRepository;
	}
	
	
	public List<Movies> showAllMovies(){
		List<Movies> movies = new ArrayList<Movies>();
		for(Movies movie : movieRepository.findAll()) {
			movies.add(movie);
		}
		
		return movies;
	}
	
	
	
	public Movies showMovies(int movieid) {
		return movieRepository.findOne(movieid);
	}
	
	public void UpdateMovieSeatNos(int movieid, int tktsavalbleattenam,int tktsavableattwopm,int tktsavbleatsixpm,int tktsavalbleatninepm) {
		movieRepository.updateSeatsDetails(movieid,tktsavalbleattenam,tktsavableattwopm,tktsavbleatsixpm,tktsavalbleatninepm);
	}

	

	

}
