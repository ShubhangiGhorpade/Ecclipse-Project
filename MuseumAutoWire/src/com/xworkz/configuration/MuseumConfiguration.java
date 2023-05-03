package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class MuseumConfiguration {

	public MuseumConfiguration() {
		System.out.println("constr in MuseumConfiguration");
	}

	@Bean
	public String sculpture() {
		System.out.println("Registering Sculpture");
		return "Scalp";
	}
}
