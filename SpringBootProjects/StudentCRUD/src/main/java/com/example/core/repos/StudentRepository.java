package com.example.core.repos;
/**
 * Copyright Prisni Technologies LLP.
 * Author: Debabrata Mukherjee
 */
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

//import org.springframework.data.jpa.repository.JpaRepository;
import com.example.core.demo.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	@Query(value="SELECT DISTINCT class_name FROM student s WHERE s.is_active='Y'", nativeQuery=true)
	public Set<String> getClasses();
	
	@Transactional
	@Modifying
	@Query(value="UPDATE student s SET s.IS_ACTIVE='N' WHERE s.student_id=?1", nativeQuery=true)
	public void deactivateById(Long student_id);
	
	@Query(value="SELECT * FROM STUDENT s WHERE s.IS_ACTIVE='Y'", nativeQuery=true)
	public List<Student> findAllActiveStudents();
	
	@Query(value="SELECT * FROM STUDENT s WHERE s.IS_ACTIVE='N'", nativeQuery=true)
	public List<Student> findAllDeactivatedStudents();
	
	@Query(value="SELECT * FROM STUDENT s WHERE s.class_name=?1 and s.IS_ACTIVE='Y'", nativeQuery=true)
	public List<Student> findStudentsByClass(String class_name);

}
