package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {

	List<Employee> getEmployee();

	void addemp(Employee e);

	Employee find(int empid);

	void updateemp(Employee e);

	void delete(int empid);

}
