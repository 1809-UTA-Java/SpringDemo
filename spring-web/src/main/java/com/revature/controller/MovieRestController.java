package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Movie;

@RestController
public class MovieRestController {
	@GetMapping("/api/all")
	public List<Movie> getAllMovies() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(0, "Jack and Jill", "Comedy", 5));
		movies.add(new Movie(1, "Jaws", "Horror", 10));
		
		return movies;
	}
	
	@PostMapping("/api/post")
	public Movie createMovie(@RequestBody Movie m) {
		return m;
	}
	
	@PostMapping("/api/postValidate")
	public Movie createValidMovie(@Valid @RequestBody Movie m, Errors errors) {
		Movie movie = null;
		
		if(errors.hasErrors())
			return null;
		
		movie = m;
		return movie;
	}
}
