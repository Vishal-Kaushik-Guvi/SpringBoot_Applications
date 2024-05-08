package com.java.hibernate;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {
    public static void main(String args[]) { 
        System.out.println("Project Started...");
        Configuration config = new Configuration();
        config.configure("com/java/hibernate/config.xml");
        SessionFactory factory = config.buildSessionFactory();

//        Employee emp = new Employee();

//        try (FileInputStream file = new FileInputStream("src/main/java/com/java/hibernate/lalu3.jpg")) 
//        {
//            byte[] data = new byte[file.available()];
//            file.read(data);
//
//            emp.setImage(data);
//
//            emp.setCity("Bihar");
//            emp.setName("Lalu Yadav");
//            emp.setNope("Nope");
//            emp.setPhone(0000);
//
//            Session ss = factory.openSession();
//            Transaction tx =  ss.beginTransaction();
//            ss.saveOrUpdate(emp);
//            tx.commit();
//            ss.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}