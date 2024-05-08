package Sprin.orm.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "student_details")
 public class Student {
	
@Id
  @Column(name = "std_Id")
  private int std_Id;
  @Column(name ="std_Name")
  private String std_Name;
  @Column(name = "std_City")
  private String std_City;
  
public Student(int std_Id, String std_Name, String std_City) {
	super();
	this.std_Id = std_Id;
	this.std_Name = std_Name;
	this.std_City = std_City;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public int getStd_Id() {
	return std_Id;
}

public void setStd_Id(int std_Id) {
	this.std_Id = std_Id;
}

public String getStd_Name() {
	return std_Name;
}

public void setStd_Name(String std_Name) {
	this.std_Name = std_Name;
}

public String getStd_City() {
	return std_City;
}

public void setStd_City(String std_City) {
	this.std_City = std_City;
}
  

  
 
 
}
