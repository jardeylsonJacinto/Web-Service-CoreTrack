package com.acc.web_service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.web_service.model.Category;
import com.acc.web_service.repository.CategoryRepository;

@Service
public class CategoryService {

  @Autowired
  private CategoryRepository repository;

  public List<Category> findAll() {
    return repository.findAll();
  }

  public Category findById(Long id) {
    Optional<Category> obj = repository.findById(id);
    return obj.get();
  }
}