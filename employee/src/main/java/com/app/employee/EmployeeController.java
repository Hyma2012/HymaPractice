package com.app.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository repo;
	
	@PostMapping(path="add")
	public String add(@RequestBody Employee employee) {
		repo.save(employee);
		return "New Employee Added";
	}
	
	@GetMapping(path="getAll")
	public List<Employee> getemployees(){
		return repo.findAll();
	}
}
