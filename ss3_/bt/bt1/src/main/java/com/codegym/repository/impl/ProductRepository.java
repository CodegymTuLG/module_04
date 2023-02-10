package com.codegym.repository.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
  static List<Product> productList = new ArrayList<>();
   static {
      productList.add(new Product(80,"Product 1",50000,"description for product 1 ","maker 1"));
      productList.add(new Product(78,"Product 2",100000,"description for product 2 ","maker 2"));
      productList.add(new Product(89,"Product 3",150000,"description for product 3 ","maker 3"));
   }
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findById(int id) {
        for (Product s: productList) {
            if (id==s.getId()){
                return s;
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public void deleteById(int id) {
        productList.remove(id-1);
    }

    @Override
    public void edit(Product product, int index) {
        productList.set(index,product);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> listResult = new ArrayList<>();
        for (Product s: productList) {
            if (s.getName().contains(name)){
                listResult.add(s);
            }
        }
        return listResult;
    }
}
