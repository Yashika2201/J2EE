package com.demo.dao;

import java.util.List;

import com.demo.model.Myuser;

public interface UserDao {

	void save(Myuser u);

	List<Myuser> findAll();

	Myuser findById(int uid);

	boolean deleteById(int uid);

	boolean updateById(int uid, String unm, String street);

	List<Myuser> sortById();

	void closeMyServiceFactory();

}
