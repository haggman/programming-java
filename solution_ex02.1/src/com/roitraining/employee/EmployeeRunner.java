package com.roitraining.employee;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class EmployeeRunner {

	public static void main(String[] args) {

		String employees[][] = {
				{"Bob", "Marley"},
				{"Colter", "Wall"},
				{"Freddie", "Mercury"},
				{"Robert", "Johnson"}
		};
		
		Scanner scanner = new Scanner(System.in);
		int lastEmpId= employees.length-1;
		
		while(true) {
			System.out.println("Press -1 to exit.");
			System.out.println("Which employee would you like?");
			System.out.println("0.." + lastEmpId);
			int e = scanner.nextInt();
			if (e==-1)
				break;
			System.out.println(employees[e][0] + " " + employees[e][1]);
		}

	}

}
