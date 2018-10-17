package com.revature;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.HeroService;

public class App {

	public static void main(String[] args) throws Exception {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		HeroService hs = ac.getBean("heroService", HeroService.class);
		hs.saveTheDay();
		ac.close();
	}

}
