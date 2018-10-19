package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Animal;

@Repository
public interface AnimalDao extends JpaRepository<Animal, Integer>{
	Animal findByName(String name);
	
	@Transactional
	List<Animal> findByAgeBetween(Integer min, Integer max);
}
