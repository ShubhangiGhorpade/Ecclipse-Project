package com.xworkz.usingBean.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.usingBean.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);
		System.out.println(spring.getBeanDefinitionCount());

		Stream.of(spring.getBeanDefinitionNames())
				.forEach(System.out::println);

		System.out.println(
				spring.getBean("email", String.class));
		System.out.println(
				spring.getBean("address", String.class));
		System.out.println(
				spring.getBean("location", String.class));
		System.out.println(
				spring.getBean("flavour", String.class));
		System.out.println(
				spring.getBean("music", String.class));
		System.out.println(
				spring.getBean("web", String.class));
		System.out.println(
				spring.getBean("version", String.class));
		System.out.println(
				spring.getBean("place", String.class));
		System.out.println(
				spring.getBean("run", String.class));
		System.out.println(
				spring.getBean("nickName", String.class));
		System.out.println(
				spring.getBean("cartoon", String.class));
		System.out.println(
				spring.getBean("mobile", String.class));
		System.out.println(
				spring.getBean("leader", String.class));

		System.out.println(
				spring.getBean("number", Integer.class));
		System.out.println(
				spring.getBean("rollNo", Integer.class));
		System.out.println(
				spring.getBean("serialNo", Integer.class));
		System.out.println(
				spring.getBean("birthday", Integer.class));
		System.out.println(spring.getBean("noOfPeople",
				Integer.class));
		System.out.println(
				spring.getBean("noOfFloor", Integer.class));
		System.out.println(
				spring.getBean("staff", Integer.class));
		System.out.println(
				spring.getBean("platform", Integer.class));
		System.out.println(
				spring.getBean("block", Integer.class));
		System.out.println("      ");
		System.out.println(
				spring.getBean("pen", Short.class));
		System.out.println(
				spring.getBean("distance", Short.class));
		System.out.println(
				spring.getBean("weight", Short.class));
		System.out.println(
				spring.getBean("seize", Short.class));
		System.out
				.println(spring.getBean("no", Short.class));
		System.out.println(
				spring.getBean("note", Short.class));
		System.out.println(
				spring.getBean("age", Short.class));
		System.out.println(
				spring.getBean("lens", Short.class));
		System.out.println(
				spring.getBean("size", Short.class));
	}

}
