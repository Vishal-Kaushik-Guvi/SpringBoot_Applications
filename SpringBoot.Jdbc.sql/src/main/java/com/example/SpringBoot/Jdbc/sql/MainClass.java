package com.example.SpringBoot.Jdbc.sql;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MainClass.class, args);
		
		StudentRepo sr = context.getBean(StudentRepo.class);
		
		System.out.println("Student Repo is done ");
		
		Students std = new Students();
		
		List<Students> stdinfo = sr.findAll();
		stdinfo.forEach(System.out::println);
		
	}
}
 