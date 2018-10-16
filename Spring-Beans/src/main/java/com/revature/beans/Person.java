package com.revature.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person implements InitializingBean, DisposableBean{
	private String name;
	
	@Autowired
	private Pet pet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this.name + " is destroyed, and his little dog too");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Person is initialized");
		setName("Tom");
	}
	
	@PostConstruct
	public void defaultInit() {
		System.out.println("Default Init called here");
	}
	
	@PreDestroy
	public void defaultDestroy() {
		System.out.println("Default destroy called here");
	}

}
