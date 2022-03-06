package com.roitraining.employee;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class EmployeeRunner {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();
		String filePath = "data/employees.ser";
		EmployeeFileDataAccessor data = 
				new EmployeeFileDataAccessor(filePath);

		
		Scanner scanner = new Scanner(System.in);
		int commandCode = 0;
		
		while(commandCode != -1) {
			System.out.println("1 to add an employee");
			System.out.println("2 to list employees");
			System.out.println("3 to load current employee file");
			System.out.println("4 to save current employee file");
			System.out.println("5 print everyone's pay");
			System.out.println("6 print everyone's record create date time");
			System.out.println("-1 to exit");
			commandCode = scanner.nextInt();
			scanner.nextLine(); //skip the new line after the number
			switch (commandCode) {
			
			case 1:
				System.out.println("Please select an employee type. Press:");
				System.out.println("s for salaried");
				System.out.println("p for part time");
				System.out.println("f for full time");
				char empCode = scanner.next().charAt(0);
				if(! (empCode == 'p' || empCode == 's' || empCode == 'f'))
					break;
				scanner.nextLine();
				System.out.println("Enter an employee's name");
				String employeeName = scanner.nextLine();
				if(employeeName.isBlank())
					break;
				
				System.out.println("Enter an employee's id");
				int id = scanner.nextInt();
				
				if(empCode == 'p' || empCode == 'f') {
					System.out.println("Enter an employee's hourly rate");
					double rate = scanner.nextDouble();
					System.out.println("Enter an employee's hours worked");
					int hours = scanner.nextInt();
					if(empCode == 'f') {
						System.out.println("e for exempt");
						System.out.println("n for non-exempt");
						char exemptStat = scanner.next().charAt(0);
						if(exemptStat=='n')
							employees.add(new FullTimeEmployee(employeeName.trim(), id, 
									rate, hours, OvertimeExemptionStatus.NON_EXEMPT));
						else
							employees.add(new FullTimeEmployee(employeeName.trim(), id, 
									rate, hours, OvertimeExemptionStatus.EXEMPT));
					} else {
						try {
							employees.add(new PartTimeEmployee(employeeName.trim(), id, rate, hours) );
						} catch (TooManyHoursException e) {
							System.out.println("Employee not added");
							System.out.println(e);
						}
					}
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
			case 3:
				try {
					employees = data.loadEmployees();
					System.out.println(employees.size() + " employees loaded from: " +filePath);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					data.saveEmployees(employees);
					System.out.println(employees.size() + " employees saved to: " +filePath);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 5:
				NumberFormat formatter = NumberFormat.getCurrencyInstance();
				for(Employee employee : employees) {
					System.out.printf("%s makes %s \n", employee, formatter.format(employee.calculatePay()));
				}
				break;
			case 6:
				for(Employee employee : employees) {
					System.out.printf("%s record created: %s \n", employee, employee.getRecordCreationDateTime());
				}
				break;
			case -1:
				System.out.println("Goodbye");
				break;
			case -2: //Load some dummy data
				try {
					employees = new ArrayList<>(List.of(
							new FullTimeEmployee("Louis Armstrong", 69, 250, 
									125, OvertimeExemptionStatus.EXEMPT),
							new FullTimeEmployee("Madonna", 63, 250, 
									250, OvertimeExemptionStatus.NON_EXEMPT),
							new SalariedEmployee("Johnny Cash", 71, 895000.),
							new PartTimeEmployee("Michael Jackson", 50, 225, 120)
							
							));
				} catch (TooManyHoursException e) {
					e.printStackTrace();
				}
	
				break;
			default:
				System.out.println("Sorry, does not compute");
				break;
			}
			
		}

	}

}
