package com.movie.MovieRepository;

import org.springframework.data.repository.CrudRepository;


import com.movie.model.BookingDetails;

public interface bookingrepository extends CrudRepository<BookingDetails, Integer>{

}
