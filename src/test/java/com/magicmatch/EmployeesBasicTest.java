package com.magicmatch;

import org.springframework.boot.test.context.SpringBootTest;

import com.magicmatch.model.EmployeesBasic;

@SpringBootTest
public class EmployeesBasicTest {
//	@Autowired
//	EmployeesBasicController ebc;
	
//	@Test
	void testAddOne() {
		EmployeesBasic employee = new EmployeesBasic();
		employee.setName("田中　慎吾");
		employee.setAge(26);
		employee.setGender(1);
		employee.setIsJapanese(true);
		
		
	}
}
