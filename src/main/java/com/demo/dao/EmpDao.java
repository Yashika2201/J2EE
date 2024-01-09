package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmpDao {

	List<Employee> getAll();

	void delete(int id);

}
