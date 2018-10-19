package com.revature.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ANIMALS")
public class Animal {
	@Id
	private int id;
	private String name;
	private int age;
	private int legs;

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", age=" + age + ", legs=" + legs + "]";
	}

}
