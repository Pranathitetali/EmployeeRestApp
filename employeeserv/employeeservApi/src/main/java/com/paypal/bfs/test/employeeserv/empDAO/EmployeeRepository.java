package com.paypal.bfs.test.employeeserv.empDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paypal.bfs.test.employeeserv.api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}