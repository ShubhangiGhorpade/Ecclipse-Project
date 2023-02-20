package com.xworkz.override.dataRunner;

import com.xworkz.override.data.Door;

public class DoorRunner {

	public static void main(String[] args) {
		Door door = new Door();
		door.setShape("Rectangular");
		door.setMaterial("Wood");
		door.setPrice(2000);
		door.setOpen(true);
		String shape = door.getShape();
		System.out.println("Shape: " + shape);
		String material = door.getMaterial();
		System.out.println("Material: " + material);
		double price = door.getPrice();
		System.out.println("Price: " + price);
		boolean open = door.isOpen();
		System.out.println("Open or not: " + open);
		System.out.println(
				"overridden hashcode: " + door.hashCode() + "Original hashcode: " + System.identityHashCode(door));

		Door door1 = new Door();
		door1.setShape("Circular");
		door1.setMaterial("glass");
		door1.setPrice(5000);
		door1.setOpen(true);
		String shape1 = door1.getShape();
		System.out.println("Shape1: " + shape1);
		String material1 = door1.getMaterial();
		System.out.println("Material1: " + material1);
		double price1 = door1.getPrice();
		System.out.println("Price1: " + price1);
		boolean open1 = door1.isOpen();
		System.out.println("Open or not: " + open1);
		System.out.println(
				"overridden hashcode: " + door1.hashCode() + "Original hashcode: " + System.identityHashCode(door1));

		boolean b1 = door.equals(door1);
		System.out.println(b1);
	}

}
