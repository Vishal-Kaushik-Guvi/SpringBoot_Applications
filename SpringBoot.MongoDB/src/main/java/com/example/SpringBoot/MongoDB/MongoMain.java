package com.example.SpringBoot.MongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoMain {

	public static void main(String[] args) {
		SpringApplication.run(MongoMain.class, args);
		System.out.println("Mongo Application Running............");
	}

}
