package com.example.core.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.repos.StudentAttendanceRepository;
import com.example.core.repos.StudentRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class StudnetAttendanceController {
	@Autowired
	private StudentAttendanceRepository studentAttendanceRepository;
	
	@PutMapping("update-student-attendance/{student_id}/{date}")
	public ResponseEntity<Void> updateStudentAttendance(String attendance, @PathVariable Long student_id,
			@PathVariable Date date){
		studentAttendanceRepository.updateStudentAttendance(attendance, student_id, date);
		return ResponseEntity.noContent().build();
	}

}
