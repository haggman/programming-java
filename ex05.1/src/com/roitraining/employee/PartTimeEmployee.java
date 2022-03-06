package com.roitraining.employee;

public class PartTimeEmployee {
	private String name;
	private double hourlyRate;
	private int hoursPerMonth;
	public PartTimeEmployee(String name, double hourlyRate, int hoursPerMonth) {
		super();
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hoursPerMonth = hoursPerMonth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getHoursPerMonth() {
		return hoursPerMonth;
	}
	public void setHoursPerMonth(int hoursPerMonth) {
		this.hoursPerMonth = hoursPerMonth;
	}
}
