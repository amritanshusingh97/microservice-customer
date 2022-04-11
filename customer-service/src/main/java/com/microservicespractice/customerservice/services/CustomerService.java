package com.microservicespractice.customerservice.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservicespractice.customerservice.classes.MyOrders;
import com.microservicespractice.customerservice.classes.Product;
import com.microservicespractice.customerservice.entity.Customer;
import com.microservicespractice.customerservice.repos.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
	
	public MyOrders getMyOrders(int custId) {
		
		Optional<Customer> customer = customerRepo.findById(custId);
		
		int pid = customer.get().getPid();
		
		Product product = restTemplate.getForObject("http://localhost:8081/product/"+pid, Product.class);
		
		MyOrders myOrders = new MyOrders();
		
		myOrders.setCustomer(customer.get());
		myOrders.setProduct(product);
		
		return myOrders;
		
	}
	
}
