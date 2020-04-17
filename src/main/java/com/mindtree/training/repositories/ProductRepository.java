package com.mindtree.training.repositories;
import org.springframework.data.repository.CrudRepository;

import com.mindtree.training.entities.Product;


public interface ProductRepository extends CrudRepository<Product, Integer> {

}
