package com.roitraining.employee;

public class HourlyEmployee extends Employee {

	protected double hourlyRate;
	protected double hoursPerMonth;

	public HourlyEmployee(String name, int id, 
			double hourlyRate, double hoursPerMonth) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursPerMonth = hoursPerMonth;
		this.setPaymentCalculator(new HourlyPaymentCalculator(this));
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHoursPerMonth() {
		return hoursPerMonth;
	}

	public void setHoursPerMonth(double hoursPerMonth) {
		this.hoursPerMonth = hoursPerMonth;
	}

}
