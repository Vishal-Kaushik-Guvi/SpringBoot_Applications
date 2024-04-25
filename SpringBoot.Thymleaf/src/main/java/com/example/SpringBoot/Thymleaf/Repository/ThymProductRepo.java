package com.example.SpringBoot.Thymleaf.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.Thymleaf.Entities.Products;

public interface ThymProductRepo extends JpaRepository<Products, Integer> {

	public List<Products> findByCategory(String category);
}
