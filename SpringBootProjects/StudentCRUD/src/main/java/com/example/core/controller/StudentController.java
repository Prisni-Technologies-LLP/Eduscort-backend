package com.example.core.controller;

import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.example.core.demo.Student;
import com.example.core.repos.StudentRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/students/")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	@GetMapping("/students/{student_id}")  
    public Student getStudentByID(@PathVariable("student_id") Long student_id) { 
           
         return studentRepository.findById(student_id).get();  
          
    }
	@PostMapping("/students/")
	public ResponseEntity<Void> createStudent(
			@RequestBody Student student){		
		
		Student createdStudent = studentRepository.save(student);
		
		//Location
		//Get current resource url
		///{id}
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(createdStudent.getstudent_id()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping("delete-student/{student_id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable Long student_id){
		studentRepository.deleteById(student_id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("update-student/{student_id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long student_id,
			@RequestBody Student student) {
		Student studentUpdated=studentRepository.save(student);
		return new ResponseEntity<Student>(studentUpdated, HttpStatus.OK);		
	}
	@GetMapping("classes")
	public Set<String> getClasses(){
		Set<String> classes=new HashSet<String>();
		classes=studentRepository.getClasses();
		return classes;
	}

}