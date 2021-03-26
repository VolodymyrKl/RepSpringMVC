package com.ciklum.internship.dao;

import com.ciklum.internship.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer> {
}
