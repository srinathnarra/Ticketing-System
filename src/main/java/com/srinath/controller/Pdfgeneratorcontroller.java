package com.srinath.controller;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.srinath.model.BookingDetails;
import com.srinath.model.Mail;
import com.srinath.model.User;
import com.srinath.services.Bookingdetailsservice;
import com.srinath.services.EmailService;
import com.srinath.services.UserService;

import CalenderUtility.GeneratePdfReport;
@Controller
public class Pdfgeneratorcontroller {
	
	
	@Autowired
	Bookingdetailsservice bookingdetailsservice;
	
	@Autowired
    private EmailService emailService;
	@Autowired
	UserService userService;
	
	private String userid;
	private String Success ="Confirmed";

	
	
	
	@RequestMapping("/Pdf-Generate")
	@Produces(MediaType.APPLICATION_PDF_VALUE)
   public ResponseEntity<InputStreamResource> bookingsummary(@RequestParam int bookingId,HttpServletRequest request) {

 //    	request.getSession().setAttribute("bookdetails",bookdetails);


		User user = (User)request.getSession().getAttribute("user");
		User user1 = userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
//		System.out.println("userName"+user.getUsername());
	    List <BookingDetails> bookingdetailslist = new ArrayList();
		BookingDetails bookingdetails = bookingdetailsservice.findByBokkingId(bookingId);
		bookingdetailslist.add(bookingdetails);
		ByteArrayInputStream bis = GeneratePdfReport.citiesReport(bookingdetailslist);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
 		

	//	request.setAttribute("bookingdetails", bookingdetails);

	//	return "Pdf";
	}


/*	   @RequestMapping(value = "/sendemail")
	   public String sendEmail(@RequestParam int bookingId,HttpServletRequest request) {
	      return "Pdf";
	   } 
	   */
	   
		@SuppressWarnings("unchecked")
		@RequestMapping("/sendemail")  
	    public String run(@RequestParam int bookingId,HttpServletRequest request) throws Exception {
	//        log.info("Sending Email with Freemarker HTML Template Example");
	        User user = (User)request.getSession().getAttribute("user");
	       // User user = (User)request.getSession().getAttribute("user");
			User user1 = userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	        userid = user1.getUserid();
	        
	    		


	        Mail mail = new Mail();
	        mail.setFrom("srinathbooktkts@gmail.com");
	     //   mail.setTo("srinathreddynarra46@gmail.com");
		      mail.setTo(userid);
		   //    mail.setTo("mounika975@gmail.com");

	        mail.setSubject("Your Recent Ticket Booking information !!!!");
			
//			System.out.println("userName"+user.getUsername());
		    List <BookingDetails> bookingdetailslist1 = new ArrayList<BookingDetails>();
			BookingDetails bookingdetails = bookingdetailsservice.findByBokkingId(bookingId);
			bookingdetailslist1.add(bookingdetails);
			bookingdetailsservice.updateBookingStatus(bookingdetails.getBooking_id(),Success);
	        @SuppressWarnings("rawtypes")
			Map model = new HashMap();
	        model.put("name", bookingdetails.getUsername());
	        model.put("bookingid", bookingdetails.getBooking_id().toString());
	        model.put("moviename", bookingdetails.getMoviename());
	        model.put("theatername", bookingdetails.getTheatername());
	        model.put("moviearea", bookingdetails.getMoviearea());
	        model.put("nooftkts", bookingdetails.getNooftkts().toString());
	        model.put("totalprice", bookingdetails.getTotalprice().toString());
	        model.put("movietime", bookingdetails.getMovietime());
	        model.put("movieid", bookingdetails.getMovie_id().toString());
	        model.put("moviedate", bookingdetails.getBookingdate().toString());
	        
	        model.put("location", bookingdetails.getMoviearea());
	        model.put("signature", "srinathreddy");
	 //       model.put("image", "movie-ticket-booking.jpg");

	        mail.setModel(model);
	        emailService.sendSimpleMessage(mail);

	    	return "Pdf";
	    }
		
}

