package com.paypal.bfs.test.employeeserv.impl;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.controller.EmployeeNotFoundException;
import com.paypal.bfs.test.employeeserv.empDAO.EmployeeRepository;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {
	
	@Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public ResponseEntity<Employee> employeeGetById(String id) 
    		throws EmployeeNotFoundException{
    	Employee employee = employeeRepository.findById(Integer.parseInt(id))
    		  .orElseThrow(() -> new EmployeeNotFoundException("Employee with id " + id + " does not exist"));
    		        return ResponseEntity.ok().body(employee);
    }

    
    @Override
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    

}
