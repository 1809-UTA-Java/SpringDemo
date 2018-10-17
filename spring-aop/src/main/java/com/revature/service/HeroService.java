package com.revature.service;

import org.springframework.stereotype.Service;

@Service
public class HeroService {
	public String brand = "DC";

	public String getBrand() {
		return this.brand;
	}

	public void saveTheDay() throws Exception {
		System.out.println("Our hero arrives to save the day");
		throw new Exception();
	}
}
