







package com.roitraining.employee;

public class SalariedEmployee extends Employee {

	private double salary;
	
	public SalariedEmployee(String name, int id) {
		this(name,id, 0);
	}

	public SalariedEmployee(String name, int id, double salary) {
		super(name, id);
		this.salary = salary;
		setPaymentCalculator(new SalariedPaymentCalculator(this));
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}
