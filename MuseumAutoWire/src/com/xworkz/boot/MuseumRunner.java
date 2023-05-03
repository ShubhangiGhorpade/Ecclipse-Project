package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.MuseumConfiguration;
import com.xworkz.thing.Museum;

public class MuseumRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(
				MuseumConfiguration.class);
		int beanDefinitionCount = spring
				.getBeanDefinitionCount();
		System.out.println(beanDefinitionCount);

		Museum museum = spring.getBean(Museum.class);
		System.out.println(museum);

	}

}
