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
	static PreparedStatement selectAll, deleteById;
	static {
		conn=DBUtil.getMyConnection();
		try {
			selectAll = conn.prepareStatement("Select * from employee;");
			deleteById = conn.prepareStatement("delete from employee where id = ?");
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

}
