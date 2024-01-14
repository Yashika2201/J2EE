package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addUser(User u) {
		jdbcTemplate.update("insert into register(username, email, password) values(?, ?, ?)", new Object[] {u.getUsername(), u.getEmail(), u.getPassword()});
		
	}

	@Override
	public User validate(String username, String password) {
		try {
		return jdbcTemplate.queryForObject("select * from register where username = ? and password = ?", new Object[] {username, password}, BeanPropertyRowMapper.newInstance(User.class));
		}
		catch(Exception e) {
			return null;
		}
	}

}
