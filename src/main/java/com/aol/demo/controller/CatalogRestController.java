package com.aol.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aol.demo.model.Product;
import com.aol.demo.service.CatalogService;

@RestController
@RequestMapping("/rest/catalog")
public class CatalogRestController {
	
	@Autowired
	private CatalogService catalogService;
	
	@RequestMapping(value="/{sku}", method=RequestMethod.GET)
	public Product getProduct(@PathVariable("sku") String sku) {
		return catalogService.getProduct(sku);
	}

}
