package com.movie.serviceI;

import com.movie.model.BookingDetails;

public interface BokkingserviceI {

	BookingDetails saveData(int customId, int cinemaHallId, int movieId, BookingDetails book);

	void savepost(BookingDetails bk);

}
