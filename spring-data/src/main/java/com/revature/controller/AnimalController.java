package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Animal;
import com.revature.repository.AnimalDao;

@RestController
public class AnimalController {
	@Autowired
	AnimalDao dao;

	@GetMapping("/animals")
	public List<Animal> getAll() {
		List<Animal> animals = dao.findAll();
		return animals;
	}
	
	@GetMapping("/animals/{name}")
	public Animal getByName(@PathVariable("name") String name) {
		return dao.findByName(name);
	}
	
	@GetMapping("/animals/{min}/{max}")
	public List<Animal> getBetween1824(@PathVariable("min") int min, @PathVariable("max") int max) {
		return dao.findByAgeBetween(min, max);
	}
}
