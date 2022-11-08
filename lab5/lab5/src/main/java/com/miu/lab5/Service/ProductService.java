package com.miu.lab5.Service;

import com.miu.lab5.Entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product getProduct(Long Id);
    void deleteProduct(Long Id);
    void saveProduct(Product product);
    void updateProduct(Product product);
}
