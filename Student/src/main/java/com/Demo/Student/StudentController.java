package com.Demo.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	
	@GetMapping(path="getAllStudents")
	public List<Student> getstudents(){
		return repo.findAll();
	}
	
	@PostMapping(path="addStudent")
	public String add(@RequestBody Student student) {
		repo.save(student);
		return "New Student Added";
		
	}

}
