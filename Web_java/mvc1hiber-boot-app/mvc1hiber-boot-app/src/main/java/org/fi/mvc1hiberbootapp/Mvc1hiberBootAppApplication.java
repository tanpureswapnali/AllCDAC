package org.fi.mvc1hiberbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages={"org.fi.mvc1hiberbootapp.controllers"})
@EntityScan(basePackages={"org.fi.mvc1hiberbootapp.entity"})
public class Mvc1hiberBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mvc1hiberBootAppApplication.class, args);
	}

}
