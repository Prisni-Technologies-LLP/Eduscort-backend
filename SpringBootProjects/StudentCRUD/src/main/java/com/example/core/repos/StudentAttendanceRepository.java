/**
 * 
 */
package com.example.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.core.demo.StudentAttendance;


public interface StudentAttendanceRepository extends JpaRepository<StudentAttendance, Long> {

}
