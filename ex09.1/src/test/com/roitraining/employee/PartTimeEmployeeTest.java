package com.roitraining.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartTimeEmployeeTest {
	
	private PartTimeEmployee employee;
	
	@BeforeEach
	void setup() {
		employee = new PartTimeEmployee("Jimi Hendrix", 27, 25, 20);
	}
	
	@Test
	void testCalculateMonthlyPayment() {
		double salary = employee.calculateMonthlyPayment();
		assertEquals(500, salary);
	}
	
	@Test
	void testBonusCalculateMonthlyPayment() {
		double salary = employee.calculateMonthlyPayment(100.0);
		assertEquals(600, salary);
	}
	
	@Test
	void getId_ReturnsId() {
		assertEquals(27, employee.getId());
	}
	
}









