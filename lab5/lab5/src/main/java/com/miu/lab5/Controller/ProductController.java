package com.miu.lab5.Controller;

import com.miu.lab5.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

}
