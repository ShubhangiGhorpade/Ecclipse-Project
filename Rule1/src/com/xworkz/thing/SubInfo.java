package com.xworkz.thing;

public class SubInfo extends AbstractInfo {

	@Override
	public void setCreatedBy(String createdBy) {
		System.out.println("subInfo running createdBy.....");
	}

	@Override
	public void setUpdatedBy(String updatedBy) {
		System.out.println("subInfo running updatedBy.....");
	}
}
