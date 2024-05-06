package com.Testing.SpringBatch.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Finance {

 private String Segment;
 private String country;
 private String product;
 private Date date;

 @Column(name = "unit Sold")
 private int unitsold;

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;

}
