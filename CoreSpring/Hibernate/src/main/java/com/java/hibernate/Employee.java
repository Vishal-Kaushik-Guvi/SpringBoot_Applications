package com.java.hibernate;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Emp_Details")
public class Employee {
@Column(name="Emp_Name")
 private String name;
@Column(name="Emp_Phone")
 private int phone;

@Column(name="Emp_ID")
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private int id;

@Column(name="Emp_City")
 private String City;

@Transient
 private String nope;

@Column(name="Emp_Image", columnDefinition = "blob")
 private byte[] image;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPhone() {
	return phone;
}

public void setPhone(int phone) {
	this.phone = phone;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getNope() {
	return nope;
}

public void setNope(String nope) {
	this.nope = nope;
}

public byte[] getImage() {
	return image;
}

public void setImage(byte[] image) {
	this.image = image;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", phone=" + phone + ", id=" + id + ", City=" + City + ", nope=" + nope
			+ ", image=" + Arrays.toString(image) + "]";
}

}
