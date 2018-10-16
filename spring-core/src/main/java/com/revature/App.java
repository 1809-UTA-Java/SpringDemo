package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Animal;
import com.revature.beans.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Animal a = (Animal) context.getBean("Hippo");
		System.out.println(a);
		Employee e = context.getBean("Employee", Employee.class);
		System.out.println(e);
		Employee bob = context.getBean("Bob", Employee.class);
		System.out.println(bob);
		Animal sam = context.getBean("Sam", Animal.class);
		System.out.println(sam);
		((AbstractApplicationContext) context).close();
	}
}
