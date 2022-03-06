package com.roitraining.employee;

import java.io.Serializable;

public abstract class PaymentCalculator implements Serializable {

	Employee employee; 
	
	public PaymentCalculator() {

	}
	
	public double calculatePay() {
		double pay = 0;
		pay += calculateBase();
		pay += calculateOvertime();
		return pay;
	}

	protected double calculateOvertime() {
		return 0;
	}

	protected abstract double calculateBase();

}
