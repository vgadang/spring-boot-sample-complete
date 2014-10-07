package com.aol.demo.service;

import java.util.List;

import com.aol.demo.model.Customer;

public interface CustomerService {
	
	Customer getCustomer(String sn);

	Customer createCustomer(Customer customer);

	List<Customer> findCustomersByLastName(String lastName);
}
