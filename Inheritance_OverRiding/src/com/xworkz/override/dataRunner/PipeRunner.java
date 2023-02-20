package com.xworkz.override.dataRunner;

import com.xworkz.override.data.Pipe;

public class PipeRunner {

	public static void main(String[] args) {
		Pipe pipe = new Pipe();
		pipe.setName("Finolex");
		pipe.setPrice(500);
		pipe.setLength(20);
		pipe.setWeight(10);
		String name = pipe.getName();
		System.out.println("Name: " + name);
		double price = pipe.getPrice();
		System.out.println("Price: " + price);
		int weight = pipe.getWeight();
		System.out.println("Weight: " + weight);
		double length = pipe.getLength();
		System.out.println("Length: " + length);
		System.out.println(
				"Over ride hashcode: " + pipe.hashCode() + " Original hashcode: " + System.identityHashCode(pipe));

		Pipe pipe1 = new Pipe();
		pipe1.setName("Aashirwad");
		pipe1.setPrice(400);
		pipe1.setLength(18);
		pipe1.setWeight(9);
		String name1 = pipe1.getName();
		System.out.println("Name1: " + name1);
		double price1 = pipe1.getPrice();
		System.out.println("Price1: " + price1);
		int weight1 = pipe1.getWeight();
		System.out.println("Weight1: " + weight1);
		double length1 = pipe1.getLength();
		System.out.println("Length1: " + length1);
		System.out.println(
				"Over ride hashcode: " + pipe1.hashCode() + " Original hashcode: " + System.identityHashCode(pipe1));

		boolean b1 = pipe.equals(pipe1);
		System.out.println(b1);
	}
}
