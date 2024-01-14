package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.model.*;
import com.demo.service.ProductService;

public class TestProduct {
//	@Autowired
//	ProductService ps;
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		ProductService ps=(ProductService)ctx.getBean("productServiceImpl");
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("1. Add new Product");
		System.out.println("2. Display All");
		System.out.println("3. Display by ID");
		System.out.println("4. Modify Product");
		System.out.println("5. Delete Product");
		System.out.println("6. Exit\nEnter choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1: ps.addNewProduct();
			break;
		case 2:
			List<Products> plist = ps.getProducts();
			plist.forEach(System.out::println);
			break;
		case 3: 
			System.out.println("Enter ID");
			int id = sc.nextInt();
			Products p = ps.getById(id);
			System.out.println(p);
			break;
		case 4: 
			int n = ps.modifyproduct();
			if (n>0) {
				System.out.println("Updated Successfully!!");
			}
			break;
		case 5: 
			n = ps.deleteProduct();
			if (n>0) {
				System.out.println("Deleted Successfully!!");
			}
			break;
		case 6: 
			System.out.println("Thank You for Visiting...");
			break;
		}
		}while(choice!=6);
	}
	
	
}
