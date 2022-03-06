package com.roitraining.employee;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Employee implements Serializable, Payable {

	private static final long serialVersionUID = -3990960831430198728L;
	
	private String name;
	
	private int id;
	
	private PaymentCalculator pc;
	
	private LocalDateTime recordCreationDateTime;

	public Employee (String name, int id) {
		this.name = name;
		this.id = id;
		recordCreationDateTime = LocalDateTime.now();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + ": " + name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	public OvertimeExemptionStatus getOvertimeExemptionStatus() {
		return OvertimeExemptionStatus.EXEMPT;
	}

	public void setPaymentCalculator(PaymentCalculator pc) {
		this.pc = pc;
	}
	
	@Override
	public double calculatePay() {
		
		return pc.calculatePay();
	}
	
	public LocalDateTime getRecordCreationDateTime() {
		return recordCreationDateTime;
	}

}
