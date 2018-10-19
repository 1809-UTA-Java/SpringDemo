package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ANIMALS")
public class Animal {
	private Integer id;
	private String name;
	private int age;
	private int legs;

	@Id
	@Column(name="ID")
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public Animal(int id, String name, int age, int legs) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.legs = legs;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", age=" + age + ", legs=" + legs + "]";
	}

}
