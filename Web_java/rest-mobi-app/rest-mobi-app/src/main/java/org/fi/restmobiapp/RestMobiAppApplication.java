package org.fi.restmobiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"org.fi.restmobiapp.services","org.fi.restmobiapp.controllers"})
@EntityScan(basePackages= {"org.fi.restmobiapp.entity"})
@EnableJpaRepositories(basePackages={"org.fi.restmobiapp.repository"})
public class RestMobiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestMobiAppApplication.class, args);
	}

}
