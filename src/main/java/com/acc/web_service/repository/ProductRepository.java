package com.acc.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.web_service.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}