package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	@Query("select student from Student student where student.name=?1")
	public List<Student> findByName(String name);

}

