package com.roitraining.employee;

public class HourlyPaymentCalculator extends PaymentCalculator {

	private HourlyEmployee employee;

	public HourlyPaymentCalculator(HourlyEmployee employee) {
		this.employee = employee;
	}

	@Override
	protected double calculateBase() {
		return employee.getHourlyRate()*employee.getHoursPerMonth();
	}

	@Override
	protected double calculateOvertime() {
		double overtime = 0;
		
		if(employee.getOvertimeExemptionStatus() == OvertimeExemptionStatus.NON_EXEMPT) {
			double overtimeHours = employee.hoursPerMonth -=160;
			if (overtimeHours >0)
				return overtimeHours * employee.getHourlyRate()*.5;
		}
		
		return overtime;
	}
	

}
