package com.example.SpringBoot.SpringSecurity.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserInfo {
  private String name;
  private String email;
  private String pass;
  private String roles;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

}
