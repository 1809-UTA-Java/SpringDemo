package com.revature.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Movie does not exist")
public class MovieNotFoundException extends RuntimeException {

}
