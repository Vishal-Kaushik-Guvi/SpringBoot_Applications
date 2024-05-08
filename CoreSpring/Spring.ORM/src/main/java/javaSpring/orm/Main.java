package javaSpring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Sprin.orm.Entities.Student;
import Spring.orm.dao.StudentDao;

public class Main {

	public static void main(String[] args) {
	  ApplicationContext ac = new ClassPathXmlApplicationContext("javaSpring/orm/config.xml");
		StudentDao sd  =  (StudentDao) ac.getBean("std");
		Student student = new Student();
		
		student.setStd_Id(101);	
		student.setStd_Name("Vishal");
		student.setStd_City("Sonipat");
		sd.insert(student);
		
	}

}
