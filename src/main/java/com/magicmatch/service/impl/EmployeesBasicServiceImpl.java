package com.magicmatch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicmatch.mapper.EmployeesBasicMapper;
import com.magicmatch.model.EmployeesBasic;
import com.magicmatch.service.EmployeesBasicService;

@Service
public class EmployeesBasicServiceImpl implements EmployeesBasicService {
	@Autowired
	EmployeesBasicMapper mapper;
	
	@Override
	public int save(EmployeesBasic employee) {
		int res = mapper.addOne(employee);
		return res;
	}
	
}
