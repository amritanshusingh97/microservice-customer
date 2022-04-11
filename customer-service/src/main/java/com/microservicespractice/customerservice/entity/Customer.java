package com.microservicespractice.customerservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId; //primary key
	private String custName;
	private String custAddress;
	private int pid; // foreign key
	public Customer() {
		super();
	}
	public Customer(String custName, String custAddress, int pid) {
		super();
		this.custName = custName;
		this.custAddress = custAddress;
		this.pid = pid;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getCustId() {
		return custId;
	}
	
	
	
}
