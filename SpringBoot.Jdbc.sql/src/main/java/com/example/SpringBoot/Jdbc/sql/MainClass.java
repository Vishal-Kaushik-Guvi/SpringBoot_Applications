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

		std.setName("Demon 1");
		std.setAddress("America");
		
		List<Students> stdbyaddress = sr.findByAddress("Garhi Brahmna");
		// List<Students> stdinfo = sr.findAll();
		stdbyaddress.forEach(System.out::println);
		
	}
}
 