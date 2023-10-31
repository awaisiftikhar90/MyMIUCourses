package com.example.asdfinalprojecteshop.service;

import edu.miu.eshop.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllMain();
    List<Category> getSubById(long id);
}
