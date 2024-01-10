package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmpService {

	List<Employee> getAllEmployees();

	void deleteEmp(int eid);

	void addnewemp(Employee e);

	Employee getById(int id);

	void modifyemp(Employee e);

//	void deleteEmp(int eid);

//	void deleteEmp(int id);
	

}
