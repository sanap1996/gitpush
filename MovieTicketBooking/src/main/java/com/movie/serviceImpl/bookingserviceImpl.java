package com.movie.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.movie.MovieRepository.bookingrepository;
import com.movie.dto.CinemaHallDetails;
import com.movie.dto.CustomerDetails;
import com.movie.dto.MovieSchdule;
import com.movie.model.BookingDetails;
import com.movie.model.MovieDetails;
import com.movie.serviceI.BokkingserviceI;

@Service
public class bookingserviceImpl implements BokkingserviceI{
    @Autowired
    RestTemplate rs;
    
	@Autowired
	bookingrepository brepo;
	@Override
	public BookingDetails saveData(int customId, int cinemaHallId, int movieId,BookingDetails book) 
	{
		   String customerurl ="http://localhost:9999/getSingle/"+customId;
		 CustomerDetails cd= rs.getForObject(customerurl, CustomerDetails.class);
		book.setCustomerName(cd.getCustomName());
		book.setCustomerContactNumber(cd.getCustomName());
		
		String cinemaurl="http://localhost:7000/getsingle/"+cinemaHallId;
		 CinemaHallDetails cdd= rs.getForObject(cinemaurl, CinemaHallDetails.class);	
				book.setCinemaHallName(cdd.getCinemaHallName());
				
				for(MovieSchdule movie:cdd.getMovie())
				{
					if(movie.getMovieId()==movieId)
					{
						MovieDetails md= new MovieDetails();
						md.setMovieId(movie.getMovieId());
						md.setMovieTitle(movie.getMovieTitle());
						md.setLeadActorName(movie.getLeadActorName());
						md.setDirectorName(movie.getDirectorName());
						md.setDateStartTime(movie.getDateStartTime());
						md.setDataEndTime(movie.getDateStartTime());
						md.setScreenNo(movie.getScreenNo());
						md.setTicketPrice(movie.getTicketPrice());
					book.setMovieDetails(md);
					}
					
				}
				 return brepo.save(book);
				
	}
	@Override
	public void savepost(BookingDetails bk) {
		brepo.save(bk);
		
	}

}
