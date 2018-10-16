package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("John Smith")
	private String name;
	
	@Value("50")
	private int age;
	
	@Value("zookeeper")
	private String job;

	@Autowired
	private Animal animal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Employee(String name, int age, String job, Animal animal) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.animal = animal;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", job=" + job + ", animal=" + animal + "]";
	}

}
