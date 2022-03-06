package com.roitraining.employee;

import java.io.Serializable;
import java.math.BigDecimal;

public abstract class PaymentCalculator implements Serializable {

	Employee employee; 
	
	public PaymentCalculator() {

	}
	
	public BigDecimal calculatePay() {
		BigDecimal total; 
		total = new BigDecimal(calculateBase());
		total = total.add(new BigDecimal(calculateOvertime()));
		return total;
	}

	protected double calculateOvertime() {
		return 0;
	}

	protected abstract double calculateBase();

}
