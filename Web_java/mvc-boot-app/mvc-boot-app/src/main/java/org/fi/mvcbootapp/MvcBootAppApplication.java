package org.fi.mvcbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"org.fi.mvcbootapp.beans","org.fi.mvcbootapp.controller"})
public class MvcBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcBootAppApplication.class, args);
	}

}
