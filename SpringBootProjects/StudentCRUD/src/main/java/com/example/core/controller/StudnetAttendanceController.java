package com.example.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.repos.StudentAttendanceRepository;
import com.example.core.repos.StudentRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class StudnetAttendanceController {
	@Autowired
	private StudentAttendanceRepository studentAttendanceRepository;

}
