package com.aol.demo.service;

import com.aol.demo.model.Product;

public interface CatalogService {
	Product getProduct(String sku);
}
