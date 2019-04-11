package com.srinath.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinath.model.BookingDetails;
import com.srinath.model.Movies;
import com.srinath.model.User;
import com.srinath.repository.BookingDetailsRepository;


@Service
@Transactional
public class Bookingdetailsservice {
	@Autowired
	BookingDetailsRepository bookingDetailsRepository;
	
	String bookstatus="Pending";
	Bookingdetailsservice()
	{
		
	}
	
	public BookingDetails saveBookingDetails(User user,Movies movie ,int nofoftkts,String showTimeslcted) {
		BookingDetails bookdetails = new BookingDetails();
		bookdetails.setMovie_id(movie.getMovieid());
		bookdetails.setNooftkts(nofoftkts);
		bookdetails.setTotalprice((movie.getTkttprice() * nofoftkts));
		bookdetails.setMoviename(movie.getMoviename());
		bookdetails.setUsername(user.getUsername());
		bookdetails.setMoviearea(movie.getMoviearea());
		bookdetails.setTheatername(movie.getTheatername());
		bookdetails.setBookingdate(movie.getMoviedate());
		bookdetails.setMovietime(showTimeslcted);


		bookdetails.setBookingstatus(bookstatus);

		bookingDetailsRepository.save(bookdetails);
		
		return bookdetails;

	}
	public BookingDetails findByUsername(String username) {
		return bookingDetailsRepository.findByUsername(username);
	}
/*	public BookingDetails findByBookingid(int bookingid) {
		return bookingDetailsRepository.findByBookingid(bookingid);
	}*/


    public BookingDetails findByBokkingId(int bookingId) {
	    return bookingDetailsRepository.findOne(bookingId);
    }
    
    public void updateBookingStatus(int bookingId,String Success) {
	     bookingDetailsRepository.updateBookingStatus(bookingId,Success);
    }
}