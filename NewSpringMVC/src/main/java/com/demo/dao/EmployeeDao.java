package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {

	List<Employee> getAll();

	void addemp(Employee e);

	Employee find(int empid);

	void modify(Employee e);

	void delete(int empid);

}
