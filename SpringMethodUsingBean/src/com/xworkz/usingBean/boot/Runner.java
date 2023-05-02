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

		System.out.println("      ");
		System.out.println(
				spring.getBean("bits", Byte.class));
		System.out.println(
				spring.getBean("coin", Byte.class));
		System.out.println(
				spring.getBean("marbles", Byte.class));
		System.out.println(
				spring.getBean("ring", Byte.class));
		System.out.println(
				spring.getBean("bottle", Byte.class));
		System.out.println(
				spring.getBean("spoon", Byte.class));
		System.out.println(
				spring.getBean("bill", Byte.class));
		System.out.println(
				spring.getBean("charge", Byte.class));
		System.out.println(
				spring.getBean("chappal", Byte.class));

		System.out.println("      ");
		System.out.println(
				spring.getBean("MobileNo", Long.class));
		System.out.println(
				spring.getBean("MobileNo", Long.class));
		System.out.println(
				spring.getBean("MobileNo", Long.class));
		System.out.println(
				spring.getBean("MobileNo", Long.class));
		System.out.println(
				spring.getBean("MobileNo", Long.class));
		System.out.println(
				spring.getBean("MobileNo", Long.class));
		System.out.println(
				spring.getBean("MobileNo", Long.class));
		System.out.println(
				spring.getBean("MobileNo", Long.class));
		System.out.println(
				spring.getBean("MobileNo", Long.class));

		System.out.println(
				spring.getBean("female", Boolean.class));

		Boolean cond2 = spring.getBean("male",
				Boolean.class);
		System.out.println("male :" + cond2);

		Boolean cond3 = spring.getBean("married",
				Boolean.class);
		System.out.println("married :" + cond3);

		Boolean cond4 = spring.getBean("unmarried",
				Boolean.class);
		System.out.println("unmarried :" + cond4);

		System.out.println(
				spring.getBean("studying", Boolean.class));

		System.out.println(
				spring.getBean("working", Boolean.class));

		System.out.println(
				spring.getBean("singer", Boolean.class));

		Long arg2 = spring.getBean("fatherContactNo",
				Long.class);
		System.out.println(arg2);

		Long arg3 = spring.getBean("pincodeOfDharwad",
				Long.class);
		System.out.println(arg3);

		Long arg4 = spring.getBean("pincodeOfHubli",
				Long.class);
		System.out.println(arg4);

		Long arg5 = spring.getBean("pincodeOfTumkur",
				Long.class);
		System.out.println(arg5);
		
		Character char1 = spring.getBean("div1", Character.class);
		System.out.println(char1);

		Character char2 = spring.getBean("div2", Character.class);
		System.out.println(char2);

		Character char3 = spring.getBean("div3", Character.class);
		System.out.println(char3);

		Character char4 = spring.getBean("div4", Character.class);
		System.out.println(char4);

		Character char5 = spring.getBean("div5", Character.class);
		System.out.println(char5);

		Character char6 = spring.getBean("div6", Character.class);
		System.out.println(char6);
		
		Double value = spring.getBean("height", Double.class);
		System.out.println("height :" + value);

		Double value2 = spring.getBean("weight", Double.class);
		System.out.println("weight :" + value2);

		Double value3 = spring.getBean("roomSize", Double.class);
		System.out.println("roomSize :" + value3);

		Double value4 = spring.getBean("waistSize", Double.class);
		System.out.println("waistSize :" + value4);

		Double value5 = spring.getBean("iceCreamQuantity", Double.class);
		System.out.println("iceCreamQuantity :" + value5);

		Double value6 = spring.getBean("goldRate", Double.class);
		System.out.println("goldRate :" + value6);

		Double value7 = spring.getBean("silverRate", Double.class);
		System.out.println("silverRate :" + value7);

		Double value8 = spring.getBean("ringSize", Double.class);
		System.out.println("ringSize :" + value8);

		Double value9 = spring.getBean("bangleSize", Double.class);
		System.out.println("bangleSize :" + value9);
		
		Float num1 = spring.getBean("salary", Float.class);
		System.out.println("salary :" + num1);

		Float num2 = spring.getBean("height", Float.class);
		System.out.println("height :" + num2);

		Float num3 = spring.getBean("weight", Float.class);
		System.out.println("weight :" + num3);

		Float num4 = spring.getBean("distance", Float.class);
		System.out.println("distance :" + num4);

		Float num5 = spring.getBean("cost", Float.class);
		System.out.println("cost :" + num5);

		Float num6 = spring.getBean("quantityOfMilk", Float.class);
		System.out.println("quantityOfMilk :" + num6);

		Float num7 = spring.getBean("quantityOfRice", Float.class);
		System.out.println("quantityOfRice :" + num7);

		Float num8 = spring.getBean("wheatPrice", Float.class);
		System.out.println("wheatPrice :" + num8);

		Float num9 = spring.getBean("dosaLength", Float.class);
		System.out.println("dosaLength :" + num9);

	}

}
