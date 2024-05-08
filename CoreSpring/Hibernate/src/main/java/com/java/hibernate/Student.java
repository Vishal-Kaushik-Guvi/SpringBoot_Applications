package com.java.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // to use as a entity 
@Table()
public class Student {
 private String name;
 private String course;
 @Id // to give primary key
 private int id;
 
 private Certificate certi;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Certificate getcerti() {
	return certi;
}

public void setCertificate(Certificate std_certi) {
	this.certi = std_certi;
}

@Override
public String toString() {
	return "Student [name=" + name + ", course=" + course + ", id=" + id + ", Certificate ="  + certi +"]";
}


 
}
