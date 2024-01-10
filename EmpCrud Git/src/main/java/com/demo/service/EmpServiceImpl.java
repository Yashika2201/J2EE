package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService {
	private EmpDao edao;
	
	public EmpServiceImpl() {
		super();
		this.edao = new EmpDaoImpl();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return edao.getAll();
	}

	@Override
	public void deleteEmp(int eid) {
		edao.delete(eid);
		
	}

	@Override
	public void addnewemp(Employee e) {
		edao.add(e);
		
	}

	@Override
	public Employee getById(int id) {
		return edao.getById(id);
	}

	@Override
	public void modifyemp(Employee e) {
		edao.updateEmp(e);
		
	}

	

}
