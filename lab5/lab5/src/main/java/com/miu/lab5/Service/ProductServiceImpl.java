package com.miu.lab5.Service;

import com.miu.lab5.Entity.Product;
import com.miu.lab5.Middleware.Annotation.ExecuteGet;
import com.miu.lab5.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepo;
    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }
    @Override
    public Product getProduct(Long Id) {
        return productRepo.findById(Id).get();
    }

    @Override
    public void deleteProduct(Long Id) {
        productRepo.deleteById(Id);
    }

    @Override
    public void saveProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        productRepo.save(product);
    }
}
