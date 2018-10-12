package com.yebelete.taxiDriverAssistant;

public class Cab {
	private int cabNumber;
	private double lastMileage;
	private int rating;
	private String cabStatus;	
	
	public Cab() {
		
	}

	public Cab(int cabNumber, double lastMileage, int rating, String cabStatus) {
		this.cabNumber = cabNumber;
		this.lastMileage = lastMileage;
		this.rating = rating;
		this.cabStatus = cabStatus;
	}

	public int getCabNumber() {
		return cabNumber;
	}

	public void setCabNumber(int cabNumber) {
		this.cabNumber = cabNumber;
	}

	public double getLastMileage() {
		return lastMileage;
	}

	public void setLastMileage(double lastMileage) {
		this.lastMileage = lastMileage;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getCabStatus() {
		return cabStatus;
	}

	public void setCabStatus(String cabStatus) {
		this.cabStatus = cabStatus;
	}
}
