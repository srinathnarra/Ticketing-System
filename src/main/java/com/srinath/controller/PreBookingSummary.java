package com.srinath.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.srinath.model.BookingDetails;
import com.srinath.model.Movies;
import com.srinath.model.User;
import com.srinath.services.Bookingdetailsservice;
import com.srinath.services.MovieService;

@Controller
public class PreBookingSummary {
	
	@Autowired
	MovieService movieService;
	@Autowired
	Bookingdetailsservice bookingdetailsservice;
	
	private String tenam ="10AM";
	private String twopm ="02PM";
	@SuppressWarnings("unused")
	private String sixpm ="06PM";
	private String ninepm ="09PM";
	//private String Success ="Confirmed";

	
	int tktsavalbleattenam =0;
	int tktsavableattwopm =0;
	int tktsavbleatsixpm =0;
	int tktsavalbleatninepm =0;
	int movieid =0;



	
	
	@RequestMapping("/Book-Summary")
	public String bookingsummary(@RequestParam int nooftkts, @RequestParam int movieId,@RequestParam String showTimeslcted,HttpServletRequest request) {
//		userService.deleteMyUser(id);
//		BookingDetails bookdetails = new BookingDetails();
//		request.getSession().setAttribute("bookdetails",bookdetails);


		User user = (User)request.getSession().getAttribute("user");
		
		System.out.println("userName"+user.getUsername());
 		Movies movie= movieService.showMovies(movieId);
 		
	//	System.out.println(movie.getMovieid());


		BookingDetails bookingDetails = bookingdetailsservice.saveBookingDetails(user, movie, nooftkts , showTimeslcted);
//		request.setAttribute("bookingdetails", bookingdetailsservice.findByUsername(user.getUsername()));
		tktsavalbleattenam=movie.getTktsavalbleattenam();
		tktsavableattwopm=movie.getTktsavableattwopm();
		tktsavbleatsixpm=movie.getTktsavbleatsixpm();
		tktsavalbleatninepm=movie.getTktsavalbleatninepm();
		
		if(bookingDetails.getMovietime().equals(tenam))
		{
			tktsavalbleattenam=tktsavalbleattenam-bookingDetails.getNooftkts();
		}
		else if(bookingDetails.getMovietime().equals(twopm)) {
			tktsavableattwopm=tktsavableattwopm-bookingDetails.getNooftkts();

		}
		else if(bookingDetails.getMovietime().equals(sixpm)) {
			tktsavbleatsixpm=tktsavbleatsixpm-bookingDetails.getNooftkts();

		}
		else if(bookingDetails.getMovietime().equals(ninepm)) {
			tktsavalbleatninepm=tktsavalbleatninepm-bookingDetails.getNooftkts();

		}
		
		movieid=bookingDetails.getMovie_id();
		movieService.UpdateMovieSeatNos(movieid,tktsavalbleattenam,tktsavableattwopm,tktsavbleatsixpm,tktsavalbleatninepm);
	//	bookingdetailsservice.updateBookingStatus(bookingDetails.getBooking_id(),Success);
		request.setAttribute("bookingdetails", bookingDetails);

		return "bookingsummary";
	}

}
