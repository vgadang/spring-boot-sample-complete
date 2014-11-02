package com.aol.demo.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import com.aol.demo.jpa.repository.CustomerRepository;
public class CustomerServiceImplStubTest {

	private CustomerServiceImpl customerServiceImpl;
	private CustomerRepository customerRepository;
	
	@Before
	public void setUp() {
		// Setup class to be tested
		customerServiceImpl = new CustomerServiceImpl();
		
		// Setup Stub for the dependency
		customerRepository = new CustomerRepositoryStub();
		ReflectionTestUtils.setField(customerServiceImpl, "customerRepository", customerRepository);
	}
	
	@Test
	public void testGetCustomer() {
		// Test
		assertNotNull(customerServiceImpl.getCustomer("viktest"));
	}

}
