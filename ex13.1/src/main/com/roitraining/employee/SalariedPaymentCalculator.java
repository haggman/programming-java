package com.roitraining.employee;

public class SalariedPaymentCalculator extends PaymentCalculator {

	private SalariedEmployee employee;
	
	public SalariedPaymentCalculator(SalariedEmployee employee) {
		this.employee = employee;
	}

	@Override
	protected double calculateBase() {
		// TODO Auto-generated method stub
		return employee.getSalary();
	}
	


}
