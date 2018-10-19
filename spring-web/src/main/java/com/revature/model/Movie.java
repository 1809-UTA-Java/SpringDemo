package com.revature.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Movie {
	private int id;

	@NotBlank
	@Pattern(regexp="[a-z-A-Z]*")
	private String title;
	private String genre;
	
	@Min(value=6)
	@Max(value=10)
	private double rating;

	public Movie(int id, String title, String genre, double rating) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + ", rating=" + rating + "]";
	}

}
