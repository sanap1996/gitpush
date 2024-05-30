package com.movie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class MovieDetails {

	@Id
	private int movieId;
	private String movieTitle;
	private String leadActorName;
	private String directorName;
	private float ticketPrice;
	 private String dateStartTime;
	 private String dataEndTime;
	 private String screenNo;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getLeadActorName() {
		return leadActorName;
	}
	public void setLeadActorName(String leadActorName) {
		this.leadActorName = leadActorName;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public float getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getDateStartTime() {
		return dateStartTime;
	}
	public void setDateStartTime(String dateStartTime) {
		this.dateStartTime = dateStartTime;
	}
	public String getDataEndTime() {
		return dataEndTime;
	}
	public void setDataEndTime(String dataEndTime) {
		this.dataEndTime = dataEndTime;
	}
	public String getScreenNo() {
		return screenNo;
	}
	public void setScreenNo(String screenNo) {
		this.screenNo = screenNo;
	}
	 
	 
}

