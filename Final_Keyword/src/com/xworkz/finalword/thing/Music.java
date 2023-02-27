package com.xworkz.finalword.thing;

public  class Music {
	private String name;
	private String type;
	private final String SINGERNAME = "Atif Aslam";

	public Music() {

	}

	public Music(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Music [name=" + name + ", type=" + type + ", SINGERNAME=" + SINGERNAME + "]";
	}

	public final void lyrics() {
		System.out.println("Lyrics method");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSINGERNAME() {
		return SINGERNAME;
	}

}
