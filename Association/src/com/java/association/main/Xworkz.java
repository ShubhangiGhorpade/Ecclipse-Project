package com.java.association.main;

public class Xworkz {
	public String founder;
	public int noOfStudent;
	public boolean chair;
	public int noOfRoom;
	public HumanResource hr=new HumanResource();

	public void init(String founder, int noOfStudent, boolean chair, int noOfRoom) {
		this.founder = founder;
		this.noOfStudent = noOfStudent;
		this.chair = chair;
		this.noOfRoom = noOfRoom;
	}

	public void show() {
		System.out.println("Founder :" + this.founder);
		System.out.println("No of Student :" + this.noOfStudent);
		System.out.println("Chair :" + this.chair);
		System.out.println("No of Room :" + this.noOfRoom);
		System.out.println("   Association       ");
		this.hr.show();
	}
}
