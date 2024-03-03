package com.jpa.dto;

import com.jpa.entity.Customer;

public class CustomerRequest {
	
	private Customer customer ;

	public CustomerRequest() {
		super();
	}

	public CustomerRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerRequest [customer=" + customer + "]";
	}
}