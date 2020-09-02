package com.paypal.bfs.test.employeeserv.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> employeeNotFound(EmployeeNotFoundException ex) {

		EmployeeErrorResponse response = new EmployeeErrorResponse();
		response.setHttpstatus(HttpStatus.NOT_FOUND.value());
		response.setMessage(ex.getMessage());

		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

	}

	// handles any other exception
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException(Exception ex) {

		EmployeeErrorResponse response = new EmployeeErrorResponse();
		response.setHttpstatus(HttpStatus.BAD_REQUEST.value());
		response.setMessage(ex.getMessage());

		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
}
