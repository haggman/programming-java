package com.roitraining.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FullTimeEmployeeTest {

	private FullTimeEmployee employee;
	
	@BeforeEach
	void setUp() throws Exception {
		employee = new FullTimeEmployee("Louis Armstrong", 69, 250, 
				125, OvertimeExemptionStatus.EXEMPT);
	}

	@Test
	void testGetOvertimeExemptionStatus() {
		assertEquals(OvertimeExemptionStatus.EXEMPT, employee.getOvertimeExemptionStatus());
	}

	@Test
	void testSetExemptionStatus() {
		employee.setExemptionStatus(OvertimeExemptionStatus.NON_EXEMPT);
		assertEquals(OvertimeExemptionStatus.NON_EXEMPT, employee.getOvertimeExemptionStatus());
	}

	@Test
	void testFullTimeEmployee() {
		assertNotNull(employee);
	}

}
