package com.xworkz.association.thing;

public class SunRise {
	public boolean rise;
	public int time;
	public Sun sun;

	public void init(boolean rise, int time) {
		this.rise = rise;
		this.time = time;
	}

	public void init(Sun sun) {
		this.sun = sun;
	}

	public void show() {
		System.out.println("Rise :" + this.rise);
		System.out.println("Time :" + this.time);
		if (sun != null) {
			this.sun.show();
		} else {
			System.err.println("this.sun.show is not pointing to any memory");
		}
	}
}
