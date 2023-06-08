package com.xworkz.donation.configuration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.donation.constant.DonationConstant;

public class DonationWebInit
		extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	public DonationWebInit() {
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
		return new Class[] { DonationConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize = DonationConstant.MAX_SIZE;
		MultipartConfigElement configElement = new MultipartConfigElement(
				DonationConstant.TEMP_FILE_NAME, maxSize, maxSize * 2,
				maxSize / 2);
		registration.setMultipartConfig(configElement);

	}

}
