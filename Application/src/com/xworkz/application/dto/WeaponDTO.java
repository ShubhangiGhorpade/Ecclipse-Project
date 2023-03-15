package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constant.WeaponType;

public class WeaponDTO implements Serializable {

	private String name;
	private int id;
	private double cost;
	private String material;
	private String madeBy;
	private LocalDate manufacturedYear;
	private String manufacturedBy;
	private String usedBy;
	private String usedFor;
	private double weight;
	private WeaponType type;

	public WeaponDTO() {
		System.out.println("No Arg const in Weapon");
	}

	public WeaponDTO(String name, int id, double cost, String material, String madeBy, LocalDate manufacturedYear,
			String manufacturedBy, String usedBy, String usedFor, double weight, WeaponType type) {
		super();
		this.name = name;
		this.id = id;
		this.cost = cost;
		this.material = material;
		this.madeBy = madeBy;
		this.manufacturedYear = manufacturedYear;
		this.manufacturedBy = manufacturedBy;
		this.usedBy = usedBy;
		this.usedFor = usedFor;
		this.weight = weight;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", id=" + id + ", cost=" + cost + ", material=" + material + ", madeBy="
				+ madeBy + ", manufacturedYear=" + manufacturedYear + ", manufacturedBy=" + manufacturedBy + ", usedBy="
				+ usedBy + ", usedFor=" + usedFor + ", weight=" + weight + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, id, madeBy, manufacturedBy, manufacturedYear, material, name, type, usedBy, usedFor,
				weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof WeaponDTO)) {
			return false;
		}
		WeaponDTO other = (WeaponDTO) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(madeBy, other.madeBy) && Objects.equals(manufacturedBy, other.manufacturedBy)
				&& Objects.equals(manufacturedYear, other.manufacturedYear) && Objects.equals(material, other.material)
				&& Objects.equals(name, other.name) && type == other.type && Objects.equals(usedBy, other.usedBy)
				&& Objects.equals(usedFor, other.usedFor)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getCost() {
		return cost;
	}

	public String getMaterial() {
		return material;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public LocalDate getManufacturedYear() {
		return manufacturedYear;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public double getWeight() {
		return weight;
	}

	public WeaponType getType() {
		return type;
	}

}
