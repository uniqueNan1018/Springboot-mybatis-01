package com.magicmatch.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.magicmatch.model.EmployeesBasic;

@Mapper
public interface EmployeesBasicMapper {
	int addOne(EmployeesBasic employee);
}
