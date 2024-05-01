package com.example.SpringBoot.SpringSecurity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.SpringSecurity.Configuration.UserInfo;
import com.example.SpringBoot.SpringSecurity.Entity.SecurityProduct;
import com.example.SpringBoot.SpringSecurity.Entity.SecurityService;

@RestController
@RequestMapping("/products")
public class SpringSecurityController {
	
	@Autowired
	SecurityService service;
  
  @GetMapping("/welcome")
  public String home() {
	  return "Welcome to Security Product Testing";	
  }
  
  @PreAuthorize("hasAuthority('ROLE_ADMIN')")
  @GetMapping("/allproducts")
  public List<SecurityProduct> getAllProduct(){
	  return service.getProducts();
  }
  
  @GetMapping("/productid/{id}")
  public SecurityProduct getProductByid(@PathVariable int id) {
	  return service.getProductById(id);
  }

  @PostMapping("/new")
  public String addNewUser(@RequestBody UserInfo userInfo){
      return service.addUser(userInfo);
  }
}
