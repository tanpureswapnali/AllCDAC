package org.fi.spring.rest.firstrestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"org.fi.spring.rest.firstrestapp.controllers"})
public class FirstRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestAppApplication.class, args);
	}

}
