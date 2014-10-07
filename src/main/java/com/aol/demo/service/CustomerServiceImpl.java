package com.aol.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aol.demo.jpa.repository.CustomerRepository;
import com.aol.demo.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer getCustomer(String sn) {
		return customerRepository.findOne(sn);
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> findCustomersByLastName(String lastName) {
		return customerRepository.findByLastName(lastName);
	}

}
