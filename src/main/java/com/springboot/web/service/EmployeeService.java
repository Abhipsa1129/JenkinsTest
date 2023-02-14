package com.springboot.web.service;

import org.springframework.stereotype.Service;

import com.springboot.web.bean.EmployeeBean;

@Service
public class EmployeeService {

	public EmployeeBean getEmployee() {
		
		return new EmployeeBean(1, "Akshay");
	}
} 
