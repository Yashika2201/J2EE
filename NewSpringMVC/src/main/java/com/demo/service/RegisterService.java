package com.demo.service;

import com.demo.model.User;

public interface RegisterService {

	void addUser(User u);

	User validate(String username, String password);

}
