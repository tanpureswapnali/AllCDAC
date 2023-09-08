package org.fi.mvc1bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages=
{"org.fi.mvc1hibernateapp"
                                     })
public class Mvc1BootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mvc1BootAppApplication.class, args);
	}

}
