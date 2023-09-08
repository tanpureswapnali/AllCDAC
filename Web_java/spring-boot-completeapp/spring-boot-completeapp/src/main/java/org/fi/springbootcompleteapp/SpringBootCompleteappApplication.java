package org.fi.springbootcompleteapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {" org.fi.springbootcompleteapp.controllers","org.fi.springbootcompleteapp.services"})
@EntityScan(basePackages= {"org.fi.springbootcompleteapp.entity"})
@EnableJpaRepositories(basePackages= {"org.fi.springbootcompleteapp.repository"})

public class SpringBootCompleteappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCompleteappApplication.class, args);
	}

}
