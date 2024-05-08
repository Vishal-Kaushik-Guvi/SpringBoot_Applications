package com.springcore.SpringCore;

public class Student {
   private int Std_id;
   private String Std_name;
   private String Std_Address;
   
public int getStd_id() {
	return Std_id;
}
public void setStd_id(int std_id) {
	Std_id = std_id;
}
public String getStd_name() {
	return Std_name;
}
public void setStd_name(String std_name) {
	Std_name = std_name;
}
public String getStd_Address() {
	return Std_Address;
}
public void setStd_Address(String std_Address) {
	Std_Address = std_Address;
}

public Student(int std_id, String std_name, String std_Address) {
	super();
	Std_id = std_id;
	Std_name = std_name;
	Std_Address = std_Address;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "[Student_id= " + Std_id + ", Student_name= " + Std_name + ", Student_Address= " + Std_Address + "]";
}


}
