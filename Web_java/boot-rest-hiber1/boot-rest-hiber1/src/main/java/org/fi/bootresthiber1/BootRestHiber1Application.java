package org.fi.bootresthiber1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"org.fi.bootresthiber1.dto","org.fi.bootresthiber1.controllers"})
@EntityScan(basePackages= {"org.fi.bootresthiber1.entity"})
@EnableJpaRepositories(basePackages= {"org.fi.bootresthiber1.repository"})
public class BootRestHiber1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootRestHiber1Application.class, args);
	}

}
