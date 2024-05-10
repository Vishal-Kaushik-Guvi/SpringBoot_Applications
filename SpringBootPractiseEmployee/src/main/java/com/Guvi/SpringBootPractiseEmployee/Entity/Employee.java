package com.Guvi.SpringBootPractiseEmployee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)

@Column(name = "Employee_ID")
private int id;

@Column(name = "First_Name")
private String firstName;
@Column(name =  "Last_Name")
private String lastName;

@Column(name = "Employee_Mail")
private String email;
}
