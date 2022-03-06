package com.roitraining.employee;

public class PartTimeEmployee extends Employee {
	private double hourlyRate;
	private int hoursPerMonth;
	public PartTimeEmployee(String name, int id, double hourlyRate, int hoursPerMonth) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursPerMonth = hoursPerMonth;
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
	public double calculateMonthlyPayment() {
		double pay = hourlyRate * hoursPerMonth;
		return  pay;
	}
	public double calculateMonthlyPayment(double bonus) {
		double pay = calculateMonthlyPayment() + bonus;
		return pay;
	}
}
