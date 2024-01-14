package com.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Products {
	private int pid;
	private String name;
	private double price;
	private int quantity;
	private String description;
	
	
	public Products() {
		super();
	}


	public Products(int pid, String name, double price, int quantity, String description) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Products [pid=" + pid + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", description=" + description + "]";
	}
	
	
}
