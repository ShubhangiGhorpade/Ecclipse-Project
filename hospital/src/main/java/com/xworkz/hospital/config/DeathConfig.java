package com.xworkz.hospital.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.hospital")

public class DeathConfig {

	public DeathConfig() {
		System.out.println("Running:" + this.getClass().getSimpleName());
	}

}
