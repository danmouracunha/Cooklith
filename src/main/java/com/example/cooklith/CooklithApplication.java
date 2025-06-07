package com.example.cooklith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulith;

@SpringBootApplication
@Modulith
public class CooklithApplication {

	public static void main(String[] args) {
		SpringApplication.run(CooklithApplication.class, args);
	}

}
