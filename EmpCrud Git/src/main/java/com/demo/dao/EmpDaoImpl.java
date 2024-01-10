package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmpDaoImpl implements EmpDao{
	static Connection conn;
	static PreparedStatement selectAll, deleteById, insert, getById, updateById;
	static {
		conn=DBUtil.getMyConnection();
		try {
			selectAll = conn.prepareStatement("Select * from employee;");
			deleteById = conn.prepareStatement("delete from employee where id = ?");
			insert = conn.prepareStatement("insert into employee values(?, ?, ?)");
			getById = conn.prepareStatement("Select * from employee where id = ?;");
			updateById =conn.prepareStatement("update employee set name=?, sal=? where id=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> getAll() {
		List <Employee> ls = new ArrayList <>();
		ResultSet rs;
		try {
			rs = selectAll.executeQuery();
			while(rs.next()) {
				Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				ls.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ls;
	}

	@Override
	public void delete(int id) {
		try {
			deleteById.setInt(1, id);
			deleteById.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void add(Employee e) {
		try {
			insert.setInt(1,e.getId());
			insert.setString(2,e.getName());
			insert.setDouble(3,e.getSal());
			insert.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}


	@Override
	public Employee getById(int id) {
		try {
			getById.setInt(1, id);
			ResultSet rs=getById.executeQuery();
			if(rs.next())
			   return new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateEmp(Employee e) {
		try {
			updateById.setString(1, e.getName());
			updateById.setDouble(2, e.getSal());
			updateById.setInt(3, e.getId());
			updateById.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	}


