package com.paypal.bfs.test.employeeserv.controller;

public class EmployeeErrorResponse {

	private int httpstatus;
	private String message;

	public EmployeeErrorResponse() {

	}

	public int getHttpstatus() {
		return httpstatus;
	}

	public void setHttpstatus(int httpstatus) {
		this.httpstatus = httpstatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
