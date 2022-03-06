package com.roitraining.employee;

public class PartTimeEmployee extends HourlyEmployee {
	
	public final static double maxHours = 120;
	
	public PartTimeEmployee(String name, int id, 
			double hourlyRate, double hoursPerMonth) throws TooManyHoursException{
		super(name, id, hourlyRate, hoursPerMonth);
		
		if(hoursPerMonth > maxHours)
			throw new TooManyHoursException("Working too hard", 
					hoursPerMonth);
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
