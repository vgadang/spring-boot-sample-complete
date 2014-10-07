package com.aol.demo.service;

import java.util.Arrays;
import java.util.List;

import com.aol.demo.model.Customer;

//@Service
public class StubbedCustomerServiceImpl implements CustomerService {

	@Override
	public Customer getCustomer(String screenName) {
		Customer customer = new Customer();
		customer.setScreenName(screenName);
		customer.setFirstName("StubbedFirst");
		customer.setLastName("StubbedLast");
		return customer;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return customer;
	}

	@Override
	public List<Customer> findCustomersByLastName(String lastName) {
		return Arrays.asList(getCustomer("test"));
	}

}
