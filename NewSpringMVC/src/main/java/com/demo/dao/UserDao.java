package com.demo.dao;

import com.demo.model.User;

public interface UserDao {

	void addUser(User u);

	User validate(String username, String password);

}
