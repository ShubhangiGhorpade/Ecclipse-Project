package com.xworkz.jpaDemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz.jpaDemo")
@EnableWebMvc

public class WebSeriesConfig implements WebMvcConfigurer{

	
	public  WebSeriesConfig() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		// it handles the static resource
		configurer.enable();
	}

}
