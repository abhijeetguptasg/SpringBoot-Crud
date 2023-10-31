package com.Student.Course.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student.Course.Student.dto.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
