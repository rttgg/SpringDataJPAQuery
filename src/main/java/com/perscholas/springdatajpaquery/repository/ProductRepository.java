package com.perscholas.springdatajpaquery.repository;

import com.perscholas.springdatajpaquery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
