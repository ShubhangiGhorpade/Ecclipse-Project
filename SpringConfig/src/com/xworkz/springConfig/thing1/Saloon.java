package com.xworkz.springConfig.thing1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("saloon")
public class Saloon {
	
	private String name;
	private String ownerName;
	private String type;
	private String location;
	private int noOfBarber;
	
	
	public Saloon(@Value("Lakhme")String name, @Value("Radhika")String ownerName, @Value("Face Makeup")String type,@Value("Rajajinagar") String location, @Value("20")int noOfBarber) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.location = location;
		this.noOfBarber = noOfBarber;
	}


	@Override
	public String toString() {
		return "Saloon [name=" + name + ", ownerName=" + ownerName + ", type=" + type + ", location=" + location
				+ ", noOfBarber=" + noOfBarber + "]";
	}
	
	

}
