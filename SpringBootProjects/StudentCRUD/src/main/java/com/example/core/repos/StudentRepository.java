package com.example.core.repos;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import org.springframework.data.jpa.repository.JpaRepository;
import com.example.core.demo.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	@Query(value="SELECT DISTINCT class_name FROM student", nativeQuery=true)
	public Set<String> getClasses();

}
