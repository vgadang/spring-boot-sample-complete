package com.aol.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aol.demo.model.Customer;
import com.aol.demo.service.CustomerService;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/rest/customers/{sn}", method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable("sn") String sn) {
		return customerService.getCustomer(sn);
	}
	
	@RequestMapping(value="/rest/customers", method=RequestMethod.GET)
	public List<Customer> getCustomersByLastName(@RequestParam("lastName") String lastName) {
		return customerService.findCustomersByLastName(lastName);
	}

	@RequestMapping(value="/rest/customers", method=RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

}

