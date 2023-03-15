package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constant.Language;
import com.xworkz.application.constant.OSTypeSupported;
import com.xworkz.application.constant.Type;

public class ApplicationDTO implements Serializable {

	private String developedBy;
	private String createdBy;
	private double price;
	private LocalDate firstVersionReleaseDate;
	private LocalDate currentVersionReleaseDate;
	private LocalDate nextVersionReleaseDate;
	private int trialDays;
	private double minProcessorSpeed;
	private double minRamSpaceRequired;
	private boolean internetNeeded;
	private int ageLimit;
	private int noOfDownloads;
	private int rating;
	private int version;
	private LocalDate date;
	private String appName;
	private double size;
	private Type type;
	private Language language;
	private OSTypeSupported osType;

	public ApplicationDTO() {
		System.out.println("No Arg constr in Application");
	}

	@Override
	public String toString() {
		return "ApplicationDTO [developedBy=" + developedBy + ", createdBy=" + createdBy + ", price=" + price
				+ ", firstVersionReleaseDate=" + firstVersionReleaseDate + ", currentVersionReleaseDate="
				+ currentVersionReleaseDate + ", nextVersionReleaseDate=" + nextVersionReleaseDate + ", trialDays="
				+ trialDays + ", minProcessorSpeed=" + minProcessorSpeed + ", minRamSpaceRequired="
				+ minRamSpaceRequired + ", internetNeeded=" + internetNeeded + ", ageLimit=" + ageLimit
				+ ", noOfDownloads=" + noOfDownloads + ", rating=" + rating + ", version=" + version + ", date=" + date
				+ ", appName=" + appName + ", size=" + size + ", type=" + type + ", language=" + language + ", osType="
				+ osType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ageLimit, appName, createdBy, currentVersionReleaseDate, date, developedBy,
				firstVersionReleaseDate, internetNeeded, language, minProcessorSpeed, minRamSpaceRequired,
				nextVersionReleaseDate, noOfDownloads, osType, price, rating, size, trialDays, type, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ApplicationDTO)) {
			return false;
		}
		ApplicationDTO other = (ApplicationDTO) obj;
		return ageLimit == other.ageLimit && Objects.equals(appName, other.appName)
				&& Objects.equals(createdBy, other.createdBy)
				&& Objects.equals(currentVersionReleaseDate, other.currentVersionReleaseDate)
				&& Objects.equals(date, other.date) && Objects.equals(developedBy, other.developedBy)
				&& Objects.equals(firstVersionReleaseDate, other.firstVersionReleaseDate)
				&& internetNeeded == other.internetNeeded && language == other.language
				&& Double.doubleToLongBits(minProcessorSpeed) == Double.doubleToLongBits(other.minProcessorSpeed)
				&& Double.doubleToLongBits(minRamSpaceRequired) == Double.doubleToLongBits(other.minRamSpaceRequired)
				&& Objects.equals(nextVersionReleaseDate, other.nextVersionReleaseDate)
				&& noOfDownloads == other.noOfDownloads && osType == other.osType
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && rating == other.rating
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
				&& Objects.equals(trialDays, other.trialDays) && type == other.type && version == other.version;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getFirstVersionReleaseDate() {
		return firstVersionReleaseDate;
	}

	public void setFirstVersionReleaseDate(LocalDate firstVersionReleaseDate) {
		this.firstVersionReleaseDate = firstVersionReleaseDate;
	}

	public LocalDate getCurrentVersionReleaseDate() {
		return currentVersionReleaseDate;
	}

	public void setCurrentVersionReleaseDate(LocalDate currentVersionReleaseDate) {
		this.currentVersionReleaseDate = currentVersionReleaseDate;
	}

	public LocalDate getNextVersionReleaseDate() {
		return nextVersionReleaseDate;
	}

	public void setNextVersionReleaseDate(LocalDate nextVersionReleaseDate) {
		this.nextVersionReleaseDate = nextVersionReleaseDate;
	}

	public int getTrialDays() {
		return trialDays;
	}

	public void setTrialDays(int trialDays) {
		this.trialDays = trialDays;
	}

	public double getMinProcessorSpeed() {
		return minProcessorSpeed;
	}

	public void setMinProcessorSpeed(double minProcessorSpeed) {
		this.minProcessorSpeed = minProcessorSpeed;
	}

	public double getMinRamSpaceRequired() {
		return minRamSpaceRequired;
	}

	public void setMinRamSpaceRequired(double minRamSpaceRequired) {
		this.minRamSpaceRequired = minRamSpaceRequired;
	}

	public boolean isInternetNeeded() {
		return internetNeeded;
	}

	public void setInternetNeeded(boolean internetNeeded) {
		this.internetNeeded = internetNeeded;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getNoOfDownloads() {
		return noOfDownloads;
	}

	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public OSTypeSupported getOsType() {
		return osType;
	}

	public void setOsType(OSTypeSupported osType) {
		this.osType = osType;
	}

}
