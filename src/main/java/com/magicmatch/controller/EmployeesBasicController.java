package com.magicmatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magicmatch.model.EmployeesBasic;
import com.magicmatch.service.EmployeesBasicService;

@RestController
@RequestMapping("/employeesBasic")
public class EmployeesBasicController {
	@Autowired
	EmployeesBasicService service;
	
	@PostMapping
	public int save(@RequestBody EmployeesBasic employee) {
		int res = service.save(employee);
		return res;
	}
}
