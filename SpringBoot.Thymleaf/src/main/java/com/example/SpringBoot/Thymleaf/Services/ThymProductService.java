package com.example.SpringBoot.Thymleaf.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.Thymleaf.Entities.Products;
import com.example.SpringBoot.Thymleaf.Repository.ThymProductRepo;

@Service
public class ThymProductService {

	@Autowired
	private ThymProductRepo thymrepo;
	
	public List<Products> FindProductByCategory(String category) {
		return thymrepo.findByCategory(category); 
	}
	
	public Products CreateProduct(Products createproduct) {
	   return thymrepo.save(createproduct);
	}
	
	public List<Products> FindAllProducts(){
		return thymrepo.findAll();
	}
}
