package com.roitraining.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartTimeEmployeeTest {
	
	private PartTimeEmployee employee;
	
	@BeforeEach
	public void setup() {
		employee = new PartTimeEmployee("Liskov", 25, 20);
	}
	
	@Test
	public void testCalculateMonthlyPayment() {
		double salary = employee.calculateMonthlyPayment();
		assertEquals(500, salary);
	}
	
	@Test
	public void testBonusCalculateMonthlyPayment() {
		double salary = employee.calculateMonthlyPayment(100.0);
		assertEquals(600, salary);
	}
}









