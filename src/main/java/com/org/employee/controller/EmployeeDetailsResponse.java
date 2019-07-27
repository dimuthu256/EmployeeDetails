package com.org.employee.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDetailsResponse {

	public EmployeeDetailsResponse() {
	}
	
	public EmployeeDetailsResponse(String status, String employeeName, int employeeId) {
		super();
		this.status = status;
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}

	private String status;
	private String employeeName;
	private int employeeId;

}
