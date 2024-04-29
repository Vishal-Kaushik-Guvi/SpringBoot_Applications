package com.example.SpringBoot.SpringSecurity.Entity;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class SecurityService {
 List<SecurityProduct> productdata = null; // at initial state it is null its like int count = 0;
 
 // This method will insert 50 random data to the productdata
 
 @PostConstruct  // this annotation is user when you want to run a method after spring application
 public void loadProductData() {
	 productdata = IntStream.range(1, 50).mapToObj(i -> SecurityProduct.builder()
			 .id(i).name("product" +i).price(new Random().nextDouble(500))
			 .quantity(new Random().nextInt(10)).build()).collect(Collectors.toList());
   }
 
 public List<SecurityProduct> getProducts(){
	 return productdata;
  }
 
 public SecurityProduct getProductById(int id) {
	 return productdata.stream().filter(i -> i.getId()==id).findAny()
			 .orElseThrow(() -> new RuntimeException("product" +id+ "not available"));
  }
}

