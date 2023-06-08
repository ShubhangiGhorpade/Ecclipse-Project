package com.xworkz.donation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz.donation")
@EnableWebMvc
public class DonationConfiguration implements WebMvcConfigurer {

	public DonationConfiguration() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		// it handles the static resource
		configurer.enable();
	}

	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();

	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("start");
	}

}
