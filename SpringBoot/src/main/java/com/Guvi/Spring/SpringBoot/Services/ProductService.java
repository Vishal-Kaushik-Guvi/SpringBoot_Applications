package com.Guvi.Spring.SpringBoot.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Guvi.Spring.SpringBoot.Exceptions.ProductNotFound;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;

    // To find all products
    public List<Products> Findall() {
        return productRepo.findAll();
    }

    // To find product using id
    public Products FindbyId(int Id) {
        return productRepo.findById(Id).orElseThrow(() -> new ProductNotFound("Product Not Found"));
    }

    // To create a new product
    public void createProduct(Products product) {
       productRepo.save(product);
    }
}