package com.demo.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Products;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao pdao;
	Scanner sc = new Scanner(System.in);

	@Override
	public void addNewProduct() {
		System.out.println("Enter ID");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		String nm = sc.nextLine();
		System.out.println("Enter Price");
		double price = sc.nextDouble();
		System.out.println("Enter Quantity");
		int qty = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Description");
		String desc = sc.nextLine();
		Products p = new Products(id, nm, price, qty, desc);
		pdao.addProduct(p);
	}

	@Override
	public List<Products> getProducts() {
		
		return pdao.getprod();
	}

	@Override
	public Products getById(int id) {
		return pdao.getById(id);
	}

	@Override
	public int modifyproduct() {
		System.out.println("Enter ID");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String nm = sc.nextLine();
		System.out.println("Enter Price");
		double price = sc.nextDouble();
		System.out.println("Enter Quantity");
		int qty = sc.nextInt();
		System.out.println("Enter Description");
		String desc = sc.nextLine();
		Products p = new Products(id, nm, price, qty, desc);
		return pdao.updateProduct(p);
	}

	@Override
	public int deleteProduct() {
		System.out.println("Enter ID");
		int id = sc.nextInt();
		return pdao.deleteById(id);
	}
}
