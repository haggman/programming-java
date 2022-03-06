package com.roitraining.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	private Employee employee; 
	
	@BeforeEach
	void setUp() throws Exception {
		employee = new Employee("Nina Simone", 70);
	}
	
	
	@Test
	void testConstruction() {
		assertNotNull(employee);
		assertEquals("Nina Simone", employee.getName());
		assertEquals(70, employee.getId());
	}
	
	@Test
	void getName_ReturnsName() {
		assertEquals("Nina Simone", employee.getName());
	}
	
	@Test
	void setName_UpdatesName() {
		assertEquals("Nina Simone", employee.getName());
		employee.setName("Bob Dylan");
		assertEquals("Bob Dylan", employee.getName());
	}
	
	@Test
	void getId_ReturnsTheId() {
		assertEquals(70, employee.getId());
	}
	
	@Test
	void toString_ReturnsPropperValue() {
		assertEquals("70: Nina Simone", employee.toString());
	}
	
	@Test
	void getOvertimeExemptionStatus_DefaultsToExempt() {
		assertEquals(OvertimeExemptionStatus.EXEMPT, employee.getOvertimeExemptionStatus());
	}


}
