package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void deleteById(int id);
    void edit(Product product, int index);
    List<Product> findByName(String name);
}
