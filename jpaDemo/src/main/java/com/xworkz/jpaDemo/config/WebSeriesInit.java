package com.xworkz.jpaDemo.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebSeriesInit
		extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	public WebSeriesInit() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		return new Class[] { WebSeriesConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		return new String[] { "/" };
	}

}
