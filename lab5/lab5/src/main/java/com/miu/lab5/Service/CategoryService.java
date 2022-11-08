package com.miu.lab5.Service;

import com.miu.lab5.Entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategorys();
    Category getCategory(Long Id);
    void deleteCategory(Long Id);
    void saveCategory(Category category);
    void updateCategory(Category category);
}
