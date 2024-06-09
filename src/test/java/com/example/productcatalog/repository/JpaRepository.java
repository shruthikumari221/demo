package com.example.productcatalog.repository;

import com.example.productcatalog.model.Product;

import java.util.List;

public interface JpaRepository<T, T1> {
    List<Product> findAll();

    void save(Product product);
}
