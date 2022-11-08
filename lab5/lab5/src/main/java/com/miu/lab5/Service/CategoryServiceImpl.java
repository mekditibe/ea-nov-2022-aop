package com.miu.lab5.Service;

import com.miu.lab5.Entity.Category;
import com.miu.lab5.Middleware.Annotation.ExecuteGet;
import com.miu.lab5.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> getCategorys() {
        return categoryRepository.findAll();
    }
    @Override
    public Category getCategory(Long Id) {
        return categoryRepository.findById(Id).get();
    }

    @Override
    public void deleteCategory(Long Id) {
        categoryRepository.deleteById(Id);
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepository.save(category);
    }
}
