package com.microservicespractice.customerservice.classes;

import com.microservicespractice.customerservice.entity.Customer;

public class MyOrders {

	private Customer customer;
	private Product product;
	public MyOrders() {
		super();
	}
	public MyOrders(Customer customer, Product product) {
		super();
		this.customer = customer;
		this.product = product;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
