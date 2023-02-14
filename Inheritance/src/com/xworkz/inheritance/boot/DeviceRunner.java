package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Camera;
import com.xworkz.inheritance.thing.Device;

public class DeviceRunner {

	public static void main(String[] args) {
		Camera camera = new Camera();
		camera.setBrand("Nickon");
		String brand = camera.getBrand();
		System.out.println("Brand :" + brand);
		camera.cost();

		Device device = new Camera();
		device.setBrand("Nickon");
		String brand1 = device.getBrand();
		System.out.println("Brand1 :" + brand1);

		Camera casted = (Camera) device;
		casted.cost();

	}

}
