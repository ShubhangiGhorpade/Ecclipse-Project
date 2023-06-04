package com.xworkz.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class IceConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	public IceConfig() {
		System.out.println("IceConfig running");
	}
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletConfigClasses");
		return null;
	}

}
