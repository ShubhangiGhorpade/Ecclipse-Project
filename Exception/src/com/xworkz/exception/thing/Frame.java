package com.xworkz.exception.thing;

public class Frame {

	public void createFrame() {
		System.out.println("Running in createFrame");
	}

	public void createFrame1() throws Exception {
		System.out.println("Running in createFrame1");
		this.createFrame2();
	}

	public void createFrame2() throws Exception {
		System.out.println("Running in createFrame2");
		this.createFrame3();
	}

	public void createFrame3() throws Exception {
		System.out.println("Running in createFrame3");
		this.createFrame4();
	}

	public void createFrame4() throws Exception {
		System.out.println("Running in createFrame4");
		this.createFrame5();
	}

	public void createFrame5() throws Exception {
		System.out.println("Running in createFrame5");
		Exception exception = new Exception();
		throw exception;
	}
}
