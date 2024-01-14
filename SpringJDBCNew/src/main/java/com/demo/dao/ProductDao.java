package com.demo.dao;

import java.util.List;

import com.demo.model.Products;

public interface ProductDao {

	void addProduct(Products p);

	List<Products> getprod();

	Products getById(int id);

	int updateProduct(Products p);

	int deleteById(int id);

}
