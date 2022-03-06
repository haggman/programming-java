package com.roitraining.employee;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalariedPaymentCalculatorTest {

	private SalariedEmployee employee;
	@BeforeEach
	void setUp() throws Exception {
		employee = new SalariedEmployee("Elvis Presley", 42, 100000.);
	}

	@Test
	void testCalculateBase() {
		assertNotNull(employee);
	}

	@Test
	void testSalariedPaymentCalculator() {
		assertEquals(new BigDecimal(100000.), employee.calculatePay());
	}

}
