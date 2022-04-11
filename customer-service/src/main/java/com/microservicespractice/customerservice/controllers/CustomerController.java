package com.microservicespractice.customerservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicespractice.customerservice.classes.MyOrders;
import com.microservicespractice.customerservice.entity.Customer;
import com.microservicespractice.customerservice.services.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerService customerService; 
	
	@PostMapping("/")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping("/myorders/{custId}")
	public MyOrders getMyOrders(@PathVariable("custId") int custId) {
		return customerService.getMyOrders(custId);
	}
}
