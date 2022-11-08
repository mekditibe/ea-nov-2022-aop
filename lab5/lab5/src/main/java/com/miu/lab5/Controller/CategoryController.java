package com.miu.lab5.Controller;

import com.miu.lab5.Entity.Category;
import com.miu.lab5.Service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/categories")
@RestController
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping
    public List<Category> getAllCategory(){
        return categoryService.getCategorys();
    }
    @GetMapping("/{Id}")
    public Category getCategory(@PathVariable Long Id){
        return categoryService.getCategory(Id);
    }

    @DeleteMapping("/{Id}")
    public void deleteCategory(@PathVariable Long Id){
        categoryService.deleteCategory(Id);
    }

    @PostMapping
    public void addCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
    }
    @PutMapping
    public void updateCategory(@RequestBody Category category){
        categoryService.updateCategory(category);
    }
}
