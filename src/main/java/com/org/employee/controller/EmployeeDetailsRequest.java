package com.org.employee.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDetailsRequest {

	private String firstName;
	private String lastName;
	private int age;

}
