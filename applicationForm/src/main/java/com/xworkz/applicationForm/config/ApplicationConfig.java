package com.xworkz.applicationForm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz.applicationForm")
@EnableWebMvc
public class ApplicationConfig implements WebMvcConfigurer {

	public ApplicationConfig() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("start");
	}

}
