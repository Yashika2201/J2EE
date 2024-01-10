package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("Bread", 25.00, "Freshly baked bread made with wheat flour, salt, and yeast.");
		Product p2 = new Product("Butter", 150.00, "Pure and creamy butter made from cow's milk.");
		Product p3 = new Product("Eggs", 120.00, "Fresh and nutritious eggs from free-range chickens.");
		Product p4 = new Product("Milk", 50.00, "Fresh and pure cow's milk, rich in calcium and vitamin D.");
		Product p5 = new Product("Rice", 40.00, "High-quality rice grown with care and packed with essential nutrients.");
		Product p6 = new Product("Sugar", 85.00, "Pure and unrefined sugar made from sugarcane or sugar beet.");
		Product p7 = new Product("Tea", 125.00, "Freshly brewed tea made from high-quality tea leaves.");
		Product p8 = new Product("Tomatoes", 65.00, "Fresh and juicy tomatoes packed with vitamins and minerals.");
		Product p9 = new Product("Wheat Flour",  65.00, "High-quality wheat flour made from premium wheat grains.");
		Product p10 = new Product( "Yogurt", 135.00, "Delicious and healthy yogurt made from fresh milk and live cultures.");
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.save(p5);
		session.save(p6);
		session.save(p7);
		session.save(p8);
		session.save(p9);
		session.save(p10);
		
		tr.commit();
		session.close();
	}

}
