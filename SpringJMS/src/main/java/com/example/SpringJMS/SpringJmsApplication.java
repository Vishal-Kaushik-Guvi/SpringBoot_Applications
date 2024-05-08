package com.example.SpringJMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJmsApplication.class, args);
		System.out.println("Spring Jms Working....");
	}
}
