package com.roitraining.employee;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeFileDataAccessorTest {

	private EmployeeFileDataAccessor efda;
	private String filePath;
	
	@BeforeEach
	void setUp() throws Exception {
		filePath = "./test/employees.ser";
		efda = new EmployeeFileDataAccessor(filePath);
	}

	@Test
	void testEmployeeFileDataAccessorString() {
		efda = new EmployeeFileDataAccessor(filePath);
		assertNotNull(efda);
	}

	@Test
	void testEmployeeFileDataAccessorPath() {
		efda = new EmployeeFileDataAccessor(Paths.get(filePath));
		assertNotNull(efda);
	}

	@Test
	void testGetFilePath() {
		assertEquals(Paths.get(filePath), efda.getFilePath());
	}

	@Test
	void testSetFilePath() {
		efda.setFilePath(Paths.get("./new/file/path/employees.ser"));
		assertEquals(Paths.get("./new/file/path/employees.ser"), efda.getFilePath());
	}

	@Test
	void testSaveEmployees() {
		try {
			ArrayList<Employee> emps = new ArrayList<>();
			emps.add(new FullTimeEmployee("Hank Williams", 29, 50, 200, OvertimeExemptionStatus.EXEMPT));
			emps.add(new PartTimeEmployee("Ray Charles", 73, 65, 115));
			emps.add(new SalariedEmployee("Michael Jackson", 50, 12000000));
			
			efda.saveEmployees(emps);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		assertTrue(Files.exists(Paths.get(filePath)));
	}
	
	@Test
	void testLoadEmployees() {
		try {
			ArrayList<Employee> emps = efda.loadEmployees();
			assertEquals(3, emps.size());
			assertEquals("Ray Charles", emps.get(1).getName());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
