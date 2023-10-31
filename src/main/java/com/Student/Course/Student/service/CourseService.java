package com.Student.Course.Student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.Course.Student.dto.Course;

@Service
public class CourseService {

	@Autowired
	private com.Student.Course.Student.repository.CourseRepo repo;
	
	public Course saveCourse(Course course)
	{
		repo.save(course);
		return course;
	}
	public List<Course> getAllCourse()
	{
		List<Course> courses = new ArrayList<>();
		repo.findAll().forEach(course1->courses.add(course1));
		return courses;
		
	}
	
	public Course getCourseById(int id)
	{
		Optional<Course> course= repo.findById(id);
		if(course.isPresent())
		{
			return course.get();
		}
		return null;
	}
	
	public Course deleteCourseById(int id)
	{
		Optional<Course> course = repo.findById(id);
		if(course.isPresent())
		{
			repo.deleteById(id);
			return course.get();
		}
		return null;
	}
	
	public Course updateCourseById(int id, Course course)
	{
		Optional<Course> course1 = repo.findById(id);
		if(course1.isPresent())
		{
			course.setCourseId(id);
			repo.save(course);
			return course;
		}
		return null;
	} 
}
