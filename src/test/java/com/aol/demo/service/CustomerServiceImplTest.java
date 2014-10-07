package com.aol.demo.service;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import com.aol.demo.jpa.repository.CustomerRepository;
import com.aol.demo.model.Customer;

import static org.mockito.Mockito.*;

public class CustomerServiceImplTest {

	private CustomerServiceImpl customerServiceImpl;
	private CustomerRepository customerRepository;
	
	@Before
	public void setUp() {
		customerServiceImpl = new CustomerServiceImpl();
		
		customerRepository = mock(CustomerRepository.class);
		ReflectionTestUtils.setField(customerServiceImpl, "customerRepository", customerRepository);
	}
	
	@Test
	public void testGetCustomer() {
		// Set Expectations
		when(customerRepository.findOne(anyString())).thenReturn(mock(Customer.class));
		
		// Test
		assertNotNull(customerServiceImpl.getCustomer("viktest"));
		
		// Verify
		verify(customerRepository).findOne(anyString());
	}

	@Test
	public void testCreateCustomer() {
		// Set Expectations
		when(customerRepository.save(any(Customer.class))).thenReturn(mock(Customer.class));
		
		// Test
		assertNotNull(customerServiceImpl.createCustomer(new Customer()));
		
		// Verify
		verify(customerRepository).save(any(Customer.class));
	}

	@Test
	public void testFindCustomersByLastName() {
		// Set Expectations
		when(customerRepository.findByLastName(anyString())).thenReturn(Arrays.asList(mock(Customer.class)));
		
		// Test
		assertNotNull(customerServiceImpl.findCustomersByLastName("Test"));
		
		// Verify
		verify(customerRepository).findByLastName(anyString());
	}

}
