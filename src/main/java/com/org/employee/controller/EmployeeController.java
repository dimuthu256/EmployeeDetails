package com.org.employee.controller;

import java.util.Random;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {

	@PostMapping()
	public EmployeeDetailsResponse addNewBankBranch(@Valid @RequestBody EmployeeDetailsRequest resRequest) {
		EmployeeDetailsResponse response = new EmployeeDetailsResponse();
		try {
			System.out.println("test");
			String employeeName = resRequest.getFirstName().concat(" ").concat(resRequest.getLastName());
			return EmployeeDetailsResponse.builder().employeeName(employeeName)
					.employeeId(new Random().nextInt((100 - 1) + 1) + 1).status("Success").build();

		} catch (Exception e) {
			response.setStatus("Failed");			
		}
		return response;
	}

}
