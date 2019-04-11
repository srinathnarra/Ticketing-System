
package com.srinath.repository;



import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.srinath.model.Movies;

public interface MovieRepository extends CrudRepository<Movies, Integer> 	
 {


	@Query("select m from Movies m where m.moviearea =:moviearea and m.moviedate=:moviedate")
	List<Movies> movieDetails(String moviearea, Date moviedate);
	
	@Modifying(clearAutomatically = true)
	@Query(value="update Movies m set m.tktsavalbleattenam = :tktsavalbleattenam,m.tktsavableattwopm = :tktsavableattwopm,m.tktsavbleatsixpm = :tktsavbleatsixpm,m.tktsavalbleatninepm = :tktsavalbleatninepm where m.movieid=:movieid")
	 void updateSeatsDetails(int movieid,int tktsavalbleattenam,int tktsavableattwopm,int tktsavbleatsixpm,int tktsavalbleatninepm);

	/* @Modifying(clearAutomatically = true)
	    @Query("UPDATE Company c SET c.address = :address WHERE c.id = :companyId")
	    int updateAddress(@Param("companyId") int companyId, @Param("address") String address);
	}
	*/
}
