package com.xworkz.contactApp.controller;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.contactApp.config.ContactConfig;

public class Contact
		extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("ContactController root:"
				+ this.getClass().getSimpleName());
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("ContactController servlet:"
				+ this.getClass().getSimpleName());
		return new Class[] { ContactConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("ContactController Mapping:"
				+ this.getClass().getSimpleName());
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
