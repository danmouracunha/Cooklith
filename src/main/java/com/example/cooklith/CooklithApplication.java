package com.example.cooklith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulith;

/**
 * Main application class for the Cooklith application.
 * 
 * This application is built using Spring Modulith to create clear boundaries
 * between different domains (ingredients, recipes, and meal plans).
 * 
 * Each domain is implemented as a separate module with its own bounded context,
 * following Domain-Driven Design principles.
 */
@SpringBootApplication
@Modulith
public class CooklithApplication {

	public static void main(String[] args) {
		SpringApplication.run(CooklithApplication.class, args);
	}

}
