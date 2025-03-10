package com.acc.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.web_service.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}