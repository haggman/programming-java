package com.roitraining.employee;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalariedEmployeeTest {

	private SalariedEmployee employee;
	
	@BeforeEach
	void setUp() throws Exception {
		employee = new SalariedEmployee("Elvis Presley", 42, 100000.);
	}

	@Test
	void testConstruction_NoSalary() {
		employee = new SalariedEmployee("Elvis Presley", 42);
		assertNotNull(employee);
		assertEquals("Elvis Presley", employee.getName());
		assertEquals(42, employee.getId());
	}
	
	@Test
	void testConstruction_Salary() {
		assertEquals("Elvis Presley", employee.getName());
	}
	
	@Test
	void setSalary_ChangesSalary() {
		employee.setSalary(250000.);
		assertEquals(250000., employee.getSalary());
		
	}
	
	@Test
	void getSalary_ReturnsSalary() {
		assertEquals(100000., employee.getSalary());
	}
	
	@Test
	void testCalculatePay() {
		assertEquals(new BigDecimal(100000), employee.calculatePay());
	}

}
