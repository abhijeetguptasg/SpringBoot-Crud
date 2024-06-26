package com.Student.Course.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Student.Course.Student.dto.Student;
import com.Student.Course.Student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent()
	{
		return service.getAllStudent();
	}
	
	@GetMapping("/getById/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		return service.getStudentById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public Student deleteStudentById(@PathVariable int id) {
		return service.deleteStudentById(id);
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudentById(@PathVariable int id, @RequestBody Student student)
	{
		return service.updateStudentById(id, student);
	}
	
		
	}
}
