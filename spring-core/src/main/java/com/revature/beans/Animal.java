package com.revature.beans;

public class Animal {
	private String name;
	private int id;
	private int legs;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal(String name, int id, int legs, int age) {
		super();
		this.name = name;
		this.id = id;
		this.legs = legs;
		this.age = age;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", id=" + id + ", legs=" + legs + ", age=" + age + "]";
	}

}
