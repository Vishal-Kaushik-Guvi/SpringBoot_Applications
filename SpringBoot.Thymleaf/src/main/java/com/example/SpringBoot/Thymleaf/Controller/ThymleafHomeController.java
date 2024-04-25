package com.example.SpringBoot.Thymleaf.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SpringBoot.Thymleaf.Entities.Products;
import com.example.SpringBoot.Thymleaf.Services.ThymProductService;


@Controller
public class ThymleafHomeController {
 
	@Autowired
	private ThymProductService service;

// Work For Template
  @GetMapping("/")
  public String home() {
	  return "index";
	  }
 
// Work For Template
  @GetMapping("/addproduct")
  public String addproductform() {
	  return "addproduct";
  }

// Work For Api
  @PostMapping("/addproduct")
  public String addProduct(@ModelAttribute Products product) {
	  service.CreateProduct(product);
	  return "redirect:/"; // redirect to index after submiting
  }

// Work For Template
  @GetMapping("/displayproduct")
  public String showProductForm(Model model){
	  model.addAttribute("product", new Products());
	  return "displayproduct";
  }

// Work For Api
  @PostMapping("/displayproduct")
   public String getProductByCategory(@RequestParam("category") String category, Model model){
	  List<Products> products = service.FindProductByCategory(category);
	  
	  model.addAttribute("products",products);
	  
	  return "productlist";
  }

    @GetMapping("allproducts")
    public String AllProductsDetails(Model model){
      List<Products> alltheproducts = service.FindAllProducts();
      model.addAttribute("alltheproducts", alltheproducts);
      return "allproducts";
    }
}
