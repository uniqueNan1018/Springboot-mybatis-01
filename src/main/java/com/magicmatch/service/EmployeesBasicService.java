package com.magicmatch.service;

import org.springframework.transaction.annotation.Transactional;

import com.magicmatch.model.EmployeesBasic;

@Transactional
public interface EmployeesBasicService {
	
	
	int save(EmployeesBasic employee);
}
