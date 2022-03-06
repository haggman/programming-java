package com.roitraining.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TooManyHoursExceptionTest {
	private TooManyHoursException e;
	
	@BeforeEach
	void setUp() throws Exception {
		e = new TooManyHoursException("Test message", 120);
	}

	@Test
	void testGetMaxHours() {
		assertEquals(120, e.getMaxHours());
		
	}

	@Test
	void testTooManyHoursException() {
		assertNotNull(e);
	}


}
