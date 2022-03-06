package com.roitraining.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HourlyPaymentCalculatorTest {
	
	private PartTimeEmployee ptEmp;
	private FullTimeEmployee ftEmp;
	private HourlyPaymentCalculator calc;

	@BeforeEach
	void setup() throws Exception{
		ptEmp = new PartTimeEmployee("Jimi Hendrix", 27, 
				25, 20);
		
		ftEmp = new FullTimeEmployee("Louis Armstrong", 69, 250, 
				200, OvertimeExemptionStatus.NON_EXEMPT);
		
		 calc = new HourlyPaymentCalculator(ftEmp);
		
	}
	
	@Test
	void testCalculateOvertime_Exempt() throws Exception{
		
		HourlyPaymentCalculator calc = new HourlyPaymentCalculator(ptEmp);
		assertEquals(0, calc.calculateOvertime());
	}
	
	@Test
	void testCalculateOvertime_NotExempt() {
		assertEquals(((ftEmp.getHoursPerMonth()-160)*ftEmp.getHourlyRate()*.5), calc.calculateOvertime());
	}

	@Test
	void testCalculateBase() {
		assertEquals(ftEmp.getHourlyRate()*ftEmp.getHoursPerMonth(), calc.calculateBase());
	}
	
	@Test
	void testCalculatePay() {
		double actual = ftEmp.getHourlyRate()*160 + 
				1.5 * ftEmp.getHourlyRate()*(ftEmp.getHoursPerMonth()-160);
		assertEquals(actual, calc.calculatePay());
	}

}
