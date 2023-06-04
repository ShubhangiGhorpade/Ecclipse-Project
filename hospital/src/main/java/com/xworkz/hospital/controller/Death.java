package com.xworkz.hospital.controller;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.hospital.config.DeathConfig;

public class Death
		extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running:" + this.getClass().getSimpleName());
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running:" + this.getClass().getSimpleName());
		return new Class[] { DeathConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running:" + this.getClass().getSimpleName());
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {

		configurer.enable();

	}

}
