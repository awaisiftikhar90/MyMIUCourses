package com.example.asdfinalprojecteshop.controller;

import edu.miu.eshop.model.Category;
import edu.miu.eshop.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(value = {"api", "api/categories"})
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = {"/main"})
    public List<Category> getAllMain() {
        return categoryService.getAllMain();
    }

    @GetMapping(value = {"/subById/{id}"})
    public List<Category> getSubById(@PathVariable long id) {
        return categoryService.getSubById(id);
    }
}
