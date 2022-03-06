package com.roitraining.employee;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

	private static final long serialVersionUID = -3990920831430196728L;
	private String name;
	
	private int id;
	
	public Employee (String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + ": " + name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	public OvertimeExemptionStatus getOvertimeExemptionStatus() {
		return OvertimeExemptionStatus.EXEMPT;
	}

}
