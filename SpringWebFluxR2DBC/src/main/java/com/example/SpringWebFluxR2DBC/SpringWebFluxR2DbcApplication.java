package com.example.SpringWebFluxR2DBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;
import org.springframework.web.reactive.config.EnableWebFlux;

import io.r2dbc.spi.ConnectionFactory;

@SpringBootApplication
@EnableWebFlux
public class SpringWebFluxR2DbcApplication {

	@Bean
	ConnectionFactoryInitializer initializer(ConnectionFactory connectionfactory){
		ConnectionFactoryInitializer intial = new ConnectionFactoryInitializer();
		intial.setConnectionFactory(connectionfactory);
		intial.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));

		return intial;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringWebFluxR2DbcApplication.class, args);
		System.out.println("R2dbc Running");
	}

}