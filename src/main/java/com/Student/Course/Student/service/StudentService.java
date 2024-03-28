package com.Student.Course.Student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.Student.Course.Student.dto.Student;
import com.Student.Course.Student.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public Student saveStudent(Student student)
	{
		repo.save(student);
		return student;
	}
	
	public List<Student> getAllStudent()
	{
		List<Student> students = new ArrayList<>();
		repo.findAll().forEach(student1->students.add(student1));
		return students;
		
	}
	
	public Student getStudentById(int id)
	{
		Optional<Student> student= repo.findById(id);
		if(student.isPresent())
		{
			return student.get();
		}
		return null;
	}
	
	public Student deleteStudentById(int id)
	{
		Optional<Student> student = repo.findById(id);
		if(student.isPresent())
		{
			repo.deleteById(id);
			return student.get();
		}
		return null;
	}
	
	public Student updateStudentById(int id, Student student)
	{
		Optional<Student> student1 = repo.findById(id);
		if(student1.isPresent())
		{
			student.setStudentId(id);
			repo.save(student);
			return student;
		}
		return null;
	} 
	
}
