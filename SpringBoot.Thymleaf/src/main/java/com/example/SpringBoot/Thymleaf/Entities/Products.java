package com.example.SpringBoot.Thymleaf.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private double price;

private String name;

private String category;


}
