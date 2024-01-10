package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Students;

public class StudentsTest {

	public static void main(String[] args) {
		
		Students s1 = new Students("Aryan", 'A');
		Students s2 = new Students("Aishwarya", 'B');
		Students s3 = new Students("Arjun", 'C');
		Students s4 = new Students("Ananya", 'A');
		Students s5 = new Students("Abhishek", 'D');
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);
		
		tr.commit();
		session.close();
	}
}
