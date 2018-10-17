package com.revature.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.revature.service.HeroService;

@Aspect
@Component
public class HeroAspect {
	@Before("execution(* com.revature.service.HeroService.saveTheDay(..))")
	public void beforeHeroism() {
		System.out.println("Our Hero puts on the uniform!");
	}
	
	@Before("execution(* com.revature.service.HeroService.saveTheDay(..))")
	public void beforeCallToAction() {
		System.out.println("Our Hero hears a distress signal!");
	}
	
	@AfterThrowing("within(com.revature.service.*)")
	public void disasterStrikes() {
		System.out.println("Disaster! What will happen to our Hero? Tune in next time!");
	}
	
	@AfterReturning(pointcut="execution(* save*(..))")
	public void theDayIsSaved(JoinPoint jp) {
		HeroService hs = (HeroService) jp.getTarget();
		System.out.println("The day is saved!");
		if (hs.getBrand().equals("DC")) {
			System.out.println("But everyone is still dark and angry");
		} else {
			System.out.println("Insert quip");
		}
	}
	
	@Around("execution(* save*(..))")
	public void ifDisaster(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("The evil badguy is about to...");
		try {
			jp.proceed();
		} catch (Exception ex) {
			this.disasterStrikes();
		}
		System.out.println("He fights the badguy!");
	}
}
