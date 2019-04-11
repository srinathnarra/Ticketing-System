package com.srinath.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.srinath.model.BookingDetails;

public interface BookingDetailsRepository extends CrudRepository<BookingDetails, Integer> {	
	
	public BookingDetails findByUsername(String username);
//	public BookingDetails findByBookingid(int bookingid);

	@Modifying(clearAutomatically = true)
	@Query(value="update BookingDetails b set b.bookingstatus = :Success where b.booking_id = :bookingid")
	 void updateBookingStatus(int bookingid,String Success);


}
