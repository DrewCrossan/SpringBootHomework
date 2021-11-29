package com.codeclan.homework.employeedata;

import com.codeclan.homework.employeedata.models.Employee;
import com.codeclan.homework.employeedata.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeedataApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void createEmployee(){
		Employee drew = new Employee("Drew", "Crossan", 31, "drew@codeclan.com");
		employeeRepository.save(drew);
		Employee harley = new Employee("Harley", "Bear", 2, "suchagoodgirl@awoof.com");
		employeeRepository.save(harley);
	}

}
