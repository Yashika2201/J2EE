package com.demo.service;


	
	import java.util.List;

	import com.demo.model.Myuser;

	public interface UserService {

		void addnewUser();

		List<Myuser> getAllUsers();

		Myuser getById(int uid);

		boolean removeById(int uid);

		boolean modifyById(int uid, String unm, String street);

		List<Myuser> sortById();

		void closeMySessionFactory();
}
