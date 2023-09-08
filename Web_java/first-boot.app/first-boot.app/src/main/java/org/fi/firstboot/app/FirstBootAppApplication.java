package org.fi.firstboot.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstBootAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstBootAppApplication.class, args);
	}

	@Override
	public void run(String...args)throws Exception
	{
		System.out.println("Hello");
	}
}
