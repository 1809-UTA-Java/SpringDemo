package com.revature.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.revature.model.Movie;

@Controller
@RequestMapping("/movies")
public class MovieController {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Hello, World!");
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Movie> returnMovie(@PathVariable("id") int id) {
		return ResponseEntity.ok(new Movie(id, "Jaws", "Horror", 10));
	}
	
	@GetMapping("/api/{id}")
	public String redirect(@PathVariable("id") String id) {
		return "redirect:/movies/" + id;
	}
	
	@GetMapping("/byName/{name}")
	@ResponseBody
	public Movie returnMovieName(@PathVariable("name") String n) {
		return new Movie(0, n, "Comedy", 5);
	}
	
	@GetMapping("/index")
	public String index() {
		return "forward:/movies/hello";
	}
	
	@SuppressWarnings("unused")
	@GetMapping("/ex")
	public Movie exMovie() throws IOException {
		Movie movie = null;
		if (movie == null) {
			throw new MovieNotFoundException();
			//throw new IOException();
		} else {
			return new Movie();
		}
	}
	
	@ResponseStatus(value=HttpStatus.CONFLICT)
	@ExceptionHandler(IOException.class)
	public ResponseEntity<String> conflict() {
		return ResponseEntity.ok("Uh oh, Spaghetti-os");
	}
}
