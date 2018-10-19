package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.config.HibernateConfig;
import com.revature.repository.AnimalDao;

public class Driver {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		AnimalDao dao = context.getBean("animalDao", AnimalDao.class);
		
		System.out.println(dao.getAnimals());
		context.close();
	}
}
