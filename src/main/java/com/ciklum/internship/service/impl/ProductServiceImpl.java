package com.ciklum.internship.service.impl;

import com.ciklum.internship.dao.ProductDAO;
import com.ciklum.internship.model.Product;
import com.ciklum.internship.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDAO productDao;

    public ProductServiceImpl(ProductDAO productDao) {
        this.productDao = productDao;
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public List<Product> listAll() {
        return (List<Product>) productDao.findAll();
    }

    @Override
    public Product get(int id) {
        return productDao.findById(id).get();
    }

    @Override
    public void delete(int id) {
        productDao.deleteById(id);
    }
}
