package com.example.productcatalog.repository;

import com.example.productcatalog.model.Product;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Product, Long> {
}
