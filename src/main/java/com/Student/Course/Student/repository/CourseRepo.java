package com.Student.Course.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.Student.Course.Student.dto.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
