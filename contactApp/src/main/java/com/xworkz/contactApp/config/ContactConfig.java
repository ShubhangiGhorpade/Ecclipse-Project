package com.xworkz.contactApp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.contactApp")
public class ContactConfig {

	public ContactConfig() {
		System.out.println("Running:" + this.getClass().getSimpleName());
	}

}
