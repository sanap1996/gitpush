package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.movie.dto.CinemaHallDetails;
import com.movie.dto.CinemaHallDetails;
import com.movie.dto.CinemaHallDetails;
import com.movie.model.BookingDetails;
import com.movie.serviceI.BokkingserviceI;


@RestController
public class MovieHomeController {

@Autowired
BokkingserviceI bsi;

@PostMapping("/insert/{customId}/{cinemaHallId}/{movieId}")
public BookingDetails postData(@PathVariable int customId,@PathVariable int cinemaHallId,@PathVariable int movieId, @RequestBody BookingDetails book)
{
	BookingDetails bookmyshow	=bsi.saveData(customId,cinemaHallId,movieId,book);
	
	return bookmyshow;
}
	
@PostMapping("/add")
public String addData(@RequestBody BookingDetails bk)
{
		bsi.savepost(bk);
		return "added successfully ";
}


}