package com.aol.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aol.demo.service.CustomerService;

@Controller
public class CustomerHtmlController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/html/customers/{sn}", method=RequestMethod.GET)
	public String getCustomer(@PathVariable("sn") String sn, Model model) {
		model.addAttribute("customer",  customerService.getCustomer(sn));
		return "greeting";
	}
}

