package com.aol.demo.controller;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import com.aol.demo.model.Customer;
import com.aol.demo.service.CustomerService;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CustomerRestControllerTest {
	
	private CustomerRestController customerRestController;
	private CustomerService customerService;
	
	@Before
	public void setUp() {
		customerRestController = new CustomerRestController();
		
		customerService = mock(CustomerService.class);
		ReflectionTestUtils.setField(customerRestController, "customerService", customerService);
	}
	
	@Test
	public void testGetCustomer() {
		// Set Expectations
		when(customerService.getCustomer(anyString())).thenReturn(mock(Customer.class));
		
		// Test
		assertNotNull(customerRestController.getCustomer("viktest"));
		
		// Verify
		verify(customerService).getCustomer(anyString());
	}

	@Test
	public void testGetCustomersByLastName() {
		// Set Expectations
		when(customerService.findCustomersByLastName(anyString())).thenReturn(Arrays.asList(mock(Customer.class)));
		
		// Test
		assertNotNull(customerRestController.getCustomersByLastName("Test"));
		
		// Verify
		verify(customerService).findCustomersByLastName(anyString());
	}

	@Test
	public void testCreateCustomer() {
		// Set Expectations
		when(customerService.createCustomer(any(Customer.class))).thenReturn(mock(Customer.class));
		
		// Test
		assertNotNull(customerRestController.createCustomer(new Customer()));
		
		// Verify
		verify(customerService).createCustomer(any(Customer.class));
	}

}
