package com.aol.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

import com.aol.demo.model.Product;

@Service
public class CatalogServiceImpl implements CatalogService {

	@Value("${ecommerce.endpoint:https://api.dev.cmi.aol.com}")
	private String ecommerceEndpoint;
	
	@Autowired
	private RestOperations restOperations;
	
	@Override
	public Product getProduct(String sku) {
		String url = String.format("%s/catalog/products/%s", ecommerceEndpoint, sku);
		return restOperations.getForObject(url, Product.class);
	}

}
