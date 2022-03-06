package com.roitraining.employee;

public class PartTimeEmployee extends HourlyEmployee {
	public PartTimeEmployee(String name, int id, double hourlyRate, int hoursPerMonth) {
		super(name, id, hourlyRate, hoursPerMonth);
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
