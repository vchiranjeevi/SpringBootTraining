package com.mindtree.training.services;

import com.mindtree.training.entities.Product;

public interface ProductService {

	Iterable<Product> listAllProducts();

	Product getProductById(Integer id);

	Product saveProduct(Product product);

	void deleteProduct(Integer id);

}
