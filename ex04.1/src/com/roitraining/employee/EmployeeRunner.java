package com.roitraining.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class EmployeeRunner {

	public static void main(String[] args) {

		ArrayList<String> employees = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		int commandCode = 0;
		
		while(commandCode != -1) {
			System.out.println("Press 1 followed by a name to add an employee, 2 to list all employees, or -1 to exit:");
			commandCode = scanner.nextInt();
			
			switch (commandCode) {
			
			case 1:
				String employeeName = scanner.nextLine();
				if(employeeName.isBlank())
					break;
				employees.add(employeeName.trim());
				break;
				
			case 2:
				Collections.sort(employees);
				for(String employee : employees) {
					System.out.println(employee);
				}
				break;
			case -1:
				System.out.println("Goodbye");
				break;
			default:
				System.out.println("Sorry, does not compute");
				break;
			}
		}

	}

}
