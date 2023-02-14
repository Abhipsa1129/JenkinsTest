package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.bean.EmployeeBean;
import com.springboot.web.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired 
	private EmployeeService employeeService;
	
	@GetMapping(path= "/emp/getEmp", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.ALL_VALUE})
	public ResponseEntity<EmployeeBean> getEmpl(){
		EmployeeBean bean = employeeService.getEmployee();
		
		return ResponseEntity.ok(bean);
	}
}
