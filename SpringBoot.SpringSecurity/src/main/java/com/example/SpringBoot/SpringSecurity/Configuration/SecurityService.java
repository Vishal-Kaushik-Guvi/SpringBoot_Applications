package com.example.SpringBoot.SpringSecurity.Configuration;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.SpringSecurity.Entity.ProductInfo;
import com.example.SpringBoot.SpringSecurity.Entity.UserInfo;
import com.example.SpringBoot.SpringSecurity.Entity.UserInfoRepository;

import jakarta.annotation.PostConstruct;

@Service
public class SecurityService {
 List<ProductInfo> productdata = null; // at initial state it is null its like int count = 0;

 @Autowired
 private UserInfoRepository userRepo;

 @Autowired 
 private PasswordEncoder passencode;
 
 // This method will insert 50 random data to the productdata
 
 @PostConstruct  // this annotation is used when you want to run a method after spring injections
 public void loadProductData() {
	 productdata = IntStream.range(1, 50).mapToObj(i -> ProductInfo.builder()
			 .id(i).name("product" +i).price(new Random().nextDouble(500))
			 .quantity(new Random().nextInt(10)).build()).collect(Collectors.toList());
   }
 
 public List<ProductInfo> getProducts(){
	 return productdata;
  }
 
 public ProductInfo getProductById(int id) {
	 return productdata.stream().filter(i -> i.getId()==id).findAny()
			 .orElseThrow(() -> new RuntimeException("product" +id+ "not available"));
  }

  public String addNewUser(UserInfo userinfo){
	userinfo.setPass(passencode.encode(userinfo.getPass()));
	userRepo.save(userinfo);
	return "User added successfully";
  }
}

