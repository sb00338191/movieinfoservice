package com.soumen.movieinfoservice.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumen.movieinfoservice.model.MovieInfo;

@RestController
@EnableEurekaClient
public class movieController {
	
	@RequestMapping(value="/movieinfo/{id}")
	public MovieInfo movieInfo(@PathVariable(value="id") int id ) {
		
		return new MovieInfo(id, "Titanic");
		
	}
 
}
