package com.roitraining.employee;

public class FullTimeEmployee extends HourlyEmployee {
	
	OvertimeExemptionStatus overtimeExemptionStatus ;

	public void setExemptionStatus(OvertimeExemptionStatus exemptionStatus) {
		this.overtimeExemptionStatus = exemptionStatus;
	}

	@Override
	public OvertimeExemptionStatus getOvertimeExemptionStatus() {
		
		return overtimeExemptionStatus;
	}

	public FullTimeEmployee(String name, int id, double hourlyRate, 
			double hoursPerMonth, OvertimeExemptionStatus exemptionStatus) {
		super(name, id, hourlyRate, hoursPerMonth);
		this.overtimeExemptionStatus = exemptionStatus;
	}
}
