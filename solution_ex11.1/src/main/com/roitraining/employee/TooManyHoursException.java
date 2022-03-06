package com.roitraining.employee;

public class TooManyHoursException extends Exception {

	private static final long serialVersionUID = -4012444628619544214L;
	private double maxHours;
	
	public double getMaxHours() {
		return maxHours;
	}

	public TooManyHoursException(String message, double maxHours) {
		super(message);
		this.maxHours = maxHours;
	}
	
	@Override
	public String toString() {
		return String.format("%s is too many monthly hours for a part time employee: %s", 
				maxHours, super.toString());
	}

}
