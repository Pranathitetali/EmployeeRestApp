package com.paypal.bfs.test.employeeservFunctionalTests;


import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.paypal.bfs.test.employeeserv.api.model.Employee;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class EmployeeTests {

	@Autowired
	private TestRestTemplate restTemplate;
	

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port;
	}


    private static final SimpleDateFormat simpleDateFormat = 
    		new SimpleDateFormat(("dd/MM/yyyy"));
    private static final String DATE_OF_BIRTH_STRING = "01/12/2020";
    private static final Date DATE_OF_BIRTH = parseDate(DATE_OF_BIRTH_STRING);
    
    private static Date parseDate(final String dateString) {
        try {
            return simpleDateFormat.parse(dateString);
        } catch (final ParseException e) {
            return new Date();
        }
    }

	@Test
	public void contextLoads() {

	}
	
	@Test
	public void testGetEmployeeById() {
		Employee employee = restTemplate.getForObject(getRootUrl() + "/employees/1", Employee.class);
		System.out.println(employee.getFirstName());
		assertNotNull(employee);
	}

	@Test
	public void testCreateEmployee() {
		Employee employee = new Employee();
		employee.setFirstName("Jane");
		employee.setLastName("Smith");
		employee.setDob(DATE_OF_BIRTH);
		employee.setAddressLine1("1234 walnut ave");
		employee.setCity("Bentonville");
		employee.setState("Arkansas");
		employee.setCountry("USA");
		employee.setZipCode("72732");

		ResponseEntity<Employee> postResponse = restTemplate.postForEntity(getRootUrl() + "/employees", employee, Employee.class);
		assertNotNull(postResponse);
		assertNotNull(postResponse.getBody());
	}


}
