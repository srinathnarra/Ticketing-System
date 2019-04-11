package com.srinath.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="booking_details")
public class BookingDetails {
	@Id
	@GeneratedValue
	private Integer booking_id;
	private Integer movie_id;
	private String moviename;	
	private Integer nooftkts;
	private Integer totalprice;
	private String username;
//	private Date bookingdate;
	private String moviearea;
	private String theatername;
	private String bookingstatus;
	private String movietime;
	private Date bookingdate;

	
	
	public BookingDetails() {
		
	}
	
	public BookingDetails(Integer booking_id, Integer movie_id, String moviename, Integer nooftkts, Integer totalprice,
			String username, Date bookingdate, String moviearea, String theatername, String bookingstatus,
			String movietime) {
		super();
		this.booking_id = booking_id;
		this.movie_id = movie_id;
		this.moviename = moviename;
		this.nooftkts = nooftkts;
		this.totalprice = totalprice;
		this.username = username;
//		this.bookingdate = bookingdate;
		this.moviearea = moviearea;
		this.theatername = theatername;
		this.bookingstatus = bookingstatus;
		this.movietime = movietime;
		this.bookingdate = bookingdate;

	}

	
	
	
	public String getMoviearea() {
		return moviearea;
	}

	public void setMoviearea(String moviearea) {
		this.moviearea = moviearea;
	}

	public String getTheatername() {
		return theatername;
	}

	public void setTheatername(String theatername) {
		this.theatername = theatername;
	}

	public String getBookingstatus() {
		return bookingstatus;
	}

	public void setBookingstatus(String bookingstatus) {
		this.bookingstatus = bookingstatus;
	}

	public String getMovietime() {
		return movietime;
	}

	public void setMovietime(String movietime) {
		this.movietime = movietime;
	}
	
	
	public Integer getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(Integer booking_id) {
		this.booking_id = booking_id;
	}
	public Integer getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public Integer getNooftkts() {
		return nooftkts;
	}
	public void setNooftkts(Integer nooftkts) {
		this.nooftkts = nooftkts;
	}
	public Integer getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Integer totalprice) {
		this.totalprice = totalprice;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}
	
	@Override
	public String toString() {
		return "BookingDetails [booking_id=" + booking_id + ", movie_id=" + movie_id + ", moviename=" + moviename
				+ ", nooftkts=" + nooftkts + ", totalprice=" + totalprice + ", username=" + username + ", moviearea="
				+ moviearea + ", theatername=" + theatername + ", bookingstatus=" + bookingstatus + ", movietime="
				+ movietime + ", bookingdate=" + bookingdate + "]";
	}



	

}
