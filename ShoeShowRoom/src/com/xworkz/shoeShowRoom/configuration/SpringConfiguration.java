package com.xworkz.shoeShowRoom.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.shoeShowRoom")
public class SpringConfiguration {

	@Bean
	public Validator validator() {
		ValidatorFactory factory = Validation
				.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;
	}

}
