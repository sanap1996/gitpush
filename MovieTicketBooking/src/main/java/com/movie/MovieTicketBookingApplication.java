package com.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@SpringBootApplication
public class MovieTicketBookingApplication {

	public static void main(String[] args) {
		System.out.println("this is movie booking app");
		SpringApplication.run(MovieTicketBookingApplication.class, args);
	}
    @Bean
      public RestTemplate  rt()
      {
    	   RestTemplate rs = new RestTemplate();
    	    return rs;
      }
	
	
}
