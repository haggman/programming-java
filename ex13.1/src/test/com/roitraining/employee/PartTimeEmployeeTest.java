package com.roitraining.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartTimeEmployeeTest {
	
	private PartTimeEmployee employee;

	
	@BeforeEach
	void setup() {
		try {
			employee = new PartTimeEmployee("Jimi Hendrix", 27, 
					25, 20);
		} catch (TooManyHoursException e) {
			System.out.println(e);
		}
		
	}
	
	@Test
	void testPartTimeEmployee_ConstructionWithException() {
		Exception e = assertThrows(TooManyHoursException.class, () -> {
			new PartTimeEmployee("Bad", 13, 50, 121);
		});
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
	
	@Test
	void testCalculatePay() {
		assertEquals(25*20, employee.calculatePay());
	}
	
}









