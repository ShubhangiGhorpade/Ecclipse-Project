package com.xworkz.association.thing;

public class Company {
	public String name;
	public String ceoName;
	public int since;
	public Address address;

	public void setName(String name) {
		this.name = name;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void show() {
		System.out.println("Details of Company");
		System.out.println("Name: " + this.name);
		System.out.println("CeoName: " + this.ceoName);
		System.out.println("Since: " + this.since);
		if (this.address != null) {
			this.address.show();
		} else {
			System.err.println("this.address is null....");
		}
	}
}
