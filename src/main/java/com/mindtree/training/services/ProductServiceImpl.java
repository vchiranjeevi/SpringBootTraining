package com.mindtree.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.training.entities.Product;
import com.mindtree.training.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
	}

	@Override
	public Product saveProduct(Product product) {
        return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Integer id) {
        productRepository.deleteById(id);		
	}

	
}
