package com.movie.dto;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


public class CinemaHallDetails {


	private int cinemaHallId;
	private String cinemaHallName;
	private  String seatingCapacity;
	private String address;
	
	
	private Set<MovieSchdule> movie;

	public Set<MovieSchdule> getMovie() {
		return movie;
	}

	public void setMovie(Set<MovieSchdule> movie) {
		this.movie = movie;
	}

	public int getCinemaHallId() {
		return cinemaHallId;
	}

	public void setCinemaHallId(int cinemaHallId) {
		this.cinemaHallId = cinemaHallId;
	}

	public String getCinemaHallName() {
		return cinemaHallName;
	}

	public void setCinemaHallName(String cinemaHallName) {
		this.cinemaHallName = cinemaHallName;
	}

	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
	
}
