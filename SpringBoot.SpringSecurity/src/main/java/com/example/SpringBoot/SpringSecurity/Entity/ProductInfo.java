package com.example.SpringBoot.SpringSecurity.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder // helps to make many objects of this class with simple config...
public class ProductInfo {
  private int id;
  private String name;
  private int quantity;
  private double price;
}