package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class MarketDTO implements Serializable {

	private String MarketName;
	private String area;
	private String location;
	private boolean quality;
	private boolean nearBy;

	public MarketDTO() {
		System.out.println("No Arg const in Market");
	}

	@Override
	public String toString() {
		return "MarketDTO [MarketName=" + MarketName + ", area=" + area + ", location=" + location + ", quality="
				+ quality + ", nearBy=" + nearBy + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(MarketName, area, location, nearBy, quality);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MarketDTO)) {
			return false;
		}
		MarketDTO other = (MarketDTO) obj;
		return Objects.equals(MarketName, other.MarketName) && Objects.equals(area, other.area)
				&& Objects.equals(location, other.location) && nearBy == other.nearBy && quality == other.quality;
	}

	public String getMarketName() {
		return MarketName;
	}

	public void setMarketName(String marketName) {
		MarketName = marketName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public boolean isNearBy() {
		return nearBy;
	}

	public void setNearBy(boolean nearBy) {
		this.nearBy = nearBy;
	}

}
