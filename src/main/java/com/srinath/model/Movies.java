package com.srinath.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="movies")
public class Movies {
	@Id
	private int movieid;
	private String moviename;	
	private String moviearea;	
	private int tktsavalbleattenam;
	private int tktsavableattwopm;
	private int tktsavbleatsixpm;
	private int tktsavalbleatninepm;
	private int tkttprice;
	private Date moviedate;
	private String theatername;
	
	
public Movies() {
		
	}
	
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getMoviearea() {
		return moviearea;
	}
	public void setMoviearea(String moviearea) {
		this.moviearea = moviearea;
	}
	
	public int getTktsavalbleattenam() {
		return tktsavalbleattenam;
	}

	public void setTktsavalbleattenam(int tktsavalbleattenam) {
		this.tktsavalbleattenam = tktsavalbleattenam;
	}

	public int getTktsavableattwopm() {
		return tktsavableattwopm;
	}

	public void setTktsavableattwopm(int tktsavableattwopm) {
		this.tktsavableattwopm = tktsavableattwopm;
	}

	public int getTktsavbleatsixpm() {
		return tktsavbleatsixpm;
	}

	public void setTktsavbleatsixpm(int tktsavbleatsixpm) {
		this.tktsavbleatsixpm = tktsavbleatsixpm;
	}

	public int getTktsavalbleatninepm() {
		return tktsavalbleatninepm;
	}

	public void setTktsavalbleatninepm(int tktsavalbleatninepm) {
		this.tktsavalbleatninepm = tktsavalbleatninepm;
	}

	public int getTkttprice() {
		return tkttprice;
	}

	public void setTkttprice(int tkttprice) {
		this.tkttprice = tkttprice;
	}

	public Date getMoviedate() {
		return moviedate;
	}

	public void setMoviedate(Date moviedate) {
		this.moviedate = moviedate;
	}

	public String getTheatername() {
		return theatername;
	}

	public void setTheatername(String theatername) {
		this.theatername = theatername;
	}

	@Override
	public String toString() {
		return "Movies [movieid=" + movieid + ", moviename=" + moviename + ", moviearea=" + moviearea
				+ ", tktsavalbleattenam=" + tktsavalbleattenam + ", tktsavableattwopm=" + tktsavableattwopm
				+ ", tktsavbleatsixpm=" + tktsavbleatsixpm + ", tktsavalbleatninepm=" + tktsavalbleatninepm
				+ ", tkttprice=" + tkttprice + ", moviedate=" + moviedate + ", theatername=" + theatername + "]";
	}
	public void add(Movies movies) {
		// TODO Auto-generated method stub
		
	}
}
