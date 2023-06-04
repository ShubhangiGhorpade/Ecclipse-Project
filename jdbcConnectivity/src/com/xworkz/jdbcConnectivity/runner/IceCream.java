package com.xworkz.jdbcConnectivity.runner;

import java.sql.DriverManager;

public class IceCream {

	public static void main(String[] args) {
		try {
			System.out.println("Driver is loaded successfully");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Getting the connection from driver manager");
			DriverManager.getConnection("jdbc:mysql://localhost/root/2LB17EC014");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
