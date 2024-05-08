package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
       public static void main(String[] args) {
           Configuration config = new Configuration();
           config.configure("com/java/hibernate/config.xml");
           SessionFactory factory = config.buildSessionFactory();
           Session ss = factory.openSession();
           
           Student st = ss.get(Student.class, 1);  
           Employee emp = ss.get(Employee.class, 1);
           System.out.println(emp);
           System.out.println(st);
           System.out.println(emp.getCity());
           ss.close();
       }
}