package com.roitraining.employee;

import java.util.jar.Attributes.Name;

public class EmployeeRunner {

	public static void main(String[] args) {
		//The classic
		String employees[][] = new String[3][2];
		employees[0][0] = "Bob";
		employees[0][1] = "Marley";
		employees[1][0] = "Colter";
		employees[1][1] = "Wall";
		employees[2][0] = "Freddie";
		employees[2][1] = "Mercury";
		
		//Using an array literal
//		String employees[][] = {
//				{"Bob", "Marley"},
//				{"Colter", "Wall"},
//				{"Freddie", "Mercury"}
//		};
		
		for(String[] name: employees) {
			System.out.println(name[0] + " " + name[1]);
		}

	}

}
