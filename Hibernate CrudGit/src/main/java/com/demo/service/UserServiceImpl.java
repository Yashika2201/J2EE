package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.model.Address;
import com.demo.model.Myuser;


public class UserServiceImpl implements UserService {
	private UserDao udao;
	
	public UserServiceImpl() {
		udao=new UserDaoImpl();
	}

	public void addnewUser() {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter user id");
	int uid=sc.nextInt();
	System.out.println("enter user name");
	String uname=sc.next();
	System.out.println("enter address id");
	int addid=sc.nextInt();
	System.out.println("enter street");
	String street=sc.next();
	System.out.println("enter city");
	String city=sc.next();
	Myuser u=new Myuser(uid,uname,new Address(addid,street,city));
	udao.save(u);
		
	}

	public List<Myuser> getAllUser() {
		
		return udao.findAll();
	}
	

	public Myuser getById(int uid) {
		
		return udao.findById(uid);
	}

	
	public boolean removeById(int uid) {
		
		return udao.deleteById(uid);
	}
	

	public boolean modifyById(int uid, String unm, String street) {
		
		return udao.updateById(uid,unm,street);
	}

	public List<Myuser> sortById() {
		
		return udao.sortById();
	}
	

	public void closeMySessionFactory() {
		
		udao.closeMyServiceFactory();
	}

	@Override
	public List<Myuser> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	 

}
