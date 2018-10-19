package com.revature.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
	@ExceptionHandler(MovieNotFoundException.class)
	public void handleNoMovie() {
		
	}
}
