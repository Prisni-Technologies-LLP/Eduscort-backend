/**
 * copyright Prisni Technologies LLP.
 * Author: Debabrata Mukherjee
 */
package com.example.core;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentCrudApplication {

	@PostConstruct
	  public void init(){
	    // Setting Spring Boot SetTimeZone
	    TimeZone.setDefault(TimeZone.getTimeZone("IST"));
	  }
	public static void main(String[] args) {
		SpringApplication.run(StudentCrudApplication.class, args);
	}

}
