package com.roitraining.employee;

import java.util.jar.Attributes.Name;

public class EmployeeRunner {

	public static void main(String[] args) {

		String employees[][] = {
				{"Bob", "Marley"},
				{"Colter", "Wall"},
				{"Freddie", "Mercury"}
		};
		
		for(String[] name: employees) {
			System.out.println(name[0] + " " + name[1]);
		}

	}

}
