package com.hibernate.java.crud.hibernate_crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class hibernateCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(hibernateCrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String args[]) {
		return runner -> {
			System.out.println("The spring beans were loaded and hence this runs! ");
		};
	}
}
