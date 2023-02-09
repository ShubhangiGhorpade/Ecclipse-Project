package com.xworkz.association.thing;

public class Security {
	public String deptName;
	public int totalStaff;
	public String headStaff;
	public Company company;

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setTotalStaff(int totalStaff) {
		this.totalStaff = totalStaff;
	}

	public void setHeadStaff(String headStaff) {
		this.headStaff = headStaff;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void show() {
		System.out.println("Details of Security");
		System.out.println("DeptName : " + this.deptName);
		System.out.println("TotalStaff: " + this.totalStaff);
		System.out.println("HeadStaff :" + this.headStaff);
		if (this.company != null) {
			this.company.show();
		} else {
			System.err.println("this.company is null....");
		}
	}
}
