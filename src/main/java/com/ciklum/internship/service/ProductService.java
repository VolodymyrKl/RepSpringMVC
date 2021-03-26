package com.ciklum.internship.service;

import com.ciklum.internship.model.Product;

import java.util.List;

public interface ProductService {

    void save(Product product);

    List<Product> listAll();

    Product get(int id);

    void delete(int id);
}
