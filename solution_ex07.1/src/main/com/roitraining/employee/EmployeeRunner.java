package com.roitraining.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class EmployeeRunner {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();
//		employees.add(new PartTimeEmployee("Bob", 12, 18));
//		employees.add(new PartTimeEmployee("Adya", 15, 11));
//		employees.add(new PartTimeEmployee("Lak", 25, 13));
//		
//		for(var emp: employees) {
//			System.out.println(emp.getName());
//		}
		
		Scanner scanner = new Scanner(System.in);
		int commandCode = 0;
		
		while(commandCode != -1) {
			System.out.println("1 to add an employee");
			System.out.println("2 to list employees");
			System.out.println("-1 to exit");
			commandCode = scanner.nextInt();
			scanner.nextLine(); //skip the new line after the number
			switch (commandCode) {
			
			case 1:
				System.out.println("Please select an employee type. Press:");
				System.out.println("s for salaried");
				System.out.println("p for part time");
				char empCode = scanner.next().charAt(0);
				if(! (empCode == 'p' || empCode == 's'))
					break;
				scanner.nextLine();
				System.out.println("Enter an employee's name");
				String employeeName = scanner.nextLine();
				if(employeeName.isBlank())
					break;
				
				System.out.println("Enter an employee's id");
				int id = scanner.nextInt();
				
				if(empCode == 'p') {
					System.out.println("Enter an employee's hourly rate");
					double rate = scanner.nextDouble();
					System.out.println("Enter an employee's hours worked");
					int hours = scanner.nextInt();
					employees.add(new PartTimeEmployee(employeeName.trim(), id, rate, hours) );
				} else if (empCode == 's') {
					System.out.println("Enter an employee's salary");
					double rate = scanner.nextDouble();
					employees.add(new SalariedEmployee(employeeName.trim(), id, rate) );

				}
				break;
				
			case 2:
				//Collections.sort(employees);
				for(Employee employee : employees) {
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
