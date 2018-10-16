package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.beans.Person;
import com.revature.util.BeanConfiguration;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Person p = ac.getBean("person", Person.class);
		System.out.println(p.getName() + " " + p.getPet().getName());
		p.setName("Harry");
		
		Person p2 = (Person) ac.getBean("person");
		System.out.println(p2.getName() + " " + p2.getPet().getName());
		
		Person p3 = (Person) ac.getBean("person");
		System.out.println(p3.getName() + " " + p3.getPet().getName());
		
		((AbstractApplicationContext) ac).close();
	}
}
