package com.demo.service;

import java.util.List;

import com.demo.model.Products;

public interface ProductService {

	void addNewProduct();

	List<Products> getProducts();

	Products getById(int id);

	int modifyproduct();

	int deleteProduct();

}
