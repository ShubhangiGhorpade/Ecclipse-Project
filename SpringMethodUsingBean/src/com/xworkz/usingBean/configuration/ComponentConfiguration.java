package com.xworkz.usingBean.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.usingBean.thing")

public class ComponentConfiguration {

	public ComponentConfiguration() {
		System.out.println(
				"Creating ComponentConfiguration ");
	}

}
