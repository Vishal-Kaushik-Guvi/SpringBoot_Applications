package com.example.SpringWebFluxR2DBC.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table
public class Person {
    @Id
    private long id;
    
    private String name;
    private int age;
}
