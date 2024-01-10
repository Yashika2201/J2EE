package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.Transaction;

import com.demo.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee(1, "Yashika", 230000);
		Employee e1 = new Employee(2, "Khushi", 200000);
		Employee e2 = new Employee(3, "LalChand", 550000);
		Employee e3 = new Employee(4, "Bharti", 520000);
		Employee e4 = new Employee(5, "Shubham", 240000);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(e);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
//		session.save(e1);
//		Employee emp = session.get(Employee.class, 3);
//		e2.setName("Lal Chand");
//		session.update(e2);
		tr.commit();
		session.close();
		
	}

}
