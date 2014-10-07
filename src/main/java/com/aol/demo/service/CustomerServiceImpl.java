package com.aol.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aol.demo.jpa.repository.CustomerRepository;
import com.aol.demo.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer getCustomer(String sn) {
		LOGGER.debug("Looking up customer for sn '{}'", sn);
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
