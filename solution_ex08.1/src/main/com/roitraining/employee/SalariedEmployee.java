







package com.roitraining.employee;

public class SalariedEmployee extends Employee {

	private double salary;
	
	public SalariedEmployee(String name, int id) {
		super(name, id);
	}

	public SalariedEmployee(String name, int id, double salary) {
		this(name, id);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}
