package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmpService {

	List<Employee> getAllEmployees();

	void deleteEmp(int eid);

//	void deleteEmp(int eid);

//	void deleteEmp(int id);
	

}
