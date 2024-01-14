package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.dao.UserDao;
import com.demo.model.User;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private UserDao udao;

	@Override
	public void addUser(User u) {
		udao.addUser(u);
		
	}

	@Override
	public User validate(String username, String password) {
		return udao.validate(username, password);
	}
}
