package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao edao;

	@Override
	public List<Employee> getEmployee() {
		return edao.getAll();
	}

	@Override
	public void addemp(Employee e) {
		edao.addemp(e);
		
	}

	@Override
	public Employee find(int empid) {
		return edao.find(empid);
	}

	@Override
	public void updateemp(Employee e) {
		edao.modify(e);
		
	}

	@Override
	public void delete(int empid) {
		edao.delete(empid);
		
	}
}
