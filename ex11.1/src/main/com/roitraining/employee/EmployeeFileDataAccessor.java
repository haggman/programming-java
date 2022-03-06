package com.roitraining.employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EmployeeFileDataAccessor {

	private Path filePath;
	
	public EmployeeFileDataAccessor(String filePath) {
		this(Paths.get(filePath));
	}
	
	public EmployeeFileDataAccessor(Path filePath) {
		this.filePath = filePath;
	}

	public Path getFilePath() {
		return filePath;
	}

	public void setFilePath(Path filePath) {
		this.filePath = filePath;
	}
	
	public void saveEmployees(ArrayList<Employee> employees) throws IOException {
		if(!Files.exists(filePath)) {
			Path parentPath = filePath.getParent();
			if(!Files.exists(parentPath))
				Files.createDirectories(parentPath);
			Files.createFile(filePath);
		}
			
		ObjectOutputStream oos = new ObjectOutputStream(
				Files.newOutputStream(filePath));
		oos.writeObject(employees);
		oos.close();
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Employee> loadEmployees() throws IOException, ClassNotFoundException{
		
		ArrayList<Employee> emps = null;
		ObjectInputStream ois = new ObjectInputStream(
				Files.newInputStream(filePath));
		emps = (ArrayList<Employee>) ois.readObject();
		return emps;
				
	}
} 
