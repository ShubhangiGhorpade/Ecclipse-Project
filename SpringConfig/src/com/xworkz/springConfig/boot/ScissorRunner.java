package com.xworkz.springConfig.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springConfig.configuration.SpringConfiguration;
import com.xworkz.springConfig.thing1.Scissor;

public class ScissorRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		int beanDefinitionCount = spring.getBeanDefinitionCount();
		System.out.println(beanDefinitionCount);

		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println(spring.getBean(Scissor.class));
		
		

	}

}