package com.smt.tx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smt.tx.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}