package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getAll() {
		return jdbcTemplate.query("select * from employee;", (rs, num)-> {
				Employee e = new Employee();
				e.setEmpid(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setSal(rs.getDouble(3));
				e.setDesg(rs.getString(4));
				e.setDepartment(rs.getString(5));
				return e;
		});
	}

	@Override
	public void addemp(Employee e) {
		jdbcTemplate.update("insert into employee values (?, ?, ?, ?, ?)", new Object[] {e.getEmpid(), e.getEname(), e.getSal(), e.getDesg(), e.getDepartment()});
	}

	@Override
	public Employee find(int empid) {
		return jdbcTemplate.queryForObject("select * from employee where empid=?;", new Object[] {empid}, BeanPropertyRowMapper.newInstance(Employee.class));
	}

	@Override
	public void modify(Employee e) {
		jdbcTemplate.update("update employee set ename=?, sal=?, desg=?, dept=? where empid=?", new Object[] {e.getEname(), e.getSal(), e.getDesg(), e.getDepartment(), e.getEmpid()});
		
	}

	@Override
	public void delete(int empid) {
		jdbcTemplate.update("delete from employee where empid=?", new Object[] {empid});
		
	}
}
