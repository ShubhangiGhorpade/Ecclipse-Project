package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constant.Brand;
import com.xworkz.application.constant.Colour;
import com.xworkz.application.constant.TypeAndWeight;

public class HeadPhoneDTO implements Serializable {
	private String modelNo;
	private double price;
	private boolean bass;
	private String customerName;
	private int invoiceNo;
	private LocalDate mfgDate;
	private int warrantyPeriod;
	private Brand brand;
	private Colour colour;
	private TypeAndWeight typeAndWeight;

	public HeadPhoneDTO() {
		System.out.println("No arg const");
	}

	public HeadPhoneDTO(String modelNo, double price, boolean bass, String customerName, int invoiceNo,
			LocalDate mfgDate, int warrantyPeriod, Brand brand, Colour colour, TypeAndWeight typeAndWeight) {
		super();
		this.modelNo = modelNo;
		this.price = price;
		this.bass = bass;
		this.customerName = customerName;
		this.invoiceNo = invoiceNo;
		this.mfgDate = mfgDate;
		this.warrantyPeriod = warrantyPeriod;
		this.brand = brand;
		this.colour = colour;
		this.typeAndWeight = typeAndWeight;
	}

	@Override
	public String toString() {
		return "HeadPhoneDTO [modelNo=" + modelNo + ", price=" + price + ", bass=" + bass + ", customerName="
				+ customerName + ", invoiceNo=" + invoiceNo + ", mfgDate=" + mfgDate + ", warrantyPeriod="
				+ warrantyPeriod + ", brand=" + brand + ", colour=" + colour + ", typeAndWeight=" + typeAndWeight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bass, brand, colour, customerName, invoiceNo, mfgDate, modelNo, price, typeAndWeight,
				warrantyPeriod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof HeadPhoneDTO)) {
			return false;
		}
		HeadPhoneDTO other = (HeadPhoneDTO) obj;
		return bass == other.bass && brand == other.brand && colour == other.colour
				&& Objects.equals(customerName, other.customerName) && invoiceNo == other.invoiceNo
				&& Objects.equals(mfgDate, other.mfgDate) && Objects.equals(modelNo, other.modelNo)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& typeAndWeight == other.typeAndWeight && warrantyPeriod == other.warrantyPeriod;
	}

	public String getModelNo() {
		return modelNo;
	}

	public double getPrice() {
		return price;
	}

	public boolean isBass() {
		return bass;
	}

	public String getCustomerName() {
		return customerName;
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public Brand getBrand() {
		return brand;
	}

	public Colour getColour() {
		return colour;
	}

	public TypeAndWeight getTypeAndWeight() {
		return typeAndWeight;
	}

}
