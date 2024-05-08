package com.java.hibernate.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.java.hibernate.Student;

public class HibernateQueryLanguage {
         public static void main(String[] args) {
        	 
        	 Configuration config = new Configuration();
        	 config.configure("com/java/hibernate/config.xml");
        	 SessionFactory factory = config.buildSessionFactory();
        	 Session ss = factory.openSession();
        	 String query = "from Student";
        	 Query<Student> q = ss.createQuery(query);	
        	 java.util.List<Student> li = q.list();
        	 for (Student std : li) {	
        		 System.out.println(std);
			}   
         }
}
